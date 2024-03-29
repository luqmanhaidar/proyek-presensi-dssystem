package com.presensikaryawan.payrollBankReport;

import com.dssystem.umum.ChangeFormatDoubleToString;
import com.dssystem.umum.ComponentFocus;
import com.dssystem.umum.FormatTerbilang;
import com.presensikaryawan.departmentSetting.Department;
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
public class PayrollBankReportForm extends javax.swing.JFrame {

    private DaoFactory service;
    private TransaksiDepartment activeTransaksiDepartment;
    private Department activeDepartment;
    GregorianCalendar gc = new GregorianCalendar();
    private JFrame frame;
    private JMenuItem menuItem;

    /**
     * Creates new form masterInventoryGrup
     */
    public PayrollBankReportForm(final JFrame frame, final JMenuItem menuItem) throws SQLException {
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
        namaBankTextField.addFocusListener(new ComponentFocus(namaBankTextField));
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
        bulanMonthChooser = new com.toedter.calendar.JMonthChooser();
        tahunYearChooser1 = new com.toedter.calendar.JYearChooser();
        nipLabel = new javax.swing.JLabel();
        nipCombo1 = new javax.swing.JComboBox();
        nipCombo2 = new javax.swing.JComboBox();
        nipLabel1 = new javax.swing.JLabel();
        cetakButton = new javax.swing.JButton();
        namaBankTextField = new javax.swing.JTextField();
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
        setTitle("Master Payroll Bank");

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
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, inputPanelLayout.createSequentialGroup()
                        .add(lihatButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(cetakButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(24, 24, 24))
                    .add(inputPanelLayout.createSequentialGroup()
                        .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(nipLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(kodeBankLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(34, 34, 34)
                        .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(namaBankTextField)
                            .add(nipCombo1, 0, 200, Short.MAX_VALUE))
                        .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(inputPanelLayout.createSequentialGroup()
                                .add(9, 9, 9)
                                .add(nipLabel1)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(nipCombo2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(0, 301, Short.MAX_VALUE))
                            .add(inputPanelLayout.createSequentialGroup()
                                .add(300, 300, 300)
                                .add(bulanLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(bulanMonthChooser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 109, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(tahunYearChooser1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(kodeBankLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(bulanLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, inputPanelLayout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, tahunYearChooser1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, bulanMonthChooser, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)))
                    .add(namaBankTextField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(nipLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(nipCombo1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(nipCombo2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(nipLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(42, 42, 42)
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cetakButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lihatButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(14, 14, 14))
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
                .add(daftarPermintaanTransferPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(daftarPermintaanTransferPanelLayout.createSequentialGroup()
                        .add(360, 360, 360)
                        .add(totalLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 263, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(nilaiTotalLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 263, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(daftarPermintaanTransferPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .add(daftarPermintaanTransferPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, nilaiTotaTerbilangLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE))))
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
    frame.setEnabled(true);
    menuItem.setEnabled(true);
    this.dispose();
}//GEN-LAST:event_cmdKeluarActionPerformed

private void lihatButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lihatButtonKeyPressed
    lihatButton.doClick();// TODO add your handling code here:
}//GEN-LAST:event_lihatButtonKeyPressed

private void lihatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lihatButtonActionPerformed

    int bulan = bulanMonthChooser.getMonth() + 1;
    int tahun = tahunYearChooser1.getYear();
    double jumlah = 0;
    Date date = new Date();
    if (bulanMonthChooser.getMonth() >= date.getMonth() && tahunYearChooser1.getYear() >= (date.getYear() + 1900)) {
        JOptionPane.showMessageDialog(this, "Data yang diminta belum direkap ", "Error", JOptionPane.ERROR_MESSAGE);
    } else if ((nipCombo1.getSelectedItem() == null && nipCombo2.getSelectedItem() == null)
            || (String.valueOf(nipCombo1.getSelectedItem()).matches("") && String.valueOf(nipCombo2.getSelectedItem()).matches(""))) {
        JOptionPane.showMessageDialog(this, "Field nip harus diisi ", "Error", JOptionPane.ERROR_MESSAGE);
    } else if (namaBankTextField.getText() == null || namaBankTextField.getText().matches("")) {
        JOptionPane.showMessageDialog(this, "Nama bank harus diisi", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        String nip1a = String.valueOf(nipCombo1.getSelectedItem());
        String nip2a = String.valueOf(nipCombo2.getSelectedItem());
        Karyawan karyawan = null, karyawan1 = null;
        try {
            karyawan = DaoFactory.getKaryawanDao().getByNIPKaryawan(nip1a);
            karyawan1 = DaoFactory.getKaryawanDao().getByNIPKaryawan(nip2a);
        } catch (SQLException ex) {
            Logger.getLogger(PayrollBankReportForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (karyawan == null) {
            JOptionPane.showMessageDialog(this, "Pegawai dengan NIP seperti \n di kotak I tidak ada", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (karyawan1 == null) {
            JOptionPane.showMessageDialog(this, "Pegawai dengan NIP seperti \n di kotak II tidak ada", "ERROR", JOptionPane.ERROR_MESSAGE);
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
            String nip1 = String.valueOf(nipCombo1.getSelectedItem());
            String nip2 = String.valueOf(nipCombo2.getSelectedItem());
            if (nip1.compareTo(nip2) > 0) {
                String nipTemp = nip1;
                nip1 = nip2;
                nip2 = nipTemp;
            }
            try {
                List<PayrollBankReport> payrollBankReports = DaoFactory.getPayrollBankDao().getPayrollBank(nip1, nip2, maxDayOfMonth);
                for (int i = 0; i < payrollBankReports.size(); i++) {
                    jumlah = jumlah + payrollBankReports.get(i).getJumlahGaji();
                }

                PayrollBankReportTableModel model = new PayrollBankReportTableModel(payrollBankReports);
                transferTable.setModel(model);
                nilaiTotalLabel.setText(ChangeFormatDoubleToString.getToString(jumlah));
                FormatTerbilang ft = new FormatTerbilang();
                nilaiTotaTerbilangLabel.setText(ft.FormatTerbilang(String.valueOf(jumlah)));


            } catch (SQLException ex) {
                Logger.getLogger(TransaksiDepartmentForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
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

private void cetakButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakButtonActionPerformed
    Date date = new Date();
    if (bulanMonthChooser.getMonth() >= date.getMonth() && tahunYearChooser1.getYear() >= (date.getYear() + 1900)) {
        JOptionPane.showMessageDialog(this, "Data yang diminta belum direkap ", "Error", JOptionPane.ERROR_MESSAGE);
    } else if ((nipCombo1.getSelectedItem() == null && nipCombo2.getSelectedItem() == null)
            || (String.valueOf(nipCombo1.getSelectedItem()).matches("") && String.valueOf(nipCombo2.getSelectedItem()).matches(""))) {
        JOptionPane.showMessageDialog(this, "Field nip harus diisi ", "Error", JOptionPane.ERROR_MESSAGE);
    } else if (namaBankTextField.getText() == null || namaBankTextField.getText().matches("")) {
        JOptionPane.showMessageDialog(this, "Nama bank harus diisi ", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        String nip1a = String.valueOf(nipCombo1.getSelectedItem());
        String nip2a = String.valueOf(nipCombo2.getSelectedItem());
        Karyawan karyawan = null, karyawan1 = null;
        try {
            karyawan = DaoFactory.getKaryawanDao().getByNIPKaryawan(nip1a);
            karyawan1 = DaoFactory.getKaryawanDao().getByNIPKaryawan(nip2a);
        } catch (SQLException ex) {
            Logger.getLogger(PayrollBankReportForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (karyawan == null) {
            JOptionPane.showMessageDialog(this, "Pegawai dengan NIP seperti \n di kotak I tidak ada", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (karyawan1 == null) {
            JOptionPane.showMessageDialog(this, "Pegawai dengan NIP seperti \n di kotak II tidak ada", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            try {

                String bulanS = null;
                switch (bulanMonthChooser.getMonth()) {
                    case 0:
                        bulanS = "Januari";
                        break;
                    case 1:
                        bulanS = "Februari";
                        break;
                    case 2:
                        bulanS = "Maret";
                        break;
                    case 3:
                        bulanS = "April";
                        break;
                    case 4:
                        bulanS = "Mei";
                        break;
                    case 5:
                        bulanS = "Juni";
                        break;
                    case 6:
                        bulanS = "Juli";
                        break;
                    case 7:
                        bulanS = "Agustus";
                        break;
                    case 8:
                        bulanS = "September";
                        break;
                    case 9:
                        bulanS = "Oktober";
                        break;
                    case 10:
                        bulanS = "November";
                        break;
                    case 11:
                        bulanS = "Desember";
                        break;
                }
                bulanS = bulanS + " " + tahunYearChooser1.getYear();
                String nip1 = String.valueOf(nipCombo1.getSelectedItem());
                String nip2 = String.valueOf(nipCombo2.getSelectedItem());
                String bank = namaBankTextField.getText();
                String bln;
                if (bulanMonthChooser.getMonth() + 1 < 10) {
                    bln = tahunYearChooser1.getYear() + "-0" + (bulanMonthChooser.getMonth() + 1);
                } else {
                    bln = tahunYearChooser1.getYear() + "-" + (bulanMonthChooser.getMonth() + 1);
                }
                String terbilang = nilaiTotaTerbilangLabel.getText();

                String reportSource = "./report/PayrollBank.jasper";
                Map<String, Object> params = new HashMap<String, Object>();
                params.put("nip1", nip1);
                params.put("nip2", nip2);
                params.put("bank", bank);
                params.put("bulanString", bulanS);
                params.put("bulan", bln);
                params.put("terbilang", terbilang);

                JasperPrint jasperPrint = JasperFillManager.fillReport(reportSource, params, DaoFactory.getConnection());
                JasperViewer.viewReport(jasperPrint, false);
            } catch (JRException ex) {
                Logger.getLogger(PayrollBankReportForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException SQLex) {
                Logger.getLogger(PayrollBankReportForm.class.getName()).log(Level.SEVERE, null, SQLex);
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

        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(PayrollBankReportForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new PayrollBankReportForm(null, null).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(PayrollBankReportForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bulanLabel;
    private com.toedter.calendar.JMonthChooser bulanMonthChooser;
    private javax.swing.JButton cetakButton;
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
    private javax.swing.JTextField namaBankTextField;
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
