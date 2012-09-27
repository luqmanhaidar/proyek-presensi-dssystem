package com.presensikaryawan.transaksiDepartment;

import com.presensikaryawan.tools.DaoFactory;
import com.dssystem.umum.ComponentFocus;
import com.presensikaryawan.departmentSetting.Department;
import com.presensikaryawan.departmentSetting.DepartmentDao;
//import com.presensikaryawan.detailtransaksidepartment.DetailLainDialog;
import com.presensikaryawan.detailtransaksidepartment.DetailLainDialog;
import com.presensikaryawan.golongan.Golongan;
import com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.Color;
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
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
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
public class TransaksiDepartmentForm extends javax.swing.JFrame {

    private DaoFactory service;
    private TransaksiDepartment activeTransaksiDepartment;
    private Department activeDepartment;
    GregorianCalendar gc = new GregorianCalendar();

    /**
     * Creates new form masterInventoryGrup
     */
    public TransaksiDepartmentForm() throws SQLException {
        initComponents();
        UIManager.put("nimbusBase", new Color(204, 204, 255));
//        UIManager.put("nimbusControl",new Color(153,255,153));
//        UIManager.put("nimbusBlueGrey", new Color(204,204,255));
//        Tampilan();
        // isitable();
        initComponentFocus();
//        tanggalMasukDateChooser.setDate(gc.getTime());
//        namaKaryawanTextField.setDocument(new ChangeCase().getToUpperCase());
//        alamatKaryawanTextField.setDocument(new ChangeCase().getToUpperCase());
//        KaryawanDao dao = DaoFactory.getKaryawanDao();
//        List<Karyawan> karyawans = dao.getAllKaryawan();
//        KaryawanTableModel model = new KaryawanTableModel(karyawans);
//        karyawanTable.setModel(model);
//        for (Karyawan k : karyawans) {
//            departmentCombo.addItem(k.getNip());
//        }
//        GolonganDao dao1 = DaoFactory.getGolonganDao();
//        List<Golongan> golongans = dao1.getAllGolongan();
//        KaryawanTableModel model = new KaryawanTableModel(karyawans);
//        karyawanTable.setModel(model);
//        for (Golongan g : golongans) {
//            golonganCombo.addItem(g.getKodeGolongan() + "-" + g.getNamaGolongan());
//        }
//        PosisiDao dao2 = DaoFactory.getPosisiDao();
//        List<Posisi> posisis = dao2.getAllPosisi();
//        for (Posisi p : posisis) {
//            posisiCombo.addItem(p.getKode_posisi() + "-" + p.getNama_posisi());
//            
//        }
//        OutletDao dao3 = DaoFactory.getOutletDao();
//        List<Outlet> outlets = dao3.getAllOutlet();
//        for (Outlet o : outlets) {
//            outletCombo.addItem(o.getKodeOutlet() + "-" + o.getNamaOutlet());
//        }
        DepartmentDao dao4 = DaoFactory.getDepartmentDao();
        List<Department> departments = dao4.getAllDepartment();
        for (Department d : departments) {
            departmentCombo.addItem(d.getKodeDepartment());
        }

    }

    private void initComponentFocus() {
//        namaKaryawanTextField.addFocusListener(new ComponentFocus(namaKaryawanTextField));
//        alamatKaryawanTextField.addFocusListener(new ComponentFocus(alamatKaryawanTextField));
        departmentCombo.addFocusListener(new ComponentFocus(departmentCombo));
        lihatButton.addFocusListener(new ComponentFocus(lihatButton));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        cmdKeluar = new javax.swing.JButton();
        inputPanel = new javax.swing.JPanel();
        namaKaryawanLabel = new javax.swing.JLabel();
        departmentLabel = new javax.swing.JLabel();
        lihatButton = new javax.swing.JButton();
        departmentCombo = new javax.swing.JComboBox();
        bulanMonthChooser = new com.toedter.calendar.JMonthChooser();
        tahunYearChooser1 = new com.toedter.calendar.JYearChooser();
        namaDepartmentLabel = new javax.swing.JLabel();
        nilaiNamaDepartment = new javax.swing.JLabel();
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

        jDesktopPane1.setBackground(new java.awt.Color(153, 255, 153));

        cmdKeluar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cmdKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/24/Exit.gif"))); // NOI18N
        cmdKeluar.setText("Keluar");
        cmdKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdKeluarActionPerformed(evt);
            }
        });
        cmdKeluar.setBounds(790, 510, 110, 40);
        jDesktopPane1.add(cmdKeluar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        inputPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        namaKaryawanLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        namaKaryawanLabel.setText("Bulan");

        departmentLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        departmentLabel.setText("Department");

        lihatButton.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lihatButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/24/Search.gif"))); // NOI18N
        lihatButton.setMnemonic('S');
        lihatButton.setText("Lihat");
        lihatButton.setToolTipText("Klik Untuk Simpan");
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

        departmentCombo.setEditable(true);
        departmentCombo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        departmentCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentComboActionPerformed(evt);
            }
        });
        departmentCombo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                departmentComboKeyPressed(evt);
            }
        });

        namaDepartmentLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        namaDepartmentLabel.setText("Nama Department");

        nilaiNamaDepartment.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nilaiNamaDepartment.setText("Nilai Nama Department");

        org.jdesktop.layout.GroupLayout inputPanelLayout = new org.jdesktop.layout.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(inputPanelLayout.createSequentialGroup()
                        .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(inputPanelLayout.createSequentialGroup()
                                .add(departmentLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(28, 28, 28))
                            .add(namaDepartmentLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(inputPanelLayout.createSequentialGroup()
                                .add(departmentCombo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(273, 273, 273)
                                .add(namaKaryawanLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(bulanMonthChooser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 109, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(18, 18, 18)
                                .add(tahunYearChooser1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                                .add(25, 25, 25))
                            .add(inputPanelLayout.createSequentialGroup()
                                .add(nilaiNamaDepartment, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
                                .addContainerGap())))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, inputPanelLayout.createSequentialGroup()
                        .add(lihatButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(30, 30, 30))))
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(departmentLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(departmentCombo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, tahunYearChooser1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, namaKaryawanLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, bulanMonthChooser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(namaDepartmentLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(nilaiNamaDepartment, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 30, Short.MAX_VALUE)
                .add(lihatButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(22, 22, 22))
        );

        inputPanel.setBounds(0, 70, 920, 170);
        jDesktopPane1.add(inputPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        daftarKaryawanPanel.setBackground(new java.awt.Color(204, 204, 204));
        daftarKaryawanPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Daftar Karyawan"));

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        karyawanTable.setAutoCreateRowSorter(true);
        karyawanTable.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        karyawanTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NO", "NIP", "NAMA", "M", "S", "I", "A", "T", "L", "POKOK", "MAKAN", "HADIR", "LEMBUR", "LAIN", "P. TELAT", "P. LAIN", "TOTAL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        karyawanTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                karyawanTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(karyawanTable);

        org.jdesktop.layout.GroupLayout daftarKaryawanPanelLayout = new org.jdesktop.layout.GroupLayout(daftarKaryawanPanel);
        daftarKaryawanPanel.setLayout(daftarKaryawanPanelLayout);
        daftarKaryawanPanelLayout.setHorizontalGroup(
            daftarKaryawanPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, daftarKaryawanPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
                .addContainerGap())
        );
        daftarKaryawanPanelLayout.setVerticalGroup(
            daftarKaryawanPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(daftarKaryawanPanelLayout.createSequentialGroup()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        daftarKaryawanPanel.setBounds(0, 240, 920, 240);
        jDesktopPane1.add(daftarKaryawanPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

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
                .addContainerGap(419, Short.MAX_VALUE))
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

        headPanel.setBounds(0, 0, 920, 77);
        jDesktopPane1.add(headPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelStatus1.setBounds(0, 570, 920, 50);
        jDesktopPane1.add(panelStatus1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jDesktopPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 919, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jDesktopPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-935)/2, (screenSize.height-655)/2, 935, 655);
    }// </editor-fold>//GEN-END:initComponents

private void cmdKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdKeluarActionPerformed

    this.dispose();
}//GEN-LAST:event_cmdKeluarActionPerformed

private void departmentComboKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_departmentComboKeyPressed
    if (evt.getKeyCode() == 10) {
    }
}//GEN-LAST:event_departmentComboKeyPressed

private void departmentComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentComboActionPerformed
    if (departmentCombo.getSelectedItem() != null) {
        String pilih = String.valueOf(departmentCombo.getSelectedItem());
        if (pilih != null) {
            try {
                activeDepartment = DaoFactory.getTranskasiGajiDao().getNamaDepartmentByCode(pilih);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        //jika ditemukan
        if (activeDepartment != null) {
            nilaiNamaDepartment.setText(activeDepartment.getNamaDepartment());
            departmentCombo.requestFocus();

        } else {
            JOptionPane.showMessageDialog(this, "Tidak Ada Department Dengan Code Tersebut", "Error", JOptionPane.ERROR_MESSAGE);
            departmentCombo.requestFocus();
        }
    }
}//GEN-LAST:event_departmentComboActionPerformed

private void lihatButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lihatButtonKeyPressed
    lihatButton.doClick();// TODO add your handling code here:
}//GEN-LAST:event_lihatButtonKeyPressed

private void lihatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lihatButtonActionPerformed
    String department = departmentCombo.getSelectedItem().toString();
    int bulan = bulanMonthChooser.getMonth() + 1;
    int tahun = tahunYearChooser1.getYear();
    Date date = new Date();
//        if (monthChooser.getMonth() >= date.getMonth() && yearChooser.getYear() >= (date.getYear() + 1900)) {
//            JOptionPane.showMessageDialog(this, "Data yang diminta belum direkap ", "Error", JOptionPane.ERROR_MESSAGE);
//        } else {
//            GregorianCalendar gc = new GregorianCalendar();
    gc.set(tahunYearChooser1.getYear(), bulanMonthChooser.getMonth(), date.getDate());
//            String year = String.valueOf(yearChooser.getYear());
//            String month = String.valueOf(monthChooser.getMonth() + 1);
    String day = String.valueOf(gc.getActualMaximum(GregorianCalendar.DAY_OF_MONTH));
    String maxDayOfMonth;
    if (bulan < 10) {
        maxDayOfMonth = tahun + "-0" + bulan + "-" + day;
    } else {
        maxDayOfMonth = tahun + "-" + bulan + "-" + day;
    }
    System.out.println(maxDayOfMonth);
//    System.out.println(department+" "+bulan+" "+ tahun);
    try {
        TransaksiDepartmentDao dao = DaoFactory.getTransaksiDepartmentDao();
//        List<TransaksiDepartment> transaksiDepartments = dao.getAllTransaksiDepartment(department, bulan, tahun);
        List<TransaksiDepartment> transaksiDepartments = dao.getAllTransaksiDepartment(department, maxDayOfMonth);

        TransaksiDepartmentTableModel model = new TransaksiDepartmentTableModel(transaksiDepartments);
        karyawanTable.setModel(model);


    } catch (SQLException ex) {
        Logger.getLogger(TransaksiDepartmentForm.class.getName()).log(Level.SEVERE, null, ex);
    }
}//GEN-LAST:event_lihatButtonActionPerformed

private void karyawanTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_karyawanTableMouseClicked
    int row = karyawanTable.getSelectedRow();
    String kodegroup = karyawanTable.getValueAt(row, 1).toString();
    String namagroup = karyawanTable.getValueAt(row, 2).toString();
    String kodedepartment = String.valueOf(departmentCombo.getSelectedItem());
    int bulan = bulanMonthChooser.getMonth() + 1;
//        if (bulanMonthChooser.getMonth() + 1 < 10) {
//            bulan = "0" + String.valueOf(bulanMonthChooser.getMonth() + 1);
//        } else {
//            bulan = String.valueOf(bulanMonthChooser.getMonth() + 1);
//        }
    int tahun = tahunYearChooser1.getYear();

    DetailLainDialog detailDialog = null;
    try {
        detailDialog = new DetailLainDialog(this, rootPaneCheckingEnabled, kodegroup, namagroup, bulan, tahun, karyawanTable, kodedepartment);
    } catch (SQLException ex) {
        Logger.getLogger(TransaksiDepartmentForm.class.getName()).log(Level.SEVERE, null, ex);
    }
    detailDialog.setVisible(true);

}//GEN-LAST:event_karyawanTableMouseClicked
    private void isitable() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
            //UIManager.setLookAndFeel(new smooth.windows.SmoothLookAndFeel());

        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TransaksiDepartmentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new TransaksiDepartmentForm().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TransaksiDepartmentForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JMonthChooser bulanMonthChooser;
    private javax.swing.JButton cmdKeluar;
    private javax.swing.JPanel daftarKaryawanPanel;
    private javax.swing.JComboBox departmentCombo;
    private javax.swing.JLabel departmentLabel;
    private javax.swing.JLabel fungsiLabel;
    private javax.swing.JPanel headPanel;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable karyawanTable;
    private javax.swing.JButton lihatButton;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel menuLabel;
    private javax.swing.JLabel namaDepartmentLabel;
    private javax.swing.JLabel namaKaryawanLabel;
    private javax.swing.JLabel nilaiNamaDepartment;
    private com.sistem.panelstatus.PanelStatus panelStatus1;
    private com.toedter.calendar.JYearChooser tahunYearChooser1;
    // End of variables declaration//GEN-END:variables
}
