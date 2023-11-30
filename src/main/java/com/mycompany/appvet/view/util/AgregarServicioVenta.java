package com.mycompany.appvet.view.util;

import com.mycompany.appvet.control.ServicioControl;
import com.mycompany.appvet.model.Empleado;
import com.mycompany.appvet.model.Servicio;
import com.mycompany.appvet.view.MenuPrincipal;
import com.mycompany.appvet.view.content.RegistrarVenta;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.Timer;

public class AgregarServicioVenta extends javax.swing.JDialog {

    private String id;
    private String servicio;
    private double precio;
    private int cantidad;
    
    ArrayList<Servicio> listaServicios = new ArrayList<>();
    ArrayList<String> servicios = new ArrayList<>();
    
    RegistrarVenta vista;
    
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
    
    public AgregarServicioVenta(java.awt.Frame parent, boolean modal, RegistrarVenta vista) {
        super(parent, modal);
        initComponents();
        cargarComboBox();
        lblMensaje.setText("");
        this.vista = vista;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtServicio = new javax.swing.JTextField();
        cbxServicios = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lblMensaje = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "AGREGAR UN PRODUCTO A LA VENTA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(351, 390));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Cantidad:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Precio:");

        cbxServicios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        cbxServicios.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        lblMensaje.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMensaje.setText("jLabel5");

        txtPrecio.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addGap(50, 50, 50)
                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblMensaje))
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addComponent(lblMensaje)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
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
    
    private void cargarComboBox(){
        try{
            ServicioControl controlador = new ServicioControl();
            listaServicios = controlador.listarServicios("alfa","");
            
            for(Servicio s: listaServicios){
                servicios.add(s.getDescripcion());
            }
            
            cbxServicios.addItem("");
            for(String item: servicios){
                cbxServicios.addItem(item);
            }
            
            cbxServicios.getEditor().getEditorComponent().setVisible(false);
            
            txtServicio.addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {
                }
                
                @Override
                public void keyPressed(KeyEvent e) {
                }
                
                @Override
                public void keyReleased(KeyEvent e) {
                    actualizarComboBox(txtServicio.getText());
                }
            });
            
            cbxServicios.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(cbxServicios.getSelectedItem() != null){
                        String servicioSeleccionado = cbxServicios.getSelectedItem().toString();

                        if(servicioSeleccionado.equals("Seleccione")){
                            txtPrecio.setText("");
                        }else{
                            for(Servicio s: listaServicios){
                                if(s.getDescripcion().equals(servicioSeleccionado)){
                                    txtPrecio.setText(s.getCosto()+"");
                                    txtServicio.setText(servicioSeleccionado);
                                }
                            }
                        }
                    }
                }
            });
            
        }catch(Exception ex){
            setMensaje("error", "Error al obtener los servicios: "+ex.getMessage());
        }
    }

    private void actualizarComboBox(String input) {
        ArrayList<String> filtro = new ArrayList<>();
        
        filtro.add("Seleccione");
        for (String sugerencia : servicios) {
            if (sugerencia.toLowerCase().contains(input.toLowerCase())) {
                filtro.add(sugerencia);
            }
        }
        
        cbxServicios.removeAllItems();
        for (String suggestion: filtro) {
            cbxServicios.addItem(suggestion);
        }
        
        if (!filtro.isEmpty()) {
            cbxServicios.setPopupVisible(true);
        } else {
            cbxServicios.setPopupVisible(false);
        }
    }
    
    private boolean verificacion(){
        if(txtServicio.getText().equals("")){
            setMensaje("error","Debe seleccionar el servicio");
            return false;
        }
        if(txtCantidad.getText().equals("")){
            setMensaje("error","Debe seleccionar la cantidad de servicios solicitados");
            return false;
        }
        return true;
    }
    
    
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if(verificacion()){
            servicio = txtServicio.getText();
            for(Servicio s: listaServicios){
                if(s.getDescripcion().equals(servicio))
                    id = s.getId_servicio();
            }
            precio = Double.parseDouble(txtPrecio.getText());
            cantidad = Integer.parseInt(txtCantidad.getText());
            
            vista.agregarEnTabla("SERV", id, servicio, precio, cantidad);
            this.dispose();
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarServicioVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarServicioVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarServicioVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarServicioVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AgregarServicioVenta dialog = new AgregarServicioVenta(new javax.swing.JFrame(), true, new RegistrarVenta(new MenuPrincipal(new Empleado()), 0));
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cbxServicios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtServicio;
    // End of variables declaration//GEN-END:variables
}
