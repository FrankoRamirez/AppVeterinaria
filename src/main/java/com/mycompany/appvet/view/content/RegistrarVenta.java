package com.mycompany.appvet.view.content;

import com.mycompany.appvet.control.ConsultaControl;
import com.mycompany.appvet.control.VentaControl;
import com.mycompany.appvet.model.Consulta;
import com.mycompany.appvet.model.DetalleFacturaProducto;
import com.mycompany.appvet.model.DetalleFacturaServicio;
import com.mycompany.appvet.model.Factura;
import com.mycompany.appvet.view.MenuPrincipal;
import com.mycompany.appvet.view.util.AgregarProductoVenta;
import com.mycompany.appvet.view.util.AgregarServicioVenta;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class RegistrarVenta extends javax.swing.JPanel {

    private double montoTotal = 0;
    private ArrayList<DetalleFacturaProducto> detalleProd = new ArrayList<>();
    private ArrayList<DetalleFacturaServicio> detalleServ = new ArrayList<>();
    
    MenuPrincipal frmPadre;
    private int consulta;
    
    DecimalFormat df = new DecimalFormat("0.00");
    
    DefaultTableModel modeloTabla;
    String[] cabecera = {"Tipo", "ID", "Nombre", "Precio", "Cantidad", "Importe"};
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
    
    public RegistrarVenta(MenuPrincipal padre, int consulta) {
        initComponents();
        lblMensaje.setText("");
        modeloTabla = new DefaultTableModel(data, cabecera);
        tblDetalle.setModel(modeloTabla);
        frmPadre = padre;
        this.consulta = consulta;
        if(consulta != 0){
            establecerIDCliente();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        lblMensaje = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetalle = new javax.swing.JTable();
        lblMonto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnAgregarProducto = new javax.swing.JButton();
        btnAgregarServicio = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();

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
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "REGISTRAR VENTA"));
        jPanel5.setPreferredSize(new java.awt.Dimension(760, 420));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("DETALLE DE LA VENTA:");

        lblMensaje.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMensaje.setText("jLabel23");

        tblDetalle.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblDetalle);

        lblMonto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMonto.setText("MONTO TOTAL: S/. 0.00");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Ingrese ID del cliente:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblMensaje))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblMonto)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel1)
                                .addGap(37, 37, 37)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMonto)
                .addGap(18, 18, 18)
                .addComponent(lblMensaje)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 179, 141));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setPreferredSize(new java.awt.Dimension(760, 110));

        btnAceptar.setText("ACEPTAR");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAgregarProducto.setText("AGREGAR PRODUCTO");
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });

        btnAgregarServicio.setText("AGREGAR SERVICIO");
        btnAgregarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarServicioActionPerformed(evt);
            }
        });

        btnRemover.setText("REMOVER");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(btnAgregarProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgregarServicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    public void agregarEnTabla(String tipo, String id, String nombre, double precio, int cantidad){
        Object[] fila = {tipo, id, nombre, df.format(precio), cantidad, df.format(precio*cantidad)};
        modeloTabla.addRow(fila);
        
        montoTotal += (precio*cantidad);
        lblMonto.setText("MONTO TOTAL: S/. "+df.format(montoTotal));
    }

    private void establecerIDCliente(){
        ConsultaControl controlador = new ConsultaControl();
        Consulta c = controlador.buscarConsulta(consulta);
        txtID.setText(c.getId_cliente());
        txtID.setEditable(false);
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
    
    private boolean verificacion(){
        if(txtID.getText().equals("")){
            setMensaje("error", "Debe ingresar el ID del cliente");
            return false;
        }
        return true;
    }
    
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if(verificacion()){
            String tipo, nombre, id;
            int cantidad;
            double monto;

            for (int row = 0; row < modeloTabla.getRowCount(); row++) {
                tipo = (String) modeloTabla.getValueAt(row, 0);
                id = (String) modeloTabla.getValueAt(row, 1);
                nombre = (String) modeloTabla.getValueAt(row, 2);
                cantidad = (int) modeloTabla.getValueAt(row, 4);
                monto = Double.parseDouble((String) modeloTabla.getValueAt(row, 5));

                if(tipo.equals("PROD")){
                    DetalleFacturaProducto detalle = new DetalleFacturaProducto();
                    detalle.setId_producto(id);
                    detalle.setNom_producto(nombre);
                    detalle.setCantidad(cantidad);
                    detalle.setMonto(monto);
                    detalleProd.add(detalle);
                }
                else if(tipo.equals("SERV")){
                    DetalleFacturaServicio detalle = new DetalleFacturaServicio();
                    detalle.setId_servicio(id);
                    detalle.setNom_servicio(nombre);
                    detalle.setCantidad(cantidad);
                    detalle.setMonto(monto);
                    detalleServ.add(detalle);
                }
                else{
                    setMensaje("error", "Error interno en procesar el detalle");
                }
            }
            
            Factura f = new Factura();
            f.setId_cliente(txtID.getText());
            f.setId_empleado(frmPadre.obtenerUsuario().getId_empleado());
            f.setImporte(montoTotal);
            
            try{
                VentaControl controlador = new VentaControl();
                controlador.registrarVenta(detalleProd, detalleServ, f, consulta);
                
                frmPadre.actualizarPanelContenido(new VerFactura(detalleProd, detalleServ));
                
            }catch(Exception e){
                setMensaje("error", "ERROR: " + e.getMessage());
                detalleProd.clear();
                detalleServ.clear();
            }
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
        AgregarProductoVenta dialog = new AgregarProductoVenta(new javax.swing.JFrame(), true, this);
        dialog.setVisible(true);
        
    }//GEN-LAST:event_btnAgregarProductoActionPerformed

    private void btnAgregarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarServicioActionPerformed
        AgregarServicioVenta dialog = new AgregarServicioVenta(new javax.swing.JFrame(), true, this);
        dialog.setVisible(true);
        
    }//GEN-LAST:event_btnAgregarServicioActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        if(tblDetalle.getSelectedRow() == -1){
            setMensaje("error", "Debes seleccionar la fila a eliminar");
        }else{
            int fila = tblDetalle.getSelectedRow();
            modeloTabla.removeRow(fila);
        }
    }//GEN-LAST:event_btnRemoverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnAgregarServicio;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblMonto;
    private javax.swing.JTable tblDetalle;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}
