package com.mycompany.appvet.view.options;

import com.mycompany.appvet.view.MenuPrincipal;
import com.mycompany.appvet.view.content.ActualizarCategoriaProd;
import com.mycompany.appvet.view.content.ActualizarProducto;
import com.mycompany.appvet.view.content.EliminarCategoriaProd;
import com.mycompany.appvet.view.content.EliminarProducto;
import com.mycompany.appvet.view.content.GuardarCategoriaProd;
import com.mycompany.appvet.view.content.GuardarProducto;
import com.mycompany.appvet.view.content.VerCategoriasProd;
import com.mycompany.appvet.view.content.VerProductos;

public class OptionsProducto extends javax.swing.JPanel {

    MenuPrincipal frmPadre;
    
    public OptionsProducto(MenuPrincipal padre) {
        initComponents();
        frmPadre = padre;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnRegistrarP = new javax.swing.JButton();
        btnActualizarP = new javax.swing.JButton();
        btnEliminarP = new javax.swing.JButton();
        btnVerP = new javax.swing.JButton();
        btnRegistrarCat = new javax.swing.JButton();
        btnActualizarCat = new javax.swing.JButton();
        btnEliminarCat = new javax.swing.JButton();
        btnVerCat = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(187, 253, 187));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(190, 420));
        jPanel2.setRequestFocusEnabled(false);

        btnRegistrarP.setText("Registrar Producto");
        btnRegistrarP.setBorder(null);
        btnRegistrarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPActionPerformed(evt);
            }
        });

        btnActualizarP.setText("Actualizar Producto");
        btnActualizarP.setBorder(null);
        btnActualizarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarPActionPerformed(evt);
            }
        });

        btnEliminarP.setText("Eliminar Producto");
        btnEliminarP.setBorder(null);
        btnEliminarP.setPreferredSize(new java.awt.Dimension(83, 40));
        btnEliminarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPActionPerformed(evt);
            }
        });

        btnVerP.setText("Ver Productos");
        btnVerP.setBorder(null);
        btnVerP.setPreferredSize(new java.awt.Dimension(57, 40));
        btnVerP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPActionPerformed(evt);
            }
        });

        btnRegistrarCat.setText("Registrar Categoria");
        btnRegistrarCat.setBorder(null);
        btnRegistrarCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarCatActionPerformed(evt);
            }
        });

        btnActualizarCat.setText("Actualizar Categoria");
        btnActualizarCat.setBorder(null);
        btnActualizarCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarCatActionPerformed(evt);
            }
        });

        btnEliminarCat.setText("Eliminar Categoria");
        btnEliminarCat.setBorder(null);
        btnEliminarCat.setPreferredSize(new java.awt.Dimension(83, 40));
        btnEliminarCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCatActionPerformed(evt);
            }
        });

        btnVerCat.setText("Ver Categorias");
        btnVerCat.setBorder(null);
        btnVerCat.setPreferredSize(new java.awt.Dimension(57, 40));
        btnVerCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerCatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegistrarP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnEliminarP, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnActualizarP, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnVerP, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btnRegistrarCat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnEliminarCat, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnActualizarCat, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnVerCat, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnRegistrarP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizarP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVerP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarCat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizarCat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVerCat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
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

    private void btnVerPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPActionPerformed
        frmPadre.actualizarPanelContenido(new VerProductos());
    }//GEN-LAST:event_btnVerPActionPerformed

    private void btnRegistrarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPActionPerformed
        frmPadre.actualizarPanelContenido(new GuardarProducto());
    }//GEN-LAST:event_btnRegistrarPActionPerformed

    private void btnActualizarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarPActionPerformed
        frmPadre.actualizarPanelContenido(new ActualizarProducto());
    }//GEN-LAST:event_btnActualizarPActionPerformed

    private void btnEliminarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPActionPerformed
        frmPadre.actualizarPanelContenido(new EliminarProducto());
    }//GEN-LAST:event_btnEliminarPActionPerformed

    private void btnRegistrarCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarCatActionPerformed
        frmPadre.actualizarPanelContenido(new GuardarCategoriaProd());
    }//GEN-LAST:event_btnRegistrarCatActionPerformed

    private void btnActualizarCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarCatActionPerformed
        frmPadre.actualizarPanelContenido(new ActualizarCategoriaProd());
    }//GEN-LAST:event_btnActualizarCatActionPerformed

    private void btnEliminarCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCatActionPerformed
        frmPadre.actualizarPanelContenido(new EliminarCategoriaProd());
    }//GEN-LAST:event_btnEliminarCatActionPerformed

    private void btnVerCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerCatActionPerformed
        frmPadre.actualizarPanelContenido(new VerCategoriasProd());
    }//GEN-LAST:event_btnVerCatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarCat;
    private javax.swing.JButton btnActualizarP;
    private javax.swing.JButton btnEliminarCat;
    private javax.swing.JButton btnEliminarP;
    private javax.swing.JButton btnRegistrarCat;
    private javax.swing.JButton btnRegistrarP;
    private javax.swing.JButton btnVerCat;
    private javax.swing.JButton btnVerP;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
