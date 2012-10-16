package com.presensikaryawan.jamMasukKeluarReport;

import com.dssystem.umum.ComponentFocus;
import com.presensikaryawan.departmentSetting.Department;
import com.presensikaryawan.eventlogReport.*;
import com.presensikaryawan.gajiPerKaryawanReport.*;
import com.presensikaryawan.karyawan.Karyawan;
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
public class JamMasukKeluarReportForm extends javax.swing.JFrame {

    private DaoFactory service;
    private TransaksiDepartment activeTransaksiDepartment;
    private Department activeDepartment;
    GregorianCalendar gc = new GregorianCalendar();
    private JFrame frame;
    private JMenuItem menuItem;

    /**
     * Creates new form masterInventoryGrup
     */
    public JamMasukKeluarReportForm(final JFrame frame, final JMenuItem menuItem) throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        this.frame = frame;
        this.menuItem = menuItem;
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.setEnabled(true);
                menuItem.setEnabled(true);
            }
        });
        UIManager.put("nimbusBase", new Color(204, 204, 255));
//         Tampilan();
//         isitable();
        initComponentFocus();

        List<Karyawan> karyawans = DaoFactory.getGajiPerKaryawanReportDao().getAllNip();
        for (Karyawan k : karyawans) {
            nipCombo.addItem(k.getNip());
            nipCombo2.addItem(k.getNip());
        }

    }

    private void initComponentFocus() {
        nipCombo.addFocusListener(new ComponentFocus(nipCombo));
        lihatButton.addFocusListener(new ComponentFocus(lihatButton));
        nipCombo2.addFocusListener(new ComponentFocus(nipCombo2));
        cetakButton.addFocusListener(new ComponentFocus(cetakButton));
        bulanMonthChooser.addFocusListener(new ComponentFocus(bulanMonthChooser));
        tahunYearChooser1.addFocusListener(new ComponentFocus(tahunYearChooser1));
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
        nipLabel = new javax.swing.JLabel();
        lihatButton = new javax.swing.JButton();
        nipCombo = new javax.swing.JComboBox();
        bulanMonthChooser = new com.toedter.calendar.JMonthChooser();
        tahunYearChooser1 = new com.toedter.calendar.JYearChooser();
        sampaiLabel = new javax.swing.JLabel();
        nipCombo2 = new javax.swing.JComboBox();
        cetakButton = new javax.swing.JButton();
        daftarKaryawanPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        eventlogTable = new javax.swing.JTable();
        headPanel = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        menuLabel = new javax.swing.JLabel();
        fungsiLabel = new javax.swing.JLabel();
        panelStatus1 = new com.sistem.panelstatus.PanelStatus();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Eventlog Report");

        jDesktopPane1.setBackground(new java.awt.Color(153, 255, 153));

        cmdKeluar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cmdKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/24/Exit.gif"))); // NOI18N
        cmdKeluar.setText("Keluar");
        cmdKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdKeluarActionPerformed(evt);
            }
        });
        cmdKeluar.setBounds(900, 560, 110, 40);
        jDesktopPane1.add(cmdKeluar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        inputPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        namaKaryawanLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        namaKaryawanLabel.setText("Bulan");

        nipLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nipLabel.setText("NIP :");

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

        nipCombo.setEditable(true);
        nipCombo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        nipCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nipComboActionPerformed(evt);
            }
        });
        nipCombo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nipComboKeyPressed(evt);
            }
        });

        sampaiLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        sampaiLabel.setText("sampai");

        nipCombo2.setEditable(true);
        nipCombo2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        nipCombo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nipCombo2ActionPerformed(evt);
            }
        });
        nipCombo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nipCombo2KeyPressed(evt);
            }
        });

        cetakButton.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cetakButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/24/Printer.gif"))); // NOI18N
        cetakButton.setText("Cetak");
        cetakButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout inputPanelLayout = new org.jdesktop.layout.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(nipLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(nipCombo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(sampaiLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(nipCombo2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 239, Short.MAX_VALUE)
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(inputPanelLayout.createSequentialGroup()
                        .add(0, 11, Short.MAX_VALUE)
                        .add(lihatButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(cetakButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(inputPanelLayout.createSequentialGroup()
                        .add(namaKaryawanLabel)
                        .add(18, 18, 18)
                        .add(bulanMonthChooser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 109, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(tahunYearChooser1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)))
                .add(25, 25, 25))
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(nipLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(nipCombo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(namaKaryawanLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(sampaiLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(nipCombo2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, tahunYearChooser1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, bulanMonthChooser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lihatButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(cetakButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(142, 142, 142))
        );

        inputPanel.setBounds(0, 70, 1020, 110);
        jDesktopPane1.add(inputPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        daftarKaryawanPanel.setBackground(new java.awt.Color(204, 204, 204));
        daftarKaryawanPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Eventlog"));

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        eventlogTable.setAutoCreateRowSorter(true);
        eventlogTable.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        eventlogTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO", "NIP", "NAMA", "DATELOG", "JAM MASUK", "JAM KELUAR"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(eventlogTable);
        eventlogTable.getColumnModel().getColumn(0).setResizable(false);
        eventlogTable.getColumnModel().getColumn(0).setPreferredWidth(70);
        eventlogTable.getColumnModel().getColumn(1).setResizable(false);
        eventlogTable.getColumnModel().getColumn(1).setPreferredWidth(150);
        eventlogTable.getColumnModel().getColumn(2).setResizable(false);
        eventlogTable.getColumnModel().getColumn(2).setPreferredWidth(200);
        eventlogTable.getColumnModel().getColumn(3).setResizable(false);
        eventlogTable.getColumnModel().getColumn(3).setPreferredWidth(120);
        eventlogTable.getColumnModel().getColumn(4).setResizable(false);
        eventlogTable.getColumnModel().getColumn(4).setPreferredWidth(150);
        eventlogTable.getColumnModel().getColumn(5).setResizable(false);
        eventlogTable.getColumnModel().getColumn(5).setPreferredWidth(150);

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
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 295, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 48, Short.MAX_VALUE))
        );

        daftarKaryawanPanel.setBounds(0, 180, 1020, 370);
        jDesktopPane1.add(daftarKaryawanPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        headPanel.setBackground(new java.awt.Color(255, 255, 255));

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logosimtel.jpg"))); // NOI18N

        menuLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        menuLabel.setText("Menu Cetak Daftar Jam Masuk dan Keluar Per Karyawan");

        fungsiLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        fungsiLabel.setText("Digunakan untuk mencetak daftar jam masuk dan keluar per karyawan per bulan");

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
                .addContainerGap(467, Short.MAX_VALUE))
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
        jDesktopPane1.add(headPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelStatus1.setBounds(0, 620, 1020, 50);
        jDesktopPane1.add(panelStatus1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jDesktopPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 1021, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jDesktopPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1037)/2, (screenSize.height-712)/2, 1037, 712);
    }// </editor-fold>//GEN-END:initComponents

private void cmdKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdKeluarActionPerformed
    frame.setEnabled(true);
    menuItem.setEnabled(true);
    this.dispose();

}//GEN-LAST:event_cmdKeluarActionPerformed

private void nipComboKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nipComboKeyPressed
    if (evt.getKeyCode() == 10) {
    }
}//GEN-LAST:event_nipComboKeyPressed

private void nipComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nipComboActionPerformed
    if (nipCombo.getSelectedItem() != null) {
        nipCombo2.requestFocus();
    }
}//GEN-LAST:event_nipComboActionPerformed

private void lihatButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lihatButtonKeyPressed
    lihatButton.doClick();// TODO add your handling code here:
}//GEN-LAST:event_lihatButtonKeyPressed

private void lihatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lihatButtonActionPerformed
    String department = nipCombo.getSelectedItem().toString();
    int bulan = bulanMonthChooser.getMonth() + 1;
    int tahun = tahunYearChooser1.getYear();
    Date date = new Date();
    if (bulanMonthChooser.getMonth() >= date.getMonth() && tahunYearChooser1.getYear() >= (date.getYear() + 1900)) {
        JOptionPane.showMessageDialog(this, "Data yang diminta belum direkap ", "Error", JOptionPane.ERROR_MESSAGE);
    } else if ((nipCombo.getSelectedItem() == null && nipCombo2.getSelectedItem() == null)
            || (String.valueOf(nipCombo.getSelectedItem()).matches("") && String.valueOf(nipCombo2.getSelectedItem()).matches(""))) {
        JOptionPane.showMessageDialog(this, "Field nip harus diisi ", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        String nip1a = String.valueOf(nipCombo.getSelectedItem());
        String nip2a = String.valueOf(nipCombo2.getSelectedItem());
        Karyawan karyawan = null, karyawan1 = null;
        try {
            karyawan = DaoFactory.getKaryawanDao().getByNIPKaryawan(nip1a);
            karyawan1 = DaoFactory.getKaryawanDao().getByNIPKaryawan(nip2a);
        } catch (SQLException ex) {
            Logger.getLogger(GajiPerKaryawanReportForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (karyawan == null) {
            JOptionPane.showMessageDialog(this, "Pegawai dengan NIP seperti \n di kotak I tidak ada", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (karyawan1 == null) {
            JOptionPane.showMessageDialog(this, "Pegawai dengan NIP seperti \n di kotak II tidak ada", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            gc.set(tahunYearChooser1.getYear(), bulanMonthChooser.getMonth(), date.getDate());
            String day = String.valueOf(gc.getActualMaximum(GregorianCalendar.DAY_OF_MONTH));
            String bulanTahun;
            String nip1 = String.valueOf(nipCombo.getSelectedItem());
            String nip2 = String.valueOf(nipCombo2.getSelectedItem());
            if (bulan < 10) {
                bulanTahun = tahun + "-0" + bulan;
            } else {
                bulanTahun = tahun + "-" + bulan;
            }
            if (nip1.compareTo(nip2) > 0) {
                String nipTemp = nip1;
                nip1 = nip2;
                nip2 = nipTemp;
            }
            try {
                List<JamMasukKeluarReport> jamMasukKeluarReports = DaoFactory.getJamMasukKeluarReportDao().getJamMasukKeluarReport(nip1, nip2, bulanTahun);
                JamMasukKeluarTableModel model = new JamMasukKeluarTableModel(jamMasukKeluarReports);
              
                eventlogTable.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(TransaksiDepartmentForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}//GEN-LAST:event_lihatButtonActionPerformed

    private void nipCombo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nipCombo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nipCombo2ActionPerformed

    private void nipCombo2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nipCombo2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_nipCombo2KeyPressed

    private void cetakButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakButtonActionPerformed
        Date date = new Date();
        if (bulanMonthChooser.getMonth() >= date.getMonth() && tahunYearChooser1.getYear() >= (date.getYear() + 1900)) {
            JOptionPane.showMessageDialog(this, "Data yang diminta belum direkap ", "Error", JOptionPane.ERROR_MESSAGE);
        } else if ((nipCombo.getSelectedItem() == null && nipCombo2.getSelectedItem() == null)
                || (String.valueOf(nipCombo.getSelectedItem()).matches("") && String.valueOf(nipCombo2.getSelectedItem()).matches(""))) {
            JOptionPane.showMessageDialog(this, "Field nip harus diisi ", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            String nip1a = String.valueOf(nipCombo.getSelectedItem());
            String nip2a = String.valueOf(nipCombo2.getSelectedItem());
            Karyawan karyawan = null, karyawan1 = null;
            try {
                karyawan = DaoFactory.getKaryawanDao().getByNIPKaryawan(nip1a);
                karyawan1 = DaoFactory.getKaryawanDao().getByNIPKaryawan(nip2a);
            } catch (SQLException ex) {
                Logger.getLogger(GajiPerKaryawanReportForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (karyawan == null) {
                JOptionPane.showMessageDialog(this, "Pegawai dengan NIP seperti \n di kotak I tidak ada", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if (karyawan1 == null) {
                JOptionPane.showMessageDialog(this, "Pegawai dengan NIP seperti \n di kotak II tidak ada", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    // TODO add your handling code here:
                    String bulanS = null;
                    switch (bulanMonthChooser.getMonth()) {
                        case 0:
                            bulanS = "JANUARI";
                            break;
                        case 1:
                            bulanS = "FEBRUARI";
                            break;
                        case 2:
                            bulanS = "MARET";
                            break;
                        case 3:
                            bulanS = "APRIL";
                            break;
                        case 4:
                            bulanS = "MEI";
                            break;
                        case 5:
                            bulanS = "JUNI";
                            break;
                        case 6:
                            bulanS = "JULI";
                            break;
                        case 7:
                            bulanS = "AGUSTUS";
                            break;
                        case 8:
                            bulanS = "SEPTEMBER";
                            break;
                        case 9:
                            bulanS = "OKTOBER";
                            break;
                        case 10:
                            bulanS = "NOVEMBER";
                            break;
                        case 11:
                            bulanS = "DESEMBER";
                            break;
                    }
                    
                    String bulanTahun;
                    int bulan = bulanMonthChooser.getMonth() + 1;
                    int tahun = tahunYearChooser1.getYear();
                    if (bulan < 10) {
                        bulanTahun = tahun + "-0" + bulan;
                    } else {
                        bulanTahun = tahun + "-" + bulan;
                    }
                    String reportSource = "./report/keluar_masuk.jasper";
                    Map<String, Object> params = new HashMap<String, Object>();
                    params.put("bulan", bulanTahun);
                    params.put("bulanString", bulanS);
                    params.put("nip1", String.valueOf(nipCombo.getSelectedItem()));
                    params.put("nip2", String.valueOf(nipCombo2.getSelectedItem()));
                    JasperPrint jasperPrint = JasperFillManager.fillReport(reportSource, params, DaoFactory.getConnection());
                    JasperViewer.viewReport(jasperPrint, false);
                } catch (SQLException ex) {
                    Logger.getLogger(GajiPerKaryawanReportForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (JRException ex) {
                    Logger.getLogger(GajiPerKaryawanReportForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_cetakButtonActionPerformed
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
            Logger.getLogger(JamMasukKeluarReportForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new JamMasukKeluarReportForm(null, null).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(JamMasukKeluarReportForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JMonthChooser bulanMonthChooser;
    private javax.swing.JButton cetakButton;
    private javax.swing.JButton cmdKeluar;
    private javax.swing.JPanel daftarKaryawanPanel;
    private javax.swing.JTable eventlogTable;
    private javax.swing.JLabel fungsiLabel;
    private javax.swing.JPanel headPanel;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lihatButton;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel menuLabel;
    private javax.swing.JLabel namaKaryawanLabel;
    private javax.swing.JComboBox nipCombo;
    private javax.swing.JComboBox nipCombo2;
    private javax.swing.JLabel nipLabel;
    private com.sistem.panelstatus.PanelStatus panelStatus1;
    private javax.swing.JLabel sampaiLabel;
    private com.toedter.calendar.JYearChooser tahunYearChooser1;
    // End of variables declaration//GEN-END:variables
}
