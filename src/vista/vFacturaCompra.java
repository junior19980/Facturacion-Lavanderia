/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.*;
import controlador.*;
import vista.*;

public class vFacturaCompra extends javax.swing.JFrame {

    static String Id = "";

    /**
     * Creates new form VProducto
     */
    public vFacturaCompra() {
        initComponents();
    }
   // mRecepcionPrenda modelo = new mRecepcionPrenda();

    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CampoNumFac = new javax.swing.JTextField();
        Cancelar = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        Nuevo = new javax.swing.JButton();
        SALIR = new javax.swing.JButton();
        CampoFecha = new javax.swing.JTextField();
        BotonEliminardetalle = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        CODSERVICIO = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDetalle = new javax.swing.JTable();
        BotonAgregardetalle = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        SERVICIO = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        CANTIDAD = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        PRECIO = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CampoCodOrden = new javax.swing.JTextField();
        CampoCodigoUsu = new javax.swing.JTextField();
        CampoCodigo2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        CampoCodProv = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        ComboTipoFact = new javax.swing.JComboBox<String>();
        jLabel5 = new javax.swing.JLabel();
        TOTAL = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CampoTimbrado = new javax.swing.JTextField();
        Seleccionar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        IVA = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        CampoCodigo = new javax.swing.JTextField();
        mes = new javax.swing.JTextField();
        CampoFechaFactura = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fechafin = new javax.swing.JTextField();
        fechainicio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Factura Compra");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1229, 650));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
        });
        getContentPane().setLayout(null);

        CampoNumFac.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(CampoNumFac);
        CampoNumFac.setBounds(140, 90, 100, 30);

        Cancelar.setBackground(new java.awt.Color(255, 255, 255));
        Cancelar.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/cancelar.png"))); // NOI18N
        Cancelar.setText("CANCELAR  ");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        getContentPane().add(Cancelar);
        Cancelar.setBounds(390, 540, 220, 40);

        Guardar.setBackground(new java.awt.Color(255, 255, 255));
        Guardar.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/guardar-el-archivo.png"))); // NOI18N
        Guardar.setText("GUARDAR");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(Guardar);
        Guardar.setBounds(890, 540, 230, 40);

        Nuevo.setBackground(new java.awt.Color(255, 255, 255));
        Nuevo.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        Nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/nueva-pagina.png"))); // NOI18N
        Nuevo.setText("Nuevo");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });
        getContentPane().add(Nuevo);
        Nuevo.setBounds(650, 540, 210, 40);

        SALIR.setBackground(new java.awt.Color(255, 255, 255));
        SALIR.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        SALIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/cerrar-sesion (1).png"))); // NOI18N
        SALIR.setText("SALIR");
        SALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALIRActionPerformed(evt);
            }
        });
        getContentPane().add(SALIR);
        SALIR.setBounds(130, 540, 220, 43);

        CampoFecha.setEditable(false);
        CampoFecha.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CampoFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoFechaActionPerformed(evt);
            }
        });
        getContentPane().add(CampoFecha);
        CampoFecha.setBounds(510, 30, 110, 30);

        BotonEliminardetalle.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        BotonEliminardetalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/archivos.png"))); // NOI18N
        BotonEliminardetalle.setText("ELIMINAR DETALLE");
        BotonEliminardetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminardetalleActionPerformed(evt);
            }
        });
        getContentPane().add(BotonEliminardetalle);
        BotonEliminardetalle.setBounds(10, 473, 180, 40);

        jLabel2.setFont(new java.awt.Font("Purisa", 0, 24)); // NOI18N
        jLabel2.setText("Factura Compra");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(470, 0, 290, 30);

        jPanel3.setBackground(new java.awt.Color(108, 99, 255));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(null);

        CODSERVICIO.setEditable(false);
        CODSERVICIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CODSERVICIOActionPerformed(evt);
            }
        });
        jPanel3.add(CODSERVICIO);
        CODSERVICIO.setBounds(90, 50, 90, 40);

        TablaDetalle.setBackground(new java.awt.Color(51, 255, 255));
        TablaDetalle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 2));
        TablaDetalle.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        TablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "DESCRIPCION", "PRECIO", "CANTIDAD", "SUB TOTAL"
            }
        ));
        TablaDetalle.setName(""); // NOI18N
        jScrollPane1.setViewportView(TablaDetalle);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(10, 90, 1180, 160);

        BotonAgregardetalle.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        BotonAgregardetalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/boton-agregar.png"))); // NOI18N
        BotonAgregardetalle.setText("AGREGAR");
        BotonAgregardetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregardetalleActionPerformed(evt);
            }
        });
        jPanel3.add(BotonAgregardetalle);
        BotonAgregardetalle.setBounds(1050, 50, 140, 40);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("                           DETALLES DE FACTURA COMPRA");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(210, 10, 730, 30);

        SERVICIO.setEditable(false);
        jPanel3.add(SERVICIO);
        SERVICIO.setBounds(270, 50, 240, 40);

        jLabel15.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("  Codigo");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(30, 50, 60, 40);
        jPanel3.add(CANTIDAD);
        CANTIDAD.setBounds(850, 50, 130, 40);

        jLabel17.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Descripcion");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(190, 50, 80, 40);

        jLabel18.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Cantidad");
        jPanel3.add(jLabel18);
        jLabel18.setBounds(780, 50, 80, 40);

        jLabel19.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Precio");
        jPanel3.add(jLabel19);
        jLabel19.setBounds(530, 50, 80, 40);

        PRECIO.setEditable(false);
        jPanel3.add(PRECIO);
        PRECIO.setBounds(580, 50, 160, 40);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 200, 1200, 270);

        jLabel3.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel3.setText("IVA:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(690, 490, 70, 30);

        CampoCodOrden.setEditable(false);
        CampoCodOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCodOrdenActionPerformed(evt);
            }
        });
        getContentPane().add(CampoCodOrden);
        CampoCodOrden.setBounds(900, 140, 100, 40);

        CampoCodigoUsu.setEditable(false);
        CampoCodigoUsu.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CampoCodigoUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCodigoUsuActionPerformed(evt);
            }
        });
        getContentPane().add(CampoCodigoUsu);
        CampoCodigoUsu.setBounds(270, 20, 50, 30);

        CampoCodigo2.setEditable(false);
        CampoCodigo2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CampoCodigo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCodigo2ActionPerformed(evt);
            }
        });
        getContentPane().add(CampoCodigo2);
        CampoCodigo2.setBounds(320, 20, 140, 30);

        jLabel21.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel21.setText("Timbrado:");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(290, 60, 80, 30);

        CampoCodProv.setEditable(false);
        CampoCodProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCodProvActionPerformed(evt);
            }
        });
        getContentPane().add(CampoCodProv);
        CampoCodProv.setBounds(110, 150, 60, 30);

        jTextField9.setEditable(false);
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField9);
        jTextField9.setBounds(170, 150, 190, 30);

        jTextField10.setEditable(false);
        getContentPane().add(jTextField10);
        jTextField10.setBounds(360, 150, 130, 30);

        jLabel7.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel7.setText("Proveedor:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 140, 100, 40);

        jLabel22.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel22.setText("Usuario:");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(220, 20, 50, 30);

        ComboTipoFact.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(ComboTipoFact);
        ComboTipoFact.setBounds(870, 90, 140, 30);

        jLabel5.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel5.setText("Nro. Orden de Compra");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(900, 110, 110, 40);

        TOTAL.setEditable(false);
        getContentPane().add(TOTAL);
        TOTAL.setBounds(970, 480, 190, 40);

        jLabel6.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel6.setText("Fecha Factura:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(600, 90, 80, 30);

        CampoTimbrado.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CampoTimbrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoTimbradoActionPerformed(evt);
            }
        });
        getContentPane().add(CampoTimbrado);
        CampoTimbrado.setBounds(340, 60, 160, 30);

        Seleccionar.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        Seleccionar.setText("Seleccionar Orden de Compra");
        Seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionarActionPerformed(evt);
            }
        });
        Seleccionar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SeleccionarFocusGained(evt);
            }
        });
        getContentPane().add(Seleccionar);
        Seleccionar.setBounds(690, 140, 210, 40);

        jLabel8.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel8.setText("Tipo Factura:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(800, 90, 70, 30);

        jInternalFrame1.setVisible(true);
        getContentPane().add(jInternalFrame1);
        jInternalFrame1.setBounds(710, 270, 22, 34);

        IVA.setEditable(false);
        getContentPane().add(IVA);
        IVA.setBounds(720, 480, 190, 40);

        jLabel10.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel10.setText("TOTAL:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(930, 490, 70, 30);

        jLabel23.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel23.setText("Codigo:");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(80, 20, 50, 30);

        CampoCodigo.setEditable(false);
        CampoCodigo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CampoCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(CampoCodigo);
        CampoCodigo.setBounds(130, 20, 50, 30);

        mes.setEditable(false);
        getContentPane().add(mes);
        mes.setBounds(186, 20, 0, 30);

        CampoFechaFactura.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CampoFechaFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoFechaFacturaActionPerformed(evt);
            }
        });
        getContentPane().add(CampoFechaFactura);
        CampoFechaFactura.setBounds(680, 90, 110, 30);

        jLabel24.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel24.setText("Numero Factura:");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(50, 90, 80, 30);

        jLabel4.setText("Fecha Fin Timbrado");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(260, 120, 130, 14);
        getContentPane().add(fechafin);
        fechafin.setBounds(370, 120, 160, 30);
        getContentPane().add(fechainicio);
        fechainicio.setBounds(370, 90, 160, 30);

        jLabel9.setText("Fecha Validez Timbrado");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(250, 100, 130, 14);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        this.Seleccionar.setEnabled(true);

        this.BotonAgregardetalle.setEnabled(false);
// TODO add your handling code here:
    }//GEN-LAST:event_NuevoActionPerformed

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

    private void CODSERVICIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CODSERVICIOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CODSERVICIOActionPerformed

    private void Funcionario3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Funcionario3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Funcionario3ActionPerformed

    private void SeleccionarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SeleccionarFocusGained
        // TODO add your handling code here:
        this.CampoCodOrden.setText(VBuscaOrdenCompra1.Id);
        this.CODSERVICIO.setText(VBuscaOrdenCompra1.Cliente);
        this.SERVICIO.setText(VBuscaOrdenCompra1.Cliente1);
        this.PRECIO.setText(VBuscaOrdenCompra1.Cliente3);
        this.CANTIDAD.setText(VBuscaOrdenCompra1.Cliente2);
        this.CampoCodProv.setText(VBuscaOrdenCompra1.Cliente4);
        this.jTextField9.setText(VBuscaOrdenCompra1.Cliente5);
        this.jTextField10.setText(VBuscaOrdenCompra1.Cliente6);
    }//GEN-LAST:event_SeleccionarFocusGained

    private void SeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionarActionPerformed
        // TODO add your handling code here:
        new CBuscaOrdenCompra1(new VBuscaOrdenCompra1()).iniciar();
        this.BotonAgregardetalle.setEnabled(true);
    }//GEN-LAST:event_SeleccionarActionPerformed

    private void BotonAgregardetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregardetalleActionPerformed
        this.Guardar.setEnabled(true);
        this.BotonEliminardetalle.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonAgregardetalleActionPerformed

    private void CampoFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoFechaActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        this.Seleccionar.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_CancelarActionPerformed

    private void CampoCodigo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCodigo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCodigo2ActionPerformed

    private void CampoCodigoUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCodigoUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCodigoUsuActionPerformed

    private void CampoCodOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCodOrdenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCodOrdenActionPerformed

    private void CampoCodProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCodProvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCodProvActionPerformed


    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        Id = this.CampoNumFac.getText();
        String tipofactura[] = this.ComboTipoFact.getSelectedItem().toString().split("-");
        int basura = Integer.parseInt(tipofactura[0].trim());
        if (basura == 2) {
            new cCuentaPagar(new vCuentaPagar()).iniciar();
        }

// TODO add your handling code here:
    }//GEN-LAST:event_GuardarActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void CampoTimbradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoTimbradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoTimbradoActionPerformed

    private void CampoCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCodigoActionPerformed

    private void CampoFechaFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoFechaFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoFechaFacturaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cFacturaCompra(new vFacturaCompra()).iniciar();
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BotonAgregardetalle;
    public javax.swing.JButton BotonEliminardetalle;
    public javax.swing.JTextField CANTIDAD;
    public javax.swing.JTextField CODSERVICIO;
    public javax.swing.JTextField CampoCodOrden;
    public javax.swing.JTextField CampoCodProv;
    public javax.swing.JTextField CampoCodigo;
    public javax.swing.JTextField CampoCodigo2;
    public javax.swing.JTextField CampoCodigoUsu;
    public javax.swing.JTextField CampoFecha;
    public javax.swing.JTextField CampoFechaFactura;
    public javax.swing.JTextField CampoNumFac;
    public javax.swing.JTextField CampoTimbrado;
    public javax.swing.JButton Cancelar;
    public javax.swing.JComboBox<String> ComboTipoFact;
    public javax.swing.JButton Guardar;
    public javax.swing.JTextField IVA;
    public javax.swing.JButton Nuevo;
    public javax.swing.JTextField PRECIO;
    public javax.swing.JButton SALIR;
    public javax.swing.JTextField SERVICIO;
    public javax.swing.JButton Seleccionar;
    public javax.swing.JTextField TOTAL;
    public javax.swing.JTable TablaDetalle;
    public javax.swing.JTextField fechafin;
    public javax.swing.JTextField fechainicio;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField jTextField10;
    public javax.swing.JTextField jTextField9;
    public javax.swing.JTextField mes;
    // End of variables declaration//GEN-END:variables
}
