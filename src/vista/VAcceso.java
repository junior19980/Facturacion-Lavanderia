package vista;
import controlador.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class VAcceso extends javax.swing.JFrame {
       public VAcceso() {
        initComponents();
	}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtcontaseña = new javax.swing.JPasswordField();
        Salir = new javax.swing.JButton();
        ingresar = new javax.swing.JButton();
        txtusuario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(840, 590));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Purisa", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 120, 0, 50);

        jLabel2.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(680, 10, 150, 30);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -30, 30, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/Frame 5 (1).png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        jLabel6.setForeground(new java.awt.Color(157, 151, 255));
        jLabel6.setText("Usuario");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jLabel7.setForeground(new java.awt.Color(157, 151, 255));
        jLabel7.setText("Password");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        txtcontaseña.setText("123");
        txtcontaseña.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtcontaseña.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtcontaseñaCaretUpdate(evt);
            }
        });
        txtcontaseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtcontaseñaMouseClicked(evt);
            }
        });
        txtcontaseña.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                txtcontaseñaMouseDragged(evt);
            }
        });
        txtcontaseña.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                txtcontaseñaComponentHidden(evt);
            }
        });
        txtcontaseña.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                txtcontaseñaComponentAdded(evt);
            }
        });
        txtcontaseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontaseñaActionPerformed(evt);
            }
        });
        txtcontaseña.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
                txtcontaseñaAncestorMoved(evt);
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
            }
        });
        txtcontaseña.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                txtcontaseñaHierarchyChanged(evt);
            }
        });
        txtcontaseña.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtcontaseñaPropertyChange(evt);
            }
        });
        txtcontaseña.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                txtcontaseñaCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        txtcontaseña.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txtcontaseñaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                txtcontaseñaAncestorRemoved(evt);
            }
        });
        txtcontaseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcontaseñaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcontaseñaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcontaseñaKeyTyped(evt);
            }
        });
        txtcontaseña.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                txtcontaseñaVetoableChange(evt);
            }
        });
        jPanel1.add(txtcontaseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 220, 30));

        Salir.setBackground(new java.awt.Color(108, 99, 255));
        Salir.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        Salir.setForeground(new java.awt.Color(255, 255, 255));
        Salir.setText("SALIR");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jPanel1.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 130, 40));

        ingresar.setBackground(new java.awt.Color(108, 99, 255));
        ingresar.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        ingresar.setForeground(new java.awt.Color(255, 255, 255));
        ingresar.setText("ENTRAR");
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });
        jPanel1.add(ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 140, 40));

        txtusuario.setFont(new java.awt.Font("Purisa", 0, 12)); // NOI18N
        txtusuario.setText("USUARIO");
        txtusuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtusuarioMouseClicked(evt);
            }
        });
        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 220, 30));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(240, 170, 360, 280);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/Group 1000002310.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 840, 1117);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcontaseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontaseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontaseñaActionPerformed

    private void txtusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtusuarioMouseClicked
        this.txtusuario.setText("");
    }//GEN-LAST:event_txtusuarioMouseClicked

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void txtcontaseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcontaseñaMouseClicked
       this.txtcontaseña.setText("");
               // TODO add your handling code here:
    }//GEN-LAST:event_txtcontaseñaMouseClicked

    private void txtcontaseñaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtcontaseñaAncestorAdded
        //this.txtcontaseña.setText("");
// TODO add your handling code here:
    }//GEN-LAST:event_txtcontaseñaAncestorAdded

    private void txtcontaseñaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtcontaseñaCaretUpdate
       // this.txtcontaseña.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_txtcontaseñaCaretUpdate

    private void txtcontaseñaComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_txtcontaseñaComponentHidden
        //this.txtcontaseña.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_txtcontaseñaComponentHidden

    private void txtcontaseñaComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txtcontaseñaComponentAdded
       // this.txtcontaseña.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_txtcontaseñaComponentAdded

    private void txtcontaseñaHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_txtcontaseñaHierarchyChanged
       // this.txtcontaseña.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_txtcontaseñaHierarchyChanged

    private void txtcontaseñaAncestorMoved(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_txtcontaseñaAncestorMoved
      //this.txtcontaseña.setText("");  // TODO add your handling code here:
    }//GEN-LAST:event_txtcontaseñaAncestorMoved

    private void txtcontaseñaCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtcontaseñaCaretPositionChanged
       //this.txtcontaseña.setText(""); // TODO add your handling code here:
    }//GEN-LAST:event_txtcontaseñaCaretPositionChanged

    private void txtcontaseñaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcontaseñaMouseDragged
       //this.txtcontaseña.setText(""); // TODO add your handling code here:
    }//GEN-LAST:event_txtcontaseñaMouseDragged

    private void txtcontaseñaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtcontaseñaPropertyChange
       //this.txtcontaseña.setText(""); // TODO add your handling code here:
    }//GEN-LAST:event_txtcontaseñaPropertyChange

    private void txtcontaseñaVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_txtcontaseñaVetoableChange
      //  this.txtcontaseña.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_txtcontaseñaVetoableChange

    private void txtcontaseñaAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtcontaseñaAncestorRemoved
       // this.txtcontaseña.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_txtcontaseñaAncestorRemoved

    private void txtcontaseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontaseñaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontaseñaKeyPressed

    private void txtcontaseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontaseñaKeyReleased
       // this.txtcontaseña.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_txtcontaseñaKeyReleased

    private void txtcontaseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontaseñaKeyTyped
      //  this.txtcontaseña.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_txtcontaseñaKeyTyped

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VAcceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VAcceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VAcceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VAcceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cacceso(new VAcceso()).iniciar();
                
                Date date = new Date();
int mediodia=12,tarde=19,zero=00;

//Caso 1: obtener la hora y salida por pantalla con formato:
DateFormat hourFormat = new SimpleDateFormat("HH");
int hra =Integer.parseInt(hourFormat.format(date));

    if(hra<=mediodia & hra>=zero){
     jLabel1.setText("Buenos dias");
    }
    if(hra>mediodia & hra<20){
        jLabel1.setText("Buenas Tardes");
    }
    if(hra>19 & hra<=23){
        jLabel1.setText("Buenas noches");
    }       }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Salir;
    public javax.swing.JButton ingresar;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPasswordField txtcontaseña;
    public javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}