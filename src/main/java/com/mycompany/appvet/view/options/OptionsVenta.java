package com.mycompany.appvet.view.options;

import com.mycompany.appvet.view.MenuPrincipal;
import com.mycompany.appvet.view.content.RegistrarVenta;
import com.mycompany.appvet.view.content.VerVentas;
import com.mycompany.appvet.view.content.VerVentasPendientes;

public class OptionsVenta extends javax.swing.JPanel {

    MenuPrincipal frmPadre;
    
    public OptionsVenta(MenuPrincipal padre) {
        initComponents();
        frmPadre = padre;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnRealizarVenta = new javax.swing.JButton();
        btnVerVentas = new javax.swing.JButton();
        btnVerVentasPendientes = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(187, 253, 187));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(190, 420));
        jPanel2.setRequestFocusEnabled(false);

        btnRealizarVenta.setText("Realizar Venta");
        btnRealizarVenta.setBorder(null);
        btnRealizarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarVentaActionPerformed(evt);
            }
        });

        btnVerVentas.setText("Ver Ventas");
        btnVerVentas.setBorder(null);
        btnVerVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerVentasActionPerformed(evt);
            }
        });

        btnVerVentasPendientes.setText("Ver Ventas Pendientes");
        btnVerVentasPendientes.setBorder(null);
        btnVerVentasPendientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerVentasPendientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(btnRealizarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnVerVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnVerVentasPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnRealizarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVerVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVerVentasPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(251, Short.MAX_VALUE))
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

    private void btnRealizarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarVentaActionPerformed
        frmPadre.actualizarPanelContenido(new RegistrarVenta(frmPadre, 0));
    }//GEN-LAST:event_btnRealizarVentaActionPerformed

    private void btnVerVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerVentasActionPerformed
        frmPadre.actualizarPanelContenido(new VerVentas());
    }//GEN-LAST:event_btnVerVentasActionPerformed

    private void btnVerVentasPendientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerVentasPendientesActionPerformed
        frmPadre.actualizarPanelContenido(new VerVentasPendientes(frmPadre));
    }//GEN-LAST:event_btnVerVentasPendientesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRealizarVenta;
    private javax.swing.JButton btnVerVentas;
    private javax.swing.JButton btnVerVentasPendientes;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
