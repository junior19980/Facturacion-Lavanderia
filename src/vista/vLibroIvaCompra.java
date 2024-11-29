package vista;
import modelo.*;
import controlador.*;
import vista.*;
public class vLibroIvaCompra extends javax.swing.JFrame {
    /**
     * Creates new form VProducto
     */
    public vLibroIvaCompra() {
        initComponents(); 
    }
   // mRecepcionPrenda modelo = new mRecepcionPrenda();
    
       @SuppressWarnings("unchecked")
 
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CampoCodigo = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        Exenta = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Iva10 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtGravada10 = new javax.swing.JTextField();
        Nuevo = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        SALIR = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        Gravada5 = new javax.swing.JTextField();
        Iva5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Libro Iva Compra");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1150, 400));
        setPreferredSize(null);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(108, 99, 255));
        jPanel1.setLayout(null);

        CampoCodigo.setEditable(false);
        CampoCodigo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel1.add(CampoCodigo);
        CampoCodigo.setBounds(320, 110, 60, 30);

        jLabel21.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Grabada 10%");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(390, 110, 70, 30);
        jPanel1.add(Exenta);
        Exenta.setBounds(790, 110, 90, 30);

        jLabel20.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Excenta");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(740, 110, 60, 30);

        jLabel3.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Iva 10%");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(270, 180, 50, 30);

        Iva10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Iva10MouseClicked(evt);
            }
        });
        Iva10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Iva10ActionPerformed(evt);
            }
        });
        jPanel1.add(Iva10);
        Iva10.setBounds(320, 180, 50, 30);

        jLabel4.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Grabada 5%");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(540, 110, 80, 30);

        txtGravada10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGravada10ActionPerformed(evt);
            }
        });
        jPanel1.add(txtGravada10);
        txtGravada10.setBounds(460, 110, 70, 30);

        Nuevo.setBackground(new java.awt.Color(255, 255, 255));
        Nuevo.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        Nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/nueva-pagina.png"))); // NOI18N
        Nuevo.setText("Nuevo");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });
        jPanel1.add(Nuevo);
        Nuevo.setBounds(600, 240, 210, 40);

        Guardar.setBackground(new java.awt.Color(255, 255, 255));
        Guardar.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/guardar-el-archivo.png"))); // NOI18N
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
        Guardar.setBounds(860, 240, 230, 40);

        SALIR.setBackground(new java.awt.Color(255, 255, 255));
        SALIR.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        SALIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/cerrar-sesion (1).png"))); // NOI18N
        SALIR.setText("SALIR");
        SALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALIRActionPerformed(evt);
            }
        });
        jPanel1.add(SALIR);
        SALIR.setBounds(40, 240, 220, 43);

        Cancelar.setBackground(new java.awt.Color(255, 255, 255));
        Cancelar.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/cancelar.png"))); // NOI18N
        Cancelar.setText("CANCELAR  ");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        jPanel1.add(Cancelar);
        Cancelar.setBounds(320, 240, 220, 40);

        jLabel23.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Codigo");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(270, 110, 50, 30);

        Gravada5.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Gravada5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Gravada5MouseClicked(evt);
            }
        });
        Gravada5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gravada5ActionPerformed(evt);
            }
        });
        jPanel1.add(Gravada5);
        Gravada5.setBounds(610, 110, 110, 30);

        Iva5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Iva5MouseClicked(evt);
            }
        });
        Iva5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Iva5ActionPerformed(evt);
            }
        });
        jPanel1.add(Iva5);
        Iva5.setBounds(450, 180, 70, 30);

        jLabel6.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Iva 5%");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(400, 180, 90, 30);

        jButton1.setFont(new java.awt.Font("Purisa", 0, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/buscar.png"))); // NOI18N
        jButton1.setText("Factura Compra");
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
        jButton1.setBounds(540, 180, 170, 30);

        jTextField1.setEditable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(710, 180, 50, 30);

        jTextField2.setEditable(false);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(760, 180, 120, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 60, 1120, 300);

        jLabel2.setFont(new java.awt.Font("Purisa", 0, 24)); // NOI18N
        jLabel2.setText("Libro IVA Compra");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(440, 20, 370, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed

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

    private void Iva10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Iva10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Iva10ActionPerformed

    private void Gravada5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gravada5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Gravada5ActionPerformed

    private void Gravada5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Gravada5MouseClicked
      // this.Gravada5.setText("");  // TODO add your handling code here:
    }//GEN-LAST:event_Gravada5MouseClicked

    private void Iva10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Iva10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Iva10MouseClicked

    private void GuardarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GuardarFocusGained
          // this.txtGravada10.setText(vFacturaCompra.Id);// TODO add your handling code here:
    }//GEN-LAST:event_GuardarFocusGained

    private void GuardarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GuardarFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_GuardarFocusLost

    private void Iva5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Iva5MouseClicked
this.Guardar.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_Iva5MouseClicked

    private void Iva5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Iva5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Iva5ActionPerformed

    private void txtGravada10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGravada10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGravada10ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new CBuscaFacturaCompra(new vista.VBuscaFacturaCompra()).iniciar();
	// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton1FocusGained
	 this.jTextField1.setText(VBuscaFacturaCompra.Id);      
	 this.jTextField2.setText(VBuscaFacturaCompra.Id);

		// TODO add your handling code here:
    }//GEN-LAST:event_jButton1FocusGained

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cLibroIvaCompra(new vLibroIvaCompra()).iniciar();
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField CampoCodigo;
    public javax.swing.JButton Cancelar;
    public javax.swing.JTextField Exenta;
    public javax.swing.JTextField Gravada5;
    public javax.swing.JButton Guardar;
    public javax.swing.JTextField Iva10;
    public javax.swing.JTextField Iva5;
    public javax.swing.JButton Nuevo;
    public javax.swing.JButton SALIR;
    public javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JTextField txtGravada10;
    // End of variables declaration//GEN-END:variables
}
