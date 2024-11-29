package vista;
import modelo.*;
import controlador.*;
public class vCalculaIvaCompra extends javax.swing.JFrame {
   static String Id= "";
    /**
     * Creates new form VProducto
     */
    public vCalculaIvaCompra() {
        initComponents(); 
    }
   // mRecepcionPrenda modelo = new mRecepcionPrenda();
           @SuppressWarnings("unchecked")
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Guardar = new javax.swing.JButton();
        SALIR = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        CampoCodigo1 = new javax.swing.JTextField();
        CampoCodigo2 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        CampoFecha = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<String>();
        jLabel18 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Libro IVA Compra");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(710, 400));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
        });
        getContentPane().setLayout(null);

        Guardar.setBackground(new java.awt.Color(255, 255, 255));
        Guardar.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        Guardar.setText("CALCULAR");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(Guardar);
        Guardar.setBounds(330, 300, 230, 40);

        SALIR.setBackground(new java.awt.Color(255, 255, 255));
        SALIR.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        SALIR.setText("SALIR");
        SALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALIRActionPerformed(evt);
            }
        });
        getContentPane().add(SALIR);
        SALIR.setBounds(80, 300, 220, 43);

        jLabel2.setFont(new java.awt.Font("Purisa", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Libro IVA Venta");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(220, 30, 260, 30);

        CampoCodigo1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CampoCodigo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCodigo1ActionPerformed(evt);
            }
        });
        getContentPane().add(CampoCodigo1);
        CampoCodigo1.setBounds(100, 90, 40, 30);

        CampoCodigo2.setEditable(false);
        CampoCodigo2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CampoCodigo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCodigo2ActionPerformed(evt);
            }
        });
        getContentPane().add(CampoCodigo2);
        CampoCodigo2.setBounds(140, 90, 110, 30);

        jTextField8.setEditable(false);
        jTextField8.setFont(new java.awt.Font("Yu Gothic Medium", 3, 12)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(0, 204, 204));
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField8);
        jTextField8.setBounds(90, 170, 90, 30);

        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("Yu Gothic Medium", 3, 12)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(0, 204, 204));
        getContentPane().add(jTextField9);
        jTextField9.setBounds(310, 170, 100, 30);

        CampoFecha.setEditable(false);
        getContentPane().add(CampoFecha);
        CampoFecha.setBounds(500, 30, 130, 30);

        jLabel22.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel22.setText("Usuario");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(40, 90, 50, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(300, 90, 140, 30);

        jLabel18.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel18.setText("IVA Factura ");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(100, 140, 100, 30);

        jLabel25.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel25.setText("Total IVA");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(270, 220, 100, 30);

        jLabel26.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel26.setText("Elegir Mes");
        getContentPane().add(jLabel26);
        jLabel26.setBounds(320, 60, 100, 30);

        jTextField11.setEditable(false);
        jTextField11.setFont(new java.awt.Font("Yu Gothic Medium", 3, 12)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(0, 204, 204));
        getContentPane().add(jTextField11);
        jTextField11.setBounds(520, 170, 80, 30);

        jTextField12.setEditable(false);
        jTextField12.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jTextField12);
        jTextField12.setBounds(250, 250, 110, 30);

        jLabel27.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel27.setText("IVA Debito");
        getContentPane().add(jLabel27);
        jLabel27.setBounds(530, 140, 130, 30);

        jLabel28.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel28.setText("IVA Nota  Credito ");
        getContentPane().add(jLabel28);
        jLabel28.setBounds(310, 140, 100, 30);

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

    private void CampoCodigo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCodigo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCodigo2ActionPerformed

    private void CampoCodigo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCodigo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCodigo1ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed


    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
/*     Id=this.CampoCodigo.getText();
        String tipofactura[] = this.jComboBox1.getSelectedItem().toString().split("-");
        int basura= Integer.parseInt(tipofactura[0].trim());
        if(basura==2){
        new cCuentaCobrar(new vCuentaCobrar()).iniciar();
        }else{
        new cFormaPago(new vFormaPago()).iniciar();
		}*/
   
// TODO add your handling code here:
    }//GEN-LAST:event_GuardarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        this.Guardar.setEnabled(true);// TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    /**
     * @param args the command line arguments
     */

    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cCalculaIvaCompra(new vCalculaIvaCompra()).iniciar();
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField CampoCodigo1;
    public javax.swing.JTextField CampoCodigo2;
    public javax.swing.JTextField CampoFecha;
    public javax.swing.JButton Guardar;
    public javax.swing.JButton SALIR;
    public javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    public javax.swing.JTextField jTextField11;
    public javax.swing.JTextField jTextField12;
    public javax.swing.JTextField jTextField8;
    public javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
