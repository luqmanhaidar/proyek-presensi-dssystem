package com.presensikaryawan.transaksiGajiDepartmentTotalReport;

import com.dssystem.umum.ComponentFocus;
import com.presensikaryawan.departmentSetting.Department;
import com.presensikaryawan.departmentSetting.DepartmentDao;
import com.presensikaryawan.detailtransaksidepartment.DetailLainDialog;
import com.presensikaryawan.tools.DaoFactory;
import com.presensikaryawan.transaksiDepartment.*;
import com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/*
 * masterInventoryGrup.java
 *
 * Created on October 21, 2006, 10:06 AM
 */
/**
 *
 * @author Als
 */
public class TransaksiGajiDepartmentReportForm extends javax.swing.JFrame {

    private DaoFactory service;
    private TransaksiDepartment activeTransaksiDepartment;
    private Department activeDepartment;
    GregorianCalendar gc = new GregorianCalendar();
    private JFrame frame;

    /**
     * Creates new form masterInventoryGrup
     */
    public TransaksiGajiDepartmentReportForm(final JFrame frame) throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        this.frame = frame;
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.setEnabled(true);

            }
        });
        UIManager.put("nimbusBase", new Color(204, 204, 255));
//        Tampilan();
        // isitable();
        initComponentFocus();
        karyawanTable.getColumnModel().getColumn(0).setPreferredWidth(70);
        karyawanTable.getColumnModel().getColumn(1).setPreferredWidth(150);
        karyawanTable.getColumnModel().getColumn(2).setPreferredWidth(200);
        karyawanTable.getColumnModel().getColumn(3).setPreferredWidth(70);
        karyawanTable.getColumnModel().getColumn(4).setPreferredWidth(70);
        karyawanTable.getColumnModel().getColumn(5).setPreferredWidth(70);
        karyawanTable.getColumnModel().getColumn(6).setPreferredWidth(70);
        karyawanTable.getColumnModel().getColumn(7).setPreferredWidth(70);
        karyawanTable.getColumnModel().getColumn(8).setPreferredWidth(70);
        karyawanTable.getColumnModel().getColumn(9).setPreferredWidth(150);
        karyawanTable.getColumnModel().getColumn(10).setPreferredWidth(150);
        karyawanTable.getColumnModel().getColumn(11).setPreferredWidth(150);
        karyawanTable.getColumnModel().getColumn(12).setPreferredWidth(150);
        karyawanTable.getColumnModel().getColumn(13).setPreferredWidth(150);
        karyawanTable.getColumnModel().getColumn(14).setPreferredWidth(150);
        karyawanTable.getColumnModel().getColumn(15).setPreferredWidth(150);
        karyawanTable.getColumnModel().getColumn(16).setPreferredWidth(150);
        karyawanTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        DepartmentDao dao4 = DaoFactory.getDepartmentDao();
        List<Department> departments = dao4.getAllDepartment();
        for (Department d : departments) {
            departmentCombo1.addItem(d.getKodeDepartment());
            departmentCombo2.addItem(d.getKodeDepartment());
        }


    }

    private void initComponentFocus() {
        departmentCombo1.addFocusListener(new ComponentFocus(departmentCombo1));
        lihatButton.addFocusListener(new ComponentFocus(lihatButton));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPaneTransaksiDepartment = new javax.swing.JDesktopPane();
        cmdKeluar = new javax.swing.JButton();
        inputPanel = new javax.swing.JPanel();
        namaKaryawanLabel = new javax.swing.JLabel();
        departmentLabel = new javax.swing.JLabel();
        lihatButton = new javax.swing.JButton();
        departmentCombo1 = new javax.swing.JComboBox();
        bulanMonthChooser = new com.toedter.calendar.JMonthChooser();
        tahunYearChooser1 = new com.toedter.calendar.JYearChooser();
        namaDepartmentLabel = new javax.swing.JLabel();
        nilaiNamaDepartment1 = new javax.swing.JLabel();
        sampaiLabel1 = new javax.swing.JLabel();
        sampaiLabel2 = new javax.swing.JLabel();
        departmentCombo2 = new javax.swing.JComboBox();
        nilaiNamaDepartment2 = new javax.swing.JLabel();
        cetakButton = new javax.swing.JButton();
        daftarKaryawanPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        karyawanTable = new javax.swing.JTable();
        headPanel = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        menuLabel = new javax.swing.JLabel();
        fungsiLabel = new javax.swing.JLabel();
        panelStatus1 = new com.sistem.panelstatus.PanelStatus();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Data Kategori");

        desktopPaneTransaksiDepartment.setBackground(new java.awt.Color(153, 255, 153));

        cmdKeluar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cmdKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/24/Exit.gif"))); // NOI18N
        cmdKeluar.setText("Keluar");
        cmdKeluar.setToolTipText("Klik Untuk Kembali Ke Window Utama");
        cmdKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdKeluarActionPerformed(evt);
            }
        });
        cmdKeluar.setBounds(890, 510, 110, 40);
        desktopPaneTransaksiDepartment.add(cmdKeluar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        inputPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        namaKaryawanLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        namaKaryawanLabel.setText("Bulan");

        departmentLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        departmentLabel.setText("Department");

        lihatButton.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lihatButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/24/Search.gif"))); // NOI18N
        lihatButton.setMnemonic('S');
        lihatButton.setText("Lihat");
        lihatButton.setToolTipText("Klik Untuk Lihat Rekap");
        lihatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lihatButtonActionPerformed(evt);
            }
        });
        lihatButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lihatButtonKeyPressed(evt);
            }
        });

        departmentCombo1.setEditable(true);
        departmentCombo1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        departmentCombo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentCombo1ActionPerformed(evt);
            }
        });
        departmentCombo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                departmentCombo1KeyPressed(evt);
            }
        });

        namaDepartmentLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        namaDepartmentLabel.setText("Nama Department");

        nilaiNamaDepartment1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nilaiNamaDepartment1.setText("Nilai Nama Department");

        sampaiLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        sampaiLabel1.setText("sampai");

        sampaiLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        sampaiLabel2.setText("      -");

        departmentCombo2.setEditable(true);
        departmentCombo2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        departmentCombo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentCombo2ActionPerformed(evt);
            }
        });
        departmentCombo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                departmentCombo2KeyPressed(evt);
            }
        });

        nilaiNamaDepartment2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nilaiNamaDepartment2.setText("Nilai Nama Department");

        cetakButton.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cetakButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/24/Printer.gif"))); // NOI18N
        cetakButton.setMnemonic('S');
        cetakButton.setText("Cetak");
        cetakButton.setToolTipText("Klik Untuk Cetak Print Out");
        cetakButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakButtonActionPerformed(evt);
            }
        });
        cetakButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cetakButtonKeyPressed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout inputPanelLayout = new org.jdesktop.layout.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(namaDepartmentLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .add(departmentLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(departmentCombo1, 0, 200, Short.MAX_VALUE)
                    .add(nilaiNamaDepartment1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(sampaiLabel1)
                    .add(sampaiLabel2))
                .add(18, 18, 18)
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(inputPanelLayout.createSequentialGroup()
                        .add(departmentCombo2, 0, 200, Short.MAX_VALUE)
                        .add(163, 163, 163))
                    .add(inputPanelLayout.createSequentialGroup()
                        .add(nilaiNamaDepartment2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)))
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(inputPanelLayout.createSequentialGroup()
                        .add(0, 25, Short.MAX_VALUE)
                        .add(lihatButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(cetakButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(inputPanelLayout.createSequentialGroup()
                        .add(namaKaryawanLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(bulanMonthChooser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 109, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(tahunYearChooser1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)))
                .addContainerGap())
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(inputPanelLayout.createSequentialGroup()
                        .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                .add(departmentLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(departmentCombo1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(namaKaryawanLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(sampaiLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, tahunYearChooser1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, bulanMonthChooser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(namaDepartmentLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(nilaiNamaDepartment1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(sampaiLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(nilaiNamaDepartment2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 31, Short.MAX_VALUE)
                        .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(lihatButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(cetakButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(inputPanelLayout.createSequentialGroup()
                        .add(1, 1, 1)
                        .add(departmentCombo2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        inputPanel.setBounds(0, 70, 1020, 170);
        desktopPaneTransaksiDepartment.add(inputPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        daftarKaryawanPanel.setBackground(new java.awt.Color(204, 204, 204));
        daftarKaryawanPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Daftar Karyawan"));

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        karyawanTable.setAutoCreateRowSorter(true);
        karyawanTable.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        karyawanTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO", "NAMA DEPARTMENT", "NIP", "NAMA", "M", "S", "I", "A", "T", "L", "POKOK", "MAKAN", "HADIR", "LEMBUR", "LAIN", "P. TELAT", "P. LAIN", "TOTAL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        karyawanTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                karyawanTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(karyawanTable);
        karyawanTable.getColumnModel().getColumn(0).setResizable(false);
        karyawanTable.getColumnModel().getColumn(0).setPreferredWidth(70);
        karyawanTable.getColumnModel().getColumn(1).setResizable(false);
        karyawanTable.getColumnModel().getColumn(2).setResizable(false);
        karyawanTable.getColumnModel().getColumn(2).setPreferredWidth(150);
        karyawanTable.getColumnModel().getColumn(3).setResizable(false);
        karyawanTable.getColumnModel().getColumn(3).setPreferredWidth(200);
        karyawanTable.getColumnModel().getColumn(4).setResizable(false);
        karyawanTable.getColumnModel().getColumn(4).setPreferredWidth(70);
        karyawanTable.getColumnModel().getColumn(5).setResizable(false);
        karyawanTable.getColumnModel().getColumn(5).setPreferredWidth(70);
        karyawanTable.getColumnModel().getColumn(6).setResizable(false);
        karyawanTable.getColumnModel().getColumn(6).setPreferredWidth(70);
        karyawanTable.getColumnModel().getColumn(7).setResizable(false);
        karyawanTable.getColumnModel().getColumn(7).setPreferredWidth(70);
        karyawanTable.getColumnModel().getColumn(8).setResizable(false);
        karyawanTable.getColumnModel().getColumn(8).setPreferredWidth(70);
        karyawanTable.getColumnModel().getColumn(9).setResizable(false);
        karyawanTable.getColumnModel().getColumn(9).setPreferredWidth(70);
        karyawanTable.getColumnModel().getColumn(10).setResizable(false);
        karyawanTable.getColumnModel().getColumn(10).setPreferredWidth(150);
        karyawanTable.getColumnModel().getColumn(11).setResizable(false);
        karyawanTable.getColumnModel().getColumn(11).setPreferredWidth(150);
        karyawanTable.getColumnModel().getColumn(12).setResizable(false);
        karyawanTable.getColumnModel().getColumn(12).setPreferredWidth(150);
        karyawanTable.getColumnModel().getColumn(13).setResizable(false);
        karyawanTable.getColumnModel().getColumn(13).setPreferredWidth(150);
        karyawanTable.getColumnModel().getColumn(14).setResizable(false);
        karyawanTable.getColumnModel().getColumn(14).setPreferredWidth(150);
        karyawanTable.getColumnModel().getColumn(15).setResizable(false);
        karyawanTable.getColumnModel().getColumn(15).setPreferredWidth(150);
        karyawanTable.getColumnModel().getColumn(16).setResizable(false);
        karyawanTable.getColumnModel().getColumn(16).setPreferredWidth(150);
        karyawanTable.getColumnModel().getColumn(17).setResizable(false);
        karyawanTable.getColumnModel().getColumn(17).setPreferredWidth(150);

        org.jdesktop.layout.GroupLayout daftarKaryawanPanelLayout = new org.jdesktop.layout.GroupLayout(daftarKaryawanPanel);
        daftarKaryawanPanel.setLayout(daftarKaryawanPanelLayout);
        daftarKaryawanPanelLayout.setHorizontalGroup(
            daftarKaryawanPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, daftarKaryawanPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
                .addContainerGap())
        );
        daftarKaryawanPanelLayout.setVerticalGroup(
            daftarKaryawanPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(daftarKaryawanPanelLayout.createSequentialGroup()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        daftarKaryawanPanel.setBounds(0, 240, 1020, 240);
        desktopPaneTransaksiDepartment.add(daftarKaryawanPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        headPanel.setBackground(new java.awt.Color(255, 255, 255));

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logosimtel.jpg"))); // NOI18N

        menuLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        menuLabel.setText("Menu Transaksi Gaji Per Department");

        fungsiLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        fungsiLabel.setText("Digunakan untuk melihat dan mengedit data presensi dan gaji karyawan per department");

        org.jdesktop.layout.GroupLayout headPanelLayout = new org.jdesktop.layout.GroupLayout(headPanel);
        headPanel.setLayout(headPanelLayout);
        headPanelLayout.setHorizontalGroup(
            headPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(headPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(logoLabel)
                .add(4, 4, 4)
                .add(headPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(menuLabel)
                    .add(fungsiLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 437, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(519, Short.MAX_VALUE))
        );
        headPanelLayout.setVerticalGroup(
            headPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(headPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(headPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(logoLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(headPanelLayout.createSequentialGroup()
                        .add(menuLabel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(fungsiLabel)))
                .addContainerGap())
        );

        headPanel.setBounds(0, 0, 1020, 77);
        desktopPaneTransaksiDepartment.add(headPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelStatus1.setBounds(0, 570, 1020, 50);
        desktopPaneTransaksiDepartment.add(panelStatus1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(desktopPaneTransaksiDepartment, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 1020, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(desktopPaneTransaksiDepartment, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1036)/2, (screenSize.height-655)/2, 1036, 655);
    }// </editor-fold>//GEN-END:initComponents

private void cmdKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdKeluarActionPerformed
    frame.setEnabled(true);
    this.dispose();
}//GEN-LAST:event_cmdKeluarActionPerformed

private void departmentCombo1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_departmentCombo1KeyPressed
    if (evt.getKeyCode() == 10) {
    }
}//GEN-LAST:event_departmentCombo1KeyPressed

private void departmentCombo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentCombo1ActionPerformed
    if (departmentCombo1.getSelectedItem() != null) {
        String pilih = String.valueOf(departmentCombo1.getSelectedItem());
        if (pilih != null) {
            try {
                activeDepartment = DaoFactory.getTranskasiGajiDao().getNamaDepartmentByCode(pilih);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        //jika ditemukan
        if (activeDepartment != null) {
            nilaiNamaDepartment1.setText(activeDepartment.getNamaDepartment());
            departmentCombo1.requestFocus();

        } else {
            JOptionPane.showMessageDialog(this, "Tidak Ada Department Dengan Code Tersebut", "Error", JOptionPane.ERROR_MESSAGE);
            departmentCombo1.requestFocus();
        }
    }
}//GEN-LAST:event_departmentCombo1ActionPerformed

private void lihatButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lihatButtonKeyPressed
    lihatButton.doClick();// TODO add your handling code here:
}//GEN-LAST:event_lihatButtonKeyPressed

private void lihatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lihatButtonActionPerformed
    String department = departmentCombo1.getSelectedItem().toString();
    String department2 = departmentCombo2.getSelectedItem().toString();
    int bulan = bulanMonthChooser.getMonth() + 1;
    int tahun = tahunYearChooser1.getYear();
    Date date = new Date();
    if (bulanMonthChooser.getMonth() >= date.getMonth() && tahunYearChooser1.getYear() >= (date.getYear() + 1900)) {
        JOptionPane.showMessageDialog(this, "Data yang diminta belum direkap ", "Error", JOptionPane.ERROR_MESSAGE);
    } else if ((departmentCombo1.getSelectedItem() == null && departmentCombo2.getSelectedItem() == null)
            || (String.valueOf(departmentCombo1.getSelectedItem()).matches("") && String.valueOf(departmentCombo2.getSelectedItem()).matches(""))) {
        JOptionPane.showMessageDialog(this, "Kotak department salah satu harus diisi ", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        Department dept = new Department();
        Department dept2 = new Department();
        try {
            dept = DaoFactory.getDepartmentDao().getByKode(department);
            dept2 = DaoFactory.getDepartmentDao().getByKode(department2);
        } catch (SQLException ex) {
            Logger.getLogger(TransaksiGajiDepartmentReportForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (dept == null) {
            JOptionPane.showMessageDialog(this, "Department dengan kode seperti \n di kotak I tidak ada", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (dept2 == null) {
            JOptionPane.showMessageDialog(this, "Department dengan kode seperti \n di kotak II tidak ada", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            gc.set(tahunYearChooser1.getYear(), bulanMonthChooser.getMonth(), date.getDate());

            String day = String.valueOf(gc.getActualMaximum(GregorianCalendar.DAY_OF_MONTH));
            String maxDayOfMonth;
            if (bulan < 10) {
                maxDayOfMonth = tahun + "-0" + bulan;
            } else {
                maxDayOfMonth = tahun + "-" + bulan;
            }
            System.out.println(maxDayOfMonth);
            try {
                TransaksiGajiDepartmentReportDao dao = DaoFactory.getTransaksiGajiDepartmentReportDao();
                List<TransaksiGajiDepartmentReport> transaksiDepartments = dao.getAllTransaksiDepartment(department, department2, maxDayOfMonth);

                TransaksiGajiDepartmentReportTableModel model = new TransaksiGajiDepartmentReportTableModel(transaksiDepartments);
                karyawanTable.setModel(model);
                karyawanTable.getColumnModel().getColumn(0).setPreferredWidth(70);
                karyawanTable.getColumnModel().getColumn(1).setPreferredWidth(150);
                karyawanTable.getColumnModel().getColumn(2).setPreferredWidth(200);
                karyawanTable.getColumnModel().getColumn(3).setPreferredWidth(70);
                karyawanTable.getColumnModel().getColumn(4).setPreferredWidth(70);
                karyawanTable.getColumnModel().getColumn(5).setPreferredWidth(70);
                karyawanTable.getColumnModel().getColumn(6).setPreferredWidth(70);
                karyawanTable.getColumnModel().getColumn(7).setPreferredWidth(70);
                karyawanTable.getColumnModel().getColumn(8).setPreferredWidth(70);
                karyawanTable.getColumnModel().getColumn(9).setPreferredWidth(150);
                karyawanTable.getColumnModel().getColumn(10).setPreferredWidth(150);
                karyawanTable.getColumnModel().getColumn(11).setPreferredWidth(150);
                karyawanTable.getColumnModel().getColumn(12).setPreferredWidth(150);
                karyawanTable.getColumnModel().getColumn(13).setPreferredWidth(150);
                karyawanTable.getColumnModel().getColumn(14).setPreferredWidth(150);
                karyawanTable.getColumnModel().getColumn(15).setPreferredWidth(150);
                karyawanTable.getColumnModel().getColumn(16).setPreferredWidth(150);
                karyawanTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);


            } catch (SQLException ex) {
                Logger.getLogger(TransaksiDepartmentForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}//GEN-LAST:event_lihatButtonActionPerformed

private void karyawanTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_karyawanTableMouseClicked
    int row = karyawanTable.getSelectedRow();
    String kodegroup = karyawanTable.getValueAt(row, 1).toString();
    String namagroup = karyawanTable.getValueAt(row, 2).toString();
    String kodedepartment = String.valueOf(departmentCombo1.getSelectedItem());
    int bulan = bulanMonthChooser.getMonth() + 1;
    int tahun = tahunYearChooser1.getYear();

    DetailLainDialog detailDialog = null;
    try {
        detailDialog = new DetailLainDialog(this, rootPaneCheckingEnabled, kodegroup, namagroup, bulan, tahun, karyawanTable, kodedepartment);
    } catch (SQLException ex) {
        Logger.getLogger(TransaksiDepartmentForm.class.getName()).log(Level.SEVERE, null, ex);
    }
    detailDialog.setVisible(true);

}//GEN-LAST:event_karyawanTableMouseClicked

    private void departmentCombo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentCombo2ActionPerformed
        // TODO add your handling code here:
        if (departmentCombo2.getSelectedItem() != null) {
            String pilih = String.valueOf(departmentCombo1.getSelectedItem());
            if (pilih != null) {
                try {
                    activeDepartment = DaoFactory.getTranskasiGajiDao().getNamaDepartmentByCode(pilih);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
            //jika ditemukan
            if (activeDepartment != null) {
                nilaiNamaDepartment2.setText(activeDepartment.getNamaDepartment());
                departmentCombo2.requestFocus();

            } else {
                JOptionPane.showMessageDialog(this, "Tidak Ada Department Dengan Code Tersebut", "Error", JOptionPane.ERROR_MESSAGE);
                departmentCombo2.requestFocus();
            }
        }
    }//GEN-LAST:event_departmentCombo2ActionPerformed

    private void departmentCombo2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_departmentCombo2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_departmentCombo2KeyPressed

    private void cetakButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakButtonActionPerformed
        // TODO add your handling code here:
        Date date = new Date();
        if (bulanMonthChooser.getMonth() >= date.getMonth() && tahunYearChooser1.getYear() >= (date.getYear() + 1900)) {
            JOptionPane.showMessageDialog(this, "Data yang diminta belum direkap ", "Error", JOptionPane.ERROR_MESSAGE);
        } else if ((departmentCombo1.getSelectedItem() == null && departmentCombo2.getSelectedItem() == null)
                || (String.valueOf(departmentCombo1.getSelectedItem()).matches("") && String.valueOf(departmentCombo2.getSelectedItem()).matches(""))) {
            JOptionPane.showMessageDialog(this, "Kotak department salah satu harus diisi ", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {

                String dep1 = String.valueOf(departmentCombo1.getSelectedItem());
                String dep2 = String.valueOf(departmentCombo2.getSelectedItem());
                String bln;
                if (bulanMonthChooser.getMonth() + 1 < 10) {
                    bln = tahunYearChooser1.getYear() + "-0" + (bulanMonthChooser.getMonth() + 1);
                } else {
                    bln = tahunYearChooser1.getYear() + "-" + (bulanMonthChooser.getMonth() + 1);
                }
                System.out.println(bln);
                String reportSource = "./report/LaporanGajiTotalDepartment.jasper";
                Map<String, Object> params = new HashMap<String, Object>();
                params.put("kode1", dep1);
                params.put("kode2", dep2);
                params.put("tahun", bln);

                JasperPrint jasperPrint = JasperFillManager.fillReport(reportSource, params, DaoFactory.getConnection());
                JasperViewer.viewReport(jasperPrint, false);
            } catch (JRException ex) {
                Logger.getLogger(TransaksiGajiDepartmentReportForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException SQLex) {
                Logger.getLogger(TransaksiGajiDepartmentReportForm.class.getName()).log(Level.SEVERE, null, SQLex);
            }
        }
    }//GEN-LAST:event_cetakButtonActionPerformed

    private void cetakButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cetakButtonKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cetakButtonKeyPressed
    private void isitable() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TransaksiGajiDepartmentReportForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new TransaksiGajiDepartmentReportForm(null).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TransaksiGajiDepartmentReportForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JMonthChooser bulanMonthChooser;
    private javax.swing.JButton cetakButton;
    private javax.swing.JButton cmdKeluar;
    private javax.swing.JPanel daftarKaryawanPanel;
    private javax.swing.JComboBox departmentCombo1;
    private javax.swing.JComboBox departmentCombo2;
    private javax.swing.JLabel departmentLabel;
    public javax.swing.JDesktopPane desktopPaneTransaksiDepartment;
    private javax.swing.JLabel fungsiLabel;
    private javax.swing.JPanel headPanel;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable karyawanTable;
    private javax.swing.JButton lihatButton;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel menuLabel;
    private javax.swing.JLabel namaDepartmentLabel;
    private javax.swing.JLabel namaKaryawanLabel;
    private javax.swing.JLabel nilaiNamaDepartment1;
    private javax.swing.JLabel nilaiNamaDepartment2;
    private com.sistem.panelstatus.PanelStatus panelStatus1;
    private javax.swing.JLabel sampaiLabel1;
    private javax.swing.JLabel sampaiLabel2;
    private com.toedter.calendar.JYearChooser tahunYearChooser1;
    // End of variables declaration//GEN-END:variables
}
