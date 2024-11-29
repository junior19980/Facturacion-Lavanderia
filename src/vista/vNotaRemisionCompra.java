package vista;
import modelo.*;
import controlador.*;
public class vNotaRemisionCompra extends javax.swing.JFrame {
   static String Id= "";
    /**
     * Creates new form VProducto
     */
    public vNotaRemisionCompra() {
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
        BotonEliminardetalle = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        CampoObservacion = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Remision Compra");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1200, 500));
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
        CampoCodigo.setBounds(110, 70, 100, 30);

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
        Cancelar.setBounds(380, 410, 220, 40);

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
        Guardar.setBounds(880, 410, 230, 40);

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
        Nuevo.setBounds(630, 410, 210, 40);

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
        SALIR.setBounds(120, 410, 220, 43);

        CampoFecha.setEditable(false);
        CampoFecha.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CampoFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoFechaActionPerformed(evt);
            }
        });
        getContentPane().add(CampoFecha);
        CampoFecha.setBounds(1060, 30, 110, 30);

        jLabel2.setFont(new java.awt.Font("Purisa", 1, 24)); // NOI18N
        jLabel2.setText("Nota Remision Compra");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(430, 20, 330, 30);

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
        CODSERVICIO.setBounds(290, 50, 70, 40);

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
        jScrollPane1.setBounds(20, 90, 1180, 100);

        BotonAgregardetalle.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        BotonAgregardetalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/boton-agregar.png"))); // NOI18N
        BotonAgregardetalle.setText("AGREGAR");
        BotonAgregardetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregardetalleActionPerformed(evt);
            }
        });
        jPanel3.add(BotonAgregardetalle);
        BotonAgregardetalle.setBounds(1060, 50, 140, 40);

        jLabel1.setFont(new java.awt.Font("Purisa", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("         DETALLES DE NOTA REMISION");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(250, 10, 730, 30);

        SeleccionarRecepcion.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        SeleccionarRecepcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/buscar.png"))); // NOI18N
        SeleccionarRecepcion.setText("Buscar Insumo");
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
        SeleccionarRecepcion.setBounds(20, 50, 190, 40);

        SERVICIO.setEditable(false);
        jPanel3.add(SERVICIO);
        SERVICIO.setBounds(460, 50, 410, 40);

        jLabel15.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("  Codigo");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(220, 50, 70, 40);
        jPanel3.add(CANTIDAD);
        CANTIDAD.setBounds(960, 50, 70, 40);

        jLabel17.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Descripcion");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(370, 50, 80, 40);

        jLabel18.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Cantidad");
        jPanel3.add(jLabel18);
        jLabel18.setBounds(890, 50, 70, 40);

        BotonEliminardetalle.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        BotonEliminardetalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/archivos.png"))); // NOI18N
        BotonEliminardetalle.setText("ELIMINAR DETALLE");
        BotonEliminardetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminardetalleActionPerformed(evt);
            }
        });
        jPanel3.add(BotonEliminardetalle);
        BotonEliminardetalle.setBounds(20, 190, 180, 40);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 160, 1210, 240);

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
        jButton2.setBounds(480, 70, 220, 30);

        jTextField4.setEditable(false);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(700, 70, 30, 30);

        jTextField6.setEditable(false);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(730, 70, 100, 30);

        jLabel21.setFont(new java.awt.Font("Purisa", 1, 10)); // NOI18N
        jLabel21.setText(" Pedido");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(110, 40, 110, 30);

        jTextField10.setEditable(false);
        getContentPane().add(jTextField10);
        jTextField10.setBounds(830, 70, 130, 30);
        getContentPane().add(CampoObservacion);
        CampoObservacion.setBounds(110, 120, 1040, 30);

        jLabel24.setFont(new java.awt.Font("Purisa", 1, 10)); // NOI18N
        jLabel24.setText("Observacion:");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(30, 120, 70, 40);

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(250, 70, 30, 30);

        jTextField7.setEditable(false);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(280, 70, 100, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Nro Factura");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(740, 50, 70, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Proveedor");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(830, 50, 90, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Id");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(710, 50, 20, 20);

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
        this.CODSERVICIO.setText(VBuscaInsumo.Id);
       this.SERVICIO.setText(VBuscaInsumo.Cliente);   
    }//GEN-LAST:event_SeleccionarRecepcionFocusGained

    private void SeleccionarRecepcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionarRecepcionActionPerformed
        // TODO add your handling code here:
         new CBuscaInsumo(new VBuscaInsumo()).iniciar();
         this.BotonAgregardetalle.setEnabled(true);
    }//GEN-LAST:event_SeleccionarRecepcionActionPerformed

    private void BotonAgregardetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregardetalleActionPerformed
 this.Guardar.setEnabled(true);       
  this.BotonEliminardetalle.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonAgregardetalleActionPerformed

    private void jButton2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jButton2AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2AncestorAdded

    private void jButton2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton2FocusGained
        this.jTextField4.setText(VBuscaFacturaCompra.Id);
        this.jTextField6.setText(VBuscaFacturaCompra.Cliente);
        this.jTextField10.setText(VBuscaFacturaCompra.Id1);
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

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed


    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
     Id=this.CampoCodigo.getText(); 
// TODO add your handling code here:
    }//GEN-LAST:event_GuardarActionPerformed

    private void CampoFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoFechaActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    /**
     * @param args the command line arguments
     */

    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cNotaRemisionCompra(new vNotaRemisionCompra()).iniciar();
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BotonAgregardetalle;
    public javax.swing.JButton BotonEliminardetalle;
    public javax.swing.JTextField CANTIDAD;
    public javax.swing.JTextField CODSERVICIO;
    public javax.swing.JTextField CampoCodigo;
    public javax.swing.JTextField CampoFecha;
    public javax.swing.JTextField CampoObservacion;
    public javax.swing.JButton Cancelar;
    public javax.swing.JButton Guardar;
    public javax.swing.JButton Nuevo;
    public javax.swing.JButton SALIR;
    public javax.swing.JTextField SERVICIO;
    public javax.swing.JButton SeleccionarRecepcion;
    public javax.swing.JTable TablaDetalle;
    public javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField jTextField10;
    public javax.swing.JTextField jTextField4;
    public javax.swing.JTextField jTextField5;
    public javax.swing.JTextField jTextField6;
    public javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
