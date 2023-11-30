package com.mycompany.appvet.view.content;

import com.mycompany.appvet.control.ConsultaControl;
import com.mycompany.appvet.control.MascotaControl;
import com.mycompany.appvet.model.Consulta;
import com.mycompany.appvet.model.DetalleConsulta;
import com.mycompany.appvet.model.Mascota;
import com.mycompany.appvet.view.MenuPrincipal;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class GuardarDetalleConsulta extends javax.swing.JPanel {

    private String idMascota;
    private String motivo;
    private String diagnostico;
    private String notas;
    
    MenuPrincipal frmPadre;
    Consulta consulta;
    
    DefaultTableModel modeloTabla;
    String[] cabecera = {"ID", "Mascotas", "Estado"};
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
    
    public GuardarDetalleConsulta(MenuPrincipal padre, Consulta c) {
        initComponents();
        lblMensaje.setText("");
        modeloTabla = new DefaultTableModel(data, cabecera);
        tblMascotas.setModel(modeloTabla);
        frmPadre = padre;
        consulta = c;
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblMensaje = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMascotas = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        txtMotivo = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtDiagnostico = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtNotasMedicas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
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
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "ATENDER MASCOTA"));
        jPanel5.setPreferredSize(new java.awt.Dimension(760, 420));

        lblMensaje.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMensaje.setText("jLabel23");

        jLabel21.setText("Ingrese ID de la mascota:");

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

        jLabel22.setText("MOTIVO:");

        jLabel23.setText("DIAGNOSTICO:");

        jLabel24.setText("NOTAS MEDICAS:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("MASCOTAS DEL CLIENTE:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblMensaje))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(18, 18, 18)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)
                            .addComponent(txtDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)
                            .addComponent(txtNotasMedicas, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(22, 22, 22))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNotasMedicas, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMensaje)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
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
                .addContainerGap(26, Short.MAX_VALUE)
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

    private void cargarTabla(){
        try{
            MascotaControl controlador = new MascotaControl();
            ArrayList<Mascota> listaMascotas = controlador.listarMascotas("id_cliente",consulta.getId_cliente());
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
            Object[] fila = {id, nombres, "No atendido"};
            modeloTabla.addRow(fila);
        }
    }
    
    private void actualizarTabla(String idMascota){
        for(int i = 0; i < modeloTabla.getRowCount(); i++){
            String id = (String)modeloTabla.getValueAt(i, 0);
            if(id.equals(idMascota)){
                modeloTabla.setValueAt("Atendido", i, 2);
            }
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
            setMensaje("error","Debe ingresar el ID de la mascota");
            return false;
        }
        return true;
    }
    
    private void limpiarEntradas(){
        txtID.setText("");
        txtMotivo.setText("");
        txtDiagnostico.setText("");
        txtNotasMedicas.setText("");
        txtID.requestFocus();
    }
    
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if(verificacion()){
            idMascota = txtID.getText();
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
                consulta.getDetalles().add(dc);
                
                int opcion = JOptionPane.showOptionDialog(null, "¿Quiere añadir otra mascota a la consulta?", 
                    "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);

                if (opcion == JOptionPane.YES_OPTION) {
                    limpiarEntradas();
                    actualizarTabla(idMascota);
                    
                }else {
                    controlador.guardarDetalleConsulta(consulta);
                    setMensaje("info", "Se guardo la informacion exitosamente");
                    this.setVisible(false);
                    int opcion2 = JOptionPane.showOptionDialog(null, "¿Quiere realizar una factura para esta consulta?", 
                        "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                    
                    if(opcion2 == JOptionPane.YES_OPTION){
                        frmPadre.actualizarPanelContenido(new RegistrarVenta(frmPadre, consulta.getIdConsulta()));
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Se envio una notificación al área de facturacion");
                    }
                }
                
            }catch(Exception ex){
                setMensaje("error", ex.getMessage());
            }
            
        }
        
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
        try{
            ConsultaControl controlador = new ConsultaControl();
            controlador.eliminarConsulta(consulta.getIdConsulta());
        }catch(Exception ex){ }
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JTable tblMascotas;
    private javax.swing.JTextField txtDiagnostico;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMotivo;
    private javax.swing.JTextField txtNotasMedicas;
    // End of variables declaration//GEN-END:variables
}
