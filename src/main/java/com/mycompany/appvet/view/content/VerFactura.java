package com.mycompany.appvet.view.content;

import com.mycompany.appvet.control.ClienteControl;
import com.mycompany.appvet.control.VentaControl;
import com.mycompany.appvet.model.Cliente;
import com.mycompany.appvet.model.DetalleFacturaProducto;
import com.mycompany.appvet.model.DetalleFacturaServicio;
import com.mycompany.appvet.model.Factura;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class VerFactura extends javax.swing.JPanel {

    ArrayList<DetalleFacturaProducto> detalleProd;
    ArrayList<DetalleFacturaServicio> detalleServ;
    Factura factura;
    Cliente cliente;
    
    DecimalFormat df = new DecimalFormat("0.00");
    
    public VerFactura(ArrayList<DetalleFacturaProducto> detalleProd, 
            ArrayList<DetalleFacturaServicio> detalleServ){
        initComponents();
        this.detalleProd = detalleProd;
        this.detalleServ = detalleServ;
        verFactura();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaFactura = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

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
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "VER FACTURA"));
        jPanel5.setPreferredSize(new java.awt.Dimension(760, 420));

        txaFactura.setColumns(20);
        txaFactura.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txaFactura.setRows(5);
        jScrollPane1.setViewportView(txaFactura);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                .addGap(22, 22, 22))
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

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(385, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void verFactura(){
        try{
            VentaControl controlador1 = new VentaControl();
            factura = controlador1.obtenerUltimaFactura();
            
            ClienteControl controlador2 = new ClienteControl();
            cliente = controlador2.buscarCliente(factura.getId_cliente());
            
            if(factura.getId_factura() == -1)
                throw new Exception ("Error al obtener la factura");
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error al obtener los datos de la factura");
        }
        
        txaFactura.append(
            "----------------- VETERINARIA HEALTHY PETS -----------------" + "\n" +
            "----------------- FACTURA N° " + factura.getId_factura() + " -----------------" + "\n\n" +
            "CLIENTE: " + cliente.getNombres() + "[" + cliente.getDni() + "]" + "\n" +
            "FECHA: " + factura.getFecha() + "\n\n" +
            "DETALLE DE FACTURA: " + "\n"
        );
        
        if(!detalleProd.isEmpty()){
            for(DetalleFacturaProducto p: detalleProd){
                txaFactura.append(
                    String.format("%-6s| %-7s| %-40s| %-4d| %-10s| %n", "PROD", p.getId_producto(),
                            p.getNom_producto(), p.getCantidad(), df.format(p.getMonto()))
                );
            }
        }
        if(!detalleServ.isEmpty()){
            for(DetalleFacturaServicio s: detalleServ){
                txaFactura.append(
                    String.format("%-6s| %-7s| %-40s| %-4d| %-10s| %n", "SERV", s.getId_servicio(),
                            s.getNom_servicio(), s.getCantidad(), df.format(s.getMonto()))
                );
            }
        }
        
        txaFactura.append("\nMONTO TOTAL: S/. " + df.format(factura.getImporte()));
        
    }
    
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txaFactura;
    // End of variables declaration//GEN-END:variables
}
