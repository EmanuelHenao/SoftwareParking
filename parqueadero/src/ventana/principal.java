package ventana;

import java.sql.Connection;
import java.util.Calendar;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class principal extends javax.swing.JFrame {

    int filas;
    static int con;
    static int c = 2;
    static String selec = "-Seleccione-";
    DefaultTableModel modelo, modelo1, modelo2;

    public principal() {
        //machetazo
        System.out.println(con);
        initComponents();
        jcombo();

        //tabla de vehiculos temporales
        String[][] data = {};
        String[] titulos = {"Placa", "tipo de vehiculo", "Tarifa", "Fecha de ingreso", "Hora de ingreso", "Estado"};
        modelo = new DefaultTableModel(data, titulos);
        JtIngresarV.setModel(modelo);

        //tabla de vehiculos retirados temporales
        String[][] dita = {};
        String[] titu = {"Placa", "tipo de vehiculo", "Tarifa", "Fecha de ingreso", "Hora de ingreso", "fecha de salida", "hora de salida", "tiempo(horas)", "total cobro"};
        modelo2 = new DefaultTableModel(dita, titu);
        JTRetirado.setModel(modelo2);

        //tabla de vehiculos permanetes
        String[][] date = {};
        String[] titul = {"Placa", "Tarifa del usuario", "Fecha de ingreso", "pago registrado", "nombre del cliente", "telefono", "estado del servicio"};
        modelo1 = new DefaultTableModel(date, titul);
        JtPer.setModel(modelo1);
        nombreparque();
    }

    public void nombreparque() {
        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/parque", "root", "");
            Statement comando = conexion.createStatement();
            ResultSet registro = comando.executeQuery("select * from dparqueadero");

            while (registro.next()) {

                jLabel19.setText(registro.getString(1));
            }
            conexion.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        populmenu = new javax.swing.JPopupMenu();
        modificar = new javax.swing.JMenuItem();
        itemRetirarvehiTem = new javax.swing.JMenuItem();
        per = new javax.swing.JPopupMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        Escritorio = new javax.swing.JDesktopPane();
        menu = new javax.swing.JTabbedPane();
        paBien = new javax.swing.JPanel();
        paEs = new javax.swing.JDesktopPane();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        rPh = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        rPm = new javax.swing.JLabel();
        rPs = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txPlaca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jcTipo = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        txTarifa = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txFecha = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txHora = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txEstado = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        JtIngresarV = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnModi = new javax.swing.JButton();
        btnEli = new javax.swing.JButton();
        rHora = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        rMinuto = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        rseg = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        JTRetirado = new javax.swing.JTable();
        txfS = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtPlacaP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txTarifaP = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txfechaInP = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txpago = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        JtPer = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        txClienteP = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txTelP = new javax.swing.JTextField();
        btnNew = new javax.swing.JButton();
        btnCan = new javax.swing.JButton();
        btnGua = new javax.swing.JButton();
        btnActu = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        JcEstadoP = new javax.swing.JComboBox();
        jLabel24 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        bparqueadero = new javax.swing.JMenuItem();
        bUsuario = new javax.swing.JMenuItem();
        btarifas = new javax.swing.JMenuItem();
        bSalir = new javax.swing.JMenuItem();

        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        populmenu.add(modificar);

        itemRetirarvehiTem.setText("Retirar");
        itemRetirarvehiTem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRetirarvehiTemActionPerformed(evt);
            }
        });
        populmenu.add(itemRetirarvehiTem);

        jMenuItem2.setText("Modificar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        per.add(jMenuItem2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        Escritorio.setBackground(new java.awt.Color(0, 153, 255));
        Escritorio.setToolTipText("");

        menu.setAutoscrolls(true);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/bienvenido.png"))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Lucida Calligraphy", 0, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 153, 51));
        jLabel18.setText("Parqueadero:");

        jLabel19.setFont(new java.awt.Font("Lucida Calligraphy", 3, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 102, 0));
        jLabel19.setText("o");

        rPh.setFont(new java.awt.Font("Lucida Calligraphy", 2, 36)); // NOI18N
        rPh.setForeground(new java.awt.Color(255, 102, 0));
        rPh.setText("00");

        jLabel21.setFont(new java.awt.Font("Lucida Calligraphy", 2, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 102, 0));
        jLabel21.setText(":");

        jLabel22.setFont(new java.awt.Font("Lucida Calligraphy", 2, 36)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 102, 0));
        jLabel22.setText(":");

        rPm.setFont(new java.awt.Font("Lucida Calligraphy", 2, 36)); // NOI18N
        rPm.setForeground(new java.awt.Color(255, 102, 0));
        rPm.setText("00");

        rPs.setFont(new java.awt.Font("Lucida Calligraphy", 2, 36)); // NOI18N
        rPs.setForeground(new java.awt.Color(255, 102, 0));
        rPs.setText("00");

        javax.swing.GroupLayout paEsLayout = new javax.swing.GroupLayout(paEs);
        paEs.setLayout(paEsLayout);
        paEsLayout.setHorizontalGroup(
            paEsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paEsLayout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addGroup(paEsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(paEsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paEsLayout.createSequentialGroup()
                            .addComponent(rPh, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2)
                            .addComponent(rPm, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rPs, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(paEsLayout.createSequentialGroup()
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(46, 46, 46))))
                .addGap(56, 56, 56))
        );
        paEsLayout.setVerticalGroup(
            paEsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paEsLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(paEsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rPh)
                    .addComponent(jLabel22)
                    .addComponent(rPm)
                    .addComponent(jLabel21)
                    .addComponent(rPs))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        paEs.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        paEs.setLayer(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);
        paEs.setLayer(jLabel19, javax.swing.JLayeredPane.DEFAULT_LAYER);
        paEs.setLayer(rPh, javax.swing.JLayeredPane.DEFAULT_LAYER);
        paEs.setLayer(jLabel21, javax.swing.JLayeredPane.DEFAULT_LAYER);
        paEs.setLayer(jLabel22, javax.swing.JLayeredPane.DEFAULT_LAYER);
        paEs.setLayer(rPm, javax.swing.JLayeredPane.DEFAULT_LAYER);
        paEs.setLayer(rPs, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout paBienLayout = new javax.swing.GroupLayout(paBien);
        paBien.setLayout(paBienLayout);
        paBienLayout.setHorizontalGroup(
            paBienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paEs)
        );
        paBienLayout.setVerticalGroup(
            paBienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paEs)
        );

        menu.addTab("BIENVENIDO", paBien);

        jPanel1.setAutoscrolls(true);

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel1.setText("Registro ");

        jLabel2.setText("Placa:");

        txPlaca.setEnabled(false);

        jLabel5.setText("Tipo de vehiculo:");

        jcTipo.setEnabled(false);
        jcTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcTipoActionPerformed(evt);
            }
        });

        jLabel6.setText("Tarifa:");

        txTarifa.setEnabled(false);

        jLabel7.setText("Fecha de ingreso:");

        txFecha.setEnabled(false);

        jLabel8.setText("Hora de ingreso");

        txHora.setEnabled(false);

        jLabel9.setText("ESTADO:");

        txEstado.setEnabled(false);

        JtIngresarV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        JtIngresarV.setComponentPopupMenu(populmenu);
        jScrollPane2.setViewportView(JtIngresarV);

        btnAgregar.setText("Agregar");
        btnAgregar.setEnabled(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModi.setText("Modificar");
        btnModi.setEnabled(false);
        btnModi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModiActionPerformed(evt);
            }
        });

        btnEli.setText("Eliminar");
        btnEli.setEnabled(false);
        btnEli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliActionPerformed(evt);
            }
        });

        rHora.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        rHora.setText("00");

        jLabel11.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel11.setText(":");

        rMinuto.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        rMinuto.setText("00");

        jLabel13.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel13.setText(":");

        rseg.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        rseg.setText("00");

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Vehiculos  Retirados ");
        jLabel20.setToolTipText("");
        jLabel20.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel20.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel23.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel23.setText("Vehiculos Ingresados ");

        JTRetirado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(JTRetirado);

        txfS.setEnabled(false);
        txfS.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txHora)
                                            .addComponent(txFecha, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jcTipo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txTarifa, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txPlaca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txfS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnModi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnEli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel23))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rHora)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rMinuto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4)
                            .addComponent(jScrollPane2)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rseg)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(rHora)
                    .addComponent(jLabel11)
                    .addComponent(rMinuto)
                    .addComponent(jLabel13)
                    .addComponent(rseg))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNuevo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModi)
                        .addGap(12, 12, 12)
                        .addComponent(btnEli))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txTarifa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addContainerGap())
        );

        menu.addTab("P.TEMPORAL", jPanel1);

        jLabel3.setText("Placa:");

        txtPlacaP.setEnabled(false);

        jLabel4.setText("tarifa de usuario:");

        txTarifaP.setEnabled(false);

        jLabel10.setText("fecha de ingreso:");

        txfechaInP.setEnabled(false);

        jLabel12.setText("pago");

        txpago.setEnabled(false);

        JtPer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        JtPer.setComponentPopupMenu(per);
        jScrollPane3.setViewportView(JtPer);

        jLabel15.setText("Nombre del cliente:");

        txClienteP.setEnabled(false);

        jLabel16.setText("telefono del cliente");

        txTelP.setEnabled(false);

        btnNew.setText("Nuevo");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnCan.setText("Cancelar");
        btnCan.setEnabled(false);
        btnCan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCanActionPerformed(evt);
            }
        });

        btnGua.setText("Guardar");
        btnGua.setEnabled(false);
        btnGua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuaActionPerformed(evt);
            }
        });

        btnActu.setText("Actualizar");
        btnActu.setEnabled(false);
        btnActu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActuActionPerformed(evt);
            }
        });

        btnE.setText("Eliminar");
        btnE.setEnabled(false);
        btnE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEActionPerformed(evt);
            }
        });

        jLabel17.setText("estado del servicio:");

        JcEstadoP.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pago", "Debe" }));
        JcEstadoP.setEnabled(false);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon-parking.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txTelP, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtPlacaP, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txTarifaP, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txfechaInP, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txpago, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txClienteP, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGap(59, 59, 59)))
                    .addComponent(jLabel16))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(JcEstadoP, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel24)
                        .addGap(69, 69, 69)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnGua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnActu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnE, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPlacaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txTarifaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNew)
                            .addComponent(JcEstadoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnCan)
                                .addGap(16, 16, 16)
                                .addComponent(btnGua)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnActu)
                                .addGap(18, 18, 18)
                                .addComponent(btnE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txfechaInP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txpago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txClienteP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txTelP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        menu.addTab("P.PERMANENTE", jPanel3);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu)
                .addContainerGap())
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu)
                .addContainerGap())
        );
        Escritorio.setLayer(menu, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(Escritorio);

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));

        jMenu1.setBackground(new java.awt.Color(51, 153, 255));
        jMenu1.setBorder(null);
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/homee.png"))); // NOI18N
        jMenu1.setText("Inicio");
        jMenu1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jMenu1StateChanged(evt);
            }
        });

        jMenu3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icono_datos11.png"))); // NOI18N
        jMenu3.setText("Datos");

        bparqueadero.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        bparqueadero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/registro.png"))); // NOI18N
        bparqueadero.setText("Parqueadero");
        bparqueadero.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bparqueadero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bparqueaderoActionPerformed(evt);
            }
        });
        jMenu3.add(bparqueadero);

        bUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        bUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/sign-up-icon.png"))); // NOI18N
        bUsuario.setText("Usuario");
        bUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUsuarioActionPerformed(evt);
            }
        });
        jMenu3.add(bUsuario);

        jMenu1.add(jMenu3);

        btarifas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        btarifas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/iconDinero.png"))); // NOI18N
        btarifas.setText("Tarifas");
        btarifas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btarifas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btarifasActionPerformed(evt);
            }
        });
        jMenu1.add(btarifas);

        bSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        bSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/eliminar-icono-4399-128.png"))); // NOI18N
        bSalir.setText("Salir");
        bSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });
        jMenu1.add(bSalir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void borrarTReti() {
        int l = JTRetirado.getRowCount();
        for (int i = l - 1; i >= 0; i--) {
            modelo2.removeRow(i);
        }
    }

    public void borrartabla() {
        int l = JtIngresarV.getRowCount();
        for (int i = l - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    public void borrartablaPer() {
        int l = JtPer.getRowCount();
        for (int i = l - 1; i >= 0; i--) {
            modelo1.removeRow(i);
        }

    }

    public void rTablaPer() {
        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/parque", "root", "");
            Statement comando = conexion.createStatement();
            ResultSet registro = comando.executeQuery("select * from dpermanente");
            String[] dato = new String[7];
            while (registro.next()) {
                dato[0] = registro.getString("placa");
                dato[1] = registro.getString("tarifaU");
                dato[2] = registro.getString("fechaIn");
                dato[3] = registro.getString("pagoo");
                dato[4] = registro.getString("nombreCliente");
                dato[5] = registro.getString("telefono");
                dato[6] = registro.getString("esSer");

                modelo1.addRow(dato);
            }
            conexion.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }

    }

    public void rtablaRetirados() {
        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/parque", "root", "");
            Statement comando = conexion.createStatement();
            ResultSet registro = comando.executeQuery("select * from dvehitemre");
            String[] dato = new String[9];
            while (registro.next()) {
                dato[0] = registro.getString("placa");
                dato[1] = registro.getString("tipovehiculo");
                dato[2] = registro.getString("tarifa");
                dato[3] = registro.getString("fecha");
                dato[4] = registro.getString("hora");
                dato[5] = registro.getString("fechaSalida");
                dato[6] = registro.getString("horaSalida");
                dato[7] = registro.getString("tiempo");
                dato[8] = registro.getString("totalaPagar");

                modelo2.addRow(dato);
            }
            conexion.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    public void rTablaTemp() {
        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/parque", "root", "");
            Statement comando = conexion.createStatement();
            ResultSet registro = comando.executeQuery("select * from dvehiculo");
            String[] dato = new String[6];
            while (registro.next()) {
                dato[0] = registro.getString("placa");
                dato[1] = registro.getString("tipovehiculo");
                dato[2] = registro.getString("tarifa");
                dato[3] = registro.getString("fecha");
                dato[4] = registro.getString("hora");
                dato[5] = registro.getString("estado");

                modelo.addRow(dato);
            }
            conexion.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    public class reloj implements ActionListener {

        public void actionPerformed(ActionEvent evt) {

            GregorianCalendar tiempo = new GregorianCalendar();
            int hora, minutos, segundos;

            hora = tiempo.get(Calendar.HOUR);
            minutos = tiempo.get(Calendar.MINUTE);
            segundos = tiempo.get(Calendar.SECOND);

            rHora.setText(String.valueOf(hora));
            rMinuto.setText(String.valueOf(minutos));
            rseg.setText(String.valueOf(segundos));

            //reloj principal
            rPh.setText(String.valueOf(hora));
            rPm.setText(String.valueOf(minutos));
            rPs.setText(String.valueOf(segundos));
        }
    }

    public void jcombo() {
        jcTipo.addItem(selec);
        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/parque", "root", "");
            Statement comando = conexion.createStatement();
            ResultSet registro = comando.executeQuery("select * from dtarifa");

            while (registro.next()) {

                jcTipo.addItem(registro.getString(1));
                con++;
            }
            conexion.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }

    }

    public String fecha() {

        Date fecha = new Date();
        SimpleDateFormat formatoF = new SimpleDateFormat("YYYY/MM/dd");
        return formatoF.format(fecha);

    }

    public String hora() {
        Calendar cal = Calendar.getInstance();
        String hora = cal.get(cal.HOUR_OF_DAY) + ":" + cal.get(cal.MINUTE) + ":" + cal.get(cal.SECOND);
        return hora;

    }
    private void bparqueaderoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bparqueaderoActionPerformed

        frParqueadero p = new frParqueadero();
        p.setVisible(true);
        p.setOpaque(true);
        paEs.add(p);


    }//GEN-LAST:event_bparqueaderoActionPerformed

    private void bUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUsuarioActionPerformed
        frUsuario u = new frUsuario();
        u.setVisible(true);
        paEs.add(u);
    }//GEN-LAST:event_bUsuarioActionPerformed

    private void jMenu1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jMenu1StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1StateChanged

    private void btarifasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btarifasActionPerformed
        frTarifas t = new frTarifas();
        t.setVisible(true);
        paEs.add(t);

    }//GEN-LAST:event_btarifasActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bSalirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        timer = new Timer(1000, new reloj());
        timer.start();

        rTablaTemp();
        rTablaPer();
        rtablaRetirados();

    }//GEN-LAST:event_formWindowOpened

    public void nuevo() {

        txPlaca.setEnabled(true);
        jcTipo.setEnabled(true);
        txTarifa.setEnabled(true);
        txFecha.setEnabled(true);
        txHora.setEnabled(true);
        txEstado.setEnabled(true);
        btnAgregar.setEnabled(true);
        btnEli.setEnabled(true);
        btnModi.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnNuevo.setEnabled(false);

        //fecha y hora
        txFecha.setText(fecha());
        txHora.setText(hora());
        txfS.setText("");

    }


    public void cancel() {
        txPlaca.setEnabled(false);
        jcTipo.setEnabled(false);
        txTarifa.setEnabled(false);
        txFecha.setEnabled(false);
        txHora.setEnabled(false);
        txEstado.setEnabled(false);
        btnAgregar.setEnabled(false);
        btnEli.setEnabled(false);
        btnModi.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnNuevo.setEnabled(true);
        //limpiar campos
        txFecha.setText("");
        txHora.setText("");
        txTarifa.setText("");
        txEstado.setText("");
        txPlaca.setText("");
    }

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        nuevo();
        int filaSelect = JtIngresarV.getSelectedRow();
        txPlaca.setText(JtIngresarV.getValueAt(filaSelect, 0).toString());
        jcTipo.setSelectedItem(JtIngresarV.getValueAt(filaSelect, 1).toString());
        txTarifa.setText(JtIngresarV.getValueAt(filaSelect, 2).toString());
        txFecha.setText(JtIngresarV.getValueAt(filaSelect, 3).toString());
        txHora.setText(JtIngresarV.getValueAt(filaSelect, 4).toString());
        txEstado.setText(JtIngresarV.getValueAt(filaSelect, 5).toString());

        filas = filaSelect;


    }//GEN-LAST:event_modificarActionPerformed

    // |||||||| parqueadero 
    // ||||||||             PERMANENTE!!!!!!!!!!!
    public void nuevoo() {

        txtPlacaP.setEnabled(true);
        txTarifaP.setEnabled(true);
        txfechaInP.setEnabled(true);
        txpago.setEnabled(true);
        txClienteP.setEnabled(true);
        txTelP.setEnabled(true);
        JcEstadoP.setEnabled(true);
        btnNew.setEnabled(false);
        btnCan.setEnabled(true);
        btnGua.setEnabled(true);
        btnActu.setEnabled(true);
        btnE.setEnabled(true);
        //
        txfechaInP.setText(fecha());

    }
    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        nuevoo();
    }//GEN-LAST:event_btnNewActionPerformed

    public void cancelae() {
        txtPlacaP.setEnabled(false);
        txTarifaP.setEnabled(false);
        txfechaInP.setEnabled(false);
        txpago.setEnabled(false);
        txClienteP.setEnabled(false);
        txTelP.setEnabled(false);
        JcEstadoP.setEnabled(false);
        btnNew.setEnabled(true);
        btnCan.setEnabled(false);
        btnGua.setEnabled(false);
        btnActu.setEnabled(false);
        btnE.setEnabled(false);

        txtPlacaP.setText("");
        txTarifaP.setText("");
        txfechaInP.setText("");
        txpago.setText("");
        txClienteP.setText("");
        txTelP.setText("");

    }
    private void btnCanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCanActionPerformed
        cancelae();
    }//GEN-LAST:event_btnCanActionPerformed

    private void btnGuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuaActionPerformed
        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/parque", "root", "");
            Statement comando = conexion.createStatement();
            comando.executeUpdate("insert into dpermanente(placa,tarifaU,fechaIn,pagoo,nombreCliente,telefono,esSer) values ('" + txtPlacaP.getText() + "'," + txTarifaP.getText() + ",'" + txfechaInP.getText() + "'," + txpago.getText() + ",'" + txClienteP.getText() + "','" + txTelP.getText() + "','" + JcEstadoP.getSelectedItem() + "')");
            conexion.close();
            JOptionPane.showMessageDialog(null, "la informacion ha sido agregada corectamente ");
            txtPlacaP.setText("");
            txTarifaP.setText("");
            txfechaInP.setText("");
            txpago.setText("");
            txClienteP.setText("");
            txTelP.setText("");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        borrartablaPer();
        rTablaPer();
        cancelae();
    }//GEN-LAST:event_btnGuaActionPerformed

    private void btnActuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActuActionPerformed
        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/parque", "root", "");
            Statement comando = conexion.createStatement();
            int cantidad = comando.executeUpdate("update dpermanente set placa='" + txtPlacaP.getText() + "',tarifaU=" + txTarifaP.getText() + ",fechaIn='" + txfechaInP.getText() + "',pagoo=" + txpago.getText() + ",nombreCliente='" + txClienteP.getText() + "',telefono='" + txTelP.getText() + "',esSer='" + JcEstadoP.getSelectedItem() + "' where placa='" + txtPlacaP.getText() + "'");
            if (cantidad == 1) {
                JOptionPane.showMessageDialog(null, "!!!!!!!!!!!!!!!!!!!!! se modifico!!!!!!!!!!!!!!!!!!!!");
            } else {
                JOptionPane.showMessageDialog(null, " NO modifico");
            }
            conexion.close();
            txtPlacaP.setText("");
            txTarifaP.setText("");
            txfechaInP.setText("");
            txpago.setText("");
            txClienteP.setText("");
            txTelP.setText("");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }

        borrartablaPer();
        rTablaPer();
        cancelae();
    }//GEN-LAST:event_btnActuActionPerformed

    private void btnEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEActionPerformed

        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/parque", "root", "");
            Statement comando = conexion.createStatement();
            int cantidad = comando.executeUpdate("delete from dpermanente where placa=" + txtPlacaP.getText());
            if (cantidad == 1) {
                JcEstadoP.setSelectedIndex(-1);
                txTarifaP.setText("");
                txfechaInP.setText("");
                txpago.setText("");
                txClienteP.setText("");
                txTelP.setText("");
                JOptionPane.showMessageDialog(null, "Se borro EXITOSAMNETE!!!!!!!! ");
            } else {
                JOptionPane.showMessageDialog(null, "No existe!!!!!!!!!");
            }
            conexion.close();
            JcEstadoP.setSelectedIndex(-1);
            txTarifaP.setText("");
            txfechaInP.setText("");
            txpago.setText("");
            txClienteP.setText("");
            txTelP.setText("");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        borrartablaPer();
        rTablaPer();


    }//GEN-LAST:event_btnEActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        int filaSelect = JtPer.getSelectedRow();

        txtPlacaP.setText(JtPer.getValueAt(filaSelect, 0).toString());
        txTarifaP.setText(JtPer.getValueAt(filaSelect, 1).toString());
        txfechaInP.setText(JtPer.getValueAt(filaSelect, 2).toString());
        txpago.setText(JtPer.getValueAt(filaSelect, 3).toString());
        txClienteP.setText(JtPer.getValueAt(filaSelect, 4).toString());
        txTelP.setText(JtPer.getValueAt(filaSelect, 5).toString());
        JcEstadoP.setSelectedItem(JtPer.getValueAt(filaSelect, 6).toString());

        filas = filaSelect;

        nuevoo();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void itemRetirarvehiTemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRetirarvehiTemActionPerformed
        //traer los valores para luego guardarlos en la Bd
        int filaSelect = JtIngresarV.getSelectedRow();
        txPlaca.setText(JtIngresarV.getValueAt(filaSelect, 0).toString());
        jcTipo.setSelectedItem(JtIngresarV.getValueAt(filaSelect, 1).toString());
        txTarifa.setText(JtIngresarV.getValueAt(filaSelect, 2).toString());
        txFecha.setText(JtIngresarV.getValueAt(filaSelect, 3).toString());
        txHora.setText(JtIngresarV.getValueAt(filaSelect, 4).toString());
        txEstado.setText(JtIngresarV.getValueAt(filaSelect, 5).toString());
        txfS.setText(fecha());
        filas = filaSelect;

        // calcular tarifa umm...
        // se trae la tarifa y la hora de entrada , luego se separa en un vector (descompone), se trae la variale y se define 
        // la de tiempo
        int tarifa = new Integer(txTarifa.getText());
        String inicio = txHora.getText();
        String seperador = ":";
        String[] arreglo, arreglo1;
        arreglo = inicio.split(":");
        int h = Integer.valueOf(arreglo[0]);
        int minutos = 60;

        //se convierte para agregarle los minutos  y vuelve a ser horas
        float hora = h * minutos;
        int m = Integer.valueOf(arreglo[1]);
        double horasumaE = (hora + m) / 60;

        // se trae la  hora de salida se aplica el mismo proceso xD
        String finalTime2 = hora();
        arreglo1 = finalTime2.split(":");
        int hE = Integer.valueOf(arreglo1[0]);

        float o = hE * minutos;
        int x = Integer.valueOf(arreglo1[1]);
        double horassumaS = (o + x) / 60;

        //cuantos dias lleva el vehiculo en el parqueadero, multiplica por dia x 24h
        String fecI = txFecha.getText();
        String fecS = fecha();
        String[] arre, arre1;
        arre = fecI.split("-");
        arre1 = fecS.split("/");
        int fE = Integer.valueOf(arre[2]);
        int fS = Integer.valueOf(arre1[2]);
        int nDia = fS - fE;
        int HxD = nDia * 24;

        // se resta el tiempo  y se multiplica por la tarifa
        double hora2f = (horassumaS - horasumaE);
        hora2f = hora2f + HxD;
        System.out.println(hora2f);
        double pag = hora2f * tarifa;
        //convertir double a entero
        int pago = (int) pag;

        //guardar datos
        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/parque", "root", "");
            Statement comando = conexion.createStatement();
            comando.executeUpdate("insert into dvehitemre(placa,tipovehiculo,tarifa,fecha,hora,fechaSalida,horaSalida,tiempo,totalaPagar) values ('" + txPlaca.getText() + "','" + jcTipo.getSelectedItem() + "','" + txTarifa.getText() + "','" + txFecha.getText() + "','" + txHora.getText() + "','" + fecha() + "','" + hora() + "'," + hora2f + "," + pago + ")");
            conexion.close();

            /*  txPlaca.setText("");
             txTarifa.setText("");
             txFecha.setText("");
             txHora.setText("");
             txEstado.setText("");*/
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }

        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/parque", "root", "");
            Statement comando = conexion.createStatement();
            int cantidad = comando.executeUpdate("DELETE FROM dvehiculo WHERE placa='" + txPlaca.getText() + "'");
            if (cantidad == 1) {
                JOptionPane.showMessageDialog(null, "El vehiculo de placa: " + txPlaca.getText() + " Esta siendo retirado" + ". \n Total a Pagar:  $" + pago);

            } else {
                JOptionPane.showMessageDialog(null, "No se pudo retirar el vehículo");
            }
            conexion.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        borrartabla();
        rTablaTemp();
        borrarTReti();
        rtablaRetirados();
        txfS.setText("");

    }//GEN-LAST:event_itemRetirarvehiTemActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        cancel();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        nuevo();
        jcTipo.removeAllItems();
        jcombo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliActionPerformed

        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/parque", "root", "");
            Statement comando = conexion.createStatement();
            int cantidad = comando.executeUpdate("delete from dvehiculo where placa=" + txPlaca.getText() + "'");
            if (cantidad == 1) {
                jcTipo.setSelectedIndex(-1);
                txTarifa.setText("");
                txFecha.setText("");
                txHora.setText("");
                txEstado.setText("");
                JOptionPane.showMessageDialog(null, "Se borro EXITOSAMNETE!!!!!!!! ");
            } else {
                JOptionPane.showMessageDialog(null, "No existe!!!!!!!!!");
            }
            conexion.close();
            jcTipo.setSelectedIndex(-1);
            txTarifa.setText("");
            txFecha.setText("");
            txHora.setText("");
            txEstado.setText("");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        borrartabla();
        rTablaTemp();
    }//GEN-LAST:event_btnEliActionPerformed

    private void btnModiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModiActionPerformed

        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/parque", "root", "");
            Statement comando = conexion.createStatement();
            int cantidad = comando.executeUpdate("update dvehiculo set tipovehiculo='" + jcTipo.getSelectedItem() + "',tarifa=" + txTarifa.getText() + ",fecha='" + txFecha.getText() + "',hora='" + txHora.getText() + "',estado='" + txEstado.getText() + "',placa='" + txPlaca.getText() + "' where placa='" + txPlaca.getText() + "'");
            if (cantidad == 1) {
                JOptionPane.showMessageDialog(null, "!!!!!!!!!!!!!!!!!!!!! se modifico!!!!!!!!!!!!!!!!!!!!");
            } else {
                JOptionPane.showMessageDialog(null, " NO modifico");
            }
            conexion.close();
            txPlaca.setText("");
            txFecha.setText("");
            txHora.setText("");
            txTarifa.setText("");
            txEstado.setText("");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        borrartabla();
        cancel();
        rTablaTemp();
    }//GEN-LAST:event_btnModiActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/parque", "root", "");
            Statement comando = conexion.createStatement();
            comando.executeUpdate("insert into dvehiculo(placa,tipovehiculo,tarifa,fecha,hora,estado) values ('" + txPlaca.getText() + "','" + jcTipo.getSelectedItem() + "','" + txTarifa.getText() + "','" + txFecha.getText() + "','" + txHora.getText() + "','" + txEstado.getText() + "')");
            conexion.close();
            JOptionPane.showMessageDialog(null, "la informacion ha sido agregada corectamente ");
            txPlaca.setText("");
            txTarifa.setText("");
            txFecha.setText("");
            txHora.setText("");
            txEstado.setText("");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        borrartabla();
        rTablaTemp();
        cancel();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jcTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcTipoActionPerformed
        try {//para traer el valor de la base de datos al pulsando en el cbm y llevarlo a la tarifa
            if (this.con > 0) {
                Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/parque", "root", "");
                Statement comando = conexion.createStatement();
                ResultSet registro = comando.executeQuery("SELECT * FROM dtarifa WHERE tipovehiculo='" + this.jcTipo.getSelectedItem() + "'");
                if (registro.next() == true) {
                    txTarifa.setText(registro.getString("tarifa"));

                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione un Vehículo para calcular tarifa");
                    //labelResultado.setText("No existe un artículo con dicho código");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }

    }//GEN-LAST:event_jcTipoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    private Timer timer;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JTable JTRetirado;
    private javax.swing.JComboBox JcEstadoP;
    private javax.swing.JTable JtIngresarV;
    private javax.swing.JTable JtPer;
    private javax.swing.JMenuItem bSalir;
    private javax.swing.JMenuItem bUsuario;
    private javax.swing.JMenuItem bparqueadero;
    private javax.swing.JMenuItem btarifas;
    private javax.swing.JButton btnActu;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCan;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnEli;
    private javax.swing.JButton btnGua;
    private javax.swing.JButton btnModi;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JMenuItem itemRetirarvehiTem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JComboBox jcTipo;
    private javax.swing.JTabbedPane menu;
    private javax.swing.JMenuItem modificar;
    private javax.swing.JPanel paBien;
    private javax.swing.JDesktopPane paEs;
    private javax.swing.JPopupMenu per;
    private javax.swing.JPopupMenu populmenu;
    private javax.swing.JLabel rHora;
    private javax.swing.JLabel rMinuto;
    private javax.swing.JLabel rPh;
    private javax.swing.JLabel rPm;
    private javax.swing.JLabel rPs;
    private javax.swing.JLabel rseg;
    private javax.swing.JTextField txClienteP;
    private javax.swing.JTextField txEstado;
    private javax.swing.JTextField txFecha;
    private javax.swing.JTextField txHora;
    private javax.swing.JTextField txPlaca;
    private javax.swing.JTextField txTarifa;
    private javax.swing.JTextField txTarifaP;
    private javax.swing.JTextField txTelP;
    private javax.swing.JTextField txfS;
    private javax.swing.JTextField txfechaInP;
    private javax.swing.JTextField txpago;
    private javax.swing.JTextField txtPlacaP;
    // End of variables declaration//GEN-END:variables
}
