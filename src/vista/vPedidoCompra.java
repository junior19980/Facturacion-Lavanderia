/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import modelo.*;
import controlador.*;
import vista.*;
public class vPedidoCompra extends javax.swing.JFrame {
   
    /**
     * Creates new form VProducto
     */
    public vPedidoCompra() {
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
        SeleccionarRecepcion = new javax.swing.JButton();
        SERVICIO = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        SERVICIO1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        CampoCodigo1 = new javax.swing.JTextField();
        CampoCodigo2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pedido Compra");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(null);
        setPreferredSize(new java.awt.Dimension(1250, 650));
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
        CampoCodigo.setBounds(220, 90, 100, 30);

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
        Nuevo.setBounds(640, 540, 210, 40);

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
        CampoFecha.setBounds(1070, 30, 110, 30);

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
        jLabel2.setText("Formulario Pedido Compra");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(410, 10, 350, 30);

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
        CODSERVICIO.setBounds(340, 50, 90, 40);

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

        jLabel1.setFont(new java.awt.Font("Purisa", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("           DETALLES DE PEDIDO COMPRA");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(210, 10, 730, 30);

        SeleccionarRecepcion.setBackground(new java.awt.Color(255, 255, 255));
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
        SeleccionarRecepcion.setBounds(10, 50, 190, 40);

        SERVICIO.setEditable(false);
        jPanel3.add(SERVICIO);
        SERVICIO.setBounds(520, 50, 290, 40);

        jLabel15.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("  Codigo");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(240, 50, 90, 40);

        jLabel17.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Cantidad");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(830, 50, 80, 40);

        jLabel18.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Descripcion");
        jPanel3.add(jLabel18);
        jLabel18.setBounds(440, 50, 80, 40);

        SERVICIO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SERVICIO1ActionPerformed(evt);
            }
        });
        jPanel3.add(SERVICIO1);
        SERVICIO1.setBounds(890, 50, 100, 40);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 200, 1200, 270);

        jButton2.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jButton2.setText("Buscar Funcionario");
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
        jButton2.setBounds(660, 90, 170, 30);

        jTextField4.setEditable(false);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(830, 90, 40, 30);

        jTextField6.setEditable(false);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(870, 90, 80, 30);

        jLabel20.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel20.setText("Observacion");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(120, 170, 80, 30);

        CampoCodigo1.setEditable(false);
        CampoCodigo1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CampoCodigo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCodigo1ActionPerformed(evt);
            }
        });
        getContentPane().add(CampoCodigo1);
        CampoCodigo1.setBounds(450, 90, 40, 30);

        CampoCodigo2.setEditable(false);
        CampoCodigo2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CampoCodigo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCodigo2ActionPerformed(evt);
            }
        });
        getContentPane().add(CampoCodigo2);
        CampoCodigo2.setBounds(490, 90, 110, 30);

        jLabel21.setFont(new java.awt.Font("Purisa", 1, 10)); // NOI18N
        jLabel21.setText(" Pedido");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(100, 90, 100, 30);

        jTextField7.setEditable(false);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(950, 90, 100, 30);
        getContentPane().add(jTextField11);
        jTextField11.setBounds(220, 170, 830, 30);

        jLabel22.setFont(new java.awt.Font("Purisa", 1, 10)); // NOI18N
        jLabel22.setText("Usuario");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(400, 90, 50, 30);

        jButton3.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/buscar.png"))); // NOI18N
        jButton3.setText("Buscar Proveedor");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton3FocusGained(evt);
            }
        });
        jButton3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jButton3AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(50, 130, 180, 30);

        jTextField5.setEditable(false);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(250, 130, 40, 30);

        jTextField8.setEditable(false);
        getContentPane().add(jTextField8);
        jTextField8.setBounds(290, 130, 160, 30);

        jTextField9.setEditable(false);
        getContentPane().add(jTextField9);
        jTextField9.setBounds(450, 130, 100, 30);

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

    private void CampoFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoFechaActionPerformed

    private void jButton2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jButton2AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2AncestorAdded

    private void jButton2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton2FocusGained
        this.jTextField4.setText(VBuscaFuncionario.Id);
        this.jTextField6.setText(VBuscaFuncionario.Cliente);
        this.jTextField7.setText(VBuscaFuncionario .Id1);
       // this.jTextField8.setText(VEquipo.precio1);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2FocusGained

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
new CBuscaFuncionario(new VBuscaFuncionario()).iniciar();
     this.jButton3.setEnabled(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        this.jButton2.setEnabled(false);
        this.jButton3.setEnabled(false);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_CancelarActionPerformed

    private void CampoCodigo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCodigo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCodigo2ActionPerformed

    private void CampoCodigo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCodigo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCodigo1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new CBuscaProveedor(new VBuscaProveedor()).iniciar();
     this.SeleccionarRecepcion.setEnabled(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton3FocusGained
        // TODO add your handling code here:
          this.jTextField5.setText(VBuscaProveedor.Id);
        this.jTextField8.setText(VBuscaProveedor.Cliente);
        this.jTextField9.setText(VBuscaProveedor .Id1);
    }//GEN-LAST:event_jButton3FocusGained

    private void jButton3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jButton3AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3AncestorAdded

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void SERVICIO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SERVICIO1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SERVICIO1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cPedidoCompra(new vPedidoCompra()).iniciar();
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BotonAgregardetalle;
    public javax.swing.JButton BotonEliminardetalle;
    public javax.swing.JTextField CODSERVICIO;
    public javax.swing.JTextField CampoCodigo;
    public javax.swing.JTextField CampoCodigo1;
    public javax.swing.JTextField CampoCodigo2;
    public javax.swing.JTextField CampoFecha;
    public javax.swing.JButton Cancelar;
    public javax.swing.JButton Guardar;
    public javax.swing.JButton Nuevo;
    public javax.swing.JButton SALIR;
    public javax.swing.JTextField SERVICIO;
    public javax.swing.JTextField SERVICIO1;
    public javax.swing.JButton SeleccionarRecepcion;
    public javax.swing.JTable TablaDetalle;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField jTextField11;
    public javax.swing.JTextField jTextField4;
    public javax.swing.JTextField jTextField5;
    public javax.swing.JTextField jTextField6;
    public javax.swing.JTextField jTextField7;
    public javax.swing.JTextField jTextField8;
    public javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
