package com.mycompany.appvet.control;

import com.mycompany.appvet.db.AccesoDB;
import com.mycompany.appvet.model.CategoriaProd;
import com.mycompany.appvet.model.Servicio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CategoriaProdControl {
    
    
    public void agregarCategoriaProducto(CategoriaProd c) {
        Connection cn = null;
        try {
            cn = AccesoDB.obtenerConexion();
            cn.setAutoCommit(false);
            PreparedStatement pstm;
            String sql = "EXECUTE sp_GuardarNuevaCategoriaProducto ?";
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, c.getNombre());
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
    
    public CategoriaProd buscarCategoriaProducto(String id_cat){
        Connection cn = null;
        CategoriaProd c = new CategoriaProd();
        c.setId_categoria("-1");
        try {
            cn = AccesoDB.obtenerConexion();
            cn.setAutoCommit(false);
            PreparedStatement pstm;
            ResultSet rs;
            String sql = "EXECUTE sp_BuscarCategoriaProducto ?";
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, id_cat);
            rs = pstm.executeQuery();
            if (rs.next()) {
                c.setId_categoria(rs.getString("id_categoria"));
                c.setNombre(rs.getString("nombre_cat"));
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
        
        return c;
    }
    
    public void actualizarCategoriaProducto(CategoriaProd c) {
        Connection cn = null;
        try {
            cn = AccesoDB.obtenerConexion();
            cn.setAutoCommit(false);
            PreparedStatement pstm;
            String sql = "EXECUTE sp_ActualizarCategoriaProducto ?,?";
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, c.getId_categoria());
            pstm.setString(2, c.getNombre());
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
    
    public void eliminarCategoriaProducto(String id_categoria) {
        Connection cn = null;
        try {
            cn = AccesoDB.obtenerConexion();
            cn.setAutoCommit(false);
            PreparedStatement pstm;
            String sql = "EXECUTE sp_EliminarCategoriaProducto ?";
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, id_categoria);
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
    
    public ArrayList<String> listarCategoriasProducto() {
        Connection cn = null;
        ArrayList<String> listadoCategorias = new ArrayList<>();
        try {
            cn = AccesoDB.obtenerConexion();
            cn.setAutoCommit(false);
            PreparedStatement pstm;
            ResultSet rs;
            String sql = "SELECT nombre_cat FROM dbo.CATEGORIA_PROD";
            pstm = cn.prepareStatement(sql);
            rs = pstm.executeQuery();
            if (rs.next()) {
                do {
                    listadoCategorias.add(rs.getString("nombre_cat"));
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
        return listadoCategorias;
    }
    
}
