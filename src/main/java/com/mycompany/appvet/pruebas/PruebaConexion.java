
package com.mycompany.appvet.pruebas;

import com.mycompany.appvet.db.AccesoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PruebaConexion {

    public static void main(String[] args) {
        try {
            Connection cn = AccesoDB.obtenerConexion();
            System.out.println("Conexion lograda con exito.");
            
            cn.setAutoCommit(false);
            PreparedStatement pstm;
            ResultSet rs;
            String sql = "SELECT * FROM CONSULTA_MEDICA";
            pstm = cn.prepareStatement(sql);
            rs = pstm.executeQuery();
            if (rs.next()) {
                do {
                    System.out.println("REGISTRO: \n");
                    System.out.println(rs.getString("id_consulta") + " | ");
                    System.out.println(rs.getString("id_cliente") + " | ");
                    System.out.println(rs.getString("id_empleado") + " | ");
                    System.out.println(rs.getString("fechaConsulta") + " | ");
                    if(rs.getString("id_factura") == null){
                        System.out.println("No existe factura asociada \n ");
                    }else{
                        System.out.println(rs.getString("id_factura") + " \n ");
                    }
                } while (rs.next());
            }
            pstm.close();
            rs.close();
            cn.commit();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
