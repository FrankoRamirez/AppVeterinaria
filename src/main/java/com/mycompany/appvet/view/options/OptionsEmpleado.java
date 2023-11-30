package com.mycompany.appvet.view.options;

import com.mycompany.appvet.view.MenuPrincipal;
import com.mycompany.appvet.view.content.VerPerfilEmpleado;

public class OptionsEmpleado extends javax.swing.JPanel {

    MenuPrincipal frmPadre;
    
    public OptionsEmpleado(MenuPrincipal padre) {
        initComponents();
        frmPadre = padre;
        frmPadre.actualizarPanelContenido(new VerPerfilEmpleado(frmPadre));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnRegistrarEmpleado = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(187, 253, 187));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(190, 420));
        jPanel2.setRequestFocusEnabled(false);

        btnRegistrarEmpleado.setText("Ver Perfil");
        btnRegistrarEmpleado.setBorder(null);
        btnRegistrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEmpleadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegistrarEmpleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnRegistrarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(355, Short.MAX_VALUE))
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

    private void btnRegistrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEmpleadoActionPerformed
        //frmPadre.actualizarPanelContenido(new VerPerfilEmpleado(frmPadre));
    }//GEN-LAST:event_btnRegistrarEmpleadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarEmpleado;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
