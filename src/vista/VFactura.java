/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.CFactura;
//import vista.VTipoFactura;
//mport controlador.CBuscaTipoFactura;
//import controlador.CBuscaCliente;
//import vista.VBuscaEquipo;
//import vista.VBuscaCatalog;
//import controlador.CBuscaCatalago;


/**
 *
 * @author Teresa
 */
public class VFactura extends javax.swing.JFrame {

    /**
     * Creates new form VProducto
     */
    public VFactura() {
        initComponents();
    }
   // mRecepcionPrenda modelo = new mRecepcionPrenda();
    
       @SuppressWarnings("unchecked")
 
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CampoCodigo = new javax.swing.JTextField();
        CANCELAR = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        AgregarVentas = new javax.swing.JButton();
        SALIR = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        CampoFecha = new javax.swing.JTextField();
        CampoTotal = new javax.swing.JTextField();
        BotonEliminardetalle = new javax.swing.JButton();
        CodFuncionario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        CODSERVICIO = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDetalle = new javax.swing.JTable();
        CANTIDAD = new javax.swing.JTextField();
        BotonAgregardetalle = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        SeleccionarRecepcion = new javax.swing.JButton();
        SERVICIO = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        SeleccionarFuncionario = new javax.swing.JButton();
        NombreFuncionario = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Orden de Facturas");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1035, 650));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
        });
        getContentPane().setLayout(null);

        CampoCodigo.setEditable(false);
        CampoCodigo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(CampoCodigo);
        CampoCodigo.setBounds(280, 40, 50, 30);

        CANCELAR.setBackground(new java.awt.Color(0, 51, 255));
        CANCELAR.setForeground(new java.awt.Color(255, 255, 255));
        CANCELAR.setText("CANCELAR  ");
        getContentPane().add(CANCELAR);
        CANCELAR.setBounds(570, 550, 120, 40);

        Guardar.setBackground(new java.awt.Color(0, 51, 255));
        Guardar.setForeground(new java.awt.Color(255, 255, 255));
        Guardar.setText("FACTURAR");
        getContentPane().add(Guardar);
        Guardar.setBounds(690, 510, 220, 80);

        AgregarVentas.setBackground(new java.awt.Color(0, 51, 255));
        AgregarVentas.setForeground(new java.awt.Color(255, 255, 255));
        AgregarVentas.setText("AGREGAR");
        AgregarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarVentasActionPerformed(evt);
            }
        });
        getContentPane().add(AgregarVentas);
        AgregarVentas.setBounds(570, 510, 120, 40);

        SALIR.setBackground(new java.awt.Color(102, 51, 255));
        SALIR.setText("SALIR");
        SALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALIRActionPerformed(evt);
            }
        });
        getContentPane().add(SALIR);
        SALIR.setBounds(20, 520, 160, 70);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("FECHA");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(710, 40, 60, 30);

        CampoFecha.setEditable(false);
        CampoFecha.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CampoFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoFechaActionPerformed(evt);
            }
        });
        getContentPane().add(CampoFecha);
        CampoFecha.setBounds(780, 40, 110, 30);

        CampoTotal.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CampoTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoTotalActionPerformed(evt);
            }
        });
        getContentPane().add(CampoTotal);
        CampoTotal.setBounds(760, 470, 150, 40);

        BotonEliminardetalle.setText("ELIMINAR DETALLE");
        BotonEliminardetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminardetalleActionPerformed(evt);
            }
        });
        getContentPane().add(BotonEliminardetalle);
        BotonEliminardetalle.setBounds(20, 470, 159, 50);
        getContentPane().add(CodFuncionario);
        CodFuncionario.setBounds(10, 130, 50, 40);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Facturas");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(400, 10, 100, 30);

        jPanel3.setBackground(new java.awt.Color(0, 51, 255));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(null);

        CODSERVICIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CODSERVICIOActionPerformed(evt);
            }
        });
        jPanel3.add(CODSERVICIO);
        CODSERVICIO.setBounds(210, 50, 40, 40);

        TablaDetalle.setBackground(new java.awt.Color(51, 255, 255));
        TablaDetalle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 2));
        TablaDetalle.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        TablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "DESCRIPCION", "PRECIO", "CANTIDAD", "SUBTOTAL"
            }
        ));
        TablaDetalle.setName(""); // NOI18N
        jScrollPane1.setViewportView(TablaDetalle);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(10, 90, 860, 180);

        CANTIDAD.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CANTIDAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANTIDADActionPerformed(evt);
            }
        });
        jPanel3.add(CANTIDAD);
        CANTIDAD.setBounds(650, 50, 80, 40);

        BotonAgregardetalle.setText("AGREGAR");
        BotonAgregardetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregardetalleActionPerformed(evt);
            }
        });
        jPanel3.add(BotonAgregardetalle);
        BotonAgregardetalle.setBounds(770, 50, 100, 40);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DETALLES");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(390, 10, 120, 30);

        SeleccionarRecepcion.setText("SERVICIOS");
        SeleccionarRecepcion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SeleccionarRecepcionFocusGained(evt);
            }
        });
        SeleccionarRecepcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionarRecepcionActionPerformed(evt);
            }
        });
        jPanel3.add(SeleccionarRecepcion);
        SeleccionarRecepcion.setBounds(60, 50, 110, 40);
        jPanel3.add(SERVICIO);
        SERVICIO.setBounds(340, 50, 100, 40);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("CANTIDAD");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(580, 50, 70, 40);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("  COD");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(168, 60, 40, 20);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Precio");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(450, 50, 40, 40);
        jPanel3.add(jTextField2);
        jTextField2.setBounds(489, 50, 90, 40);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Descripcion");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(260, 60, 80, 20);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 190, 900, 280);

        jLabel8.setText("TOTAL");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(700, 470, 60, 40);

        SeleccionarFuncionario.setText("Tipo Factura");
        SeleccionarFuncionario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SeleccionarFuncionarioFocusGained(evt);
            }
        });
        SeleccionarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionarFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(SeleccionarFuncionario);
        SeleccionarFuncionario.setBounds(170, 130, 118, 40);

        NombreFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(NombreFuncionario);
        NombreFuncionario.setBounds(60, 130, 110, 40);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("CODIGO");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(220, 40, 60, 30);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(290, 130, 50, 40);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(340, 130, 90, 40);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(430, 130, 90, 40);

        jButton1.setText("Cliente");
        jButton1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton1FocusGained(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(520, 130, 80, 40);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(130, 40, 90, 30);

        jLabel9.setText("Nro Factura");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(40, 40, 90, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgregarVentasActionPerformed

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeactivated
            
    }//GEN-LAST:event_formWindowDeactivated

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       
    }//GEN-LAST:event_formWindowActivated

    private void SALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SALIRActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_SALIRActionPerformed

    private void BotonEliminardetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminardetalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonEliminardetalleActionPerformed

    private void CANTIDADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANTIDADActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CANTIDADActionPerformed

    private void CODSERVICIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CODSERVICIOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CODSERVICIOActionPerformed

    private void Funcionario3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Funcionario3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Funcionario3ActionPerformed

    private void SeleccionarRecepcionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SeleccionarRecepcionFocusGained
        // TODO add your handling code here:
       
      // this.PRENDA.setText(VBuscarTipoServicio.PRENDA);
    }//GEN-LAST:event_SeleccionarRecepcionFocusGained

    private void SeleccionarRecepcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionarRecepcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SeleccionarRecepcionActionPerformed

    private void BotonAgregardetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregardetalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonAgregardetalleActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton1FocusGained
     

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1FocusGained

    private void CampoFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoFechaActionPerformed

    private void NombreFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreFuncionarioActionPerformed

    private void SeleccionarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionarFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SeleccionarFuncionarioActionPerformed

    private void SeleccionarFuncionarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SeleccionarFuncionarioFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_SeleccionarFuncionarioFocusGained

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void CampoTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoTotalActionPerformed

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
            java.util.logging.Logger.getLogger(VFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CFactura(new VFactura()).iniciar();
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton AgregarVentas;
    public javax.swing.JButton BotonAgregardetalle;
    public javax.swing.JButton BotonEliminardetalle;
    public javax.swing.JButton CANCELAR;
    public javax.swing.JTextField CANTIDAD;
    public javax.swing.JTextField CODSERVICIO;
    public javax.swing.JTextField CampoCodigo;
    public javax.swing.JTextField CampoFecha;
    public javax.swing.JTextField CampoTotal;
    public javax.swing.JTextField CodFuncionario;
    public javax.swing.JButton Guardar;
    public javax.swing.JTextField NombreFuncionario;
    public javax.swing.JButton SALIR;
    public javax.swing.JTextField SERVICIO;
    public javax.swing.JButton SeleccionarFuncionario;
    public javax.swing.JButton SeleccionarRecepcion;
    public javax.swing.JTable TablaDetalle;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JTextField jTextField4;
    public javax.swing.JTextField jTextField5;
    public javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
