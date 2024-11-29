package vista;

import modelo.*;
import controlador.*;
import vista.*;

public class vNotaDebitoCompra extends javax.swing.JFrame {

    static String Id = "";
    /**
     * Creates new form VProducto
     */
    public vNotaDebitoCompra() {
        initComponents();
    }
   // mRecepcionPrenda modelo = new mRecepcionPrenda();

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Camponro = new javax.swing.JTextField();
        Cancelar = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        Nuevo = new javax.swing.JButton();
        SALIR = new javax.swing.JButton();
        CampoFecha = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        CODSERVICIO = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDetalle = new javax.swing.JTable();
        BotonAgregardetalle = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        SeleccionarRecepcion = new javax.swing.JButton();
        SERVICIO = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        CANTIDAD = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        PRECIO = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        BotonEliminardetalle = new javax.swing.JButton();
        CampoTOTAL = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        IVA = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        nrofacturacom = new javax.swing.JTextField();
        CampoCodigousu = new javax.swing.JTextField();
        CampoCodigo2 = new javax.swing.JTextField();
        IDNC = new javax.swing.JLabel();
        NombreProv = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        CampoFechaDocumento = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        RucProv = new javax.swing.JTextField();
        CodigoFac = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CampoCodigo = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        mes = new javax.swing.JTextField();
        Timbrado = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nota Debito");
        setBackground(new java.awt.Color(255, 255, 255));
        setFocusTraversalPolicyProvider(true);
        setMinimumSize(new java.awt.Dimension(1100, 590));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
        });
        getContentPane().setLayout(null);

        Camponro.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(Camponro);
        Camponro.setBounds(20, 110, 90, 30);

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
        Cancelar.setBounds(280, 490, 190, 50);

        Guardar.setBackground(new java.awt.Color(255, 255, 255));
        Guardar.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/guardar-el-archivo.png"))); // NOI18N
        Guardar.setText("GUARDAR");
        getContentPane().add(Guardar);
        Guardar.setBounds(700, 490, 230, 50);

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
        Nuevo.setBounds(480, 490, 210, 50);

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
        SALIR.setBounds(50, 490, 220, 50);

        CampoFecha.setEditable(false);
        CampoFecha.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CampoFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoFechaActionPerformed(evt);
            }
        });
        getContentPane().add(CampoFecha);
        CampoFecha.setBounds(850, 40, 110, 30);

        jLabel2.setFont(new java.awt.Font("Purisa", 1, 24)); // NOI18N
        jLabel2.setText("Nota Debito Compra");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(300, 20, 330, 30);

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
        CODSERVICIO.setBounds(220, 50, 60, 40);

        TablaDetalle.setBackground(new java.awt.Color(51, 255, 255));
        TablaDetalle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 2));
        TablaDetalle.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
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
        jScrollPane1.setBounds(10, 90, 1030, 150);

        BotonAgregardetalle.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        BotonAgregardetalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/boton-agregar.png"))); // NOI18N
        BotonAgregardetalle.setText("AGREGAR");
        BotonAgregardetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregardetalleActionPerformed(evt);
            }
        });
        jPanel3.add(BotonAgregardetalle);
        BotonAgregardetalle.setBounds(890, 50, 140, 40);

        jLabel1.setFont(new java.awt.Font("Purisa", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("          DETALLES DE NOTA DEBITO");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(210, 10, 730, 30);

        SeleccionarRecepcion.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        SeleccionarRecepcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/buscar.png"))); // NOI18N
        SeleccionarRecepcion.setText("Concepto");
        SeleccionarRecepcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionarRecepcionActionPerformed(evt);
            }
        });
        SeleccionarRecepcion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SeleccionarRecepcionFocusGained(evt);
            }
        });
        jPanel3.add(SeleccionarRecepcion);
        SeleccionarRecepcion.setBounds(10, 50, 130, 40);

        SERVICIO.setEditable(false);
        jPanel3.add(SERVICIO);
        SERVICIO.setBounds(350, 50, 230, 40);

        jLabel15.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("  Codigo");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(150, 50, 90, 40);
        jPanel3.add(CANTIDAD);
        CANTIDAD.setBounds(820, 50, 70, 40);

        jLabel17.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Descripcion");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(280, 50, 80, 40);

        jLabel18.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Precio");
        jPanel3.add(jLabel18);
        jLabel18.setBounds(590, 50, 60, 40);

        PRECIO.setEditable(false);
        jPanel3.add(PRECIO);
        PRECIO.setBounds(630, 50, 110, 40);

        jLabel19.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("IVA");
        jPanel3.add(jLabel19);
        jLabel19.setBounds(640, 260, 60, 40);

        BotonEliminardetalle.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        BotonEliminardetalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/archivos.png"))); // NOI18N
        BotonEliminardetalle.setText("ELIMINAR DETALLE");
        BotonEliminardetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminardetalleActionPerformed(evt);
            }
        });
        jPanel3.add(BotonEliminardetalle);
        BotonEliminardetalle.setBounds(10, 250, 180, 40);

        CampoTOTAL.setEditable(false);
        CampoTOTAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoTOTALActionPerformed(evt);
            }
        });
        jPanel3.add(CampoTOTAL);
        CampoTOTAL.setBounds(890, 250, 140, 40);

        jLabel23.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Cantidad");
        jPanel3.add(jLabel23);
        jLabel23.setBounds(750, 50, 60, 40);

        IVA.setEditable(false);
        IVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IVAActionPerformed(evt);
            }
        });
        jPanel3.add(IVA);
        IVA.setBounds(680, 250, 140, 40);

        jLabel25.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("TOTAL");
        jPanel3.add(jLabel25);
        jLabel25.setBounds(840, 260, 60, 40);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 160, 1040, 320);

        jLabel3.setFont(new java.awt.Font("Purisa", 1, 10)); // NOI18N
        jLabel3.setText("RUC Proveedor");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(930, 80, 90, 40);

        jButton2.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jButton2.setText("Buscar Factura Compra");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton2FocusGained(evt);
            }
        });
        jButton2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jButton2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(417, 110, 180, 30);

        nrofacturacom.setEditable(false);
        nrofacturacom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nrofacturacomActionPerformed(evt);
            }
        });
        getContentPane().add(nrofacturacom);
        nrofacturacom.setBounds(650, 110, 90, 30);

        CampoCodigousu.setEditable(false);
        CampoCodigousu.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CampoCodigousu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCodigousuActionPerformed(evt);
            }
        });
        getContentPane().add(CampoCodigousu);
        CampoCodigousu.setBounds(640, 40, 40, 30);

        CampoCodigo2.setEditable(false);
        CampoCodigo2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CampoCodigo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCodigo2ActionPerformed(evt);
            }
        });
        getContentPane().add(CampoCodigo2);
        CampoCodigo2.setBounds(680, 40, 130, 30);

        IDNC.setFont(new java.awt.Font("Purisa", 1, 10)); // NOI18N
        IDNC.setText("Id Nota Debito");
        getContentPane().add(IDNC);
        IDNC.setBounds(10, 10, 110, 30);

        NombreProv.setEditable(false);
        getContentPane().add(NombreProv);
        NombreProv.setBounds(740, 110, 180, 30);

        jLabel7.setFont(new java.awt.Font("Purisa", 1, 10)); // NOI18N
        jLabel7.setText("Proveedor");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(760, 80, 100, 40);

        jLabel22.setFont(new java.awt.Font("Purisa", 1, 10)); // NOI18N
        jLabel22.setText("Timbrado");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(160, 80, 110, 30);

        CampoFechaDocumento.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CampoFechaDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoFechaDocumentoActionPerformed(evt);
            }
        });
        getContentPane().add(CampoFechaDocumento);
        CampoFechaDocumento.setBounds(260, 110, 110, 30);

        jLabel24.setFont(new java.awt.Font("Purisa", 1, 10)); // NOI18N
        jLabel24.setText("Usuario");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(680, 10, 50, 30);

        jLabel5.setFont(new java.awt.Font("Purisa", 1, 10)); // NOI18N
        jLabel5.setText("Id");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(610, 80, 70, 40);

        RucProv.setEditable(false);
        getContentPane().add(RucProv);
        RucProv.setBounds(920, 110, 130, 30);

        CodigoFac.setEditable(false);
        CodigoFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoFacActionPerformed(evt);
            }
        });
        getContentPane().add(CodigoFac);
        CodigoFac.setBounds(600, 110, 50, 30);

        jLabel6.setFont(new java.awt.Font("Purisa", 1, 10)); // NOI18N
        jLabel6.setText("Nro. Factura");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(660, 80, 70, 40);

        CampoCodigo.setEditable(false);
        CampoCodigo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(CampoCodigo);
        CampoCodigo.setBounds(10, 40, 90, 30);

        jLabel26.setFont(new java.awt.Font("Purisa", 1, 10)); // NOI18N
        jLabel26.setText("Nro. Nota Debito");
        getContentPane().add(jLabel26);
        jLabel26.setBounds(20, 80, 110, 30);

        mes.setEditable(false);
        mes.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesActionPerformed(evt);
            }
        });
        getContentPane().add(mes);
        mes.setBounds(960, 40, 6, 30);

        Timbrado.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Timbrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimbradoActionPerformed(evt);
            }
        });
        getContentPane().add(Timbrado);
        Timbrado.setBounds(130, 110, 110, 30);

        jLabel27.setFont(new java.awt.Font("Purisa", 1, 10)); // NOI18N
        jLabel27.setText("Fecha Nota Debito");
        getContentPane().add(jLabel27);
        jLabel27.setBounds(270, 80, 110, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        this.jButton2.setEnabled(true);

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

    private void SeleccionarRecepcionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SeleccionarRecepcionFocusGained
        // TODO add your handling code here:
        this.CODSERVICIO.setText(VConcepto.Cod);
        this.SERVICIO.setText(VConcepto.Descripcion);
        this.PRECIO.setText(VConcepto.Precio);
    }//GEN-LAST:event_SeleccionarRecepcionFocusGained

    private void SeleccionarRecepcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionarRecepcionActionPerformed
        // TODO add your handling code here:
        new CConcepto(new VConcepto()).iniciar();
        this.BotonAgregardetalle.setEnabled(true);
    }//GEN-LAST:event_SeleccionarRecepcionActionPerformed

    private void BotonAgregardetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregardetalleActionPerformed
        this.Guardar.setEnabled(true);
        this.BotonEliminardetalle.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonAgregardetalleActionPerformed

    private void CampoFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoFechaActionPerformed

    private void jButton2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jButton2AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2AncestorAdded

    private void jButton2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton2FocusGained
        this.CodigoFac.setText(VBuscaFacturaCompra.Id);
        this.nrofacturacom.setText(VBuscaFacturaCompra.Cliente);
        this.NombreProv.setText(VBuscaFacturaCompra.Id1);
        this.RucProv.setText(VBuscaFacturaCompra.Cliente1);
        // this.jTextField8.setText(VEquipo.precio1);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2FocusGained

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new CBuscaFacturaCompra(new VBuscaFacturaCompra()).iniciar();
        this.SeleccionarRecepcion.setEnabled(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        this.jButton2.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_CancelarActionPerformed

    private void CampoCodigo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCodigo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCodigo2ActionPerformed

    private void CampoCodigousuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCodigousuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCodigousuActionPerformed

    private void nrofacturacomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nrofacturacomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nrofacturacomActionPerformed

    private void CampoFechaDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoFechaDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoFechaDocumentoActionPerformed

    private void IVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IVAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IVAActionPerformed

    private void CodigoFacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoFacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodigoFacActionPerformed

    private void CampoTOTALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoTOTALActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoTOTALActionPerformed

    private void mesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesActionPerformed

    private void TimbradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimbradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TimbradoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cNotaDebitoCompra(new vNotaDebitoCompra()).iniciar();
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BotonAgregardetalle;
    public javax.swing.JButton BotonEliminardetalle;
    public javax.swing.JTextField CANTIDAD;
    public javax.swing.JTextField CODSERVICIO;
    public javax.swing.JTextField CampoCodigo;
    public javax.swing.JTextField CampoCodigo2;
    public javax.swing.JTextField CampoCodigousu;
    public javax.swing.JTextField CampoFecha;
    public javax.swing.JTextField CampoFechaDocumento;
    public javax.swing.JTextField CampoTOTAL;
    public javax.swing.JTextField Camponro;
    public javax.swing.JButton Cancelar;
    public javax.swing.JTextField CodigoFac;
    public javax.swing.JButton Guardar;
    private javax.swing.JLabel IDNC;
    public javax.swing.JTextField IVA;
    public javax.swing.JTextField NombreProv;
    public javax.swing.JButton Nuevo;
    public javax.swing.JTextField PRECIO;
    public javax.swing.JTextField RucProv;
    public javax.swing.JButton SALIR;
    public javax.swing.JTextField SERVICIO;
    public javax.swing.JButton SeleccionarRecepcion;
    public javax.swing.JTable TablaDetalle;
    public javax.swing.JTextField Timbrado;
    public javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField mes;
    public javax.swing.JTextField nrofacturacom;
    // End of variables declaration//GEN-END:variables
}
