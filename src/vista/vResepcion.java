package vista;
import modelo.*;
import controlador.*;
public class vResepcion extends javax.swing.JFrame {
    /**
     * Creates new form VProducto
     */
    public vResepcion() {
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
        jLabel1 = new javax.swing.JLabel();
        SeleccionarServicio = new javax.swing.JButton();
        SERVICIO = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        CODSERVICIO1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        CampoCodigo1 = new javax.swing.JTextField();
        CampoCodigo2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("RECEPCION");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1230, 650));
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
        CampoCodigo.setBounds(140, 80, 100, 30);

        Cancelar.setBackground(new java.awt.Color(0, 51, 255));
        Cancelar.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        Cancelar.setForeground(new java.awt.Color(255, 255, 255));
        Cancelar.setText("CANCELAR  ");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        getContentPane().add(Cancelar);
        Cancelar.setBounds(390, 540, 220, 40);

        Guardar.setBackground(new java.awt.Color(0, 51, 255));
        Guardar.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        Guardar.setForeground(new java.awt.Color(255, 255, 255));
        Guardar.setText("GUARDAR");
        getContentPane().add(Guardar);
        Guardar.setBounds(890, 540, 230, 40);

        Nuevo.setBackground(new java.awt.Color(0, 51, 255));
        Nuevo.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        Nuevo.setForeground(new java.awt.Color(255, 255, 255));
        Nuevo.setText("Nuevo");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });
        getContentPane().add(Nuevo);
        Nuevo.setBounds(640, 540, 210, 40);

        SALIR.setBackground(new java.awt.Color(102, 51, 255));
        SALIR.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
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
        CampoFecha.setBounds(1070, 30, 110, 30);

        BotonEliminardetalle.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        BotonEliminardetalle.setText("ELIMINAR DETALLE");
        BotonEliminardetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminardetalleActionPerformed(evt);
            }
        });
        getContentPane().add(BotonEliminardetalle);
        BotonEliminardetalle.setBounds(10, 473, 180, 40);

        jLabel2.setFont(new java.awt.Font("Purisa", 0, 24)); // NOI18N
        jLabel2.setText(" Recepcion Prendas");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(470, 10, 280, 30);

        jPanel3.setBackground(new java.awt.Color(0, 51, 255));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(null);

        CODSERVICIO.setEditable(false);
        CODSERVICIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CODSERVICIOActionPerformed(evt);
            }
        });
        jPanel3.add(CODSERVICIO);
        CODSERVICIO.setBounds(280, 50, 60, 40);

        TablaDetalle.setBackground(new java.awt.Color(51, 255, 255));
        TablaDetalle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 2));
        TablaDetalle.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        TablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "DESCRIPCION", "CANTIDAD"
            }
        ));
        TablaDetalle.setName(""); // NOI18N
        jScrollPane1.setViewportView(TablaDetalle);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(10, 90, 1180, 180);

        BotonAgregardetalle.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        BotonAgregardetalle.setText("AGREGAR");
        BotonAgregardetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregardetalleActionPerformed(evt);
            }
        });
        jPanel3.add(BotonAgregardetalle);
        BotonAgregardetalle.setBounds(1050, 50, 140, 40);

        jLabel1.setFont(new java.awt.Font("Purisa", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("          DETALLES DE RECEPCION");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(270, 10, 730, 30);

        SeleccionarServicio.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        SeleccionarServicio.setText("Buscar Prenda");
        SeleccionarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionarServicioActionPerformed(evt);
            }
        });
        SeleccionarServicio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SeleccionarServicioFocusGained(evt);
            }
        });
        jPanel3.add(SeleccionarServicio);
        SeleccionarServicio.setBounds(10, 50, 180, 40);

        SERVICIO.setEditable(false);
        jPanel3.add(SERVICIO);
        SERVICIO.setBounds(450, 50, 400, 40);

        jLabel15.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("  Codigo");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(200, 50, 80, 40);

        jLabel17.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Descripcion");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(360, 50, 80, 40);

        CODSERVICIO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CODSERVICIO1ActionPerformed(evt);
            }
        });
        jPanel3.add(CODSERVICIO1);
        CODSERVICIO1.setBounds(950, 50, 60, 40);

        jLabel16.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Cantidad");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(870, 50, 80, 40);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 190, 1200, 280);

        jTextField1.setEditable(false);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(700, 80, 50, 30);

        jButton1.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jButton1.setText("Buscar Cliente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton1FocusGained(evt);
            }
        });
        jButton1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jButton1AncestorAdded(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(530, 80, 150, 30);

        jLabel6.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel6.setText("Codigo");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(700, 50, 60, 40);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(140, 140, 690, 30);

        jLabel20.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel20.setText("Usuario");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(250, 80, 50, 30);

        CampoCodigo1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CampoCodigo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCodigo1ActionPerformed(evt);
            }
        });
        getContentPane().add(CampoCodigo1);
        CampoCodigo1.setBounds(300, 80, 40, 30);

        CampoCodigo2.setEditable(false);
        CampoCodigo2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CampoCodigo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCodigo2ActionPerformed(evt);
            }
        });
        getContentPane().add(CampoCodigo2);
        CampoCodigo2.setBounds(340, 80, 110, 30);

        jLabel21.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel21.setText("Codigo");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(90, 80, 50, 30);

        jLabel10.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel10.setText("Nombre o Razon Social");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(800, 50, 160, 40);

        jLabel11.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel11.setText("CI o RUC");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(970, 50, 150, 40);

        jTextField5.setEditable(false);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(750, 80, 210, 30);

        jTextField6.setEditable(false);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(960, 80, 100, 30);

        jLabel19.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel19.setText("Observacion");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(60, 140, 70, 30);

        getAccessibleContext().setAccessibleName("Resepcion");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
 this.jButton1.setEnabled(true);
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new CClientes(new VClientes()).iniciar();
        this.SeleccionarServicio.setEnabled(true);    
       
      //  new CClientes(new VClientes()).iniciar();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton1FocusGained
      this.jTextField1.setText(VClientes.Id);
    
    this.jTextField5.setText(VClientes.Cliente);
    this.jTextField6.setText(VClientes.ci);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1FocusGained

    private void CampoFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoFechaActionPerformed

    private void jButton1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jButton1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1AncestorAdded

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
     
        // TODO add your handling code here:
    }//GEN-LAST:event_CancelarActionPerformed

    private void CampoCodigo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCodigo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCodigo2ActionPerformed

    private void CampoCodigo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCodigo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCodigo1ActionPerformed

    private void SeleccionarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionarServicioActionPerformed
        // TODO add your handling code here:
        new CAccesorio(new VAccesorio()).iniciar();
        this.BotonAgregardetalle.setEnabled(true);
    }//GEN-LAST:event_SeleccionarServicioActionPerformed

    private void SeleccionarServicioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SeleccionarServicioFocusGained
        // TODO add your handling code here:
         this.CODSERVICIO.setText(VAccesorio.Cod);
         this.SERVICIO.setText(VAccesorio.Cargo);
        // this.PRENDA.setText(VBuscarTipoServicio.PRENDA);
    }//GEN-LAST:event_SeleccionarServicioFocusGained

    private void BotonAgregardetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregardetalleActionPerformed
        this.Guardar.setEnabled(true);
        this.BotonEliminardetalle.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonAgregardetalleActionPerformed

    private void CODSERVICIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CODSERVICIOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CODSERVICIOActionPerformed

    private void CODSERVICIO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CODSERVICIO1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CODSERVICIO1ActionPerformed

    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cResepcion(new vResepcion()).iniciar();
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BotonAgregardetalle;
    public javax.swing.JButton BotonEliminardetalle;
    public javax.swing.JTextField CODSERVICIO;
    public javax.swing.JTextField CODSERVICIO1;
    public javax.swing.JTextField CampoCodigo;
    public javax.swing.JTextField CampoCodigo1;
    public javax.swing.JTextField CampoCodigo2;
    public javax.swing.JTextField CampoFecha;
    public javax.swing.JButton Cancelar;
    public javax.swing.JButton Guardar;
    public javax.swing.JButton Nuevo;
    public javax.swing.JButton SALIR;
    public javax.swing.JTextField SERVICIO;
    public javax.swing.JButton SeleccionarServicio;
    public javax.swing.JTable TablaDetalle;
    public javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField5;
    public javax.swing.JTextField jTextField6;
    public javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}