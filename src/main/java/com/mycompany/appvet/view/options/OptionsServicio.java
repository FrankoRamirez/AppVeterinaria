package com.mycompany.appvet.view.options;

import com.mycompany.appvet.view.MenuPrincipal;
import com.mycompany.appvet.view.content.ActualizarServicio;
import com.mycompany.appvet.view.content.EliminarServicio;
import com.mycompany.appvet.view.content.GuardarServicio;
import com.mycompany.appvet.view.content.VerServicio;

public class OptionsServicio extends javax.swing.JPanel {

    MenuPrincipal frmPadre;
    
    public OptionsServicio(MenuPrincipal padre) {
        initComponents();
        frmPadre = padre;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnRegistrarServicio = new javax.swing.JButton();
        btnActualizarServicio = new javax.swing.JButton();
        btnEliminarServicio = new javax.swing.JButton();
        btnVerServicio = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(187, 253, 187));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(190, 420));
        jPanel2.setRequestFocusEnabled(false);

        btnRegistrarServicio.setText("Registrar Servicio");
        btnRegistrarServicio.setBorder(null);
        btnRegistrarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarServicioActionPerformed(evt);
            }
        });

        btnActualizarServicio.setText("Actualizar Servicio");
        btnActualizarServicio.setBorder(null);
        btnActualizarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarServicioActionPerformed(evt);
            }
        });

        btnEliminarServicio.setText("Eliminar Servicio");
        btnEliminarServicio.setBorder(null);
        btnEliminarServicio.setPreferredSize(new java.awt.Dimension(83, 40));
        btnEliminarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarServicioActionPerformed(evt);
            }
        });

        btnVerServicio.setText("Ver Servicio");
        btnVerServicio.setBorder(null);
        btnVerServicio.setPreferredSize(new java.awt.Dimension(57, 40));
        btnVerServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerServicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegistrarServicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnEliminarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnActualizarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnVerServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnRegistrarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVerServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnVerServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerServicioActionPerformed
        frmPadre.actualizarPanelContenido(new VerServicio());
    }//GEN-LAST:event_btnVerServicioActionPerformed

    private void btnRegistrarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarServicioActionPerformed
        frmPadre.actualizarPanelContenido(new GuardarServicio());
    }//GEN-LAST:event_btnRegistrarServicioActionPerformed

    private void btnActualizarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarServicioActionPerformed
        frmPadre.actualizarPanelContenido(new ActualizarServicio());
    }//GEN-LAST:event_btnActualizarServicioActionPerformed

    private void btnEliminarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarServicioActionPerformed
        frmPadre.actualizarPanelContenido(new EliminarServicio());
    }//GEN-LAST:event_btnEliminarServicioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarServicio;
    private javax.swing.JButton btnEliminarServicio;
    private javax.swing.JButton btnRegistrarServicio;
    private javax.swing.JButton btnVerServicio;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
