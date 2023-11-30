package com.mycompany.appvet.view.options;

import com.mycompany.appvet.view.content.ActualizarCliente;
import com.mycompany.appvet.view.content.EliminarCliente;
import com.mycompany.appvet.view.content.GuardarCliente;
import com.mycompany.appvet.view.MenuPrincipal;
import com.mycompany.appvet.view.content.VerClientes;

public class OptionsCliente extends javax.swing.JPanel {

    MenuPrincipal frmPadre;
    
    public OptionsCliente(MenuPrincipal padre) {
        initComponents();
        frmPadre = padre;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnRegistrarCliente = new javax.swing.JButton();
        btnActualizarCliente = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();
        btnVerCliente = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(187, 253, 187));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(190, 420));
        jPanel2.setRequestFocusEnabled(false);

        btnRegistrarCliente.setText("Registrar Cliente");
        btnRegistrarCliente.setBorder(null);
        btnRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarClienteActionPerformed(evt);
            }
        });

        btnActualizarCliente.setText("Actualizar Cliente");
        btnActualizarCliente.setBorder(null);
        btnActualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarClienteActionPerformed(evt);
            }
        });

        btnEliminarCliente.setText("Eliminar Cliente");
        btnEliminarCliente.setBorder(null);
        btnEliminarCliente.setPreferredSize(new java.awt.Dimension(83, 40));
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });

        btnVerCliente.setText("Ver Cliente");
        btnVerCliente.setBorder(null);
        btnVerCliente.setPreferredSize(new java.awt.Dimension(57, 40));
        btnVerCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegistrarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnActualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnVerCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnRegistrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVerCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(217, Short.MAX_VALUE))
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

    private void btnVerClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerClienteActionPerformed
        frmPadre.actualizarPanelContenido(new VerClientes());
    }//GEN-LAST:event_btnVerClienteActionPerformed

    private void btnRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarClienteActionPerformed
        frmPadre.actualizarPanelContenido(new GuardarCliente());
    }//GEN-LAST:event_btnRegistrarClienteActionPerformed

    private void btnActualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarClienteActionPerformed
        frmPadre.actualizarPanelContenido(new ActualizarCliente());
    }//GEN-LAST:event_btnActualizarClienteActionPerformed

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
        frmPadre.actualizarPanelContenido(new EliminarCliente());
    }//GEN-LAST:event_btnEliminarClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarCliente;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnRegistrarCliente;
    private javax.swing.JButton btnVerCliente;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
