package com.mycompany.appvet.view.options;

import com.mycompany.appvet.view.MenuPrincipal;
import com.mycompany.appvet.view.content.ActualizarMascota;
import com.mycompany.appvet.view.content.EliminarMascota;
import com.mycompany.appvet.view.content.GuardarMascota;
import com.mycompany.appvet.view.content.VerMascotas;

public class OptionsMascota extends javax.swing.JPanel {

    MenuPrincipal frmPadre;
    
    public OptionsMascota(MenuPrincipal padre) {
        initComponents();
        frmPadre = padre;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnRegistrarMascota = new javax.swing.JButton();
        btnActualizarMascota = new javax.swing.JButton();
        btnEliminarMascota = new javax.swing.JButton();
        btnVerMascotas = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(187, 253, 187));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(190, 420));
        jPanel2.setRequestFocusEnabled(false);

        btnRegistrarMascota.setText("Registrar Mascota");
        btnRegistrarMascota.setBorder(null);
        btnRegistrarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarMascotaActionPerformed(evt);
            }
        });

        btnActualizarMascota.setText("Actualizar Mascota");
        btnActualizarMascota.setBorder(null);
        btnActualizarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarMascotaActionPerformed(evt);
            }
        });

        btnEliminarMascota.setText("Eliminar Mascota");
        btnEliminarMascota.setBorder(null);
        btnEliminarMascota.setPreferredSize(new java.awt.Dimension(83, 40));
        btnEliminarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarMascotaActionPerformed(evt);
            }
        });

        btnVerMascotas.setText("Ver Mascotas");
        btnVerMascotas.setBorder(null);
        btnVerMascotas.setPreferredSize(new java.awt.Dimension(57, 40));
        btnVerMascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerMascotasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegistrarMascota, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnEliminarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnActualizarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnVerMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnRegistrarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVerMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnVerMascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerMascotasActionPerformed
        frmPadre.actualizarPanelContenido(new VerMascotas());
    }//GEN-LAST:event_btnVerMascotasActionPerformed

    private void btnRegistrarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarMascotaActionPerformed
        frmPadre.actualizarPanelContenido(new GuardarMascota());
    }//GEN-LAST:event_btnRegistrarMascotaActionPerformed

    private void btnActualizarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarMascotaActionPerformed
        frmPadre.actualizarPanelContenido(new ActualizarMascota());
    }//GEN-LAST:event_btnActualizarMascotaActionPerformed

    private void btnEliminarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMascotaActionPerformed
        frmPadre.actualizarPanelContenido(new EliminarMascota());
    }//GEN-LAST:event_btnEliminarMascotaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarMascota;
    private javax.swing.JButton btnEliminarMascota;
    private javax.swing.JButton btnRegistrarMascota;
    private javax.swing.JButton btnVerMascotas;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
