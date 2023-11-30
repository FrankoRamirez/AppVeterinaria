package com.mycompany.appvet.control;

import com.mycompany.appvet.db.AccesoDB;
import com.mycompany.appvet.model.Consulta;
import com.mycompany.appvet.model.DetalleConsulta;
import com.mycompany.appvet.model.Mascota;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ConsultaControl {
    
    public void agregarConsulta(Consulta c) {
        Connection cn = null;
        try {
            cn = AccesoDB.obtenerConexion();
            cn.setAutoCommit(false);
            PreparedStatement pstm;
            String sql = "EXECUTE sp_GuardarNuevaConsulta ?,?";
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, c.getId_cliente());
            pstm.setString(2, c.getId_empleado());
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
    
    public Consulta obtenerUltimaConsulta(String id_cliente){
        Connection cn = null;
        Consulta c = new Consulta();
        try {
            cn = AccesoDB.obtenerConexion();
            cn.setAutoCommit(false);
            PreparedStatement pstm;
            ResultSet rs;
            String sql = "EXEC sp_ObtenerUltimaConsultaDeCliente ?";
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, id_cliente);
            rs = pstm.executeQuery();
            if (rs.next()) {
                c.setIdConsulta(rs.getInt("id_consulta"));
                c.setId_cliente(rs.getString("id_cliente"));
                c.setCliente(rs.getString("cliente"));
                c.setId_empleado(rs.getString("id_empleado"));
                c.setEmpleado(rs.getString("empleado"));
                c.setFecha(rs.getString("fechaConsulta"));
                if(rs.getString("id_factura") != null)
                    c.getFactura().setId_factura(rs.getInt("id_factura"));
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
        return c;
    
    }
    
    public void guardarDetalleConsulta(Consulta c){
        Connection cn = null;
        try {
            cn = AccesoDB.obtenerConexion();
            cn.setAutoCommit(false);
            PreparedStatement pstm;
            String sql = "EXECUTE sp_GuardarDetalleConsulta ?,?,?,?,?";
            pstm = cn.prepareStatement(sql);
            for(DetalleConsulta dc: c.getDetalles()){
                pstm.setInt(1, c.getIdConsulta());
                pstm.setString(2, dc.getId_mascota());
                pstm.setString(3, dc.getMotivo());
                pstm.setString(4, dc.getDiagnostico());
                pstm.setString(5, dc.getNotasMedicas());
                int rows = pstm.executeUpdate();
                if (rows != 1) {
                    throw new SQLException("Error al almacenar en la base de datos.");
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
    }
    
    public Consulta buscarConsulta(int idConsulta){
        Connection cn = null;
        Consulta c = new Consulta();
        c.setIdConsulta(-1);
        try {
            cn = AccesoDB.obtenerConexion();
            cn.setAutoCommit(false);
            PreparedStatement pstm;
            ResultSet rs;
            String sql = "EXEC sp_BuscarConsultaPorID ?";
            pstm = cn.prepareStatement(sql);
            pstm.setInt(1, idConsulta);
            rs = pstm.executeQuery();
            if (rs.next()) {
                c.setIdConsulta(rs.getInt("id_consulta"));
                c.setId_cliente(rs.getString("id_cliente"));
                c.setCliente(rs.getString("cliente"));
                c.setId_empleado(rs.getString("id_empleado"));
                c.setEmpleado(rs.getString("empleado"));
                c.setFecha(rs.getString("fechaConsulta"));
                if(rs.getString("id_factura") != null)
                    c.getFactura().setId_factura(rs.getInt("id_factura"));
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
        return c;
    }
    
    public DetalleConsulta buscarDetalleConsulta(int idConsulta, String idMascota){
        Connection cn = null;
        DetalleConsulta dc = new DetalleConsulta();
        dc.setId_mascota("-1");
        try {
            cn = AccesoDB.obtenerConexion();
            cn.setAutoCommit(false);
            PreparedStatement pstm;
            ResultSet rs;
            String sql = "EXEC sp_BuscarDetalleConsultaPorID ?,?";
            pstm = cn.prepareStatement(sql);
            pstm.setInt(1, idConsulta);
            pstm.setString(2, idMascota);
            rs = pstm.executeQuery();
            if (rs.next()) {
                dc.setId_mascota(rs.getString("id_mascota"));
                dc.setMotivo(rs.getString("motivo"));
                dc.setDiagnostico(rs.getString("diagnostico"));
                dc.setNotasMedicas(rs.getString("notasMedicas"));
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
        return dc;
    }
    
    public void actualizarConsulta(int idConsulta, DetalleConsulta dc){
        Connection cn = null;
        try {
            cn = AccesoDB.obtenerConexion();
            cn.setAutoCommit(false);
            PreparedStatement pstm;
            String sql = "EXEC sp_ActualizarDetalleConsulta ?,?,?,?,?";
            pstm = cn.prepareStatement(sql);
            pstm.setInt(1, idConsulta);
            pstm.setString(2, dc.getId_mascota());
            pstm.setString(3, dc.getMotivo());
            pstm.setString(4, dc.getDiagnostico());
            pstm.setString(5, dc.getNotasMedicas());
            int rows = pstm.executeUpdate();
            if(rows != 1){
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
            throw new RuntimeException("Error en el proceso");
        } finally {
            try {
                cn.close();
            } catch (Exception e) {}
        }
    }
    
    public void eliminarConsulta(int idConsulta){
        Connection cn = null;
        try {
            cn = AccesoDB.obtenerConexion();
            cn.setAutoCommit(false);
            PreparedStatement pstm;
            String sql = "EXEC sp_EliminarConsulta ?";
            pstm = cn.prepareStatement(sql);
            pstm.setInt(1, idConsulta);
            int rows = pstm.executeUpdate();
            if(rows == 0){
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
            throw new RuntimeException("Error en el proceso");
        } finally {
            try {
                cn.close();
            } catch (Exception e) {}
        }
    }
    
    public ArrayList<Consulta> listarConsultas(String tipo, String clave) {
        Connection cn = null;
        ArrayList<Consulta> listadoConsultas = new ArrayList<>();
        try {
            cn = AccesoDB.obtenerConexion();
            cn.setAutoCommit(false);
            PreparedStatement pstm;
            ResultSet rs;
            String sql;
            switch(tipo){
                case "todos" -> {
                    sql = "EXEC sp_ListarConsultas";
                    pstm = cn.prepareStatement(sql);
                    break;
                }
                case "id cliente" -> {
                    sql = "EXEC sp_ListarConsultasPorIDCliente ?";
                    pstm = cn.prepareStatement(sql);
                    pstm.setString(1, clave);
                    break;
                }
                case "id empleado" -> {
                    sql = "EXEC sp_ListarConsultasPorIDEmpleado ?";
                    pstm = cn.prepareStatement(sql);
                    pstm.setString(1, clave);
                    break;
                }
                case "recien agregado" -> {
                    sql = "EXEC sp_ListarConsultasPorRecienAgregado";
                    pstm = cn.prepareStatement(sql);
                    break;
                }
                case "factura pendiente" -> {
                    sql = "EXEC sp_ListarFacturasPendientes";
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
                    Consulta c = new Consulta();
                    c.setIdConsulta(rs.getInt("id_consulta"));
                    c.setId_cliente(rs.getString("id_cliente"));
                    c.setCliente(rs.getString("cliente"));
                    c.setId_empleado(rs.getString("id_empleado"));
                    c.setEmpleado(rs.getString("empleado"));
                    c.setFecha(rs.getString("fechaConsulta"));
                    if(rs.getString("id_factura") != null)
                        c.getFactura().setId_factura(rs.getInt("id_factura"));
                    listadoConsultas.add(c);
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
            System.out.println(e.getMessage());
            throw new RuntimeException(e.getMessage());
        } finally {
            try {
                cn.close();
            } catch (Exception e) {}
        }
        return listadoConsultas;
    }
    
    public boolean verificarConsultaConFacturaPendiente(int idConsulta){
        Connection cn = null;
        try {
            cn = AccesoDB.obtenerConexion();
            cn.setAutoCommit(false);
            PreparedStatement pstm;
            ResultSet rs;
            String sql = "EXECUTE sp_ConsultarFacturaPendiente ?";
            pstm = cn.prepareStatement(sql);
            pstm.setInt(1, idConsulta);
            rs = pstm.executeQuery();
            if(rs.next()){
                return true;
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
        
        return false;
    }
    
    
    public ArrayList<Mascota> listarMascotasPorIDConsulta(int idConsulta) {
        Connection cn = null;
        ArrayList<Mascota> listadoMascotas = new ArrayList<>();
        try {
            cn = AccesoDB.obtenerConexion();
            cn.setAutoCommit(false);
            PreparedStatement pstm;
            ResultSet rs;
            String sql = "EXEC sp_ObtenerMascotasPorIDConsulta ?";
            pstm = cn.prepareStatement(sql);
            pstm.setInt(1, idConsulta);
            rs = pstm.executeQuery();
            if(rs.next()){
                do{
                    Mascota m = new Mascota();
                    m.setId_mascota(rs.getString("id_mascota"));
                    m.setNombre(rs.getString("nombre"));
                    listadoMascotas.add(m);
                }while(rs.next());
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
            System.out.println(e.getMessage());
            throw new RuntimeException(e.getMessage());
        } finally {
            try {
                cn.close();
            } catch (Exception e) {}
        }
        return listadoMascotas;
    }
    
}
