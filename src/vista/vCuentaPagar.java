package vista;
import modelo.*;
import controlador.*;
import vista.*;
public class vCuentaPagar extends javax.swing.JFrame {
   
    public vCuentaPagar() {
        initComponents(); 
    }
   // mRecepcionPrenda modelo = new mRecepcionPrenda();
    
       @SuppressWarnings("unchecked")
 
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CampoCodigo = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        monto = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fact = new javax.swing.JTextField();
        CampoCodigo1 = new javax.swing.JTextField();
        CampoCodigo2 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        Guardar = new javax.swing.JButton();
        SALIR = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        CampoFecha1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cuentas a Pgar");
        setBackground(new java.awt.Color(255, 255, 255));
        setEnabled(false);
        setMinimumSize(new java.awt.Dimension(1200, 550));
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
        jPanel1.setMinimumSize(new java.awt.Dimension(1150, 600));
        jPanel1.setLayout(null);

        CampoCodigo.setEditable(false);
        CampoCodigo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel1.add(CampoCodigo);
        CampoCodigo.setBounds(220, 110, 60, 30);

        jLabel21.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Nro Factura");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(290, 110, 70, 30);

        monto.setEditable(false);
        jPanel1.add(monto);
        monto.setBounds(480, 200, 140, 30);

        jLabel20.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Monto");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(410, 200, 70, 30);

        jLabel3.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cantidad Cuota");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(650, 200, 90, 30);

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
        jTextField4.setBounds(740, 200, 50, 30);

        jLabel4.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha Vencimiento");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(690, 110, 110, 30);

        fact.setEditable(false);
        fact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factActionPerformed(evt);
            }
        });
        jPanel1.add(fact);
        fact.setBounds(360, 110, 100, 30);

        CampoCodigo1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CampoCodigo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCodigo1ActionPerformed(evt);
            }
        });
        jPanel1.add(CampoCodigo1);
        CampoCodigo1.setBounds(520, 110, 40, 30);

        CampoCodigo2.setEditable(false);
        CampoCodigo2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CampoCodigo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCodigo2ActionPerformed(evt);
            }
        });
        jPanel1.add(CampoCodigo2);
        CampoCodigo2.setBounds(560, 110, 110, 30);

        jLabel22.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Usuario");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(470, 110, 50, 30);

        Guardar.setBackground(new java.awt.Color(0, 51, 255));
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
        Guardar.setBounds(620, 300, 230, 40);

        SALIR.setBackground(new java.awt.Color(102, 51, 255));
        SALIR.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        SALIR.setText("SALIR");
        SALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALIRActionPerformed(evt);
            }
        });
        jPanel1.add(SALIR);
        SALIR.setBounds(60, 300, 220, 43);

        Cancelar.setBackground(new java.awt.Color(0, 51, 255));
        Cancelar.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        Cancelar.setText("CANCELAR  ");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        jPanel1.add(Cancelar);
        Cancelar.setBounds(340, 300, 220, 40);

        jLabel23.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Codigo");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(170, 110, 50, 30);

        CampoFecha1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CampoFecha1.setText("aaaa-mm-dd");
        CampoFecha1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CampoFecha1MouseClicked(evt);
            }
        });
        CampoFecha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoFecha1ActionPerformed(evt);
            }
        });
        jPanel1.add(CampoFecha1);
        CampoFecha1.setBounds(790, 110, 110, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 130, 1150, 360);

        jLabel2.setFont(new java.awt.Font("Purisa", 0, 24)); // NOI18N
        jLabel2.setText("Cuentas a Pagar");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(500, 50, 210, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void CampoFecha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoFecha1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoFecha1ActionPerformed

    private void CampoFecha1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoFecha1MouseClicked
      this.CampoFecha1.setText("");  // TODO add your handling code here:
    }//GEN-LAST:event_CampoFecha1MouseClicked

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
        this.Guardar.setEnabled(true);// TODO add your handling code here:
    }//GEN-LAST:event_jTextField4MouseClicked

    private void GuardarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GuardarFocusGained
          this.fact.setText(vFacturaCompra.Id);// TODO add your handling code here:
    }//GEN-LAST:event_GuardarFocusGained

    private void GuardarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GuardarFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_GuardarFocusLost

    private void factActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_factActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cCuentaPagar(new vCuentaPagar()).iniciar();
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField CampoCodigo;
    public javax.swing.JTextField CampoCodigo1;
    public javax.swing.JTextField CampoCodigo2;
    public javax.swing.JTextField CampoFecha1;
    public javax.swing.JButton Cancelar;
    public javax.swing.JButton Guardar;
    public javax.swing.JTextField fact;
    public javax.swing.JButton SALIR;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField jTextField4;
    public javax.swing.JTextField monto;
    // End of variables declaration//GEN-END:variables
}
