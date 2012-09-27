package com.presensikaryawan.payrollBankReport;

import com.dssystem.umum.ComponentFocus;
import com.presensikaryawan.departmentSetting.Department;
import com.presensikaryawan.detailtransaksidepartment.DetailLainDialog;
import com.presensikaryawan.karyawan.Karyawan;
import com.presensikaryawan.tools.DaoFactory;
import com.presensikaryawan.transaksiDepartment.*;
import com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.Color;
import java.sql.SQLException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/*
 * masterInventoryGrup.java
 *
 * Created on October 21, 2006, 10:06 AM
 */
/**
 *
 * @author Als
 */
public class PayrollBankReportForm extends javax.swing.JFrame {

    private DaoFactory service;
    private TransaksiDepartment activeTransaksiDepartment;
    private Department activeDepartment;
    GregorianCalendar gc = new GregorianCalendar();

    /**
     * Creates new form masterInventoryGrup
     */
    public PayrollBankReportForm() throws SQLException {
        initComponents();
        UIManager.put("nimbusBase", new Color(204, 204, 255));
//        Tampilan();
        // isitable();
        initComponentFocus();
        List<Karyawan> karyawans = DaoFactory.getGajiPerKaryawanReportDao().getAllNip();
        for (Karyawan k : karyawans) {
            nipCombo1.addItem(k.getNip());
            nipCombo2.addItem(k.getNip());
        }

    }

    private void initComponentFocus() {
//        namaKaryawanTextField.addFocusListener(new ComponentFocus(namaKaryawanTextField));
//        alamatKaryawanTextField.addFocusListener(new ComponentFocus(alamatKaryawanTextField));
        bankCombo.addFocusListener(new ComponentFocus(bankCombo));
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
        bulanLabel = new javax.swing.JLabel();
        kodeBankLabel = new javax.swing.JLabel();
        lihatButton = new javax.swing.JButton();
        bankCombo = new javax.swing.JComboBox();
        bulanMonthChooser = new com.toedter.calendar.JMonthChooser();
        tahunYearChooser1 = new com.toedter.calendar.JYearChooser();
        namaBankLabel = new javax.swing.JLabel();
        nilaiNamaBankLabel = new javax.swing.JLabel();
        nipLabel = new javax.swing.JLabel();
        nipCombo1 = new javax.swing.JComboBox();
        nipCombo2 = new javax.swing.JComboBox();
        nipLabel1 = new javax.swing.JLabel();
        daftarPermintaanTransferPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        transferTable = new javax.swing.JTable();
        totalLabel = new javax.swing.JLabel();
        nilaiTotalLabel = new javax.swing.JLabel();
        nilaiTotaTerbilangLabel = new javax.swing.JLabel();
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
        cmdKeluar.setBounds(800, 530, 110, 40);
        jDesktopPane1.add(cmdKeluar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        inputPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        bulanLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        bulanLabel.setText("Bulan");

        kodeBankLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        kodeBankLabel.setText("Bank");

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

        bankCombo.setEditable(true);
        bankCombo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        bankCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankComboActionPerformed(evt);
            }
        });
        bankCombo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bankComboKeyPressed(evt);
            }
        });

        namaBankLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        namaBankLabel.setText("Nama Bank");

        nilaiNamaBankLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nilaiNamaBankLabel.setText("Nilai Nama Department");

        nipLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nipLabel.setText("NIP");

        nipCombo1.setEditable(true);
        nipCombo1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        nipCombo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nipCombo1ActionPerformed(evt);
            }
        });
        nipCombo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nipCombo1KeyPressed(evt);
            }
        });

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

        nipLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nipLabel1.setText("sampai");

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
                                .add(kodeBankLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(28, 28, 28))
                            .add(namaBankLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(inputPanelLayout.createSequentialGroup()
                                .add(bankCombo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(300, 300, 300)
                                .add(bulanLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(bulanMonthChooser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 109, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(tahunYearChooser1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                            .add(nilaiNamaBankLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, inputPanelLayout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(lihatButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(inputPanelLayout.createSequentialGroup()
                        .add(nipLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(34, 34, 34)
                        .add(nipCombo1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(9, 9, 9)
                        .add(nipLabel1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(nipCombo2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(kodeBankLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(bankCombo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(bulanLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, tahunYearChooser1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, bulanMonthChooser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(namaBankLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(nilaiNamaBankLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(nipLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(nipCombo1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(nipCombo2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(nipLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(lihatButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        inputPanel.setBounds(0, 70, 920, 180);
        jDesktopPane1.add(inputPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        daftarPermintaanTransferPanel.setBackground(new java.awt.Color(204, 204, 204));
        daftarPermintaanTransferPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Daftar Transfer"));

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        transferTable.setAutoCreateRowSorter(true);
        transferTable.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        transferTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO", "NO. REKENING", "NAMA", "JUMLAH GAJI"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(transferTable);
        transferTable.getColumnModel().getColumn(0).setResizable(false);
        transferTable.getColumnModel().getColumn(0).setPreferredWidth(50);
        transferTable.getColumnModel().getColumn(1).setResizable(false);
        transferTable.getColumnModel().getColumn(1).setPreferredWidth(150);
        transferTable.getColumnModel().getColumn(2).setResizable(false);
        transferTable.getColumnModel().getColumn(2).setPreferredWidth(200);
        transferTable.getColumnModel().getColumn(3).setResizable(false);
        transferTable.getColumnModel().getColumn(3).setPreferredWidth(200);

        totalLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        totalLabel.setText("Total");

        nilaiTotalLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nilaiTotalLabel.setText("nilai total");

        nilaiTotaTerbilangLabel.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        nilaiTotaTerbilangLabel.setText("nilai total terbilang");

        org.jdesktop.layout.GroupLayout daftarPermintaanTransferPanelLayout = new org.jdesktop.layout.GroupLayout(daftarPermintaanTransferPanel);
        daftarPermintaanTransferPanel.setLayout(daftarPermintaanTransferPanelLayout);
        daftarPermintaanTransferPanelLayout.setHorizontalGroup(
            daftarPermintaanTransferPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(daftarPermintaanTransferPanelLayout.createSequentialGroup()
                .add(360, 360, 360)
                .add(totalLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 263, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(nilaiTotalLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 263, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(daftarPermintaanTransferPanelLayout.createSequentialGroup()
                .add(daftarPermintaanTransferPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(daftarPermintaanTransferPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE))
                    .add(daftarPermintaanTransferPanelLayout.createSequentialGroup()
                        .add(360, 360, 360)
                        .add(nilaiTotaTerbilangLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        daftarPermintaanTransferPanelLayout.setVerticalGroup(
            daftarPermintaanTransferPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(daftarPermintaanTransferPanelLayout.createSequentialGroup()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 167, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(daftarPermintaanTransferPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(totalLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(nilaiTotalLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(nilaiTotaTerbilangLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 19, Short.MAX_VALUE))
        );

        daftarPermintaanTransferPanel.setBounds(0, 250, 920, 270);
        jDesktopPane1.add(daftarPermintaanTransferPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        headPanel.setBackground(new java.awt.Color(255, 255, 255));

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logosimtel.jpg"))); // NOI18N

        menuLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        menuLabel.setText("Menu Laporan Payroll Bank");

        fungsiLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        fungsiLabel.setText("Digunakan untuk melihat dan mencetak laporan payroll bank");

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
        panelStatus1.setBounds(0, 580, 920, 50);
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
                .add(jDesktopPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-935)/2, (screenSize.height-678)/2, 935, 678);
    }// </editor-fold>//GEN-END:initComponents

private void cmdKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdKeluarActionPerformed

    this.dispose();
}//GEN-LAST:event_cmdKeluarActionPerformed

private void bankComboKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bankComboKeyPressed
    if (evt.getKeyCode() == 10) {
    }
}//GEN-LAST:event_bankComboKeyPressed

private void bankComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankComboActionPerformed
    if (bankCombo.getSelectedItem() != null) {
        String pilih = String.valueOf(bankCombo.getSelectedItem());
        if (pilih != null) {
            try {
                activeDepartment = DaoFactory.getTranskasiGajiDao().getNamaDepartmentByCode(pilih);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        //jika ditemukan
        if (activeDepartment != null) {
            nilaiNamaBankLabel.setText(activeDepartment.getNamaDepartment());
            bankCombo.requestFocus();

        } else {
            JOptionPane.showMessageDialog(this, "Tidak Ada Department Dengan Code Tersebut", "Error", JOptionPane.ERROR_MESSAGE);
            bankCombo.requestFocus();
        }
    }
}//GEN-LAST:event_bankComboActionPerformed

private void lihatButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lihatButtonKeyPressed
    lihatButton.doClick();// TODO add your handling code here:
}//GEN-LAST:event_lihatButtonKeyPressed

private void lihatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lihatButtonActionPerformed
//    String department = bankCombo.getSelectedItem().toString();
    int bulan = bulanMonthChooser.getMonth() + 1;
    int tahun = tahunYearChooser1.getYear();
    Date date = new Date();
//        if (monthChooser.getMonth() >= date.getMonth() && yearChooser.getYear() >= (date.getYear() + 1900)) {
//            JOptionPane.showMessageDialog(this, "Data yang diminta belum direkap ", "Error", JOptionPane.ERROR_MESSAGE);
//        } else {
//            GregorianCalendar gc = new GregorianCalendar();
    gc.set(tahunYearChooser1.getYear(), bulanMonthChooser.getMonth(), date.getDate());
    String day = String.valueOf(gc.getActualMaximum(GregorianCalendar.DAY_OF_MONTH));
    String maxDayOfMonth;
    if (bulan < 10) {
        maxDayOfMonth = tahun + "-0" + bulan;
    } else {
        maxDayOfMonth = tahun + "-" + bulan;
    }
    System.out.println(maxDayOfMonth);
    String nip1 = String.valueOf(nipCombo1.getSelectedItem());
    String nip2 = String.valueOf(nipCombo2.getSelectedItem());
    try {
        List<PayrollBankReport> payrollBankReports = DaoFactory.getPayrollBankDao().getPayrollBank(nip1, nip2, maxDayOfMonth);

        PayrollBankReportTableModel model = new PayrollBankReportTableModel(payrollBankReports);
        transferTable.setModel(model);


    } catch (SQLException ex) {
        Logger.getLogger(TransaksiDepartmentForm.class.getName()).log(Level.SEVERE, null, ex);
    }
}//GEN-LAST:event_lihatButtonActionPerformed

    private void nipCombo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nipCombo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nipCombo1ActionPerformed

    private void nipCombo1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nipCombo1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_nipCombo1KeyPressed

    private void nipCombo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nipCombo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nipCombo2ActionPerformed

    private void nipCombo2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nipCombo2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_nipCombo2KeyPressed
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
            Logger.getLogger(PayrollBankReportForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                try {
                    new PayrollBankReportForm().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(PayrollBankReportForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox bankCombo;
    private javax.swing.JLabel bulanLabel;
    private com.toedter.calendar.JMonthChooser bulanMonthChooser;
    private javax.swing.JButton cmdKeluar;
    private javax.swing.JPanel daftarPermintaanTransferPanel;
    private javax.swing.JLabel fungsiLabel;
    private javax.swing.JPanel headPanel;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel kodeBankLabel;
    private javax.swing.JButton lihatButton;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel menuLabel;
    private javax.swing.JLabel namaBankLabel;
    private javax.swing.JLabel nilaiNamaBankLabel;
    private javax.swing.JLabel nilaiTotaTerbilangLabel;
    private javax.swing.JLabel nilaiTotalLabel;
    private javax.swing.JComboBox nipCombo1;
    private javax.swing.JComboBox nipCombo2;
    private javax.swing.JLabel nipLabel;
    private javax.swing.JLabel nipLabel1;
    private com.sistem.panelstatus.PanelStatus panelStatus1;
    private com.toedter.calendar.JYearChooser tahunYearChooser1;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JTable transferTable;
    // End of variables declaration//GEN-END:variables
}
