package com.mycompany.appvet.control;

import com.mycompany.appvet.db.AccesoDB;
import com.mycompany.appvet.model.Servicio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ServicioControl {
    
    public void agregarServicio(Servicio s) {
        Connection cn = null;
        try {
            //Consideraciones previas
            if(s.getCosto() < 0){
                throw new SQLException("El valor del costo no puede ser negativo");
            }
            cn = AccesoDB.obtenerConexion();
            cn.setAutoCommit(false);
            PreparedStatement pstm;
            String sql = "EXECUTE sp_GuardarNuevoServicio ?,?";
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, s.getDescripcion());
            pstm.setDouble(2, s.getCosto());
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
    
    public Servicio buscarServicio(String id_servicio){
        Connection cn = null;
        Servicio s = new Servicio();
        s.setId_servicio("-1");
        try {
            cn = AccesoDB.obtenerConexion();
            cn.setAutoCommit(false);
            PreparedStatement pstm;
            ResultSet rs;
            String sql = "EXECUTE sp_BuscarServicio ?";
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, id_servicio);
            rs = pstm.executeQuery();
            if (rs.next()) {
                s.setId_servicio(rs.getString("id_servicio"));
                s.setDescripcion(rs.getString("descripcion"));
                s.setCosto(rs.getDouble("costo"));
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
        
        return s;
    }
    
    public void actualizarServicio(Servicio s) {
        Connection cn = null;
        try {
            cn = AccesoDB.obtenerConexion();
            cn.setAutoCommit(false);
            PreparedStatement pstm;
            String sql = "EXECUTE sp_ActualizarServicio ?,?,?";
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, s.getId_servicio());
            pstm.setString(2, s.getDescripcion());
            pstm.setDouble(3, s.getCosto());
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
    
    public void eliminarServicio(String id_servicio) {
        Connection cn = null;
        try {
            cn = AccesoDB.obtenerConexion();
            cn.setAutoCommit(false);
            PreparedStatement pstm;
            String sql = "EXECUTE sp_EliminarServicio ?";
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, id_servicio);
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
    
    public ArrayList<Servicio> listarServicios(String tipo, String clave) {
        Connection cn = null;
        ArrayList<Servicio> listadoServicios = new ArrayList<>();
        try {
            cn = AccesoDB.obtenerConexion();
            cn.setAutoCommit(false);
            PreparedStatement pstm;
            ResultSet rs;
            String sql;
            switch(tipo){
                case "todos" -> {
                    sql = "EXEC sp_ListarServicios";
                    pstm = cn.prepareStatement(sql);
                    break;
                }
                case "nombres" -> {
                    sql = "EXEC sp_ListarServiciosPorNombre ?";
                    pstm = cn.prepareStatement(sql);
                    pstm.setString(1, clave);
                    break;
                }
                case "recien agregado" -> {
                    sql = "EXEC sp_ListarServiciosPorRecienAgregado";
                    pstm = cn.prepareStatement(sql);
                    break;
                }
                case "alfa" -> {
                    sql = "sp_ListarServicioAlfabetico";
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
                    Servicio s = new Servicio();
                    s.setId_servicio(rs.getString("id_servicio"));
                    s.setDescripcion(rs.getString("descripcion"));
                    s.setCosto(rs.getDouble("costo"));
                    listadoServicios.add(s);
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
        return listadoServicios;
    }
    
    
    
    
}
