package com.mycompany.appvet.view;

import com.mycompany.appvet.model.Empleado;
import com.mycompany.appvet.view.options.OptionsCliente;
import com.mycompany.appvet.view.options.OptionsConsulta;
import com.mycompany.appvet.view.options.OptionsEmpleado;
import com.mycompany.appvet.view.options.OptionsEmpleado_Admin;
import com.mycompany.appvet.view.options.OptionsMascota;
import com.mycompany.appvet.view.options.OptionsProducto;
import com.mycompany.appvet.view.options.OptionsServicio;
import com.mycompany.appvet.view.options.OptionsVenta;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MenuPrincipal extends javax.swing.JFrame {

    private final Empleado usuario;
    
    public MenuPrincipal(Empleado emp) {
        initComponents();
        this.setLocationRelativeTo(null);
        SetImageLabel(jLabel4);
        usuario = emp;
        lblBienvenida.setText("Bienvenido " + emp.getNombres());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnCliente = new javax.swing.JButton();
        btnMascota = new javax.swing.JButton();
        btnServicio = new javax.swing.JButton();
        btnProducto = new javax.swing.JButton();
        btnEmpleado = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnConsultas = new javax.swing.JButton();
        panelOpciones = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panelContenido = new javax.swing.JPanel();
        lblBienvenida = new javax.swing.JLabel();
        panelOpciones1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA VETERINARIA");

        jPanel3.setBackground(new java.awt.Color(252, 235, 147));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnCliente.setText("CLIENTE");
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        btnMascota.setText("MASCOTA");
        btnMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMascotaActionPerformed(evt);
            }
        });

        btnServicio.setText("SERVICIO");
        btnServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServicioActionPerformed(evt);
            }
        });

        btnProducto.setText("PRODUCTO");
        btnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoActionPerformed(evt);
            }
        });

        btnEmpleado.setText("EMPLEADO");
        btnEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadoActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(252, 63, 63));
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnVentas.setText("VENTAS");
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });

        btnConsultas.setText("CONSULTAS");
        btnConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );

        panelOpciones.setBackground(new java.awt.Color(187, 253, 187));
        panelOpciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelOpciones.setPreferredSize(new java.awt.Dimension(190, 420));

        jLabel2.setText("AQUI APARECERAN");

        jLabel3.setText("SUS OPCIONES");

        javax.swing.GroupLayout panelOpcionesLayout = new javax.swing.GroupLayout(panelOpciones);
        panelOpciones.setLayout(panelOpcionesLayout);
        panelOpcionesLayout.setHorizontalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcionesLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        panelOpcionesLayout.setVerticalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOpcionesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelContenido.setBackground(new java.awt.Color(184, 216, 248));
        panelContenido.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "BIENVENIDA", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        panelContenido.setPreferredSize(new java.awt.Dimension(760, 530));

        lblBienvenida.setText("Le damos la bienvenida");

        javax.swing.GroupLayout panelContenidoLayout = new javax.swing.GroupLayout(panelContenido);
        panelContenido.setLayout(panelContenidoLayout);
        panelContenidoLayout.setHorizontalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblBienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(601, 601, 601))
        );
        panelContenidoLayout.setVerticalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblBienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(457, 457, 457))
        );

        panelOpciones1.setBackground(new java.awt.Color(187, 253, 187));
        panelOpciones1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelOpciones1.setPreferredSize(new java.awt.Dimension(190, 110));

        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout panelOpciones1Layout = new javax.swing.GroupLayout(panelOpciones1);
        panelOpciones1.setLayout(panelOpciones1Layout);
        panelOpciones1Layout.setHorizontalGroup(
            panelOpciones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOpciones1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelOpciones1Layout.setVerticalGroup(
            panelOpciones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOpciones1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelOpciones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(panelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(panelOpciones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SetImageLabel(JLabel labelName){
        labelName.setText("");
        ImageIcon image = new ImageIcon(getClass().getResource("/LogoVeterinaria.png"));
        Icon icon = new ImageIcon (image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }

    public void actualizarPanelContenido(javax.swing.JPanel content){
        content.setSize(panelContenido.getSize());
        content.setLocation(0, 0);
        
        panelContenido.removeAll();
        panelContenido.add(content, BorderLayout.CENTER);
        panelContenido.revalidate();
        panelContenido.repaint();
        
        this.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                content.setSize(panelContenido.getSize());
                content.revalidate();
                content.repaint();
            }
        });
    }
    
    private void actualizarPanelOpciones(javax.swing.JPanel options){
        options.setSize(panelContenido.getSize());
        options.setLocation(0, 0);
        
        panelOpciones.removeAll();
        panelOpciones.add(options, BorderLayout.CENTER);
        panelOpciones.revalidate();
        panelOpciones.repaint();
        
        this.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                options.setSize(panelOpciones.getSize());
                options.revalidate();
                options.repaint();
            }
        });
    }
    
    public Empleado obtenerUsuario(){
        return usuario;
    }
    
    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        actualizarPanelOpciones(new OptionsCliente(this));
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServicioActionPerformed
        actualizarPanelOpciones(new OptionsServicio(this));
    }//GEN-LAST:event_btnServicioActionPerformed

    private void btnMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMascotaActionPerformed
        actualizarPanelOpciones(new OptionsMascota(this));
    }//GEN-LAST:event_btnMascotaActionPerformed

    private void btnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoActionPerformed
        actualizarPanelOpciones(new OptionsProducto(this));
    }//GEN-LAST:event_btnProductoActionPerformed

    private void btnEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadoActionPerformed
        if(usuario.getTipo().equals("Administrador")){
            actualizarPanelOpciones(new OptionsEmpleado_Admin(this));
        }else{
            actualizarPanelOpciones(new OptionsEmpleado(this));
        }
    }//GEN-LAST:event_btnEmpleadoActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        actualizarPanelOpciones(new OptionsVenta(this));
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultasActionPerformed
        actualizarPanelOpciones(new OptionsConsulta(this));
    }//GEN-LAST:event_btnConsultasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal(new Empleado()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnConsultas;
    private javax.swing.JButton btnEmpleado;
    private javax.swing.JButton btnMascota;
    private javax.swing.JButton btnProducto;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnServicio;
    private javax.swing.JButton btnVentas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JPanel panelOpciones;
    private javax.swing.JPanel panelOpciones1;
    // End of variables declaration//GEN-END:variables
}
