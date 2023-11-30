package com.mycompany.appvet.control;

import com.mycompany.appvet.db.AccesoDB;
import com.mycompany.appvet.model.RegistroMedico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ReporteControl {
    
    public ArrayList<RegistroMedico> obtenerRegistroMedico(String idMascota){
        Connection cn = null;
        ArrayList<RegistroMedico> registros = new ArrayList<>();
        try {
            cn = AccesoDB.obtenerConexion();
            cn.setAutoCommit(false);
            PreparedStatement pstm;
            ResultSet rs;
            String sql = "EXEC sp_ObtenerRegistroMedicoPorIDMascota ?";
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, idMascota);
            rs = pstm.executeQuery();
            if (rs.next()) {
                do{
                    RegistroMedico rm = new RegistroMedico();
                    rm.setIdConsulta(rs.getInt("id_consulta"));
                    rm.setIdCliente(rs.getString("id_cliente"));
                    rm.setCliente(rs.getString("cliente"));
                    rm.setIdEmpleado(rs.getString("id_empleado"));
                    rm.setEmpleado(rs.getString("empleado"));
                    rm.setFechaConsulta(rs.getString("fechaConsulta"));
                    rm.setMotivo(rs.getString("motivo"));
                    rm.setDiagnostico(rs.getString("diagnostico"));
                    rm.setNotasMedicas(rs.getString("notasMedicas"));
                    registros.add(rm);
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
            throw new RuntimeException("Error en el proceso");
        } finally {
            try {
                cn.close();
            } catch (Exception e) {}
        }
        return registros;
    }
    
}
