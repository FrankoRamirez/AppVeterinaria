package com.mycompany.appvet.view.options;

import com.mycompany.appvet.view.MenuPrincipal;
import com.mycompany.appvet.view.content.ActualizarEmpleado;
import com.mycompany.appvet.view.content.EliminarEmpleado;
import com.mycompany.appvet.view.content.GuardarEmpleado;
import com.mycompany.appvet.view.content.VerEmpleados;

public class OptionsEmpleado_Admin extends javax.swing.JPanel {

    MenuPrincipal frmPadre;
    
    public OptionsEmpleado_Admin(MenuPrincipal padre) {
        initComponents();
        frmPadre = padre;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnRegistrarEmpleado = new javax.swing.JButton();
        btnActualizarEmpleado = new javax.swing.JButton();
        btnEliminarEmpleado = new javax.swing.JButton();
        btnVerEmpleado = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(187, 253, 187));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(190, 420));
        jPanel2.setRequestFocusEnabled(false);

        btnRegistrarEmpleado.setText("Registrar Empleado");
        btnRegistrarEmpleado.setBorder(null);
        btnRegistrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEmpleadoActionPerformed(evt);
            }
        });

        btnActualizarEmpleado.setText("Actualizar Empleado");
        btnActualizarEmpleado.setBorder(null);
        btnActualizarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarEmpleadoActionPerformed(evt);
            }
        });

        btnEliminarEmpleado.setText("Eliminar Empleado");
        btnEliminarEmpleado.setBorder(null);
        btnEliminarEmpleado.setPreferredSize(new java.awt.Dimension(83, 40));
        btnEliminarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEmpleadoActionPerformed(evt);
            }
        });

        btnVerEmpleado.setText("Ver Empleado");
        btnVerEmpleado.setBorder(null);
        btnVerEmpleado.setPreferredSize(new java.awt.Dimension(57, 40));
        btnVerEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerEmpleadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegistrarEmpleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnEliminarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnActualizarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnVerEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnRegistrarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVerEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnVerEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerEmpleadoActionPerformed
        frmPadre.actualizarPanelContenido(new VerEmpleados());
    }//GEN-LAST:event_btnVerEmpleadoActionPerformed

    private void btnRegistrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEmpleadoActionPerformed
        frmPadre.actualizarPanelContenido(new GuardarEmpleado());
    }//GEN-LAST:event_btnRegistrarEmpleadoActionPerformed

    private void btnActualizarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarEmpleadoActionPerformed
        frmPadre.actualizarPanelContenido(new ActualizarEmpleado());
    }//GEN-LAST:event_btnActualizarEmpleadoActionPerformed

    private void btnEliminarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEmpleadoActionPerformed
        frmPadre.actualizarPanelContenido(new EliminarEmpleado());
    }//GEN-LAST:event_btnEliminarEmpleadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarEmpleado;
    private javax.swing.JButton btnEliminarEmpleado;
    private javax.swing.JButton btnRegistrarEmpleado;
    private javax.swing.JButton btnVerEmpleado;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
