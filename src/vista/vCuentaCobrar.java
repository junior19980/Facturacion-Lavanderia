package vista;
import modelo.*;
import controlador.*;
import vista.*;
public class vCuentaCobrar extends javax.swing.JFrame {
     cFacturaVenta vn;
	/**
     * Creates new form VProducto
     */
    public vCuentaCobrar() {
        initComponents(); 
    }
   // mRecepcionPrenda modelo = new mRecepcionPrenda();
    
       @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CampoCodigo = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        CampoCodigo1 = new javax.swing.JTextField();
        CampoCodigo2 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        Nuevo = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        SALIR = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        CampoFecha = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Orden de Trabajo");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1200, 450));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        CampoCodigo.setEditable(false);
        CampoCodigo.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        CampoCodigo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel1.add(CampoCodigo);
        CampoCodigo.setBounds(300, 110, 90, 30);

        jLabel21.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jLabel21.setText("Codigo Factura");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(410, 110, 150, 30);

        jTextField7.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jPanel1.add(jTextField7);
        jTextField7.setBounds(300, 170, 120, 30);

        jLabel20.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jLabel20.setText("Monto Total");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(180, 170, 120, 30);

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClicked(evt);
            }
        });
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4);
        jTextField4.setBounds(520, 170, 40, 30);

        jTextField6.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jPanel1.add(jTextField6);
        jTextField6.setBounds(550, 110, 100, 30);

        CampoCodigo1.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        CampoCodigo1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CampoCodigo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCodigo1ActionPerformed(evt);
            }
        });
        jPanel1.add(CampoCodigo1);
        CampoCodigo1.setBounds(740, 110, 40, 30);

        CampoCodigo2.setEditable(false);
        CampoCodigo2.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        CampoCodigo2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CampoCodigo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCodigo2ActionPerformed(evt);
            }
        });
        jPanel1.add(CampoCodigo2);
        CampoCodigo2.setBounds(780, 110, 110, 30);

        jLabel22.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("%");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(690, 170, 70, 30);

        Nuevo.setBackground(new java.awt.Color(255, 255, 255));
        Nuevo.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        Nuevo.setText("Nuevo");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });
        jPanel1.add(Nuevo);
        Nuevo.setBounds(620, 300, 210, 40);

        Guardar.setBackground(new java.awt.Color(255, 255, 255));
        Guardar.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        Guardar.setText("GUARDAR");
        Guardar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                GuardarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                GuardarFocusLost(evt);
            }
        });
        jPanel1.add(Guardar);
        Guardar.setBounds(880, 300, 230, 40);

        SALIR.setBackground(new java.awt.Color(255, 255, 255));
        SALIR.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        SALIR.setText("SALIR");
        SALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALIRActionPerformed(evt);
            }
        });
        jPanel1.add(SALIR);
        SALIR.setBounds(60, 300, 220, 43);

        Cancelar.setBackground(new java.awt.Color(255, 255, 255));
        Cancelar.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        Cancelar.setText("CANCELAR  ");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        jPanel1.add(Cancelar);
        Cancelar.setBounds(340, 300, 220, 40);

        jLabel23.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jLabel23.setText("Codigo");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(230, 110, 80, 30);

        CampoFecha.setEditable(false);
        CampoFecha.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CampoFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CampoFechaMouseClicked(evt);
            }
        });
        CampoFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoFechaActionPerformed(evt);
            }
        });
        jPanel1.add(CampoFecha);
        CampoFecha.setBounds(1000, 20, 110, 30);

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField5MouseClicked(evt);
            }
        });
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5);
        jTextField5.setBounds(490, 170, 30, 30);

        jButton1.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jButton1.setText("Interes");
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
        jPanel1.add(jButton1);
        jButton1.setBounds(720, 170, 170, 30);

        jTextField8.setEditable(false);
        jTextField8.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jTextField8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField8MouseClicked(evt);
            }
        });
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField8);
        jTextField8.setBounds(620, 170, 60, 30);

        jLabel24.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jLabel24.setText("Usuario");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(660, 110, 80, 30);

        jLabel25.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jLabel25.setText("Meses");
        jPanel1.add(jLabel25);
        jLabel25.setBounds(570, 170, 80, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 60, 1150, 360);

        jLabel2.setFont(new java.awt.Font("Purisa", 0, 24)); // NOI18N
        jLabel2.setText("Cuentas Cobrar");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(500, 10, 210, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
this.Guardar.setEnabled(true);
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

    private void CampoFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoFechaActionPerformed

    private void CampoFechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoFechaMouseClicked
      this.CampoFecha.setText("");  // TODO add your handling code here:
    }//GEN-LAST:event_CampoFechaMouseClicked

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
        this.Guardar.setEnabled(true);// TODO add your handling code here:
    }//GEN-LAST:event_jTextField4MouseClicked

    private void GuardarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GuardarFocusGained
          this.jTextField6.setText(vFacturaCompra.Id);// TODO add your handling code here:
    }//GEN-LAST:event_GuardarFocusGained

    private void GuardarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GuardarFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_GuardarFocusLost

    private void jTextField5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5MouseClicked

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new CBuscaInteres(new VBuscaInteres()).iniciar();
		this.Guardar.setEnabled(true);
	// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton1FocusGained
 this.jTextField5.setText(vista.VBuscaInteres.Id);
  this.jTextField4.setText(vista.VBuscaInteres.desc); 
  this.jTextField8.setText(vista.VBuscaInteres.cat); 
    double totales=(this.vn.total);
  double porce=Integer.parseInt(vista.VBuscaInteres.cat);
  double meeee=(totales*porce)/100;
  double impre=totales+meeee;
  this.jTextField7.setText(String.valueOf(impre));
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1FocusGained

    private void jTextField8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8MouseClicked
    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cCuentaCobrar(new vCuentaCobrar()).iniciar();
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField CampoCodigo;
    public javax.swing.JTextField CampoCodigo1;
    public javax.swing.JTextField CampoCodigo2;
    public javax.swing.JTextField CampoFecha;
    public javax.swing.JButton Cancelar;
    public javax.swing.JButton Guardar;
    public javax.swing.JButton Nuevo;
    public javax.swing.JButton SALIR;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField jTextField4;
    public javax.swing.JTextField jTextField5;
    public javax.swing.JTextField jTextField6;
    public javax.swing.JTextField jTextField7;
    public javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}