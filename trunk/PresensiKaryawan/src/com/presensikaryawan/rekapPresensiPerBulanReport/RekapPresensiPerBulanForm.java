package com.presensikaryawan.rekapPresensiPerBulanReport;

import com.presensikaryawan.rekapPresensi.*;
import com.dssystem.umum.ComponentFocus;
import com.presensikaryawan.departmentSetting.Department;
import com.presensikaryawan.detailpresensikaryawan.DetailPresensiDialog;
import com.presensikaryawan.karyawan.Karyawan;
import com.presensikaryawan.posisi.*;
import com.presensikaryawan.tools.DaoFactory;
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
import net.sf.jasperreports.view.JasperViewer;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;

/*
 * masterInventoryGrup.java
 *
 * Created on October 21, 2006, 10:06 AM
 */
/**
 *
 * @author Als
 */
public class RekapPresensiPerBulanForm extends javax.swing.JFrame {

    private Posisi activePosisi;
    private Department activeDepartment;

    /**
     * Creates new form masterInventoryGrup
     */
    public RekapPresensiPerBulanForm() throws SQLException {
        initComponents();
        UIManager.put("nimbusBase", new Color(204, 204, 255));

        initComponentFocus();
        List<Department> departments = DaoFactory.getRekapPresensiDao().getAllDepartments();
        for (Department d : departments) {
            departmentCombo.addItem(d.getKodeDepartment());
        }
        rekapTable.setVisible(false);
    }

    private void initComponentFocus() {
        monthChooser.addFocusListener(new ComponentFocus(monthChooser));
        yearChooser.addFocusListener(new ComponentFocus(yearChooser));
        departmentCombo.addFocusListener(new ComponentFocus(departmentCombo));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        panelStatus1 = new com.sistem.panelstatus.PanelStatus();
        inputPanel = new javax.swing.JPanel();
        bulanLabel = new javax.swing.JLabel();
        monthChooser = new com.toedter.calendar.JMonthChooser();
        yearChooser = new com.toedter.calendar.JYearChooser();
        lihatButton = new javax.swing.JButton();
        cetakButton = new javax.swing.JButton();
        departmentLabel = new javax.swing.JLabel();
        departmentCombo = new javax.swing.JComboBox();
        namaDepartmentLabel = new javax.swing.JLabel();
        nilaiNamaDepartment = new javax.swing.JLabel();
        posisiPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rekapTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        headPanel = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        menuLabel = new javax.swing.JLabel();
        fungsiLabel = new javax.swing.JLabel();
        keluarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Data Kategori");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jDesktopPane1.setBackground(new java.awt.Color(153, 255, 153));
        jDesktopPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelStatus1.setBounds(0, 600, 1020, 50);
        jDesktopPane1.add(panelStatus1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        inputPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        bulanLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        bulanLabel.setText("Bulan :");

        lihatButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/24/Search.gif"))); // NOI18N
        lihatButton.setText("Lihat");
        lihatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lihatButtonActionPerformed(evt);
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

        departmentLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        departmentLabel.setText("Kode Department");

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
            .add(org.jdesktop.layout.GroupLayout.TRAILING, inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(inputPanelLayout.createSequentialGroup()
                        .add(0, 742, Short.MAX_VALUE)
                        .add(lihatButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(cetakButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(inputPanelLayout.createSequentialGroup()
                        .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(namaDepartmentLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(departmentLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 114, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(departmentCombo, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(nilaiNamaDepartment, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 425, Short.MAX_VALUE)
                        .add(bulanLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(monthChooser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(yearChooser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(26, 26, 26))
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(inputPanelLayout.createSequentialGroup()
                        .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(bulanLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                .add(monthChooser, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(yearChooser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 92, Short.MAX_VALUE)
                        .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(lihatButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(cetakButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(inputPanelLayout.createSequentialGroup()
                        .add(1, 1, 1)
                        .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(departmentLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(departmentCombo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(namaDepartmentLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(nilaiNamaDepartment, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        inputPanel.setBounds(0, 70, 1020, 190);
        jDesktopPane1.add(inputPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        posisiPanel.setBackground(new java.awt.Color(204, 204, 204));
        posisiPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Daftar Posisi"));

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        rekapTable.setAutoCreateRowSorter(true);
        rekapTable.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        rekapTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "NIP", "Nama", "Jum. S", "Jum. I", "Jum. A", "Jum. T", "Jum. M"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(rekapTable);
        rekapTable.getColumnModel().getColumn(0).setResizable(false);
        rekapTable.getColumnModel().getColumn(0).setPreferredWidth(50);
        rekapTable.getColumnModel().getColumn(1).setResizable(false);
        rekapTable.getColumnModel().getColumn(1).setPreferredWidth(150);
        rekapTable.getColumnModel().getColumn(2).setResizable(false);
        rekapTable.getColumnModel().getColumn(2).setPreferredWidth(200);
        rekapTable.getColumnModel().getColumn(3).setResizable(false);
        rekapTable.getColumnModel().getColumn(3).setPreferredWidth(100);
        rekapTable.getColumnModel().getColumn(4).setResizable(false);
        rekapTable.getColumnModel().getColumn(4).setPreferredWidth(100);
        rekapTable.getColumnModel().getColumn(5).setResizable(false);
        rekapTable.getColumnModel().getColumn(5).setPreferredWidth(100);
        rekapTable.getColumnModel().getColumn(6).setResizable(false);
        rekapTable.getColumnModel().getColumn(6).setPreferredWidth(100);
        rekapTable.getColumnModel().getColumn(7).setResizable(false);
        rekapTable.getColumnModel().getColumn(7).setPreferredWidth(100);

        org.jdesktop.layout.GroupLayout posisiPanelLayout = new org.jdesktop.layout.GroupLayout(posisiPanel);
        posisiPanel.setLayout(posisiPanelLayout);
        posisiPanelLayout.setHorizontalGroup(
            posisiPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 1008, Short.MAX_VALUE)
        );
        posisiPanelLayout.setVerticalGroup(
            posisiPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(posisiPanelLayout.createSequentialGroup()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 250, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 3, Short.MAX_VALUE))
        );

        posisiPanel.setBounds(0, 260, 1020, 280);
        jDesktopPane1.add(posisiPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        headPanel.setBackground(new java.awt.Color(255, 255, 255));

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logosimtel.jpg"))); // NOI18N

        menuLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        menuLabel.setText("Menu Cetak Rekap Presensi Karyawan per Bulan");

        fungsiLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        fungsiLabel.setText("Digunakan mencetak rekap presensi karyawan per bulan");

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

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 1020, Short.MAX_VALUE)
            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel1Layout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(headPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 77, Short.MAX_VALUE)
            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel1Layout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(headPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.setBounds(0, 0, 1020, 70);
        jDesktopPane1.add(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        keluarButton.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        keluarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/24/Exit.gif"))); // NOI18N
        keluarButton.setText("Keluar");
        keluarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarButtonActionPerformed(evt);
            }
        });
        keluarButton.setBounds(900, 550, 110, 40);
        jDesktopPane1.add(keluarButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jDesktopPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 1020, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jDesktopPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        jDesktopPane1.getAccessibleContext().setAccessibleName("");
        jDesktopPane1.getAccessibleContext().setAccessibleDescription("");

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1036)/2, (screenSize.height-688)/2, 1036, 688);
    }// </editor-fold>//GEN-END:initComponents

    private void isitable() {
    }

    private void cetakButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakButtonActionPerformed
        if (rekapTable.isVisible()) {
            try {
                String bulanS = null;
                String bulan = null;
                switch (monthChooser.getMonth()) {
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
                bulanS = bulanS + " " + String.valueOf(yearChooser.getYear());
                if(monthChooser.getMonth()+1<10)
                bulan = yearChooser.getYear()+"-0"+(monthChooser.getMonth()+1);
                else
                  bulan = yearChooser.getYear()+"-"+(monthChooser.getMonth()+1);  
                String reportSource = "./report/RekapPresensiKaryawan.jasper";
                Map<String, Object> params = new HashMap<String, Object>();
                params.put("bulanString", bulanS);
                params.put("bulan", bulan);
                params.put("department", String.valueOf(departmentCombo.getSelectedItem()));
                params.put("nip1", bulan);
                params.put("nip2", bulan);
                JasperPrint jasperPrint = JasperFillManager.fillReport(reportSource, params, DaoFactory.getConnection());
                JasperViewer.viewReport(jasperPrint, false);
            } catch (SQLException ex) {
                Logger.getLogger(RekapPresensiPerBulanForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (JRException ex) {
                Logger.getLogger(RekapPresensiForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Maaf Anda Harus Menampilkan Hasil Rekap\n"+
                    "Dengan Menekan Tombol Lihat Dahulu","PEMBERITAHUAN",JOptionPane.INFORMATION_MESSAGE);
        }

}//GEN-LAST:event_cetakButtonActionPerformed

    private void lihatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lihatButtonActionPerformed
        // TODO add your handling code here:
        Date date = new Date();
//        if (monthChooser.getMonth() >= date.getMonth() && yearChooser.getYear() >= (date.getYear() + 1900)) {
//            JOptionPane.showMessageDialog(this, "Data yang diminta belum direkap ", "Error", JOptionPane.ERROR_MESSAGE);
//        } else {
        GregorianCalendar gc = new GregorianCalendar();
        gc.set(yearChooser.getYear(), monthChooser.getMonth(), date.getDate());
        String year = String.valueOf(yearChooser.getYear());
        String month = String.valueOf(monthChooser.getMonth() + 1);
        String day = String.valueOf(gc.getActualMaximum(GregorianCalendar.DAY_OF_MONTH));
        String maxDayOfMonth = year + "-" + month + "-" + day;

        String kode_department = String.valueOf(departmentCombo.getSelectedItem());
        try {
            List<Karyawan> karyawans = DaoFactory.getRekapPresensiPerBulanDao().getAllKaryawanByDepartmentCode(kode_department);
            while (!karyawans.isEmpty()) {
                Karyawan karyawan = karyawans.remove(0);
                DaoFactory.getRekapPresensiPerBulanDao().callInsertAlfa(maxDayOfMonth, karyawan.getNip());
            }
            List<RekapPresensiPerBulan> rekapPresensiPerBulans = DaoFactory.getRekapPresensiPerBulanDao().callGetPresensi(month, year, kode_department);
            RekapPresensiPerBulanTableModel model = new RekapPresensiPerBulanTableModel(rekapPresensiPerBulans);
            rekapTable.setModel(model);
            rekapTable.setVisible(true);
        } catch (SQLException ex) {
//            }
        }
    }//GEN-LAST:event_lihatButtonActionPerformed

    private void keluarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_keluarButtonActionPerformed

    private void departmentComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentComboActionPerformed
        // TODO add your handling code here:
        if (departmentCombo.getSelectedItem() != null) {
            String pilih = String.valueOf(departmentCombo.getSelectedItem());
            if (pilih != null) {
                try {
                    activeDepartment = DaoFactory.getRekapPresensiDao().getNamaDepartmentByCode(pilih);
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

    private void departmentComboKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_departmentComboKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_departmentComboKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
            //UIManager.setLookAndFeel(new smooth.windows.SmoothLookAndFeel());

        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(RekapPresensiPerBulanForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new RekapPresensiPerBulanForm().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(RekapPresensiPerBulanForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bulanLabel;
    private javax.swing.JButton cetakButton;
    private javax.swing.JComboBox departmentCombo;
    private javax.swing.JLabel departmentLabel;
    private javax.swing.JLabel fungsiLabel;
    private javax.swing.JPanel headPanel;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton keluarButton;
    private javax.swing.JButton lihatButton;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel menuLabel;
    private com.toedter.calendar.JMonthChooser monthChooser;
    private javax.swing.JLabel namaDepartmentLabel;
    private javax.swing.JLabel nilaiNamaDepartment;
    private com.sistem.panelstatus.PanelStatus panelStatus1;
    private javax.swing.JPanel posisiPanel;
    private javax.swing.JTable rekapTable;
    private com.toedter.calendar.JYearChooser yearChooser;
    // End of variables declaration//GEN-END:variables
}
