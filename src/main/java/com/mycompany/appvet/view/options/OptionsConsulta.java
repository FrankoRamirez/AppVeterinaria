package com.mycompany.appvet.view.options;

import com.mycompany.appvet.view.MenuPrincipal;
import com.mycompany.appvet.view.content.ActualizarConsulta;
import com.mycompany.appvet.view.content.EliminarConsulta;
import com.mycompany.appvet.view.content.GuardarConsulta;
import com.mycompany.appvet.view.content.VerConsultas;
import com.mycompany.appvet.view.content.VerRegistroMedico;

public class OptionsConsulta extends javax.swing.JPanel {

    MenuPrincipal frmPadre;
    
    public OptionsConsulta(MenuPrincipal padre) {
        initComponents();
        frmPadre = padre;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnRegistrarConsulta = new javax.swing.JButton();
        btnActualizarConsulta = new javax.swing.JButton();
        btnEliminarConsulta = new javax.swing.JButton();
        btnVerConsultas = new javax.swing.JButton();
        btnVerRegistroMedico = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(187, 253, 187));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(190, 420));
        jPanel2.setRequestFocusEnabled(false);

        btnRegistrarConsulta.setText("Crear Consulta");
        btnRegistrarConsulta.setBorder(null);
        btnRegistrarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarConsultaActionPerformed(evt);
            }
        });

        btnActualizarConsulta.setText("Actualizar Consulta");
        btnActualizarConsulta.setBorder(null);
        btnActualizarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarConsultaActionPerformed(evt);
            }
        });

        btnEliminarConsulta.setText("Eliminar Consulta");
        btnEliminarConsulta.setBorder(null);
        btnEliminarConsulta.setPreferredSize(new java.awt.Dimension(83, 40));
        btnEliminarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarConsultaActionPerformed(evt);
            }
        });

        btnVerConsultas.setText("Ver Consultas");
        btnVerConsultas.setBorder(null);
        btnVerConsultas.setPreferredSize(new java.awt.Dimension(57, 40));
        btnVerConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerConsultasActionPerformed(evt);
            }
        });

        btnVerRegistroMedico.setText("Ver Registro Medico");
        btnVerRegistroMedico.setBorder(null);
        btnVerRegistroMedico.setPreferredSize(new java.awt.Dimension(57, 40));
        btnVerRegistroMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerRegistroMedicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegistrarConsulta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnEliminarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnActualizarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnVerConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnVerRegistroMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnRegistrarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVerConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVerRegistroMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
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

    private void btnVerConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerConsultasActionPerformed
        frmPadre.actualizarPanelContenido(new VerConsultas());
    }//GEN-LAST:event_btnVerConsultasActionPerformed

    private void btnRegistrarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarConsultaActionPerformed
        frmPadre.actualizarPanelContenido(new GuardarConsulta(frmPadre));
    }//GEN-LAST:event_btnRegistrarConsultaActionPerformed

    private void btnActualizarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarConsultaActionPerformed
        frmPadre.actualizarPanelContenido(new ActualizarConsulta());
    }//GEN-LAST:event_btnActualizarConsultaActionPerformed

    private void btnEliminarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarConsultaActionPerformed
        frmPadre.actualizarPanelContenido(new EliminarConsulta());
    }//GEN-LAST:event_btnEliminarConsultaActionPerformed

    private void btnVerRegistroMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerRegistroMedicoActionPerformed
        frmPadre.actualizarPanelContenido(new VerRegistroMedico());
    }//GEN-LAST:event_btnVerRegistroMedicoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarConsulta;
    private javax.swing.JButton btnEliminarConsulta;
    private javax.swing.JButton btnRegistrarConsulta;
    private javax.swing.JButton btnVerConsultas;
    private javax.swing.JButton btnVerRegistroMedico;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
