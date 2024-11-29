package vista;
import modelo.*;
import controlador.*;
public class vRemisionCompra extends javax.swing.JFrame {
       /**
     * Creates new form VProducto
     */
    public vRemisionCompra() {
        initComponents(); 
    }
   // mRecepcionPrenda modelo = new mRecepcionPrenda();
    
       @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        CampoFecha = new javax.swing.JTextField();
        CampoCodigo = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        CampoCodigo1 = new javax.swing.JTextField();
        CampoCodigo2 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        Nuevo = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        SALIR = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        CampoCodigo3 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTextField10 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        CampoCodigo4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Orden de Trabajo");
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

        jLabel2.setFont(new java.awt.Font("Purisa", 0, 24)); // NOI18N
        jLabel2.setText("Remision Compra");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(500, 50, 250, 30);

        jPanel1.setBackground(new java.awt.Color(108, 99, 255));
        jPanel1.setLayout(null);

        CampoFecha.setEditable(false);
        CampoFecha.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CampoFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoFechaActionPerformed(evt);
            }
        });
        jPanel1.add(CampoFecha);
        CampoFecha.setBounds(1000, 30, 110, 30);

        CampoCodigo.setEditable(false);
        CampoCodigo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel1.add(CampoCodigo);
        CampoCodigo.setBounds(360, 60, 60, 30);
        jPanel1.add(jTextField7);
        jTextField7.setBounds(260, 140, 150, 30);

        jLabel20.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Direccion Partida:");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(170, 140, 100, 30);

        jLabel3.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Motivo");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(720, 140, 60, 30);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4);
        jTextField4.setBounds(760, 140, 200, 30);

        CampoCodigo1.setEditable(false);
        CampoCodigo1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CampoCodigo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCodigo1ActionPerformed(evt);
            }
        });
        jPanel1.add(CampoCodigo1);
        CampoCodigo1.setBounds(480, 60, 40, 30);

        CampoCodigo2.setEditable(false);
        CampoCodigo2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CampoCodigo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCodigo2ActionPerformed(evt);
            }
        });
        jPanel1.add(CampoCodigo2);
        CampoCodigo2.setBounds(520, 60, 110, 30);

        jLabel22.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Sucursal");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(670, 60, 50, 30);

        Nuevo.setBackground(new java.awt.Color(0, 0, 0));
        Nuevo.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        Nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/nueva-pagina.png"))); // NOI18N
        Nuevo.setText("Nuevo");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });
        jPanel1.add(Nuevo);
        Nuevo.setBounds(620, 300, 210, 40);

        Guardar.setBackground(new java.awt.Color(0, 0, 0));
        Guardar.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/guardar-el-archivo.png"))); // NOI18N
        Guardar.setText("GUARDAR");
        jPanel1.add(Guardar);
        Guardar.setBounds(880, 300, 230, 40);

        Cancelar.setBackground(new java.awt.Color(0, 0, 0));
        Cancelar.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/cancelar.png"))); // NOI18N
        Cancelar.setText("CANCELAR  ");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        jPanel1.add(Cancelar);
        Cancelar.setBounds(340, 300, 220, 40);

        SALIR.setBackground(new java.awt.Color(0, 0, 0));
        SALIR.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        SALIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/cerrar-sesion (1).png"))); // NOI18N
        SALIR.setText("SALIR");
        SALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALIRActionPerformed(evt);
            }
        });
        jPanel1.add(SALIR);
        SALIR.setBounds(50, 300, 220, 43);

        jLabel23.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Codigo");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(310, 60, 50, 30);

        CampoCodigo3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel1.add(CampoCodigo3);
        CampoCodigo3.setBounds(720, 60, 40, 30);

        jLabel24.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Usuario");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(430, 60, 50, 30);

        jButton3.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jButton3.setText("Buscar Factura Compra");
        jButton3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jButton3AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jButton3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton3FocusGained(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(220, 230, 220, 30);

        jLabel6.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Codigo");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(450, 200, 60, 40);

        jTextField8.setEditable(false);
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField8);
        jTextField8.setBounds(440, 230, 50, 30);

        jTextField9.setEditable(false);
        jPanel1.add(jTextField9);
        jTextField9.setBounds(490, 230, 120, 30);

        jLabel7.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Descripcion");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(510, 200, 100, 40);

        jButton4.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jButton4.setText("Buscar Proveedor");
        jButton4.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jButton4AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jButton4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton4FocusGained(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(620, 230, 160, 30);

        jTextField10.setEditable(false);
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField10);
        jTextField10.setBounds(780, 230, 50, 30);

        jLabel8.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Codigo");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(790, 200, 60, 40);

        jLabel9.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nombre");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(850, 200, 100, 40);

        jTextField11.setEditable(false);
        jPanel1.add(jTextField11);
        jTextField11.setBounds(830, 230, 120, 30);
        jPanel1.add(jTextField12);
        jTextField12.setBounds(540, 140, 170, 30);

        jLabel21.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Direccion llegada:");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(430, 140, 100, 30);

        CampoCodigo4.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel1.add(CampoCodigo4);
        CampoCodigo4.setBounds(760, 60, 60, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 130, 1150, 360);

        getAccessibleContext().setAccessibleName("Remision Compra");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
this.jButton3.setEnabled(true);
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

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jButton3AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3AncestorAdded

    private void jButton3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton3FocusGained
             this.jTextField8.setText(VBuscaFacturaCompra.Id);
        this.jTextField9.setText(VBuscaFacturaCompra.Cliente);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton3FocusGained

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new CBuscaFacturaCompra(new  VBuscaFacturaCompra()).iniciar();
        this.jButton4.setEnabled(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jButton4AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jButton4AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4AncestorAdded

    private void jButton4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton4FocusGained
         this.jTextField10.setText(VBuscaProveedor.Id);
        this.jTextField11.setText(VBuscaProveedor.Cliente);
                // TODO add your handling code here:
    }//GEN-LAST:event_jButton4FocusGained

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new CBuscaProveedor(new VBuscaProveedor()).iniciar();
        this.Guardar.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cRemisionCompra(new vRemisionCompra()).iniciar();
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField CampoCodigo;
    public javax.swing.JTextField CampoCodigo1;
    public javax.swing.JTextField CampoCodigo2;
    public javax.swing.JTextField CampoCodigo3;
    public javax.swing.JTextField CampoCodigo4;
    public javax.swing.JTextField CampoFecha;
    public javax.swing.JButton Cancelar;
    public javax.swing.JButton Guardar;
    public javax.swing.JButton Nuevo;
    public javax.swing.JButton SALIR;
    public javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField jTextField10;
    public javax.swing.JTextField jTextField11;
    public javax.swing.JTextField jTextField12;
    public javax.swing.JTextField jTextField4;
    public javax.swing.JTextField jTextField7;
    public javax.swing.JTextField jTextField8;
    public javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
