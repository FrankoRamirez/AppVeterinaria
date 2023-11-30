
package com.mycompany.appvet.control;

import com.mycompany.appvet.db.AccesoDB;
import com.mycompany.appvet.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteControl {
    
    public void agregarCliente(Cliente c) {
        Connection cn = null;
        try {
            cn = AccesoDB.obtenerConexion();
            cn.setAutoCommit(false);
            PreparedStatement pstm;
            String sql = "EXECUTE sp_GuardarNuevoCliente ?,?,?,?,?,?";
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, c.getNombres());
            pstm.setString(2, c.getDni());
            pstm.setString(3, c.getSexo());
            pstm.setString(4, c.getCorreo());
            pstm.setString(5, c.getTelefono());
            pstm.setString(6, c.getDireccion());
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
    
    public Cliente buscarCliente(String id_cliente){
        Connection cn = null;
        Cliente c = new Cliente();
        c.setId_cliente("-1");
        try {
            cn = AccesoDB.obtenerConexion();
            cn.setAutoCommit(false);
            PreparedStatement pstm;
            ResultSet rs;
            String sql = "EXECUTE sp_BuscarCliente ?";
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, id_cliente);
            rs = pstm.executeQuery();
            if (rs.next()) {
                c.setId_cliente(rs.getString("id_cliente"));
                c.setNombres(rs.getString("nombres"));
                c.setDni(rs.getString("dni"));
                c.setSexo(rs.getString("sexo"));
                c.setCorreo(rs.getString("correo"));
                c.setTelefono(rs.getString("telefono"));
                c.setDireccion(rs.getString("direccion"));
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
    
    public void actualizarCliente(Cliente c) {
        Connection cn = null;
        try {
            cn = AccesoDB.obtenerConexion();
            cn.setAutoCommit(false);
            PreparedStatement pstm;
            String sql = "EXECUTE sp_ActualizarCliente ?,?,?,?,?,?,?";
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, c.getId_cliente());
            pstm.setString(2, c.getNombres());
            pstm.setString(3, c.getDni());
            pstm.setString(4, c.getSexo());
            pstm.setString(5, c.getCorreo());
            pstm.setString(6, c.getTelefono());
            pstm.setString(7, c.getDireccion());
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
    
    public void eliminarCliente(String id_cliente) {
        Connection cn = null;
        try {
            cn = AccesoDB.obtenerConexion();
            cn.setAutoCommit(false);
            PreparedStatement pstm;
            String sql = "EXECUTE sp_EliminarCliente ?";
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, id_cliente);
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
    
    public ArrayList<Cliente> listarClientes(String tipo, String clave) {
        Connection cn = null;
        ArrayList<Cliente> listadoClientes = new ArrayList<>();
        try {
            cn = AccesoDB.obtenerConexion();
            cn.setAutoCommit(false);
            PreparedStatement pstm;
            ResultSet rs;
            String sql;
            switch(tipo){
                case "todos" -> {
                    sql = "EXEC sp_ListarClientes";
                    pstm = cn.prepareStatement(sql);
                    break;
                }
                case "nombres" -> {
                    sql = "EXEC sp_ListarClientesPorNombre ?";
                    pstm = cn.prepareStatement(sql);
                    pstm.setString(1, clave);
                    break;
                }
                case "recien agregado" -> {
                    sql = "EXEC sp_ListarClientesPorRecienAgregado";
                    pstm = cn.prepareStatement(sql);
                    break;
                }
                case "dni" -> {
                    sql = "EXEC sp_ListarClientesPorDNI ?";
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
                    Cliente c = new Cliente();
                    c.setId_cliente(rs.getString("id_cliente"));
                    c.setNombres(rs.getString("nombres"));
                    c.setDni(rs.getString("dni"));
                    c.setSexo(rs.getString("sexo"));
                    c.setCorreo(rs.getString("correo"));
                    c.setTelefono(rs.getString("telefono"));
                    c.setDireccion(rs.getString("direccion"));
                    listadoClientes.add(c);
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
        return listadoClientes;
    }
    
}
