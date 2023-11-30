package com.mycompany.appvet.view.content;

import com.mycompany.appvet.control.VentaControl;
import com.mycompany.appvet.model.Factura;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class VerVentas extends javax.swing.JPanel {

    private int idFactura;
    private String cliente;
    private String empleado;
    private String fecha;
    private double importe;
    
    DecimalFormat df = new DecimalFormat("0.00");
    
    DefaultTableModel modeloTabla;
    String[] cabecera = {"ID", "CLIENTE", "EMPLEADO", "FECHA", "IMPORTE"};
    String[][] data = {};
    
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
    
    public VerVentas() {
        initComponents();
        lblMensaje.setText("");
        modeloTabla = new DefaultTableModel(data, cabecera);
        tblClientes.setModel(modeloTabla);
        txtClave.setVisible(false);
        cargarTabla();
        interaccionComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblMensaje = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        cbxFiltro = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 821, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 524, Short.MAX_VALUE)
        );

        setPreferredSize(new java.awt.Dimension(760, 530));

        jPanel2.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(760, 530));

        jPanel5.setBackground(new java.awt.Color(184, 216, 248));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "VER VENTAS"));
        jPanel5.setPreferredSize(new java.awt.Dimension(760, 420));

        lblMensaje.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMensaje.setText("jLabel23");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblClientes);

        cbxFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mostrar todos", "Cliente DNI", "Cliente ID", "Empleado ID", "Ultimos agregados" }));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Filtrar ventas por:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblMensaje)
                        .addGap(0, 682, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMensaje)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 179, 141));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setPreferredSize(new java.awt.Dimension(760, 110));

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(277, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void cargarTabla(){
        try{
            VentaControl controlador = new VentaControl();
            ArrayList<Factura> listaVentas = controlador.obtenerVentas("todos","");
            actualizarTabla(listaVentas);
            
        }catch (Exception ex){
            setMensaje("error", "Hubo un problema al obtener las ventas de la base de datos: "+ex.getMessage());
        }
    }
    
    private void interaccionComboBox(){
        cbxFiltro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String opcion = cbxFiltro.getSelectedItem().toString();
                
                if (opcion.equals("Cliente DNI") || opcion.equals("Cliente ID") || opcion.equals("Empleado ID")) {
                    txtClave.setVisible(true);
                    txtClave.setText("");
                }else {
                    txtClave.setVisible(false);
                }
                
                updateUI();
            }
        });
    }
    
    private void actualizarTabla(ArrayList<Factura> listaVentas){
        limpiarTabla();
        for(Factura f: listaVentas){
            idFactura = f.getId_factura();
            cliente = f.getCliente();
            empleado = f.getEmpleado();
            fecha = f.getFecha();
            importe = f.getImporte();
            Object[] fila = {idFactura, cliente, empleado, fecha, df.format(importe)};
            modeloTabla.addRow(fila);
        }
    }
    
    private void limpiarTabla(){
        int rowCount = modeloTabla.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            modeloTabla.removeRow(i);
        }
    }
    
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
    
    private void limpiarEntradas(){
        txtClave.setText("");
        cbxFiltro.setSelectedIndex(0);
    }
    
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try{
            VentaControl controlador = new VentaControl();
            ArrayList<Factura> listaVentas;
            String filtro = cbxFiltro.getSelectedItem().toString();
            
            switch(filtro){
                case "Mostrar todos" -> {
                    listaVentas = controlador.obtenerVentas("todos", "");
                }
                case "Cliente DNI" -> {
                    if(txtClave.getText().equals("")){
                        throw new Exception ("Debe ingresar la palabra clave para buscar");
                    }else{
                        listaVentas = controlador.obtenerVentas("cliente dni",txtClave.getText());
                    }
                }
                case "Cliente ID" -> {
                    if(txtClave.getText().equals("")){
                        throw new Exception ("Debe ingresar la palabra clave para buscar");
                    }else{
                        listaVentas = controlador.obtenerVentas("cliente id",txtClave.getText());
                    }
                }
                case "Empleado ID" -> {
                    if(txtClave.getText().equals("")){
                        throw new Exception ("Debe ingresar la palabra clave para buscar");
                    }else{
                        listaVentas = controlador.obtenerVentas("empleado id",txtClave.getText());
                    }
                }
                case "Ultimos agregados" -> {
                    listaVentas = controlador.obtenerVentas("recien agregado", "");
                }
                default -> {
                    listaVentas = controlador.obtenerVentas("todos", "");
                }
            }
            
            actualizarTabla(listaVentas);
            
        }catch(Exception ex){
            setMensaje("error", ex.getMessage());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarEntradas();
        cargarTabla();
    }//GEN-LAST:event_btnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cbxFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtClave;
    // End of variables declaration//GEN-END:variables
}
