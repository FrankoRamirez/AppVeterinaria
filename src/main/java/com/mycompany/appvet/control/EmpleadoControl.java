package com.mycompany.appvet.control;

import com.mycompany.appvet.db.AccesoDB;
import com.mycompany.appvet.model.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmpleadoControl {
    
    public void agregarEmpleado(Empleado e){
        Connection cn = null;
        try {
            cn = AccesoDB.obtenerConexion();
            cn.setAutoCommit(false);
            PreparedStatement pstm;
            String sql = "EXECUTE sp_GuardarNuevoEmpleado ?,?,?,?,?,?,?,?";
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, e.getNombres());
            pstm.setString(2, e.getDni());
            pstm.setString(3, e.getSexo());
            pstm.setString(4, e.getCorreo());
            pstm.setString(5, e.getTelefono());
            pstm.setString(6, e.getTipo());
            pstm.setString(7, e.getUsuario());
            pstm.setString(8, e.getContrasenia());
            int rows = pstm.executeUpdate();
            if (rows != 1) {
                throw new SQLException("Error al almacenar en la base de datos.");
            }
            pstm.close();
            cn.commit();
        } catch (SQLException ex) {
            try {
                cn.rollback();
            } catch (Exception e1) {}
            throw new RuntimeException(ex.getMessage());
        } catch (Exception ex) {
            try{
                cn.rollback();
            } catch (Exception e1) {}
            throw new RuntimeException("Error en el proceso.");
        } finally {
            try {
                cn.close();
            } catch (Exception ex) {}
        }
    }
    
    public Empleado buscarEmpleado(String id_empleado){
        Connection cn = null;
        Empleado e = new Empleado();
        e.setId_empleado("-1");
        try {
            cn = AccesoDB.obtenerConexion();
            cn.setAutoCommit(false);
            PreparedStatement pstm;
            ResultSet rs;
            String sql = "EXECUTE sp_BuscarEmpleado ?";
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, id_empleado);
            rs = pstm.executeQuery();
            if (rs.next()) {
                e.setId_empleado(rs.getString("id_empleado"));
                e.setNombres(rs.getString("nombres"));
                e.setDni(rs.getString("dni"));
                e.setSexo(rs.getString("sexo"));
                e.setCorreo(rs.getString("correo"));
                e.setTelefono(rs.getString("telefono"));
                e.setTipo(rs.getString("tipo"));
                e.setUsuario(rs.getString("usuario"));
                e.setContrasenia(rs.getString("contrasenia"));
            }
            if(rs.next()){
                throw new SQLException("Algo fue mal...");
            }
            pstm.close();
            rs.close();
            cn.commit();
        } catch (SQLException ex) {
            try {
                cn.rollback();
            } catch (Exception e1) {}
            throw new RuntimeException(ex.getMessage());
        } catch (Exception ex) {
            try {
                cn.rollback();
            } catch (Exception e1) {}
            throw new RuntimeException("Error en el proceso.");
        } finally {
            try {
                cn.close();
            } catch (Exception ex) {}
        }
        
        return e;
    }
    
    public void actualizarEmpleado(Empleado e) {
        Connection cn = null;
        try {
            cn = AccesoDB.obtenerConexion();
            cn.setAutoCommit(false);
            PreparedStatement pstm;
            String sql = "EXECUTE sp_ActualizarEmpleado ?,?,?,?,?,?,?,?,?";
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, e.getId_empleado());
            pstm.setString(2, e.getNombres());
            pstm.setString(3, e.getDni());
            pstm.setString(4, e.getSexo());
            pstm.setString(5, e.getCorreo());
            pstm.setString(6, e.getTelefono());
            pstm.setString(7, e.getTipo());
            pstm.setString(8, e.getUsuario());
            pstm.setString(9, e.getContrasenia());
            int rows = pstm.executeUpdate();
            if (rows != 1) {
                throw new SQLException("Error al almacenar en la base de datos.");
            }
            pstm.close();
            cn.commit();
        } catch (SQLException ex) {
            try {
                cn.rollback();
            } catch (Exception e1) {}
            throw new RuntimeException(ex.getMessage());
        } catch (Exception ex) {
            try {
                cn.rollback();
            } catch (Exception e1) {}
            throw new RuntimeException("Error en el proceso.");
        } finally {
            try {
                cn.close();
            } catch (Exception ex) {}
        }
    }
    
    public void eliminarEmpleado(String id_empleado) {
        Connection cn = null;
        try {
            cn = AccesoDB.obtenerConexion();
            cn.setAutoCommit(false);
            PreparedStatement pstm;
            String sql = "EXECUTE sp_EliminarEmpleado ?";
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, id_empleado);
            int rows = pstm.executeUpdate();
            if (rows != 1) {
                throw new SQLException("Error al almacenar en la base de datos.");
            }
            pstm.close();
            cn.commit();
        } catch (SQLException ex) {
            try {
                cn.rollback();
            } catch (Exception e1) {}
            throw new RuntimeException(ex.getMessage());
        } catch (Exception ex) {
            try {
                cn.rollback();
            } catch (Exception e1) {}
            throw new RuntimeException("Error en el proceso.");
        } finally {
            try {
                cn.close();
            } catch (Exception ex) {}
        }
    }
    
    public ArrayList<Empleado> listarEmpleados(String tipo, String clave) {
        Connection cn = null;
        ArrayList<Empleado> listadoEmpleados = new ArrayList<>();
        try {
            cn = AccesoDB.obtenerConexion();
            cn.setAutoCommit(false);
            PreparedStatement pstm;
            ResultSet rs;
            String sql;
            switch(tipo){
                case "todos" -> {
                    sql = "EXEC sp_ListarEmpleados";
                    pstm = cn.prepareStatement(sql);
                    break;
                }
                case "nombres" -> {
                    sql = "EXEC sp_ListarEmpleadosPorNombre ?";
                    pstm = cn.prepareStatement(sql);
                    pstm.setString(1, clave);
                    break;
                }
                case "recien agregado" -> {
                    sql = "EXEC sp_ListarEmpleadosPorRecienAgregado";
                    pstm = cn.prepareStatement(sql);
                    break;
                }
                case "dni" -> {
                    sql = "EXEC sp_ListarEmpleadosPorDNI ?";
                    pstm = cn.prepareStatement(sql);
                    pstm.setString(1, clave);
                    break;
                }
                default -> {
                    throw new SQLException ("Error interno");
                }
            }
            rs = pstm.executeQuery();
            if (rs.next()) {
                do {
                    Empleado e = new Empleado();
                    e.setId_empleado(rs.getString("id_empleado"));
                    e.setNombres(rs.getString("nombres"));
                    e.setDni(rs.getString("dni"));
                    e.setSexo(rs.getString("sexo"));
                    e.setCorreo(rs.getString("correo"));
                    e.setTelefono(rs.getString("telefono"));
                    e.setTipo(rs.getString("tipo"));
                    listadoEmpleados.add(e);
                } while (rs.next());
            }
            pstm.close();
            rs.close();
            cn.commit();
        } catch (SQLException ex) {
            try {
                cn.rollback();
            } catch (Exception e1) {}
            throw new RuntimeException(ex.getMessage());
        } catch (Exception ex) {
            try {
                cn.rollback();
            } catch (Exception e1) {}
            throw new RuntimeException("Error en el proceso.");
        } finally {
            try {
                cn.close();
            } catch (Exception ex) {}
        }
        return listadoEmpleados;
    }
    
    public Empleado loginEmpleado(String user, String pass){
        Connection cn = null;
        Empleado e = new Empleado();
        e.setId_empleado("-1");
        try {
            cn = AccesoDB.obtenerConexion();
            cn.setAutoCommit(false);
            PreparedStatement pstm;
            ResultSet rs;
            String sql = "EXECUTE sp_LoginEmpleado ?,?";
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, user);
            pstm.setString(2, pass);
            rs = pstm.executeQuery();
            if (rs.next()) {
                e.setId_empleado(rs.getString("id_empleado"));
                e.setNombres(rs.getString("nombres"));
                e.setDni(rs.getString("dni"));
                e.setSexo(rs.getString("sexo"));
                e.setCorreo(rs.getString("correo"));
                e.setTelefono(rs.getString("telefono"));
                e.setTipo(rs.getString("tipo"));
            }
            
        } catch (SQLException ex) {
            try {
                cn.rollback();
            } catch (Exception e1) {}
            throw new RuntimeException(ex.getMessage());
        } catch (Exception ex) {
            try{
                cn.rollback();
            } catch (Exception e1) {}
            throw new RuntimeException("Error en el proceso.");
        } finally {
            try {
                cn.close();
            } catch (Exception ex) {}
        }
        
        return e;
    }
    
    
}
