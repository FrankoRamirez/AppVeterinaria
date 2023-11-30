package com.mycompany.appvet.control;

import com.mycompany.appvet.db.AccesoDB;
import com.mycompany.appvet.model.DetalleFacturaProducto;
import com.mycompany.appvet.model.DetalleFacturaServicio;
import com.mycompany.appvet.model.Factura;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class VentaControl {
    
    public int registrarVenta(ArrayList<DetalleFacturaProducto> detalleProd, 
            ArrayList<DetalleFacturaServicio> detalleServ, Factura f, int idConsulta){
        
        Connection cn = null;
        try {
            if(detalleProd.isEmpty() && detalleServ.isEmpty())
                throw new SQLException ("No se ha solicitado nada aun");
            
            cn = AccesoDB.obtenerConexion();
            cn.setAutoCommit(false);
            ResultSet rs;
            PreparedStatement pstm;
            
            // VERIFICANDO EL STOCK DE PRODUCTOS
            String sql = "EXECUTE sp_VerificarStock ?";
            for(DetalleFacturaProducto detalle: detalleProd){
                pstm = cn.prepareStatement(sql);
                pstm.setString(1, detalle.getId_producto());
                rs = pstm.executeQuery();
                if(rs.next()){
                    if(detalle.getCantidad() > rs.getInt("stock")){
                        throw new SQLException("No hay suficiente stock de "+rs.getString("descripcion"));
                    }
                }else{
                    throw new SQLException("Error al obtener el producto");
                }
            }
            
            // GUARDANDO LA FACTURA 
            sql = "EXECUTE sp_RegistrarVenta ?,?,?";
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, f.getId_cliente());
            pstm.setString(2, f.getId_empleado());
            pstm.setDouble(3, f.getImporte());
            
            rs = pstm.executeQuery();
            if(rs.next()){
                f.setId_factura(rs.getInt("id_factura"));
            }else{
                throw new SQLException ("Error al obtener el ID de la factura");
            }
            
            // GUARDANDO LA FACTURA EN LA CONSULTA MEDICA (SI CORRESPONDE)
            sql = "EXECUTE sp_ActualizarFacturaDeConsulta ?, ?";
            pstm = cn.prepareStatement(sql);
            pstm.setInt(1, idConsulta);
            pstm.setInt(2, f.getId_factura());
            int rows1 = pstm.executeUpdate();
            if (rows1 != 1) {
                throw new SQLException("Error al anexar la factura a la consulta respectiva");
            }
            
            // GUARDANDO EL DETALLE DE PRODUCTOS VENDIDOS
            sql = "EXECUTE sp_VenderProducto ?,?,?,?"; 
            
            for(DetalleFacturaProducto detalle: detalleProd){
                pstm = cn.prepareStatement(sql);
                pstm.setInt(1, f.getId_factura());
                pstm.setString(2, detalle.getId_producto());
                pstm.setInt(3, detalle.getCantidad());
                pstm.setDouble(4, detalle.getMonto());
                int rows = pstm.executeUpdate();
                if(rows != 1){
                    throw new SQLException("Ocurrio un error al intentar guardar el detalle de productos");
                }
            }
            
            // GUARDANDO EL DETALLE DE SERVICIOS VENDIDOS
            sql = "EXECUTE sp_VenderServicio ?,?,?,?";
            
            for(DetalleFacturaServicio detalle: detalleServ){
                pstm = cn.prepareStatement(sql);
                pstm.setInt(1, f.getId_factura());
                pstm.setString(2, detalle.getId_servicio());
                pstm.setInt(3, detalle.getCantidad());
                pstm.setDouble(4, detalle.getMonto());
                int rows = pstm.executeUpdate();
                if(rows != 1){
                    throw new SQLException("Ocurrio un error al intentar guardar el detalle de servicios");
                }
            }

            pstm.close();
            cn.commit();
        } catch (SQLException e) {
            try {
                cn.rollback();
            } catch (Exception e1) {}
            throw new RuntimeException(e.getMessage());
        } catch (Exception e) {
            try{
                cn.rollback();
            } catch (Exception e1) {}
            throw new RuntimeException("Error en el proceso.");
        } finally {
            try {
                cn.close();
            } catch (Exception e) {}
        }
        
        return f.getId_factura();
    }
    
    public Factura obtenerUltimaFactura(){
        Connection cn = null;
        Factura f = new Factura();
        f.setId_factura(-1);
        try {
            cn = AccesoDB.obtenerConexion();
            cn.setAutoCommit(false);
            ResultSet rs;
            PreparedStatement pstm;
            
            String sql = "EXECUTE sp_obtenerUltimaFactura";
            pstm = cn.prepareStatement(sql);
            
            rs = pstm.executeQuery();
            if(rs.next()){
                f.setId_factura(rs.getInt("id_factura"));
                f.setId_cliente(rs.getString("id_cliente"));
                f.setId_empleado(rs.getString("id_empleado"));
                f.setFecha(rs.getString("fecha_factura"));
                f.setImporte(rs.getDouble("importe"));
            }else{
                throw new SQLException("Factura no encontrada");
            }
            
            pstm.close();
            cn.commit();
        } catch (SQLException e) {
            try {
                cn.rollback();
            } catch (Exception e1) {}
            throw new RuntimeException(e.getMessage());
        } catch (Exception e) {
            try{
                cn.rollback();
            } catch (Exception e1) {}
            throw new RuntimeException("Error en el proceso.");
        } finally {
            try {
                cn.close();
            } catch (Exception e) {}
        }
        
        return f;
    }
    
    public ArrayList<Factura> obtenerVentas(String tipo, String clave){
        Connection cn = null;
        ArrayList<Factura> listaVentas = new ArrayList<>();
        try {
            cn = AccesoDB.obtenerConexion();
            cn.setAutoCommit(false);
            PreparedStatement pstm;
            ResultSet rs;
            String sql;
            switch(tipo){
                case "todos" -> {
                    sql = "EXEC sp_ListarVentas";
                    pstm = cn.prepareStatement(sql);
                    break;
                }
                case "cliente dni" -> {
                    sql = "EXEC sp_ListarVentasPorClienteDNI ?";
                    pstm = cn.prepareStatement(sql);
                    pstm.setString(1, clave);
                    break;
                }
                case "cliente id" -> {
                    sql = "EXEC sp_ListarVentasPorClienteID ?";
                    pstm = cn.prepareStatement(sql);
                    pstm.setString(1, clave);
                    break;
                }
                case "empleado id" -> {
                    sql = "EXEC sp_ListarVentasPorEmpleadoID ?";
                    pstm = cn.prepareStatement(sql);
                    pstm.setString(1, clave);
                    break;
                }
                case "recien agregado" -> {
                    sql = "EXEC sp_ListarVentasPorRecienAgregado";
                    pstm = cn.prepareStatement(sql);
                    break;
                }
                default -> {
                    throw new SQLException ("Error interno");
                }
            }
            rs = pstm.executeQuery();
            
            if(rs.next()){
                do{
                    Factura f = new Factura();
                    f.setId_factura(rs.getInt("id_factura"));
                    f.setCliente(rs.getString("cliente"));
                    f.setEmpleado(rs.getString("empleado"));
                    f.setFecha(rs.getString("fecha_factura"));
                    f.setImporte(rs.getDouble("importe"));
                    listaVentas.add(f);
                }while(rs.next());
            }
            
            pstm.close();
            cn.commit();
        } catch (SQLException e) {
            try {
                cn.rollback();
            } catch (Exception e1) {}
            throw new RuntimeException(e.getMessage());
        } catch (Exception e) {
            try{
                cn.rollback();
            } catch (Exception e1) {}
            throw new RuntimeException("Error en el proceso.");
        } finally {
            try {
                cn.close();
            } catch (Exception e) {}
        }
        
        return listaVentas;
    }
    
    
}
