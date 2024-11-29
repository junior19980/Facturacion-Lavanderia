package vista;
import controlador.*;
public class VBuscaFacturaCompra extends javax.swing.JFrame {
 static String Id= "";
 static String Cliente= "";
  static String Id1= "";
 static String Cliente1= "";
    /**
     * Creates new form VBarrio
     */
    public VBuscaFacturaCompra() {
        initComponents();
    }
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
        CampoCodigo = new javax.swing.JTextField();
        CampoNro = new javax.swing.JTextField();
        NombreProv = new javax.swing.JTextField();
        Seleccionar1 = new javax.swing.JButton();
        RucProv = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1250, 500));
        getContentPane().setLayout(null);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jTabbedPane1.setFont(new java.awt.Font("Purisa", 3, 14)); // NOI18N
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(147, 540));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(480, 360));

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
        jScrollPane1.setBounds(10, 50, 1190, 160);
        jPanel1.add(CampoBuscar);
        CampoBuscar.setBounds(1010, 10, 190, 40);

        jLabel2.setFont(new java.awt.Font("Purisa", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Buscar ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(920, 10, 90, 40);

        Seleccionar.setFont(new java.awt.Font("Purisa", 1, 18)); // NOI18N
        Seleccionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/salida (2).png"))); // NOI18N
        Seleccionar.setText("Salir");
        Seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionarActionPerformed(evt);
            }
        });
        jPanel1.add(Seleccionar);
        Seleccionar.setBounds(1050, 230, 140, 40);

        CampoCodigo.setEditable(false);
        CampoCodigo.setFont(new java.awt.Font("Purisa", 0, 14)); // NOI18N
        jPanel1.add(CampoCodigo);
        CampoCodigo.setBounds(10, 20, 40, 30);

        CampoNro.setEditable(false);
        CampoNro.setFont(new java.awt.Font("Purisa", 0, 14)); // NOI18N
        jPanel1.add(CampoNro);
        CampoNro.setBounds(50, 20, 90, 30);

        NombreProv.setEditable(false);
        NombreProv.setFont(new java.awt.Font("Purisa", 0, 14)); // NOI18N
        jPanel1.add(NombreProv);
        NombreProv.setBounds(140, 20, 130, 30);

        Seleccionar1.setFont(new java.awt.Font("Purisa", 1, 18)); // NOI18N
        Seleccionar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/cancelar (2).png"))); // NOI18N
        Seleccionar1.setText("Anular");
        Seleccionar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seleccionar1ActionPerformed(evt);
            }
        });
        jPanel1.add(Seleccionar1);
        Seleccionar1.setBounds(890, 230, 140, 40);

        RucProv.setEditable(false);
        RucProv.setFont(new java.awt.Font("Purisa", 0, 14)); // NOI18N
        jPanel1.add(RucProv);
        RucProv.setBounds(270, 20, 130, 30);

        jTabbedPane1.addTab("Listado", jPanel1);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 50, 1220, 320);

        jLabel1.setFont(new java.awt.Font("Purisa", 1, 18)); // NOI18N
        jLabel1.setText("Factura Compra");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(500, 20, 170, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void SeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionarActionPerformed
        Id= this.CampoCodigo.getText();
        Cliente= this.CampoNro.getText();
        Id1= this.NombreProv.getText();
        Cliente1= this.RucProv.getText();
        dispose();
    }//GEN-LAST:event_SeleccionarActionPerformed

    private void TablaConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaConsultaMouseClicked
   
        // TODO add your handling code here:
    }//GEN-LAST:event_TablaConsultaMouseClicked

    private void Seleccionar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seleccionar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Seleccionar1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             new CBuscaFacturaCompra(new VBuscaFacturaCompra()).iniciar();            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField CampoBuscar;
    public javax.swing.JTextField CampoCodigo;
    public javax.swing.JTextField CampoNro;
    public javax.swing.JTextField NombreProv;
    public javax.swing.JTextField RucProv;
    private javax.swing.JButton Seleccionar;
    public javax.swing.JButton Seleccionar1;
    public javax.swing.JTable TablaConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}