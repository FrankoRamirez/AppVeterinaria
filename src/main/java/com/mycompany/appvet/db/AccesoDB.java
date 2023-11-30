
package com.mycompany.appvet.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AccesoDB {
    
    private AccesoDB() {}
    
    public static Connection obtenerConexion() throws SQLException {
        
        Connection cn = null;
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String url = "jdbc:sqlserver://localhost:1433;databaseName=VET_DB;" +
                     "encrypt=true; trustServerCertificate=true;";
        String user = "sa";
        String pass = "20030727";
        try {
            cn = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            throw e;
        } catch (Exception e) {
            throw new SQLException("No se puede establecer la conexion con la BD.");
        }
        return cn;
        
        
    }
}
