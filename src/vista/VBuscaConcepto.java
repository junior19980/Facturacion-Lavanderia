package vista;
import controlador.*;
import vista.*;
/**
 *
 * @author Pablo Santander
 */
public class VBuscaConcepto extends javax.swing.JFrame {
 static String Id= "";
 static String desc= "";
 static String cat="";
    /**
     * Creates new form VBarrio
     */
    public VBuscaConcepto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaConsulta = new javax.swing.JTable();
        CampoBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Seleccionar = new javax.swing.JButton();
        descriciudad = new javax.swing.JTextField();
        CampoDescripcion = new javax.swing.JTextField();
        CampoCodigo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1180, 450));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Purisa", 3, 18)); // NOI18N
        jLabel1.setText("Concepto");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(540, 20, 170, 30);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jTabbedPane1.setFont(new java.awt.Font("Purisa", 3, 14)); // NOI18N
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(108, 99, 255));
        jPanel1.setLayout(null);

        TablaConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TablaConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaConsultaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaConsulta);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 60, 1150, 160);

        CampoBuscar.setFont(new java.awt.Font("Purisa", 3, 18)); // NOI18N
        jPanel1.add(CampoBuscar);
        CampoBuscar.setBounds(970, 30, 190, 30);

        jLabel2.setFont(new java.awt.Font("Purisa", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Buscar ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(880, 30, 90, 30);

        Seleccionar.setFont(new java.awt.Font("Purisa", 3, 18)); // NOI18N
        Seleccionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/seleccione.png"))); // NOI18N
        Seleccionar.setText("Seleccionar");
        Seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionarActionPerformed(evt);
            }
        });
        jPanel1.add(Seleccionar);
        Seleccionar.setBounds(940, 220, 220, 40);

        descriciudad.setEditable(false);
        descriciudad.setFont(new java.awt.Font("Purisa", 3, 18)); // NOI18N
        jPanel1.add(descriciudad);
        descriciudad.setBounds(160, 30, 80, 30);

        CampoDescripcion.setEditable(false);
        CampoDescripcion.setFont(new java.awt.Font("Purisa", 3, 18)); // NOI18N
        jPanel1.add(CampoDescripcion);
        CampoDescripcion.setBounds(40, 30, 120, 30);

        CampoCodigo.setEditable(false);
        CampoCodigo.setFont(new java.awt.Font("Purisa", 3, 18)); // NOI18N
        jPanel1.add(CampoCodigo);
        CampoCodigo.setBounds(10, 30, 30, 30);

        jTabbedPane1.addTab("Listado", jPanel1);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 60, 1170, 320);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionarActionPerformed
        Id= this.CampoCodigo.getText();
        desc= this.CampoDescripcion.getText();
        cat=this.descriciudad.getText();
        dispose();
    }//GEN-LAST:event_SeleccionarActionPerformed

    private void TablaConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaConsultaMouseClicked

      this.CampoDescripcion.setEnabled(true);
    
       this.descriciudad.setEnabled(true);

     
// TODO add your handling code here:
    }//GEN-LAST:event_TablaConsultaMouseClicked

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1MouseClicked

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
            java.util.logging.Logger.getLogger(VBuscaConcepto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VBuscaConcepto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VBuscaConcepto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VBuscaConcepto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
		new CBuscaConcepto(new VBuscaConcepto()).iniciar();   }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField CampoBuscar;
    public javax.swing.JTextField CampoCodigo;
    public javax.swing.JTextField CampoDescripcion;
    private javax.swing.JButton Seleccionar;
    public javax.swing.JTable TablaConsulta;
    public javax.swing.JTextField descriciudad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
