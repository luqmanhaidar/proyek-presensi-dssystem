package com.presensikaryawan.rekapHistoriGaji;

import com.dssystem.umum.ComponentFocus;
import com.presensikaryawan.departmentSetting.Department;
import com.presensikaryawan.karyawan.Karyawan;
import com.presensikaryawan.posisi.*;
import com.presensikaryawan.rekapPresensi.*;
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
public class RekapGajiForm extends javax.swing.JFrame {

    private Karyawan activeKaryawan;
    private Department activeDepartment;

    /**
     * Creates new form masterInventoryGrup
     */
    public RekapGajiForm() throws SQLException {
        initComponents();
        UIManager.put("nimbusBase", new Color(204, 204, 255));

        initComponentFocus();
        List<Department> departments = DaoFactory.getDepartmentDao().getAllDepartment();
        for (Department d : departments) {
            departmentCombo.addItem(d.getKodeDepartment());
        }
        String kode_department = String.valueOf(departmentCombo.getSelectedItem());
//        List<Karyawan> karyawans = DaoFactory.getRekapGajiDao().getNIPByKodeDepartment(kode_department);
//        for (Karyawan k : karyawans) {
//            nipCombo.addItem(k.getNip());
//        }

    }

    private void initComponentFocus() {
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
        cetakButton = new javax.swing.JButton();
        inputPanel = new javax.swing.JPanel();
        tahunLabel = new javax.swing.JLabel();
        yearChooser = new com.toedter.calendar.JYearChooser();
        departmentLabel = new javax.swing.JLabel();
        departmentCombo = new javax.swing.JComboBox();
        namaDepartmentLabel = new javax.swing.JLabel();
        nilaiNamaDepartment = new javax.swing.JLabel();
        prosesButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        nipLabel = new javax.swing.JLabel();
        nipCombo = new javax.swing.JComboBox();
        namaKaryawanLabel = new javax.swing.JLabel();
        nilaiNamaKaryawan = new javax.swing.JLabel();
        namaKaryawanLabel1 = new javax.swing.JLabel();
        nilaiGolonganLabel = new javax.swing.JLabel();
        posisiPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rekapTable = new javax.swing.JTable();
        totalLabel = new javax.swing.JLabel();
        nilaiTotalLabel = new javax.swing.JLabel();
        headPanel9 = new javax.swing.JPanel();
        logoLabel9 = new javax.swing.JLabel();
        menuLabel9 = new javax.swing.JLabel();
        fungsiLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Data Kategori");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jDesktopPane1.setBackground(new java.awt.Color(153, 255, 153));
        jDesktopPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelStatus1.setBounds(0, 610, 1020, 50);
        jDesktopPane1.add(panelStatus1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        cetakButton.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cetakButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/24/Printer.gif"))); // NOI18N
        cetakButton.setText("Cetak");
        cetakButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakButtonActionPerformed(evt);
            }
        });
        cetakButton.setBounds(900, 560, 110, 40);
        jDesktopPane1.add(cetakButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        inputPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tahunLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tahunLabel.setText("Tahun :");

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

        prosesButton.setText("Proses");
        prosesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prosesButtonActionPerformed(evt);
            }
        });

        nipLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nipLabel.setText("NIP");

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

        namaKaryawanLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        namaKaryawanLabel.setText("Nama Karyawan");

        nilaiNamaKaryawan.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nilaiNamaKaryawan.setText("nilai Nama Karyawan");

        namaKaryawanLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        namaKaryawanLabel1.setText("Golongan");

        nilaiGolonganLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nilaiGolonganLabel.setText("nilai Golongan");

        org.jdesktop.layout.GroupLayout inputPanelLayout = new org.jdesktop.layout.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jSeparator1)
            .add(inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(inputPanelLayout.createSequentialGroup()
                        .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(namaDepartmentLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .add(departmentLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(departmentCombo, 0, 200, Short.MAX_VALUE)
                            .add(nilaiNamaDepartment, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 496, Short.MAX_VALUE)
                        .add(tahunLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(57, 57, 57)
                        .add(yearChooser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(45, 45, 45))
                    .add(inputPanelLayout.createSequentialGroup()
                        .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(namaKaryawanLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, namaKaryawanLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .add(inputPanelLayout.createSequentialGroup()
                                .add(nipLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(inputPanelLayout.createSequentialGroup()
                                .add(nipCombo, 0, 200, Short.MAX_VALUE)
                                .add(686, 686, 686))
                            .add(inputPanelLayout.createSequentialGroup()
                                .add(nilaiNamaKaryawan, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE)
                                .addContainerGap())
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, inputPanelLayout.createSequentialGroup()
                                .add(nilaiGolonganLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE)
                                .addContainerGap())))))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, inputPanelLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(prosesButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 145, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(43, 43, 43))
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(yearChooser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(departmentLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(departmentCombo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(tahunLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(namaDepartmentLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(nilaiNamaDepartment, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(nipLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(nipCombo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(namaKaryawanLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(nilaiNamaKaryawan, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(namaKaryawanLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(nilaiGolonganLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(prosesButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        inputPanel.setBounds(0, 70, 1020, 230);
        jDesktopPane1.add(inputPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        posisiPanel.setBackground(new java.awt.Color(204, 204, 204));
        posisiPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Daftar Posisi"));

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        rekapTable.setAutoCreateRowSorter(true);
        rekapTable.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        rekapTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "Bulan", "S", "I", "A", "T", "L", "Gaji Pokok", "Uang Makan", "Uang Hadir", "Uang Lembur", "P. Terlambat", "P. Lain", "Lain", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(rekapTable);

        totalLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        totalLabel.setText("Total");

        nilaiTotalLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nilaiTotalLabel.setText("nilai total");

        org.jdesktop.layout.GroupLayout posisiPanelLayout = new org.jdesktop.layout.GroupLayout(posisiPanel);
        posisiPanel.setLayout(posisiPanelLayout);
        posisiPanelLayout.setHorizontalGroup(
            posisiPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 1008, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, posisiPanelLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(totalLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 68, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(nilaiTotalLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 117, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        posisiPanelLayout.setVerticalGroup(
            posisiPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, posisiPanelLayout.createSequentialGroup()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 175, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(posisiPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(totalLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(nilaiTotalLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        posisiPanel.setBounds(0, 300, 1020, 250);
        jDesktopPane1.add(posisiPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        headPanel9.setBackground(new java.awt.Color(255, 255, 255));

        logoLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logosimtel.jpg"))); // NOI18N

        menuLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        menuLabel9.setText("Menu Transaksi Gaji Karyawan");

        fungsiLabel9.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        fungsiLabel9.setText("Digunakan menghitung transaksi gaji & rekap karyawan per bulan/per tahun");

        org.jdesktop.layout.GroupLayout headPanel9Layout = new org.jdesktop.layout.GroupLayout(headPanel9);
        headPanel9.setLayout(headPanel9Layout);
        headPanel9Layout.setHorizontalGroup(
            headPanel9Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(headPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .add(logoLabel9)
                .add(4, 4, 4)
                .add(headPanel9Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(menuLabel9)
                    .add(fungsiLabel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 437, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(519, Short.MAX_VALUE))
        );
        headPanel9Layout.setVerticalGroup(
            headPanel9Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(headPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .add(headPanel9Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(logoLabel9, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(headPanel9Layout.createSequentialGroup()
                        .add(menuLabel9)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(fungsiLabel9)))
                .addContainerGap())
        );

        headPanel9.setBounds(0, 0, 1020, 77);
        jDesktopPane1.add(headPanel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jDesktopPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 1020, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jDesktopPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 659, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        jDesktopPane1.getAccessibleContext().setAccessibleName("");
        jDesktopPane1.getAccessibleContext().setAccessibleDescription("");

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1036)/2, (screenSize.height-697)/2, 1036, 697);
    }// </editor-fold>//GEN-END:initComponents

    private void isitable() {
    }

    private void cetakButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakButtonActionPerformed
        try {

            String reportSource = "./report/rekapReport.jasper";
            Map<String, Object> params = new HashMap<String, Object>();
            params.put("bulan", bulan);
            JasperPrint jasperPrint = JasperFillManager.fillReport(reportSource, params, new JRTableModelDataSource(rekapTable.getModel()));
            JasperViewer.viewReport(jasperPrint, false);
        } catch (JRException ex) {
            Logger.getLogger(RekapPresensiForm.class.getName()).log(Level.SEVERE, null, ex);
        }

}//GEN-LAST:event_cetakButtonActionPerformed

    private void departmentComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentComboActionPerformed
        // TODO add your handling code here:
        nipCombo.removeAllItems();
        if (departmentCombo.getSelectedItem() != null) {
            String pilih = String.valueOf(departmentCombo.getSelectedItem());
            if (pilih != null) {
                try {
                    activeDepartment = DaoFactory.getDepartmentDao().getByKode(pilih);
                    List<Karyawan> karyawans = DaoFactory.getRekapGajiDao().getNIPByKodeDepartment(pilih);
                    for (Karyawan k : karyawans) {
                        nipCombo.addItem(k.getNip());
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
            //jika ditemukan
            if (activeDepartment != null) {
                nilaiNamaDepartment.setText(activeDepartment.getNamaDepartment());
                nipCombo.requestFocus();

            } else {
                JOptionPane.showMessageDialog(this, "Tidak Ada Department Dengan Code Tersebut", "Error", JOptionPane.ERROR_MESSAGE);
                departmentCombo.requestFocus();
            }
        }
    }//GEN-LAST:event_departmentComboActionPerformed

    private void departmentComboKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_departmentComboKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_departmentComboKeyPressed

    private void prosesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prosesButtonActionPerformed
        // TODO add your handling code here:
        Date date = new Date();
        if (yearChooser.getYear() >= (date.getYear() + 1900)) {
            JOptionPane.showMessageDialog(this, "Data yang diminta belum direkap ", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            GregorianCalendar gc = new GregorianCalendar();
            String nip = String.valueOf(nipCombo.getSelectedItem());
            String tahun = String.valueOf(yearChooser.getYear());
            try {
                List<RekapGaji> rekapGajis = DaoFactory.getRekapGajiDao().getRekapGajiByNIPAndYear(nip, tahun);
                RekapGajiTableModel model = new RekapGajiTableModel(rekapGajis);
                rekapTable.setModel(model);
                rekapTable.setVisible(true);
            } catch (SQLException ex) {
            }

        }
    }//GEN-LAST:event_prosesButtonActionPerformed

    private void nipComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nipComboActionPerformed
        // TODO add your handling code here:
        if (nipCombo.getSelectedItem() != null) {
            String pilih = String.valueOf(nipCombo.getSelectedItem());
            if (pilih != null) {
                try {
                    activeKaryawan = DaoFactory.getRekapGajiDao().getKaryawanByNIP(pilih);
                    
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
            //jika ditemukan
            if (activeKaryawan != null) {
                nilaiNamaKaryawan.setText(activeKaryawan.getNama());
                nilaiGolonganLabel.setText(activeKaryawan.getKodeGolongan());
                prosesButton.requestFocus();

            } else {
                JOptionPane.showMessageDialog(this, "Tidak Ada Karyawan Dengan NIP Tersebut", "Error", JOptionPane.ERROR_MESSAGE);
                departmentCombo.requestFocus();
            }
        }
    }//GEN-LAST:event_nipComboActionPerformed

    private void nipComboKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nipComboKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_nipComboKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
            //UIManager.setLookAndFeel(new smooth.windows.SmoothLookAndFeel());

        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(RekapGajiForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new RekapGajiForm().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(RekapGajiForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cetakButton;
    private javax.swing.JComboBox departmentCombo;
    private javax.swing.JLabel departmentLabel;
    private javax.swing.JLabel fungsiLabel;
    private javax.swing.JLabel fungsiLabel1;
    private javax.swing.JLabel fungsiLabel2;
    private javax.swing.JLabel fungsiLabel3;
    private javax.swing.JLabel fungsiLabel4;
    private javax.swing.JLabel fungsiLabel5;
    private javax.swing.JLabel fungsiLabel6;
    private javax.swing.JLabel fungsiLabel7;
    private javax.swing.JLabel fungsiLabel8;
    private javax.swing.JLabel fungsiLabel9;
    private javax.swing.JPanel headPanel;
    private javax.swing.JPanel headPanel1;
    private javax.swing.JPanel headPanel2;
    private javax.swing.JPanel headPanel3;
    private javax.swing.JPanel headPanel4;
    private javax.swing.JPanel headPanel5;
    private javax.swing.JPanel headPanel6;
    private javax.swing.JPanel headPanel7;
    private javax.swing.JPanel headPanel8;
    private javax.swing.JPanel headPanel9;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel logoLabel1;
    private javax.swing.JLabel logoLabel2;
    private javax.swing.JLabel logoLabel3;
    private javax.swing.JLabel logoLabel4;
    private javax.swing.JLabel logoLabel5;
    private javax.swing.JLabel logoLabel6;
    private javax.swing.JLabel logoLabel7;
    private javax.swing.JLabel logoLabel8;
    private javax.swing.JLabel logoLabel9;
    private javax.swing.JLabel menuLabel;
    private javax.swing.JLabel menuLabel1;
    private javax.swing.JLabel menuLabel2;
    private javax.swing.JLabel menuLabel3;
    private javax.swing.JLabel menuLabel4;
    private javax.swing.JLabel menuLabel5;
    private javax.swing.JLabel menuLabel6;
    private javax.swing.JLabel menuLabel7;
    private javax.swing.JLabel menuLabel8;
    private javax.swing.JLabel menuLabel9;
    private javax.swing.JLabel namaDepartmentLabel;
    private javax.swing.JLabel namaKaryawanLabel;
    private javax.swing.JLabel namaKaryawanLabel1;
    private javax.swing.JLabel nilaiGolonganLabel;
    private javax.swing.JLabel nilaiNamaDepartment;
    private javax.swing.JLabel nilaiNamaKaryawan;
    private javax.swing.JLabel nilaiTotalLabel;
    private javax.swing.JComboBox nipCombo;
    private javax.swing.JLabel nipLabel;
    private com.sistem.panelstatus.PanelStatus panelStatus1;
    private javax.swing.JPanel posisiPanel;
    private javax.swing.JButton prosesButton;
    private javax.swing.JTable rekapTable;
    private javax.swing.JLabel tahunLabel;
    private javax.swing.JLabel totalLabel;
    private com.toedter.calendar.JYearChooser yearChooser;
    // End of variables declaration//GEN-END:variables
}
