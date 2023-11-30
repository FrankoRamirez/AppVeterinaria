package com.mycompany.appvet.view.content;

import com.mycompany.appvet.control.MascotaControl;
import com.mycompany.appvet.model.Mascota;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;
import javax.swing.Timer;

public class ActualizarMascota extends javax.swing.JPanel {

    private String id_mascota;
    private String nombre;
    private String especie;
    private char sexo;
    private String raza;
    private String fecha_nac;
    private String id_cliente;
    
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
    
    public ActualizarMascota() {
        initComponents();
        lblMensaje.setText("");
        btnAceptar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txtRaza = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        txtEspecie = new javax.swing.JTextField();
        lblMensaje = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnBuscar = new javax.swing.JButton();
        cbxSexo = new javax.swing.JComboBox<>();
        txtDia = new javax.swing.JTextField();
        cbxMes = new javax.swing.JComboBox<>();
        txtAño = new javax.swing.JTextField();
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
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "ACTUALIZAR MASCOTA"));
        jPanel5.setPreferredSize(new java.awt.Dimension(760, 420));

        jLabel17.setText("RAZA:");

        txtRaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRazaActionPerformed(evt);
            }
        });

        jLabel18.setText("SEXO:");

        jLabel19.setText("FECHA DE NACIMIENTO:");

        jLabel20.setText("NOMBRE:");

        jLabel21.setText("ID CLIENTE:");

        jLabel22.setText("ESPECIE:");

        lblMensaje.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMensaje.setText("jLabel23");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Buscar mascota por ID:");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        cbxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "M", "F", "C" }));

        txtDia.setText("1");

        cbxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Setiembre", "Octubre", "Noviembre", "Diciembre" }));

        txtAño.setText("2023");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)
                        .addGap(37, 37, 37)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(18, 18, 18)
                                .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel17))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(18, 18, 18)
                                .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMensaje)))
                .addGap(234, 234, 234))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxMes, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
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

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        if(txtNombre.getText().equals("")){
            setMensaje("error","Debe ingresar el nombre de la mascota");
            return false;
        }
        if(txtDia.getText().equals("")){
            setMensaje("error","Debe ingresar el dia de la fecha de nacimiento");
            return false;
        }
        if(txtEspecie.getText().equals("")){
            setMensaje("error","Debe ingresar la especie de la mascota");
            return false;
        }
        if(txtRaza.getText().equals("")){
            setMensaje("error","Debe ingresar la raza de la mascota");
            return false;
        }
        if(txtIdCliente.getText().equals("")){
            setMensaje("error","Debe ingresar el id del cliente dueño de la mascota");
            return false;
        }
        if(txtAño.getText().equals("")){
            setMensaje("error","Debe ingresar el año de la fecha de nacimiento");
            return false;
        }
        return true;
    }
    
    private void limpiarEntradas(){
        txtID.setText("");
        txtNombre.setText("");
        txtDia.setText("");
        txtAño.setText("");
        cbxSexo.setSelectedIndex(0);
        cbxMes.setSelectedIndex(0);
        txtEspecie.setText("");
        txtRaza.setText("");
        txtIdCliente.setText("");
        txtNombre.requestFocus();
    }
    
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if(verificacion()){
            String dia, mes, año, eleccion;
            nombre = txtNombre.getText();
            dia = txtDia.getText();
            año = txtAño.getText();
            if(cbxSexo.getSelectedItem().toString().equals("M"))
                sexo = 'M';
            else if(cbxSexo.getSelectedItem().toString().equals("F"))
                sexo = 'F';
            else
                setMensaje("error","Debe de seleccionar el sexo de la mascota");
            especie = txtEspecie.getText();
            raza = txtRaza.getText();
            id_cliente = txtIdCliente.getText();
            eleccion = cbxMes.getSelectedItem().toString();
            switch(eleccion) {
                case "Enero": 
                    mes = "01";
                    break;
                case "Febrero":
                    mes = "02";
                    break;
                case "Marzo":
                    mes = "03";
                    break;
                case "Abril":
                    mes = "04";
                    break;
                case "Mayo":
                    mes = "05";
                    break;
                case "Junio":
                    mes = "06";
                    break;
                case "Julio":
                    mes = "07";
                    break;
                case "Agosto":
                    mes = "08";
                    break;
                case "Setiembre":
                    mes = "09";
                    break;
                case "Octubre":
                    mes = "10";
                    break;
                case "Noviembre":
                    mes = "11";
                    break;
                case "Diciembre":
                    mes = "12";
                    break;
                default:
                    mes = "00";
                    setMensaje("error","Debe de seleccionar un mes valido");
                    break;
            }
            fecha_nac = año + "-" + mes + "-" + dia; 
            
            try{
                MascotaControl controlador = new MascotaControl();
                Mascota m = new Mascota();
                m.setId_mascota(id_mascota);
                m.setNombre(nombre);
                m.setEspecie(especie);
                m.setSexo(sexo);
                m.setRaza(raza);
                m.setFecha_nac(fecha_nac);
                m.setId_cliente(id_cliente);
                controlador.actualizarMascota(m);
                setMensaje("info", "Se actualizo a la mascota exitosamente");
                limpiarEntradas();
                btnAceptar.setEnabled(false);
                
            }catch(Exception ex){
                setMensaje("error", "Error al actualizar la mascota: "+ex.getMessage());
            }
        }
        
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if(txtID.getText().equals("")){
            setMensaje("error", "Debe ingresar una mascota a buscar");
        }else{
            id_mascota = txtID.getText();
            try{
                MascotaControl controlador = new MascotaControl();
                Mascota m = controlador.buscarMascota(id_mascota);
                if(m.getId_mascota().equals("-1")){
                    throw new Exception("Mascota no encontrada");
                }else{
                    txtNombre.setText(m.getNombre());
                    txtEspecie.setText(m.getEspecie());
                    if(m.getSexo() == 'M')
                        cbxSexo.setSelectedIndex(1);
                    if(m.getSexo() == 'F')
                        cbxMes.setSelectedIndex(2);
                    txtRaza.setText(m.getRaza());
                    StringTokenizer st = new StringTokenizer(m.getFecha_nac(), "-");
                    txtAño.setText(st.nextToken());
                    byte mes = Byte.parseByte(st.nextToken());
                    if(mes <= 12) 
                        cbxMes.setSelectedIndex(mes - 1);
                    else
                        setMensaje("error","Fallo al obtener el mes");
                    txtDia.setText(st.nextToken());
                    txtIdCliente.setText(m.getId_cliente());
                    setMensaje("info","Ya puede actualizar la información de esta mascota");
                    btnAceptar.setEnabled(true);
                }
            }catch(Exception ex){
                setMensaje("error", "Error al buscar a la mascota: "+ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtRazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRazaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRazaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cbxMes;
    private javax.swing.JComboBox<String> cbxSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtEspecie;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRaza;
    // End of variables declaration//GEN-END:variables
}
