package com.mycompany.appvet.view.content;

import com.mycompany.appvet.control.ConsultaControl;
import com.mycompany.appvet.control.MascotaControl;
import com.mycompany.appvet.model.Consulta;
import com.mycompany.appvet.model.DetalleConsulta;
import com.mycompany.appvet.model.Mascota;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class ActualizarConsulta extends javax.swing.JPanel {

    private int idConsulta;
    private String idMascota;
    private String motivo;
    private String diagnostico;
    private String notas;
    
    DefaultTableModel modeloTabla;
    String[] cabecera = {"ID", "Mascota"};
    String[][] data = {};
    
    Timer timer = new Timer(10000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            lblMensaje.setText("");
        }
    });
    
    Timer timerError = new Timer(15000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            lblMensaje.setText("");
        }
    });
    
    public ActualizarConsulta() {
        initComponents();
        lblMensaje.setText("");
        btnAceptar.setEnabled(false);
        btnBuscarDetalle.setEnabled(false);
        modeloTabla = new DefaultTableModel(data, cabecera);
        tblMascotas.setModel(modeloTabla);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblMensaje = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnBuscar = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        txtNotasMedicas = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtIDMascota = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtMotivo = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtDiagnostico = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMascotas = new javax.swing.JTable();
        btnBuscarDetalle = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 821, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 524, Short.MAX_VALUE)
        );

        setPreferredSize(new java.awt.Dimension(760, 530));

        jPanel2.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(760, 530));

        jPanel5.setBackground(new java.awt.Color(184, 216, 248));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "ACTUALIZAR CONSULTA"));
        jPanel5.setPreferredSize(new java.awt.Dimension(760, 420));

        lblMensaje.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMensaje.setText("jLabel23");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Buscar consulta por ID:");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel24.setText("NOTAS MEDICAS:");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setText("Ingrese ID de la mascota:");

        jLabel22.setText("MOTIVO:");

        jLabel23.setText("DIAGNOSTICO:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("MASCOTAS ATENDIDAS:");

        tblMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblMascotas);

        btnBuscarDetalle.setText("BUSCAR");
        btnBuscarDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDetalleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMensaje))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(18, 18, 18)
                                .addComponent(txtIDMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)
                            .addComponent(txtDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)
                            .addComponent(txtNotasMedicas, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIDMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNotasMedicas, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(lblMensaje)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 179, 141));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setPreferredSize(new java.awt.Dimension(760, 110));

        btnAceptar.setText("ACEPTAR");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(385, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cargarTabla(Consulta c){
        try{
            ConsultaControl controlador = new ConsultaControl();
            ArrayList<Mascota> listaMascotas = controlador.listarMascotasPorIDConsulta(idConsulta);
            actualizarTabla(listaMascotas);
            
        }catch (Exception ex){
            setMensaje("error", "Hubo un problema al obtener las mascotas del cliente: "+ex.getMessage());
        }
    }
    
    private void actualizarTabla(ArrayList<Mascota> listaMascotas){
        limpiarTabla();
        for(Mascota m: listaMascotas){
            String id = m.getId_mascota();
            String nombres = m.getNombre();
            Object[] fila = {id, nombres};
            modeloTabla.addRow(fila);
        }
    }
    
    private void limpiarTabla(){
        int rowCount = modeloTabla.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            modeloTabla.removeRow(i);
        }
    }
    
    private void setMensaje(String tipo, String contenido){
        if(tipo.equals("error")){
            lblMensaje.setForeground(Color.red);
            lblMensaje.setText(contenido);
            timerError.start();
        }
        
        if(tipo.equals("info")){
            lblMensaje.setForeground(Color.black);
            lblMensaje.setText(contenido);
            timer.start();
        }
    }
    
    private boolean verificacion(){
        if(txtID.getText().equals("")){
            setMensaje("error","Debe ingresar el ID de la consulta a actualizar");
            return false;
        }
        if(txtIDMascota.getText().equals("")){
            setMensaje("error","Debe ingresar el ID de la mascota");
            return false;
        }
        return true;
    }
    
    private void limpiarEntradas(){
        txtIDMascota.setText("");
        txtMotivo.setText("");
        txtDiagnostico.setText("");
        txtNotasMedicas.setText("");
    }
    
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if(verificacion()){
            idMascota = txtIDMascota.getText();
            motivo = txtMotivo.getText();
            diagnostico = txtDiagnostico.getText();
            notas = txtNotasMedicas.getText();
            
            try{
                ConsultaControl controlador = new ConsultaControl();
                DetalleConsulta dc = new DetalleConsulta();
                dc.setId_mascota(idMascota);
                dc.setMotivo(motivo);
                dc.setDiagnostico(diagnostico);
                dc.setNotasMedicas(notas);
                controlador.actualizarConsulta(idConsulta, dc);
                setMensaje("info", "Se actualizo el detalle de la consulta exitosamente");
                limpiarEntradas();
                btnAceptar.setEnabled(false);
            
            }catch(Exception ex){
                setMensaje("error", "Error al actualizar el servicio: "+ex.getMessage());
            }
        }
        
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if(txtID.getText().equals("")){
            setMensaje("error", "Debe ingresar el ID de la consulta a buscar");
        }else{
            idConsulta = Integer.parseInt(txtID.getText());
            try{
                ConsultaControl controlador = new ConsultaControl();
                Consulta c = controlador.buscarConsulta(idConsulta);
                if(c.getIdConsulta() == -1){
                    throw new Exception("Consulta no encontrada");
                }else{
                    cargarTabla(c);
                    limpiarEntradas();
                    setMensaje("info","Ahora puede seleccionar las mascotas atendidas en la consulta");
                    btnBuscarDetalle.setEnabled(true);
                }
            }catch(Exception ex){
                setMensaje("error", "Error al buscar la consulta: "+ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBuscarDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDetalleActionPerformed
        if(txtIDMascota.getText().equals("")){
            setMensaje("error", "Debe ingresar el ID de la mascota a buscar");
        }else{
            idMascota = txtIDMascota.getText();
            try{
                ConsultaControl controlador = new ConsultaControl();
                DetalleConsulta dc = controlador.buscarDetalleConsulta(idConsulta, idMascota);
                if(dc.getId_mascota().equals("-1")){
                    throw new Exception("Mascota no valida");
                }else{
                    txtMotivo.setText(dc.getMotivo());
                    txtDiagnostico.setText(dc.getDiagnostico());
                    txtNotasMedicas.setText(dc.getNotasMedicas());
                    setMensaje("info","Ahora puede modificar los datos ingresados en la consulta para esta mascota");
                    btnAceptar.setEnabled(true);
                }
            }catch(Exception ex){
                setMensaje("error", "Error al buscar la consulta de la mascota: "+ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnBuscarDetalleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarDetalle;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JTable tblMascotas;
    private javax.swing.JTextField txtDiagnostico;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIDMascota;
    private javax.swing.JTextField txtMotivo;
    private javax.swing.JTextField txtNotasMedicas;
    // End of variables declaration//GEN-END:variables
}
