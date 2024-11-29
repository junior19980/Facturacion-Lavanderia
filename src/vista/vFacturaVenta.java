package vista;
import modelo.*;
import controlador.*;
public class vFacturaVenta extends javax.swing.JFrame {
   static String Id= "",desc="",inser="";
    /**
     * Creates new form VProducto
     */
    public vFacturaVenta() {
        initComponents(); 
    }
   // mRecepcionPrenda modelo = new mRecepcionPrenda();
           @SuppressWarnings("unchecked")
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CampoCodigo = new javax.swing.JTextField();
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
        SERVICIO = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        CANTIDAD = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        PRECIO = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        Descuento = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        BuscarDescuento = new javax.swing.JButton();
        CampoCodigo1 = new javax.swing.JTextField();
        CampoCodigo2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        BuscarServicioRealizado = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<String>();
        jTextField1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        CampoCodigo6 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        CampoCodigo5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CampoCodigo7 = new javax.swing.JTextField();
        CampoFecha1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        BuscarDescuento2 = new javax.swing.JButton();
        jTextField11 = new javax.swing.JTextField();
        CampoCodigo3 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Factura Servicio");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1240, 650));
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
        CampoCodigo.setBounds(80, 60, 80, 30);

        Cancelar.setBackground(new java.awt.Color(255, 255, 255));
        Cancelar.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        Cancelar.setForeground(new java.awt.Color(51, 51, 51));
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
        Nuevo.setForeground(new java.awt.Color(51, 51, 51));
        Nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/nueva-pagina.png"))); // NOI18N
        Nuevo.setText("Nuevo");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });
        getContentPane().add(Nuevo);
        Nuevo.setBounds(640, 540, 210, 40);

        SALIR.setBackground(new java.awt.Color(255, 255, 255));
        SALIR.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        SALIR.setForeground(new java.awt.Color(51, 51, 51));
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
        CampoFecha.setBounds(1070, 60, 110, 30);

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
        jLabel2.setText("Facturas Servicios");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(470, 20, 260, 30);

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
        CODSERVICIO.setBounds(110, 50, 70, 40);

        TablaDetalle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 2));
        TablaDetalle.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        TablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "DESCRIPCION", "PRECIO", "CANTIDAD", "DESC PORCENTAJE", "DESCUENTO", "SUBTOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaDetalle.setName(""); // NOI18N
        TablaDetalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDetalleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaDetalle);
        if (TablaDetalle.getColumnModel().getColumnCount() > 0) {
            TablaDetalle.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(10, 100, 1180, 160);

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

        SERVICIO.setEditable(false);
        jPanel3.add(SERVICIO);
        SERVICIO.setBounds(280, 50, 280, 40);

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("  Codigo");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(30, 50, 90, 40);
        jPanel3.add(CANTIDAD);
        CANTIDAD.setBounds(960, 50, 70, 40);

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Descripcion");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(190, 50, 80, 40);

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Precio");
        jPanel3.add(jLabel19);
        jLabel19.setBounds(570, 50, 80, 40);

        PRECIO.setEditable(false);
        jPanel3.add(PRECIO);
        PRECIO.setBounds(620, 50, 80, 40);

        jLabel20.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel20.setText("Descuento");
        jPanel3.add(jLabel20);
        jLabel20.setBounds(700, 50, 80, 40);

        Descuento.setText("0");
        jPanel3.add(Descuento);
        Descuento.setBounds(780, 50, 110, 40);

        jLabel27.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel27.setText("Cantidad");
        jPanel3.add(jLabel27);
        jLabel27.setBounds(900, 50, 80, 40);

        BuscarDescuento.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        BuscarDescuento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/boton-agregar.png"))); // NOI18N
        BuscarDescuento.setText(" Descuento");
        BuscarDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarDescuentoActionPerformed(evt);
            }
        });
        BuscarDescuento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BuscarDescuentoFocusGained(evt);
            }
        });
        BuscarDescuento.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                BuscarDescuentoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel3.add(BuscarDescuento);
        BuscarDescuento.setBounds(780, 10, 140, 40);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 220, 1200, 250);

        CampoCodigo1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CampoCodigo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCodigo1ActionPerformed(evt);
            }
        });
        getContentPane().add(CampoCodigo1);
        CampoCodigo1.setBounds(260, 60, 40, 30);

        CampoCodigo2.setEditable(false);
        CampoCodigo2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CampoCodigo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCodigo2ActionPerformed(evt);
            }
        });
        getContentPane().add(CampoCodigo2);
        CampoCodigo2.setBounds(300, 60, 110, 30);

        jLabel21.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel21.setText("Validez Timbrado");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(950, 130, 100, 30);

        BuscarServicioRealizado.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        BuscarServicioRealizado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/boton-agregar.png"))); // NOI18N
        BuscarServicioRealizado.setText("Buscar Servicio Realizado");
        BuscarServicioRealizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarServicioRealizadoActionPerformed(evt);
            }
        });
        BuscarServicioRealizado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BuscarServicioRealizadoFocusGained(evt);
            }
        });
        BuscarServicioRealizado.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                BuscarServicioRealizadoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(BuscarServicioRealizado);
        BuscarServicioRealizado.setBounds(10, 110, 220, 40);

        jTextField8.setEditable(false);
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField8);
        jTextField8.setBounds(230, 110, 50, 40);

        jTextField9.setEditable(false);
        getContentPane().add(jTextField9);
        jTextField9.setBounds(280, 110, 170, 40);

        jTextField10.setEditable(false);
        getContentPane().add(jTextField10);
        jTextField10.setBounds(450, 110, 130, 40);

        jLabel22.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel22.setText("Usuario");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(290, 30, 50, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(920, 60, 140, 30);

        jTextField1.setEditable(false);
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(1010, 480, 130, 40);

        jLabel18.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel18.setText("IVA");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(730, 480, 60, 40);

        jLabel23.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel23.setText("Nro Factura");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(170, 30, 80, 30);

        CampoCodigo6.setEditable(false);
        CampoCodigo6.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CampoCodigo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCodigo6ActionPerformed(evt);
            }
        });
        getContentPane().add(CampoCodigo6);
        CampoCodigo6.setBounds(1070, 100, 120, 30);

        jLabel24.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel24.setText("Codigo");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(100, 30, 60, 30);

        CampoCodigo5.setEditable(false);
        CampoCodigo5.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(CampoCodigo5);
        CampoCodigo5.setBounds(1040, 100, 30, 30);

        jLabel8.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel8.setText("Apertura Caja");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(830, 100, 90, 30);

        jLabel9.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel9.setText("Tipo Factura");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(840, 60, 90, 30);

        CampoCodigo7.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(CampoCodigo7);
        CampoCodigo7.setBounds(920, 100, 50, 30);

        CampoFecha1.setEditable(false);
        CampoFecha1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CampoFecha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoFecha1ActionPerformed(evt);
            }
        });
        getContentPane().add(CampoFecha1);
        CampoFecha1.setBounds(1140, 150, 0, 30);

        jTextField2.setEditable(false);
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(770, 480, 140, 40);

        jLabel25.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel25.setText("GS");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(1160, 480, 40, 40);

        jLabel26.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel26.setText("TOTAL");
        getContentPane().add(jLabel26);
        jLabel26.setBounds(930, 480, 60, 40);

        BuscarDescuento2.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        BuscarDescuento2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/boton-agregar.png"))); // NOI18N
        BuscarDescuento2.setText("Consultar Presupuesto");
        BuscarDescuento2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarDescuento2ActionPerformed(evt);
            }
        });
        BuscarDescuento2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BuscarDescuento2FocusGained(evt);
            }
        });
        BuscarDescuento2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                BuscarDescuento2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(BuscarDescuento2);
        BuscarDescuento2.setBounds(590, 110, 240, 40);

        jTextField11.setEditable(false);
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField11);
        jTextField11.setBounds(280, 110, 0, 40);

        CampoCodigo3.setEditable(false);
        getContentPane().add(CampoCodigo3);
        CampoCodigo3.setBounds(169, 60, 70, 30);

        jLabel28.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel28.setText("Timbrado");
        getContentPane().add(jLabel28);
        jLabel28.setBounds(990, 100, 60, 30);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(1040, 140, 150, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
this.BuscarServicioRealizado.setEnabled(true);
        
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

    private void Funcionario3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Funcionario3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Funcionario3ActionPerformed

    private void CampoFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoFechaActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_CancelarActionPerformed

    private void CampoCodigo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCodigo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCodigo2ActionPerformed

    private void CampoCodigo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCodigo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCodigo1ActionPerformed

    private void BuscarServicioRealizadoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_BuscarServicioRealizadoAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarServicioRealizadoAncestorAdded

    private void BuscarServicioRealizadoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BuscarServicioRealizadoFocusGained
       this.jTextField8.setText(VBuscaServicioRalizadoF.Id);
        this.jTextField9.setText(VBuscaServicioRalizadoF.Cliente5);
        this.jTextField10.setText(VBuscaServicioRalizadoF.Cliente6);
        this.jTextField11.setText(VBuscaServicioRalizadoF.idCli);
        this.CODSERVICIO.setText(VBuscaServicioRalizadoF.Cliente);
        this.SERVICIO.setText(VBuscaServicioRalizadoF.Cliente1);
        this.CANTIDAD.setText(VBuscaServicioRalizadoF.Cliente2);
        this.PRECIO.setText(VBuscaServicioRalizadoF.Cliente3);
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarServicioRealizadoFocusGained

    private void BuscarServicioRealizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarServicioRealizadoActionPerformed
       new CBuscaServicioRealizadoF(new VBuscaServicioRalizadoF()).iniciar();
    this.BotonAgregardetalle.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarServicioRealizadoActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed


    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
     Id=this.CampoCodigo.getText();
        String tipofactura[] = this.jComboBox1.getSelectedItem().toString().split("-");
        int basura= Integer.parseInt(tipofactura[0].trim());
        if(basura==2){
        new cCuentaCobrar(new vCuentaCobrar()).iniciar();
        }else{
        new cFormaPago(new vFormaPago()).iniciar();
		}
   
// TODO add your handling code here:
    }//GEN-LAST:event_GuardarActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void CampoFecha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoFecha1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoFecha1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void BotonAgregardetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregardetalleActionPerformed
        this.Guardar.setEnabled(true);
        this.BotonEliminardetalle.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonAgregardetalleActionPerformed

    private void TablaDetalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDetalleMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_TablaDetalleMouseClicked

    private void CODSERVICIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CODSERVICIOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CODSERVICIOActionPerformed

    private void BuscarDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarDescuentoActionPerformed
        // TODO add your handling code here:
        new cDescuento(new vDescuento()).iniciar();
    }//GEN-LAST:event_BuscarDescuentoActionPerformed

    private void BuscarDescuentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BuscarDescuentoFocusGained
        // TODO add your handling code here:
        desc=vDescuento.Cargo;
            //inser=desc;
        if(desc!=null){
             desc=this.SERVICIO.getText()+"-"+desc;
        }
         this.Descuento.setText(vDescuento.precio);
         this.SERVICIO.setText(desc);
    }//GEN-LAST:event_BuscarDescuentoFocusGained

    private void BuscarDescuentoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_BuscarDescuentoAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarDescuentoAncestorAdded

    private void BuscarDescuento2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarDescuento2ActionPerformed
        // TODO add your handling code here:
        new CBuscaPresupuesto1(new VBuscaPresupuesto1()).iniciar();
    }//GEN-LAST:event_BuscarDescuento2ActionPerformed

    private void BuscarDescuento2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BuscarDescuento2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarDescuento2FocusGained

    private void BuscarDescuento2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_BuscarDescuento2AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarDescuento2AncestorAdded

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void CampoCodigo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCodigo6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCodigo6ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    /**
     * @param args the command line arguments
     */

    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cFacturaVenta(new vFacturaVenta()).iniciar();
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BotonAgregardetalle;
    public javax.swing.JButton BotonEliminardetalle;
    public javax.swing.JButton BuscarDescuento;
    public javax.swing.JButton BuscarDescuento2;
    public javax.swing.JButton BuscarServicioRealizado;
    public javax.swing.JTextField CANTIDAD;
    public javax.swing.JTextField CODSERVICIO;
    public javax.swing.JTextField CampoCodigo;
    public javax.swing.JTextField CampoCodigo1;
    public javax.swing.JTextField CampoCodigo2;
    public javax.swing.JTextField CampoCodigo3;
    public javax.swing.JTextField CampoCodigo5;
    public javax.swing.JTextField CampoCodigo6;
    public javax.swing.JTextField CampoCodigo7;
    public javax.swing.JTextField CampoFecha;
    public javax.swing.JTextField CampoFecha1;
    public javax.swing.JButton Cancelar;
    public javax.swing.JTextField Descuento;
    public javax.swing.JButton Guardar;
    public javax.swing.JButton Nuevo;
    public javax.swing.JTextField PRECIO;
    public javax.swing.JButton SALIR;
    public javax.swing.JTextField SERVICIO;
    public javax.swing.JTable TablaDetalle;
    public javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField10;
    public javax.swing.JTextField jTextField11;
    public javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    public javax.swing.JTextField jTextField8;
    public javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
