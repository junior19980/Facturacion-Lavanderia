/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.CMarcaInsumo;
import javax.swing.JOptionPane;

/**
 *
 * @author Pablo
 */
public class VMarcaInsumo extends javax.swing.JFrame {

    static String Cod= "";
    static String Cargo = "";

    /**
     * Creates new form VCategorias
     */
    public VMarcaInsumo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaConsulta = new javax.swing.JTable();
        CampoBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Seleccionar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        CampoCodigo = new javax.swing.JTextField();
        CampoDescripcion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Modificar = new javax.swing.JButton();
        Informe = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        Nuevo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1230, 500));
        getContentPane().setLayout(null);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jTabbedPane1.setFont(new java.awt.Font("Purisa", 3, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(108, 99, 255));
        jPanel1.setLayout(null);

        TablaConsulta.setFont(new java.awt.Font("Purisa", 3, 12)); // NOI18N
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
        jScrollPane1.setBounds(20, 60, 1170, 230);
        jPanel1.add(CampoBuscar);
        CampoBuscar.setBounds(1000, 30, 190, 30);

        jLabel2.setFont(new java.awt.Font("Purisa", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Buscar ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(930, 30, 60, 30);

        Seleccionar.setFont(new java.awt.Font("Purisa", 3, 12)); // NOI18N
        Seleccionar.setText("Seleccionar");
        Seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionarActionPerformed(evt);
            }
        });
        jPanel1.add(Seleccionar);
        Seleccionar.setBounds(1070, 310, 120, 30);

        jTabbedPane1.addTab("Listado", jPanel1);

        jPanel2.setBackground(new java.awt.Color(108, 99, 255));
        jPanel2.setLayout(null);
        jPanel2.add(CampoCodigo);
        CampoCodigo.setBounds(460, 130, 70, 30);
        jPanel2.add(CampoDescripcion);
        CampoDescripcion.setBounds(690, 130, 130, 30);

        jLabel3.setFont(new java.awt.Font("Purisa", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Codigo");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(390, 130, 70, 30);

        jLabel4.setFont(new java.awt.Font("Purisa", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Descripcion");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(600, 130, 90, 30);

        Modificar.setFont(new java.awt.Font("Purisa", 1, 10)); // NOI18N
        Modificar.setText("Modificar");
        Modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModificarMouseClicked(evt);
            }
        });
        jPanel2.add(Modificar);
        Modificar.setBounds(570, 190, 100, 40);

        Informe.setFont(new java.awt.Font("Purisa", 1, 10)); // NOI18N
        Informe.setText("Informe");
        jPanel2.add(Informe);
        Informe.setBounds(710, 250, 100, 40);

        Eliminar.setFont(new java.awt.Font("Purisa", 1, 10)); // NOI18N
        Eliminar.setText("Eliminar");
        Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminarMouseClicked(evt);
            }
        });
        jPanel2.add(Eliminar);
        Eliminar.setBounds(710, 190, 100, 40);

        Cancelar.setFont(new java.awt.Font("Purisa", 1, 10)); // NOI18N
        Cancelar.setText("Cancelar");
        Cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelarMouseClicked(evt);
            }
        });
        jPanel2.add(Cancelar);
        Cancelar.setBounds(570, 250, 100, 40);

        Guardar.setFont(new java.awt.Font("Purisa", 1, 10)); // NOI18N
        Guardar.setText("Guardar");
        jPanel2.add(Guardar);
        Guardar.setBounds(440, 190, 100, 40);

        Nuevo.setFont(new java.awt.Font("Purisa", 1, 10)); // NOI18N
        Nuevo.setText("Nuevo");
        Nuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NuevoMouseClicked(evt);
            }
        });
        jPanel2.add(Nuevo);
        Nuevo.setBounds(440, 250, 100, 40);

        jTabbedPane1.addTab("Registro", jPanel2);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 50, 1210, 380);

        jLabel1.setFont(new java.awt.Font("Purisa", 3, 18)); // NOI18N
        jLabel1.setText("Marcas de Insumos");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(470, 20, 260, 30);

        Salir.setFont(new java.awt.Font("Purisa", 1, 10)); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir);
        Salir.setBounds(1100, 430, 90, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void SeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionarActionPerformed
        Cod= this.CampoCodigo.getText();
        Cargo= this.CampoDescripcion.getText();
      dispose();
    }//GEN-LAST:event_SeleccionarActionPerformed

    private void NuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuevoMouseClicked
       this.Guardar.setEnabled(true);
       this.CampoDescripcion.setEnabled(true);
       this.Cancelar.setEnabled(true);
       this.Nuevo.setEnabled(false);
        this.CampoDescripcion.requestFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_NuevoMouseClicked

    private void CancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelarMouseClicked
this.CampoDescripcion.setEnabled(false);
this.Nuevo.setEnabled(true);
this.Guardar.setEnabled(false);
this.Cancelar.setEnabled(false);

this.Modificar.setEnabled(false);
this.Eliminar.setEnabled(false);

// TODO add your handling code here:
    }//GEN-LAST:event_CancelarMouseClicked

    private void TablaConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaConsultaMouseClicked
      this.Modificar.setEnabled(true);
      this.Eliminar.setEnabled(true);
      this.Cancelar.setEnabled(true);
      this.CampoDescripcion.setEnabled(true);
      this.Nuevo.setEnabled(false);
      this.Guardar.setEnabled(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_TablaConsultaMouseClicked

    private void ModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarMouseClicked
        this.Modificar.setEnabled(false);
      this.Eliminar.setEnabled(false);
      this.Cancelar.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_ModificarMouseClicked

    private void EliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMouseClicked
       this.Modificar.setEnabled(false);
      this.Eliminar.setEnabled(false);
      this.Cancelar.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_EliminarMouseClicked

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
            java.util.logging.Logger.getLogger(VMarcaInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VMarcaInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VMarcaInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VMarcaInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CMarcaInsumo(new VMarcaInsumo()).iniciar();

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField CampoBuscar;
    public javax.swing.JTextField CampoCodigo;
    public javax.swing.JTextField CampoDescripcion;
    public javax.swing.JButton Cancelar;
    public javax.swing.JButton Eliminar;
    public javax.swing.JButton Guardar;
    public javax.swing.JButton Informe;
    public javax.swing.JButton Modificar;
    public javax.swing.JButton Nuevo;
    public javax.swing.JButton Salir;
    private javax.swing.JButton Seleccionar;
    public javax.swing.JTable TablaConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
