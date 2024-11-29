/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import modelo.*;
import controlador.*;
import vista.*;
public class vOrdenTrabajo extends javax.swing.JFrame {
   static String Id= "";
    /**
     * Creates new form VProducto
     */
    public vOrdenTrabajo() {
        initComponents(); 
    }
   // mRecepcionPrenda modelo = new mRecepcionPrenda();
    
       @SuppressWarnings("unchecked")
 
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        SERVICIO = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        CANTIDAD = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        CampoCod = new javax.swing.JTextField();
        CampoCodigoUsu = new javax.swing.JTextField();
        CampoCodigo2 = new javax.swing.JTextField();
        Cliente = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ci = new javax.swing.JTextField();
        Seleccionar = new javax.swing.JButton();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel23 = new javax.swing.JLabel();
        CampoCodigo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Seleccionar1 = new javax.swing.JButton();
        CampoCodigoFun = new javax.swing.JTextField();
        CampoapeFunc = new javax.swing.JTextField();
        CamponombreFunc1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Orden de Trabajo");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1229, 650));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
        });
        getContentPane().setLayout(null);

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
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
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
        CampoFecha.setBounds(360, 60, 110, 30);

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
        jLabel2.setText("Formulario Orden de Trabajo");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(400, 0, 340, 30);

        jPanel3.setBackground(new java.awt.Color(108, 99, 255));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(null);

        CODSERVICIO.setEditable(false);
        CODSERVICIO.setBackground(new java.awt.Color(255, 255, 255));
        CODSERVICIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CODSERVICIOActionPerformed(evt);
            }
        });
        jPanel3.add(CODSERVICIO);
        CODSERVICIO.setBounds(90, 50, 90, 40);

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

        BotonAgregardetalle.setBackground(new java.awt.Color(255, 255, 255));
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

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("                           DETALLES DE ODEN DE TRABAJO");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(200, 10, 730, 30);

        SERVICIO.setEditable(false);
        SERVICIO.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.add(SERVICIO);
        SERVICIO.setBounds(270, 50, 480, 40);

        jLabel15.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("  Codigo");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(30, 50, 60, 40);

        CANTIDAD.setEditable(false);
        CANTIDAD.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.add(CANTIDAD);
        CANTIDAD.setBounds(850, 50, 130, 40);

        jLabel17.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Descripcion");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(190, 50, 80, 40);

        jLabel18.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Cantidad");
        jPanel3.add(jLabel18);
        jLabel18.setBounds(780, 50, 80, 40);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 200, 1200, 270);

        CampoCod.setEditable(false);
        CampoCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCodActionPerformed(evt);
            }
        });
        getContentPane().add(CampoCod);
        CampoCod.setBounds(230, 150, 40, 40);

        CampoCodigoUsu.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CampoCodigoUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCodigoUsuActionPerformed(evt);
            }
        });
        getContentPane().add(CampoCodigoUsu);
        CampoCodigoUsu.setBounds(960, 10, 50, 30);

        CampoCodigo2.setEditable(false);
        CampoCodigo2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CampoCodigo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCodigo2ActionPerformed(evt);
            }
        });
        getContentPane().add(CampoCodigo2);
        CampoCodigo2.setBounds(1010, 10, 140, 30);

        Cliente.setEditable(false);
        getContentPane().add(Cliente);
        Cliente.setBounds(270, 150, 210, 40);

        jLabel22.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel22.setText("Usuario:");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(920, 10, 50, 30);

        jLabel5.setFont(new java.awt.Font("Purisa", 1, 10)); // NOI18N
        jLabel5.setText("Id");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(240, 120, 50, 40);

        jLabel6.setFont(new java.awt.Font("Purisa", 1, 10)); // NOI18N
        jLabel6.setText("Fecha:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(310, 60, 70, 30);

        ci.setEditable(false);
        ci.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciActionPerformed(evt);
            }
        });
        getContentPane().add(ci);
        ci.setBounds(480, 150, 100, 40);

        Seleccionar.setBackground(new java.awt.Color(255, 255, 255));
        Seleccionar.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        Seleccionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/seleccione.png"))); // NOI18N
        Seleccionar.setText("Seleccionar Solicitud");
        Seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionarActionPerformed(evt);
            }
        });
        Seleccionar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SeleccionarFocusGained(evt);
            }
        });
        getContentPane().add(Seleccionar);
        Seleccionar.setBounds(20, 150, 210, 40);

        jInternalFrame1.setVisible(true);
        getContentPane().add(jInternalFrame1);
        jInternalFrame1.setBounds(710, 270, 22, 34);

        jLabel23.setFont(new java.awt.Font("Purisa", 1, 10)); // NOI18N
        jLabel23.setText("Codigo:");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(80, 60, 50, 30);

        CampoCodigo.setEditable(false);
        CampoCodigo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CampoCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(CampoCodigo);
        CampoCodigo.setBounds(140, 60, 50, 30);

        jLabel8.setFont(new java.awt.Font("Purisa", 1, 10)); // NOI18N
        jLabel8.setText("CI o RUC");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(500, 110, 100, 40);

        jLabel9.setFont(new java.awt.Font("Purisa", 1, 10)); // NOI18N
        jLabel9.setText("Cliente");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(330, 110, 100, 40);

        Seleccionar1.setBackground(new java.awt.Color(255, 255, 255));
        Seleccionar1.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        Seleccionar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/buscar.png"))); // NOI18N
        Seleccionar1.setText("Seleccionar Funcionario");
        Seleccionar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seleccionar1ActionPerformed(evt);
            }
        });
        Seleccionar1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Seleccionar1FocusGained(evt);
            }
        });
        getContentPane().add(Seleccionar1);
        Seleccionar1.setBounds(570, 60, 230, 40);

        CampoCodigoFun.setEditable(false);
        CampoCodigoFun.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CampoCodigoFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCodigoFunActionPerformed(evt);
            }
        });
        getContentPane().add(CampoCodigoFun);
        CampoCodigoFun.setBounds(800, 60, 50, 40);

        CampoapeFunc.setEditable(false);
        CampoapeFunc.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CampoapeFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoapeFuncActionPerformed(evt);
            }
        });
        getContentPane().add(CampoapeFunc);
        CampoapeFunc.setBounds(1010, 60, 160, 40);

        CamponombreFunc1.setEditable(false);
        CamponombreFunc1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CamponombreFunc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CamponombreFunc1ActionPerformed(evt);
            }
        });
        getContentPane().add(CamponombreFunc1);
        CamponombreFunc1.setBounds(850, 60, 160, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
this.Seleccionar.setEnabled(true);
        
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

    private void SeleccionarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SeleccionarFocusGained
        // TODO add your handling code here:
        
        this.CODSERVICIO.setText(VBuscaSolicitud.Cliente);
        this.SERVICIO.setText(VBuscaSolicitud.Cliente1);
//        this.PRECIO.setText(VBuscaSolicitud.Cliente3);
        this.CANTIDAD.setText(VBuscaSolicitud.Cliente2);
          this.CampoCod.setText(VBuscaSolicitud.Id);
       // this.Equipo.setText(VBuscaSolicitud.Cliente4);
        this.Cliente.setText(VBuscaSolicitud.Cliente5);   
        this.ci.setText(VBuscaSolicitud.Cliente6);
    }//GEN-LAST:event_SeleccionarFocusGained

    private void SeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionarActionPerformed
        // TODO add your handling code here:
         new CBuscaSolicitud(new VBuscaSolicitud()).iniciar();
         this.BotonAgregardetalle.setEnabled(true);
    }//GEN-LAST:event_SeleccionarActionPerformed

    private void BotonAgregardetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregardetalleActionPerformed
 this.Guardar.setEnabled(true);       
  this.BotonEliminardetalle.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonAgregardetalleActionPerformed

    private void CampoFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoFechaActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        this.Seleccionar.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_CancelarActionPerformed

    private void CampoCodigo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCodigo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCodigo2ActionPerformed

    private void CampoCodigoUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCodigoUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCodigoUsuActionPerformed

    private void CampoCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCodActionPerformed


    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
/*     Id=this.CampoNumFac.getText();
        String tipofactura[] = this.ComboTipoFact.getSelectedItem().toString().split("-");
        int basura= Integer.parseInt(tipofactura[0].trim());
        if(basura==2){
        new cCuentaPagar(new vCuentaPagar()).iniciar();*/
        //}
   
// TODO add your handling code here:
    }//GEN-LAST:event_GuardarActionPerformed

    private void ciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ciActionPerformed

    private void CampoCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCodigoActionPerformed

    private void Seleccionar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seleccionar1ActionPerformed
        // TODO add your handling code here:
         new CBuscaFuncionario(new VBuscaFuncionario()).iniciar();
    }//GEN-LAST:event_Seleccionar1ActionPerformed

    private void Seleccionar1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Seleccionar1FocusGained
        // TODO add your handling code here:
         this.CampoCodigoFun.setText(VBuscaFuncionario.Id);
        this.CamponombreFunc1.setText(VBuscaFuncionario.Cliente);
        this.CampoapeFunc.setText(VBuscaFuncionario.Id1);
    }//GEN-LAST:event_Seleccionar1FocusGained

    private void CampoCodigoFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCodigoFunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCodigoFunActionPerformed

    private void CampoapeFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoapeFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoapeFuncActionPerformed

    private void CamponombreFunc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CamponombreFunc1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CamponombreFunc1ActionPerformed

    /**
     * @param args the command line arguments
     */

    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cOrdenTrabajo(new vOrdenTrabajo()).iniciar();
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BotonAgregardetalle;
    public javax.swing.JButton BotonEliminardetalle;
    public javax.swing.JTextField CANTIDAD;
    public javax.swing.JTextField CODSERVICIO;
    public javax.swing.JTextField CampoCod;
    public javax.swing.JTextField CampoCodigo;
    public javax.swing.JTextField CampoCodigo2;
    public javax.swing.JTextField CampoCodigoFun;
    public javax.swing.JTextField CampoCodigoUsu;
    public javax.swing.JTextField CampoFecha;
    public javax.swing.JTextField CampoapeFunc;
    public javax.swing.JTextField CamponombreFunc1;
    public javax.swing.JButton Cancelar;
    public javax.swing.JTextField Cliente;
    public javax.swing.JButton Guardar;
    public javax.swing.JButton Nuevo;
    public javax.swing.JButton SALIR;
    public javax.swing.JTextField SERVICIO;
    public javax.swing.JButton Seleccionar;
    public javax.swing.JButton Seleccionar1;
    public javax.swing.JTable TablaDetalle;
    public javax.swing.JTextField ci;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
