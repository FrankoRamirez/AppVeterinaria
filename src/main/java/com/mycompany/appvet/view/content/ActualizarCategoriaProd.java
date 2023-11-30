package com.mycompany.appvet.view.content;

import com.mycompany.appvet.control.CategoriaProdControl;
import com.mycompany.appvet.model.CategoriaProd;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class ActualizarCategoriaProd extends javax.swing.JPanel {

    private String idCat;
    private String nombre;
    
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
    
    public ActualizarCategoriaProd() {
        initComponents();
        lblMensaje.setText("");
        btnAceptar.setEnabled(false);
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
        jLabel20 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
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
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "ACTUALIZAR CATEGORIA PRODUCTO"));
        jPanel5.setPreferredSize(new java.awt.Dimension(760, 420));

        lblMensaje.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMensaje.setText("jLabel23");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Buscar categoria por ID:");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel20.setText("NOMBRE:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)
                        .addGap(37, 37, 37)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel20)
                        .addGap(38, 38, 38)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMensaje)))
                .addContainerGap(229, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 265, Short.MAX_VALUE)
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
        if(txtNombre.getText().equals("")){
            setMensaje("error","Debe ingresar el nombre de la categoria");
            return false;
        }
        return true;
    }
    
    private void limpiarEntradas(){
        txtID.setText("");
        txtNombre.setText("");
    }
    
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if(verificacion()){
            nombre = txtNombre.getText();
            
            try{
                CategoriaProdControl controlador = new CategoriaProdControl();
                CategoriaProd c = new CategoriaProd();
                c.setId_categoria(idCat);
                c.setNombre(nombre);
                controlador.actualizarCategoriaProducto(c);
                setMensaje("info", "Se actualizo la categoria exitosamente");
                limpiarEntradas();
                btnAceptar.setEnabled(false);
            
            }catch(Exception ex){
                setMensaje("error", "Error al actualizar la categoria: "+ex.getMessage());
            }
        }
        
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if(txtID.getText().equals("")){
            setMensaje("error", "Debe ingresar el ID de la categoria a buscar");
        }else{
            idCat = txtID.getText();
            try{
                CategoriaProdControl controlador = new CategoriaProdControl();
                CategoriaProd c = controlador.buscarCategoriaProducto(idCat);
                if(c.getId_categoria().equals("-1")){
                    throw new Exception("Categoria no encontrada");
                }else{
                    txtNombre.setText(c.getNombre());
                    setMensaje("info","Ya puede actualizar la información de esta categoria");
                    btnAceptar.setEnabled(true);
                }
            }catch(Exception ex){
                setMensaje("error", "Error al buscar la categoria: "+ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
