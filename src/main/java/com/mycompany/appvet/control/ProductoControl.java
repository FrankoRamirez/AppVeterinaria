package com.mycompany.appvet.control;

import com.mycompany.appvet.db.AccesoDB;
import com.mycompany.appvet.model.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductoControl {
    
    
    public void agregarProducto(Producto p) {
        Connection cn = null;
        try {
            if(p.getPrecioVenta() < 0){
                throw new SQLException("El precio de venta no puede ser negativo");
            }
            if(p.getCostoUnitario() < 0){
                throw new SQLException("El costo unitario no puede ser negativo");
            }
            cn = AccesoDB.obtenerConexion();
            cn.setAutoCommit(false);
            PreparedStatement pstm;
            String sql = "EXECUTE sp_GuardarNuevoProducto ?,?,?,?,?,?,?,?";
            p.setMargenGanancia(p.getPrecioVenta()-p.getCostoUnitario());
            p.setMargenPorcentual((int)((p.getPrecioVenta()-p.getCostoUnitario())/p.getPrecioVenta()*100));
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, p.getDescripcion());
            pstm.setString(2, p.getUnidad());
            pstm.setInt(3, p.getStock());
            pstm.setDouble(4, p.getCostoUnitario());
            pstm.setInt(5, p.getMargenPorcentual());
            pstm.setDouble(6, p.getMargenGanancia());
            pstm.setDouble(7, p.getPrecioVenta());
            pstm.setString(8, p.getCategoria());
            int rows = pstm.executeUpdate();
            if (rows != 1) {
                throw new SQLException("Error al almacenar en la base de datos.");
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
    }
    
    public Producto buscarProducto(String id_producto){
        Connection cn = null;
        Producto p = new Producto();
        p.setId_producto("-1");
        try {
            cn = AccesoDB.obtenerConexion();
            cn.setAutoCommit(false);
            PreparedStatement pstm;
            ResultSet rs;
            String sql = "EXECUTE sp_BuscarProducto ?";
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, id_producto);
            rs = pstm.executeQuery();
            if (rs.next()) {
                p.setId_producto(rs.getString("id_producto"));
                p.setDescripcion(rs.getString("descripcion"));
                p.setUnidad(rs.getString("unidad"));
                p.setStock(rs.getInt("stock"));
                p.setCostoUnitario(rs.getDouble("costoUnitario"));
                p.setMargenPorcentual(rs.getInt("margenPorcentual"));
                p.setMargenGanancia(rs.getDouble("margenGanancia"));
                p.setPrecioVenta(rs.getDouble("precioVenta"));
                p.setCategoria(rs.getString("nombre_cat"));
            }
            if(rs.next()){
                throw new SQLException("Algo fue mal...");
            }
            pstm.close();
            rs.close();
            cn.commit();
        } catch (SQLException e) {
            try {
                cn.rollback();
            } catch (Exception e1) {}
            throw new RuntimeException(e.getMessage());
        } catch (Exception e) {
            try {
                cn.rollback();
            } catch (Exception e1) {}
            throw new RuntimeException("Error en el proceso.");
        } finally {
            try {
                cn.close();
            } catch (Exception e) {}
        }
        
        return p;
    }
    
    public void actualizarProducto(Producto p) {
        Connection cn = null;
        try {
            if(p.getPrecioVenta() < 0){
                throw new SQLException("El precio de venta no puede ser negativo");
            }
            if(p.getCostoUnitario() < 0){
                throw new SQLException("El costo unitario no puede ser negativo");
            }
            cn = AccesoDB.obtenerConexion();
            cn.setAutoCommit(false);
            PreparedStatement pstm;
            String sql = "EXECUTE sp_ActualizarProducto ?,?,?,?,?,?,?,?,?";
            p.setMargenGanancia(p.getPrecioVenta()-p.getCostoUnitario());
            p.setMargenPorcentual((int)((p.getPrecioVenta()-p.getCostoUnitario())/p.getPrecioVenta()*100));
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, p.getId_producto());
            pstm.setString(2, p.getDescripcion());
            pstm.setString(3, p.getUnidad());
            pstm.setInt(4, p.getStock());
            pstm.setDouble(5, p.getCostoUnitario());
            pstm.setInt(6, p.getMargenPorcentual());
            pstm.setDouble(7, p.getMargenGanancia());
            pstm.setDouble(8, p.getPrecioVenta());
            pstm.setString(9, p.getCategoria());
            int rows = pstm.executeUpdate();
            if (rows != 1) {
                throw new SQLException("Error al actualizar en la base de datos.");
            }
            pstm.close();
            cn.commit();
        } catch (SQLException e) {
            try {
                cn.rollback();
            } catch (Exception e1) {}
            throw new RuntimeException(e.getMessage());
        } catch (Exception e) {
            try {
                cn.rollback();
            } catch (Exception e1) {}
            throw new RuntimeException("Error en el proceso.");
        } finally {
            try {
                cn.close();
            } catch (Exception e) {}
        }
    }
    
    public void eliminarProducto(String id_producto) {
        Connection cn = null;
        try {
            cn = AccesoDB.obtenerConexion();
            cn.setAutoCommit(false);
            PreparedStatement pstm;
            String sql = "EXECUTE sp_EliminarProducto ?";
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, id_producto);
            int rows = pstm.executeUpdate();
            if (rows != 1) {
                throw new SQLException("Error al eliminar en la base de datos.");
            }
            pstm.close();
            cn.commit();
        } catch (SQLException e) {
            try {
                cn.rollback();
            } catch (Exception e1) {}
            throw new RuntimeException(e.getMessage());
        } catch (Exception e) {
            try {
                cn.rollback();
            } catch (Exception e1) {}
            throw new RuntimeException("Error en el proceso.");
        } finally {
            try {
                cn.close();
            } catch (Exception e) {}
        }
    }
    
    public ArrayList<Producto> listarProductos(String tipo, String clave) {
        Connection cn = null;
        ArrayList<Producto> listaProductos = new ArrayList<>();
        try {
            cn = AccesoDB.obtenerConexion();
            cn.setAutoCommit(false);
            PreparedStatement pstm;
            ResultSet rs;
            String sql;
            switch(tipo){
                case "todos" -> {
                    sql = "EXEC sp_ListarProductos";
                    pstm = cn.prepareStatement(sql);
                    break;
                }
                case "nombres" -> {
                    sql = "EXEC sp_ListarProductosPorNombre ?";
                    pstm = cn.prepareStatement(sql);
                    pstm.setString(1, clave);
                    break;
                }
                case "recien agregado" -> {
                    sql = "EXEC sp_ListarProductosPorRecienAgregado";
                    pstm = cn.prepareStatement(sql);
                    break;
                }
                case "categoria" -> {
                    sql = "EXEC sp_ListarProductosPorCategoria ?";
                    pstm = cn.prepareStatement(sql);
                    pstm.setString(1, clave);
                    break;
                }
                case "alfa" -> {
                    sql = "sp_ListarProductosAlfabetico";
                    pstm = cn.prepareStatement(sql);
                    break;
                }
                default -> {
                    throw new SQLException ("Error interno");
                }
            }
            rs = pstm.executeQuery();
            if (rs.next()) {
                do {
                    Producto p = new Producto();
                    p.setId_producto(rs.getString("id_producto"));
                    p.setDescripcion(rs.getString("descripcion"));
                    p.setUnidad(rs.getString("unidad"));
                    p.setStock(rs.getInt("stock"));
                    p.setCostoUnitario(rs.getDouble("costoUnitario"));
                    p.setMargenPorcentual(rs.getInt("margenPorcentual"));
                    p.setMargenGanancia(rs.getDouble("margenGanancia"));
                    p.setPrecioVenta(rs.getDouble("precioVenta"));
                    p.setCategoria(rs.getString("nombre_cat"));
                    listaProductos.add(p);
                } while (rs.next());
            }
            pstm.close();
            rs.close();
            cn.commit();
        } catch (SQLException e) {
            try {
                cn.rollback();
            } catch (Exception e1) {}
            throw new RuntimeException(e.getMessage());
        } catch (Exception e) {
            try {
                cn.rollback();
            } catch (Exception e1) {}
            throw new RuntimeException("Error en el proceso");
        } finally {
            try {
                cn.close();
            } catch (Exception e) {}
        }
        return listaProductos;
    }
    
}
