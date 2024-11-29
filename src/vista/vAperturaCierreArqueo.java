package vista;
import controlador.*;
import modelo.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
public class vAperturaCierreArqueo extends javax.swing.JFrame  implements Runnable  {
    public String asddd;
     String hora,minutos,segundos,ampm;
     Thread h1;
	public void calcula () {     
        Calendar calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();
        calendario.setTime(fechaHoraActual);
        ampm = calendario.get(Calendar.AM_PM)==Calendar.AM?"AM":"PM";
        if(ampm.equals("PM")){
            int h = calendario.get(Calendar.HOUR_OF_DAY)-12;
            hora = h>9?""+h:"0"+h;
        }else{
            hora = calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);            
        }
            minutos = calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
            segundos = calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND); 
    }
      public void run(){
            Date date = new Date();

    Thread ct = Thread.currentThread();
        while(ct == h1) {   
                calcula();
                CampoHoraArqueo.setText(hora + ":" + minutos);
                CampoHoraCierre.setText(hora + ":" + minutos);
                CampoHoraApertura.setText(hora + ":" + minutos);
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
                SimpleDateFormat mess = new SimpleDateFormat("MM", Locale.getDefault());
                Date currentDate1 = new Date();
                Date currentDate = new Date();
                String lastdate = formatter.format(currentDate);
                String lastdate1 = mess.format(currentDate1);
                this.CampoNombreUsuario1.setText(lastdate1);
        this.CampoFechaApertura.setText(lastdate);
        this.CampoFechaCierre.setText(lastdate);
        this.CampoFechaArqueo.setText(lastdate);
            try {
                Thread.sleep(1000);
            }catch(InterruptedException e) {}
        }
    }
   VAcceso  Vista;
   mAperturaCierreArqueo modelo = new mAperturaCierreArqueo();
    public vAperturaCierreArqueo() {
         initComponents();
            h1 = new Thread(this);
            h1.start();
            setLocationRelativeTo(null);//para centrar la ventana
            setVisible(true);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Consulta = new javax.swing.JTable();
        CampoCodigoApertura1 = new javax.swing.JTextField();
        jPanelApertura = new javax.swing.JPanel();
        ComboCaja = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CampoFechaApertura = new javax.swing.JTextField();
        CampoHoraApertura = new javax.swing.JTextField();
        CampoMontoApertura = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Abrir = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        CampoMontoApertura1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CampoCodigoApertura = new javax.swing.JTextField();
        CierreCaja = new javax.swing.JPanel();
        CampoFechaCierre = new javax.swing.JTextField();
        CampoHoraCierre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Cerrar = new javax.swing.JButton();
        CampoHoraCierre1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_Consulta1 = new javax.swing.JTable();
        CampoCodigoApertura3 = new javax.swing.JTextField();
        CampoCodigoApertura2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        CampoCodigoArqueo = new javax.swing.JTextField();
        horaarqueo = new javax.swing.JLabel();
        CampoFechaArqueo = new javax.swing.JTextField();
        CampoHoraArqueo = new javax.swing.JTextField();
        Generar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        horaarqueo1 = new javax.swing.JLabel();
        horaarqueo2 = new javax.swing.JLabel();
        horaarqueo3 = new javax.swing.JLabel();
        horaarqueo4 = new javax.swing.JLabel();
        Calcular = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        horaarqueo5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabla_Consulta2 = new javax.swing.JTable();
        CampoCodigoApertura4 = new javax.swing.JTextField();
        CampoCodigoApertura5 = new javax.swing.JTextField();
        CampoCodigoApertura6 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        CampoCodigoArqueo1 = new javax.swing.JTextField();
        horaarqueo6 = new javax.swing.JLabel();
        CampoFechaArqueo1 = new javax.swing.JTextField();
        CampoHoraArqueo1 = new javax.swing.JTextField();
        Generar1 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        horaarqueo7 = new javax.swing.JLabel();
        horaarqueo8 = new javax.swing.JLabel();
        horaarqueo9 = new javax.swing.JLabel();
        horaarqueo10 = new javax.swing.JLabel();
        Calcular1 = new javax.swing.JButton();
        jTextField13 = new javax.swing.JTextField();
        horaarqueo11 = new javax.swing.JLabel();
        CampoNombreUsuario2 = new javax.swing.JTextField();
        CampoNombreUsuario3 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        Recaudacion = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        Cancelar = new javax.swing.JButton();
        CampoCodigoUsuario = new javax.swing.JTextField();
        CampoNombreUsuario1 = new javax.swing.JTextField();
        CampoNombreUsuario = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1170, 480));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jTabbedPane2.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jTabbedPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane2MouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(108, 99, 255));
        jPanel2.setLayout(null);

        Tabla_Consulta.setBackground(new java.awt.Color(204, 204, 255));
        Tabla_Consulta.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Tabla_Consulta.setForeground(new java.awt.Color(0, 0, 255));
        Tabla_Consulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tabla_Consulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_ConsultaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla_Consulta);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(20, 40, 1090, 190);

        CampoCodigoApertura1.setEditable(false);
        CampoCodigoApertura1.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        CampoCodigoApertura1.setForeground(new java.awt.Color(0, 0, 255));
        jPanel2.add(CampoCodigoApertura1);
        CampoCodigoApertura1.setBounds(20, 10, 40, 30);

        jTabbedPane2.addTab("Consulta", jPanel2);

        jPanelApertura.setBackground(new java.awt.Color(108, 99, 255));
        jPanelApertura.setForeground(new java.awt.Color(0, 0, 255));
        jPanelApertura.setName(""); // NOI18N
        jPanelApertura.setLayout(null);

        ComboCaja.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        ComboCaja.setForeground(new java.awt.Color(0, 0, 255));
        jPanelApertura.add(ComboCaja);
        ComboCaja.setBounds(270, 120, 160, 40);

        jLabel2.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Punto Espedicion");
        jPanelApertura.add(jLabel2);
        jLabel2.setBounds(110, 120, 160, 40);

        jLabel3.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha:");
        jPanelApertura.add(jLabel3);
        jLabel3.setBounds(440, 120, 60, 40);

        CampoFechaApertura.setEditable(false);
        CampoFechaApertura.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        CampoFechaApertura.setForeground(new java.awt.Color(0, 0, 255));
        jPanelApertura.add(CampoFechaApertura);
        CampoFechaApertura.setBounds(500, 120, 160, 40);

        CampoHoraApertura.setEditable(false);
        CampoHoraApertura.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        CampoHoraApertura.setForeground(new java.awt.Color(0, 0, 255));
        jPanelApertura.add(CampoHoraApertura);
        CampoHoraApertura.setBounds(720, 120, 160, 40);

        CampoMontoApertura.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        CampoMontoApertura.setForeground(new java.awt.Color(0, 0, 255));
        CampoMontoApertura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoMontoAperturaActionPerformed(evt);
            }
        });
        jPanelApertura.add(CampoMontoApertura);
        CampoMontoApertura.setBounds(770, 60, 160, 40);

        jLabel6.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Hora:");
        jPanelApertura.add(jLabel6);
        jLabel6.setBounds(670, 120, 70, 40);

        jLabel7.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Monto:");
        jPanelApertura.add(jLabel7);
        jLabel7.setBounds(720, 60, 80, 40);

        Abrir.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        Abrir.setForeground(new java.awt.Color(0, 0, 255));
        Abrir.setText("Abrir Caja");
        jPanelApertura.add(Abrir);
        Abrir.setBounds(900, 180, 140, 50);

        jLabel9.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nro Factura Inicio");
        jPanelApertura.add(jLabel9);
        jLabel9.setBounds(390, 60, 190, 40);

        CampoMontoApertura1.setEditable(false);
        CampoMontoApertura1.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        CampoMontoApertura1.setForeground(new java.awt.Color(0, 0, 255));
        jPanelApertura.add(CampoMontoApertura1);
        CampoMontoApertura1.setBounds(550, 60, 160, 40);

        jLabel5.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Codigo Apertura:");
        jPanelApertura.add(jLabel5);
        jLabel5.setBounds(60, 60, 160, 40);

        CampoCodigoApertura.setEditable(false);
        CampoCodigoApertura.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        CampoCodigoApertura.setForeground(new java.awt.Color(0, 0, 255));
        jPanelApertura.add(CampoCodigoApertura);
        CampoCodigoApertura.setBounds(220, 60, 160, 40);

        jTabbedPane2.addTab("Apertura Caja", jPanelApertura);

        CierreCaja.setBackground(new java.awt.Color(108, 99, 255));
        CierreCaja.setLayout(null);

        CampoFechaCierre.setEditable(false);
        CampoFechaCierre.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        CampoFechaCierre.setForeground(new java.awt.Color(0, 0, 255));
        CierreCaja.add(CampoFechaCierre);
        CampoFechaCierre.setBounds(520, 70, 160, 40);

        CampoHoraCierre.setEditable(false);
        CampoHoraCierre.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        CampoHoraCierre.setForeground(new java.awt.Color(0, 0, 255));
        CierreCaja.add(CampoHoraCierre);
        CampoHoraCierre.setBounds(760, 70, 160, 40);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Monto Cierre");
        CierreCaja.add(jLabel8);
        jLabel8.setBounds(130, 70, 120, 40);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Fecha:");
        CierreCaja.add(jLabel10);
        jLabel10.setBounds(460, 70, 80, 40);

        Cerrar.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        Cerrar.setText("Cerrar caja");
        CierreCaja.add(Cerrar);
        Cerrar.setBounds(940, 190, 140, 50);

        CampoHoraCierre1.setEditable(false);
        CampoHoraCierre1.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        CampoHoraCierre1.setForeground(new java.awt.Color(0, 0, 255));
        CierreCaja.add(CampoHoraCierre1);
        CampoHoraCierre1.setBounds(260, 70, 160, 40);

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Hora:");
        CierreCaja.add(jLabel14);
        jLabel14.setBounds(710, 70, 90, 40);

        jTabbedPane2.addTab("Cierre de Caja", CierreCaja);

        jPanel4.setBackground(new java.awt.Color(108, 99, 255));
        jPanel4.setLayout(null);

        Tabla_Consulta1.setBackground(new java.awt.Color(204, 204, 255));
        Tabla_Consulta1.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        Tabla_Consulta1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tabla_Consulta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_Consulta1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tabla_Consulta1);

        jPanel4.add(jScrollPane2);
        jScrollPane2.setBounds(20, 40, 1090, 190);

        CampoCodigoApertura3.setEditable(false);
        CampoCodigoApertura3.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        CampoCodigoApertura3.setForeground(new java.awt.Color(0, 0, 255));
        jPanel4.add(CampoCodigoApertura3);
        CampoCodigoApertura3.setBounds(60, 10, 40, 30);

        CampoCodigoApertura2.setEditable(false);
        CampoCodigoApertura2.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jPanel4.add(CampoCodigoApertura2);
        CampoCodigoApertura2.setBounds(20, 10, 40, 30);

        jTabbedPane2.addTab("Consulta Cierre", jPanel4);

        jPanel1.setBackground(new java.awt.Color(108, 99, 255));
        jPanel1.setLayout(null);

        jLabel13.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Codigo:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(190, 30, 70, 40);

        CampoCodigoArqueo.setEditable(false);
        CampoCodigoArqueo.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        CampoCodigoArqueo.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(CampoCodigoArqueo);
        CampoCodigoArqueo.setBounds(260, 30, 70, 40);

        horaarqueo.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        horaarqueo.setForeground(new java.awt.Color(255, 255, 255));
        horaarqueo.setText("Targeta Debito");
        jPanel1.add(horaarqueo);
        horaarqueo.setBounds(670, 90, 160, 40);

        CampoFechaArqueo.setEditable(false);
        CampoFechaArqueo.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        CampoFechaArqueo.setForeground(new java.awt.Color(0, 0, 255));
        CampoFechaArqueo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoFechaArqueoActionPerformed(evt);
            }
        });
        jPanel1.add(CampoFechaArqueo);
        CampoFechaArqueo.setBounds(420, 30, 110, 40);

        CampoHoraArqueo.setEditable(false);
        CampoHoraArqueo.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        CampoHoraArqueo.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(CampoHoraArqueo);
        CampoHoraArqueo.setBounds(590, 30, 60, 40);

        Generar.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        Generar.setText("Generar Arqueo");
        Generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarActionPerformed(evt);
            }
        });
        jPanel1.add(Generar);
        Generar.setBounds(890, 190, 190, 50);

        jLabel17.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Fecha:");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(360, 30, 70, 40);

        jTextField4.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(0, 0, 153));
        jPanel1.add(jTextField4);
        jTextField4.setBounds(790, 30, 120, 40);

        jTextField5.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(0, 0, 153));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5);
        jTextField5.setBounds(550, 90, 100, 40);

        jTextField6.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(0, 0, 153));
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField6);
        jTextField6.setBounds(260, 90, 130, 40);

        jTextField7.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(0, 0, 153));
        jPanel1.add(jTextField7);
        jTextField7.setBounds(810, 90, 100, 40);

        horaarqueo1.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        horaarqueo1.setForeground(new java.awt.Color(255, 255, 255));
        horaarqueo1.setText("Hora:");
        jPanel1.add(horaarqueo1);
        horaarqueo1.setBounds(540, 30, 50, 40);

        horaarqueo2.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        horaarqueo2.setForeground(new java.awt.Color(255, 255, 255));
        horaarqueo2.setText("Efectivo");
        jPanel1.add(horaarqueo2);
        horaarqueo2.setBounds(670, 30, 100, 40);

        horaarqueo3.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        horaarqueo3.setForeground(new java.awt.Color(255, 255, 255));
        horaarqueo3.setText("Cheque Diferido");
        jPanel1.add(horaarqueo3);
        horaarqueo3.setBounds(110, 140, 150, 40);

        horaarqueo4.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        horaarqueo4.setForeground(new java.awt.Color(255, 255, 255));
        horaarqueo4.setText("Targeta Credito");
        jPanel1.add(horaarqueo4);
        horaarqueo4.setBounds(400, 90, 160, 40);

        Calcular.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        Calcular.setText("Calcular");
        jPanel1.add(Calcular);
        Calcular.setBounds(270, 190, 130, 40);

        jTextField8.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(0, 0, 153));
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField8);
        jTextField8.setBounds(260, 140, 130, 40);

        horaarqueo5.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        horaarqueo5.setForeground(new java.awt.Color(255, 255, 255));
        horaarqueo5.setText("Cheque dia");
        jPanel1.add(horaarqueo5);
        horaarqueo5.setBounds(150, 90, 120, 40);

        jTabbedPane2.addTab("Arqueo", jPanel1);

        jPanel6.setBackground(new java.awt.Color(108, 99, 255));
        jPanel6.setLayout(null);

        Tabla_Consulta2.setBackground(new java.awt.Color(204, 204, 255));
        Tabla_Consulta2.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        Tabla_Consulta2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tabla_Consulta2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_Consulta2MouseClicked(evt);
            }
        });
        Tabla_Consulta2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Tabla_Consulta2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane3.setViewportView(Tabla_Consulta2);

        jPanel6.add(jScrollPane3);
        jScrollPane3.setBounds(20, 40, 1090, 190);

        CampoCodigoApertura4.setEditable(false);
        CampoCodigoApertura4.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jPanel6.add(CampoCodigoApertura4);
        CampoCodigoApertura4.setBounds(20, 10, 40, 30);

        CampoCodigoApertura5.setEditable(false);
        CampoCodigoApertura5.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        CampoCodigoApertura5.setForeground(new java.awt.Color(0, 0, 255));
        jPanel6.add(CampoCodigoApertura5);
        CampoCodigoApertura5.setBounds(60, 10, 80, 30);

        CampoCodigoApertura6.setEditable(false);
        CampoCodigoApertura6.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        CampoCodigoApertura6.setForeground(new java.awt.Color(0, 0, 255));
        jPanel6.add(CampoCodigoApertura6);
        CampoCodigoApertura6.setBounds(140, 10, 80, 30);

        jTabbedPane2.addTab("Consulta Arqueo", jPanel6);

        jPanel3.setBackground(new java.awt.Color(108, 99, 255));
        jPanel3.setLayout(null);

        jPanel5.setBackground(new java.awt.Color(0, 0, 204));
        jPanel5.setLayout(null);

        jLabel16.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Codigo:");
        jPanel5.add(jLabel16);
        jLabel16.setBounds(190, 30, 70, 40);

        CampoCodigoArqueo1.setEditable(false);
        CampoCodigoArqueo1.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        CampoCodigoArqueo1.setForeground(new java.awt.Color(0, 0, 255));
        jPanel5.add(CampoCodigoArqueo1);
        CampoCodigoArqueo1.setBounds(260, 30, 70, 40);

        horaarqueo6.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        horaarqueo6.setForeground(new java.awt.Color(255, 255, 255));
        horaarqueo6.setText("Targeta Debito");
        jPanel5.add(horaarqueo6);
        horaarqueo6.setBounds(670, 90, 160, 40);

        CampoFechaArqueo1.setEditable(false);
        CampoFechaArqueo1.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        CampoFechaArqueo1.setForeground(new java.awt.Color(0, 0, 255));
        CampoFechaArqueo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoFechaArqueo1ActionPerformed(evt);
            }
        });
        jPanel5.add(CampoFechaArqueo1);
        CampoFechaArqueo1.setBounds(420, 30, 110, 40);

        CampoHoraArqueo1.setEditable(false);
        CampoHoraArqueo1.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        CampoHoraArqueo1.setForeground(new java.awt.Color(0, 0, 255));
        jPanel5.add(CampoHoraArqueo1);
        CampoHoraArqueo1.setBounds(590, 30, 60, 40);

        Generar1.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        Generar1.setText("Generar Arqueo");
        Generar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Generar1ActionPerformed(evt);
            }
        });
        jPanel5.add(Generar1);
        Generar1.setBounds(890, 190, 190, 50);

        jLabel18.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Fecha:");
        jPanel5.add(jLabel18);
        jLabel18.setBounds(360, 30, 70, 40);

        jTextField9.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(0, 0, 153));
        jPanel5.add(jTextField9);
        jTextField9.setBounds(790, 30, 120, 40);

        jTextField10.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(0, 0, 153));
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField10);
        jTextField10.setBounds(550, 90, 100, 40);

        jTextField11.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(0, 0, 153));
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField11);
        jTextField11.setBounds(260, 90, 130, 40);

        jTextField12.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(0, 0, 153));
        jPanel5.add(jTextField12);
        jTextField12.setBounds(810, 90, 100, 40);

        horaarqueo7.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        horaarqueo7.setForeground(new java.awt.Color(255, 255, 255));
        horaarqueo7.setText("Hora:");
        jPanel5.add(horaarqueo7);
        horaarqueo7.setBounds(540, 30, 50, 40);

        horaarqueo8.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        horaarqueo8.setForeground(new java.awt.Color(255, 255, 255));
        horaarqueo8.setText("Efectivo");
        jPanel5.add(horaarqueo8);
        horaarqueo8.setBounds(670, 30, 100, 40);

        horaarqueo9.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        horaarqueo9.setForeground(new java.awt.Color(255, 255, 255));
        horaarqueo9.setText("Cheque Diferido");
        jPanel5.add(horaarqueo9);
        horaarqueo9.setBounds(110, 140, 150, 40);

        horaarqueo10.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        horaarqueo10.setForeground(new java.awt.Color(255, 255, 255));
        horaarqueo10.setText("Targeta Credito");
        jPanel5.add(horaarqueo10);
        horaarqueo10.setBounds(400, 90, 160, 40);

        Calcular1.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        Calcular1.setText("Calcular");
        jPanel5.add(Calcular1);
        Calcular1.setBounds(270, 190, 130, 40);

        jTextField13.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(0, 0, 153));
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField13);
        jTextField13.setBounds(260, 140, 130, 40);

        horaarqueo11.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        horaarqueo11.setForeground(new java.awt.Color(255, 255, 255));
        horaarqueo11.setText("Cheque dia");
        jPanel5.add(horaarqueo11);
        horaarqueo11.setBounds(150, 90, 120, 40);

        jPanel3.add(jPanel5);
        jPanel5.setBounds(314, 206, 0, 0);

        CampoNombreUsuario2.setEditable(false);
        CampoNombreUsuario2.setFont(new java.awt.Font("Purisa", 1, 36)); // NOI18N
        CampoNombreUsuario2.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.add(CampoNombreUsuario2);
        CampoNombreUsuario2.setBounds(360, 90, 260, 50);

        CampoNombreUsuario3.setEditable(false);
        CampoNombreUsuario3.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jPanel3.add(CampoNombreUsuario3);
        CampoNombreUsuario3.setBounds(620, 90, 6, 50);

        jLabel15.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Recaudaciones a Depositar");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(390, 60, 250, 30);

        Recaudacion.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        Recaudacion.setText("Guardar Recaudacion");
        Recaudacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecaudacionActionPerformed(evt);
            }
        });
        jPanel3.add(Recaudacion);
        Recaudacion.setBounds(840, 220, 280, 50);

        jTabbedPane2.addTab("Recaudaciones a Depositar", jPanel3);

        getContentPane().add(jTabbedPane2);
        jTabbedPane2.setBounds(0, 80, 1130, 300);

        Salir.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir);
        Salir.setBounds(1010, 380, 110, 40);

        jLabel11.setFont(new java.awt.Font("Purisa", 1, 24)); // NOI18N
        jLabel11.setText("Apertura, Arqueo y Cierre de Caja");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(340, 0, 540, 80);

        Cancelar.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        getContentPane().add(Cancelar);
        Cancelar.setBounds(890, 380, 120, 40);

        CampoCodigoUsuario.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        getContentPane().add(CampoCodigoUsuario);
        CampoCodigoUsuario.setBounds(40, 50, 30, 30);

        CampoNombreUsuario1.setEditable(false);
        CampoNombreUsuario1.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        getContentPane().add(CampoNombreUsuario1);
        CampoNombreUsuario1.setBounds(960, 40, 6, 30);

        CampoNombreUsuario.setEditable(false);
        CampoNombreUsuario.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        getContentPane().add(CampoNombreUsuario);
        CampoNombreUsuario.setBounds(70, 50, 140, 30);

        jLabel19.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jLabel19.setText("Usuario:");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(40, 20, 100, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CancelarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       this.Tabla_Consulta.setModel( this.modelo.getTabla() );
       
        ComboCaja.removeAllItems();
            //combo
          this.ComboCaja.setModel(this.modelo.getListaCaja());
         //combo
    }//GEN-LAST:event_formWindowActivated

    private void CampoFechaArqueoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoFechaArqueoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoFechaArqueoActionPerformed

    private void CampoMontoAperturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoMontoAperturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoMontoAperturaActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void GenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarActionPerformed
        
// TODO add your handling code here:
    }//GEN-LAST:event_GenerarActionPerformed

    private void Tabla_ConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_ConsultaMouseClicked
			
// TODO add your handling code here:
    }//GEN-LAST:event_Tabla_ConsultaMouseClicked

    private void jTabbedPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane2MouseClicked

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void Tabla_Consulta1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_Consulta1MouseClicked
        asddd=this.CampoCodigoApertura2.getText();// TODO add your handling code here:
    }//GEN-LAST:event_Tabla_Consulta1MouseClicked

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void CampoFechaArqueo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoFechaArqueo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoFechaArqueo1ActionPerformed

    private void Generar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Generar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Generar1ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void Tabla_Consulta2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_Consulta2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Tabla_Consulta2MouseClicked

    private void RecaudacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecaudacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RecaudacionActionPerformed

    private void Tabla_Consulta2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Tabla_Consulta2AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_Tabla_Consulta2AncestorAdded

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
            java.util.logging.Logger.getLogger(vAperturaCierreArqueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vAperturaCierreArqueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vAperturaCierreArqueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vAperturaCierreArqueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cAperturaCierreArqueo(new vAperturaCierreArqueo()) .iniciar();
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Abrir;
    public javax.swing.JButton Calcular;
    public javax.swing.JButton Calcular1;
    public javax.swing.JTextField CampoCodigoApertura;
    public javax.swing.JTextField CampoCodigoApertura1;
    public javax.swing.JTextField CampoCodigoApertura2;
    public javax.swing.JTextField CampoCodigoApertura3;
    public javax.swing.JTextField CampoCodigoApertura4;
    public javax.swing.JTextField CampoCodigoApertura5;
    public javax.swing.JTextField CampoCodigoApertura6;
    public javax.swing.JTextField CampoCodigoArqueo;
    public javax.swing.JTextField CampoCodigoArqueo1;
    public javax.swing.JTextField CampoCodigoUsuario;
    public javax.swing.JTextField CampoFechaApertura;
    public javax.swing.JTextField CampoFechaArqueo;
    public javax.swing.JTextField CampoFechaArqueo1;
    public javax.swing.JTextField CampoFechaCierre;
    public javax.swing.JTextField CampoHoraApertura;
    public javax.swing.JTextField CampoHoraArqueo;
    public javax.swing.JTextField CampoHoraArqueo1;
    public javax.swing.JTextField CampoHoraCierre;
    public javax.swing.JTextField CampoHoraCierre1;
    public javax.swing.JTextField CampoMontoApertura;
    public javax.swing.JTextField CampoMontoApertura1;
    public javax.swing.JTextField CampoNombreUsuario;
    public javax.swing.JTextField CampoNombreUsuario1;
    public javax.swing.JTextField CampoNombreUsuario2;
    public javax.swing.JTextField CampoNombreUsuario3;
    public javax.swing.JButton Cancelar;
    public javax.swing.JButton Cerrar;
    public javax.swing.JPanel CierreCaja;
    public javax.swing.JComboBox ComboCaja;
    public javax.swing.JButton Generar;
    public javax.swing.JButton Generar1;
    public javax.swing.JButton Recaudacion;
    public javax.swing.JButton Salir;
    public javax.swing.JTable Tabla_Consulta;
    public javax.swing.JTable Tabla_Consulta1;
    public javax.swing.JTable Tabla_Consulta2;
    private javax.swing.JLabel horaarqueo;
    private javax.swing.JLabel horaarqueo1;
    private javax.swing.JLabel horaarqueo10;
    private javax.swing.JLabel horaarqueo11;
    private javax.swing.JLabel horaarqueo2;
    private javax.swing.JLabel horaarqueo3;
    private javax.swing.JLabel horaarqueo4;
    private javax.swing.JLabel horaarqueo5;
    private javax.swing.JLabel horaarqueo6;
    private javax.swing.JLabel horaarqueo7;
    private javax.swing.JLabel horaarqueo8;
    private javax.swing.JLabel horaarqueo9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    public javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    public javax.swing.JPanel jPanelApertura;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    public javax.swing.JTextField jTextField10;
    public javax.swing.JTextField jTextField11;
    public javax.swing.JTextField jTextField12;
    public javax.swing.JTextField jTextField13;
    public javax.swing.JTextField jTextField4;
    public javax.swing.JTextField jTextField5;
    public javax.swing.JTextField jTextField6;
    public javax.swing.JTextField jTextField7;
    public javax.swing.JTextField jTextField8;
    public javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}