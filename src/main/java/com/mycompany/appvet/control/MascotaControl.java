
package com.mycompany.appvet.control;

import com.mycompany.appvet.db.AccesoDB;
import com.mycompany.appvet.model.Mascota;
import java.sql.*;
import java.util.ArrayList;

public class MascotaControl {
    
    public void agregarMascota(Mascota m) {
        Connection cn = null;
        try {
            cn = AccesoDB.obtenerConexion();
            cn.setAutoCommit(false);
            PreparedStatement pstm;
            String sql = "EXECUTE sp_GuardarNuevaMascota ?, ?, ?, ?, ?, ?";
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, m.getNombre());
            pstm.setString(2, m.getEspecie());
            pstm.setString(3, String.valueOf(m.getSexo() + ""));
            pstm.setString(4, m.getRaza());
            pstm.setString(5, m.getFecha_nac());
            pstm.setString(6, m.getId_cliente());
            int rows = pstm.executeUpdate();
            if (rows != 1)
                throw new SQLException("Error al almacenar en la base de datos.");
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
            } catch (Exception e2) {}
            throw new RuntimeException("Error en el proceso.");
        } finally {
            try {
                cn.close();
            } catch (Exception e) {}
        }
    }

    public Mascota buscarMascota(String id_mascota){
        Connection cn = null;
        Mascota m = new Mascota();
        m.setId_mascota("-1");
        try {
            cn = AccesoDB.obtenerConexion();
            cn.setAutoCommit(false);
            PreparedStatement pstm;
            ResultSet rs;
            String sql = "EXECUTE sp_BuscarMascota ?";
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, id_mascota);
            rs = pstm.executeQuery();
            if (rs.next()) {
                m.setId_mascota(rs.getString("id_mascota"));
                m.setNombre(rs.getString("nombre"));
                m.setEspecie(rs.getString("especie"));
                m.setSexo(rs.getString("sexo").charAt(0));
                m.setRaza(rs.getString("raza"));
                m.setFecha_nac(rs.getString("fecha_nac"));
                m.setId_cliente(rs.getString("id_cliente"));
            }
            if(rs.next()){
                throw new SQLException("Algo fue mal..."); // :0
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
        
        return m;
    }
    
    public void actualizarMascota(Mascota m) {
        Connection cn = null;
        try {
            cn = AccesoDB.obtenerConexion();
            cn.setAutoCommit(false);
            PreparedStatement pstm;
            String sql = "EXECUTE sp_ActualizarMascota ?, ?, ?, ?, ?, ?, ?";
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, m.getId_mascota());
            pstm.setString(2, m.getNombre());
            pstm.setString(3, m.getEspecie());
            pstm.setString(4, String.valueOf(m.getSexo() + ""));
            pstm.setString(5, m.getRaza());
            pstm.setString(6, m.getFecha_nac());
            pstm.setString(7, m.getId_cliente());
            int rows = pstm.executeUpdate();
            if (rows != 1)
                throw new SQLException("Error al almacenar en la base de datos.");
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
            } catch (Exception e2) {}
            throw new RuntimeException("Error en el proceso.");
        } finally {
            try {
                cn.close();
            } catch (Exception e) {}
        }
    }
    
    public void eliminarMascota(String id_mascota) {
        Connection cn = null;
        try {
            cn = AccesoDB.obtenerConexion();
            cn.setAutoCommit(false);
            PreparedStatement pstm;
            String sql = "EXECUTE sp_EliminarMascota ?";
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, id_mascota);
            int rows = pstm.executeUpdate();
            if (rows != 1)
                throw new SQLException("Error al almacenar en la base de datos.");
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
    
    public ArrayList<Mascota> listarMascotas(String tipo, String clave) {
        Connection cn = null;
        ArrayList<Mascota> listadoMascotas = new ArrayList<>();
        try {
            cn = AccesoDB.obtenerConexion();
            cn.setAutoCommit(false);
            PreparedStatement pstm;
            ResultSet rs;
            String sql;
            switch(tipo){
                case "todos" -> {
                    sql = "EXEC sp_ListarMascotas";
                    pstm = cn.prepareStatement(sql);
                    break;
                }
                case "nombres" -> {
                    sql = "EXEC sp_ListarMascotasPorNombre ?";
                    pstm = cn.prepareStatement(sql);
                    pstm.setString(1, clave);
                    break;
                }
                case "id_cliente" -> {
                    sql = "EXEC sp_ListarMascotasPorIDCliente ?";
                    pstm = cn.prepareStatement(sql);
                    pstm.setString(1, clave);
                    break;
                }
                case "recien agregado" -> {
                    sql = "EXEC sp_ListarMascotasPorRecienAgregado";
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
                    Mascota m = new Mascota();
                    m.setId_mascota(rs.getString("id_mascota"));
                    m.setNombre(rs.getString("nombre"));
                    m.setEspecie(rs.getString("especie"));
                    m.setSexo(rs.getString("sexo").charAt(0));
                    m.setRaza(rs.getString("raza"));
                    m.setFecha_nac(rs.getString("fecha_nac"));
                    m.setId_cliente(rs.getString("id_cliente"));
                    m.setCliente(rs.getString("cliente"));
                    listadoMascotas.add(m);
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
        return listadoMascotas;
    }
    
}
