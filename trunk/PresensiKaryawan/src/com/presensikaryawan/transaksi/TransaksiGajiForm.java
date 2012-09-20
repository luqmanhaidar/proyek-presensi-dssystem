package com.presensikaryawan.transaksi;

import com.dssystem.umum.ComponentFocus;
import com.mysql.jdbc.CallableStatement;
import com.presensikaryawan.departmentSetting.Department;
import com.presensikaryawan.karyawan.Karyawan;
import com.presensikaryawan.posisi.*;
import com.presensikaryawan.tools.DaoFactory;
import com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.Color;
import java.sql.Connection;
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
public class TransaksiGajiForm extends javax.swing.JFrame {

    private Posisi activePosisi;
    private Department activeDepartment;

    /**
     * Creates new form masterInventoryGrup
     */
    public TransaksiGajiForm() throws SQLException {
        initComponents();
        UIManager.put("nimbusBase", new Color(204, 204, 255));

        initComponentFocus();
        List<Department> departments = DaoFactory.getTransaksiGajiDao().getAllDepartments();
        for (Department d : departments) {
            departmentCombo.addItem(d.getKodeDepartment());
        }

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
        headPanel = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        menuLabel = new javax.swing.JLabel();
        fungsiLabel = new javax.swing.JLabel();
        panelStatus1 = new com.sistem.panelstatus.PanelStatus();
        cmdKeluar = new javax.swing.JButton();
        inputPanel = new javax.swing.JPanel();
        bulanLabel = new javax.swing.JLabel();
        monthChooser = new com.toedter.calendar.JMonthChooser();
        yearChooser = new com.toedter.calendar.JYearChooser();
        departmentLabel = new javax.swing.JLabel();
        departmentCombo = new javax.swing.JComboBox();
        namaDepartmentLabel = new javax.swing.JLabel();
        nilaiNamaDepartment = new javax.swing.JLabel();
        prosesButton = new javax.swing.JButton();
        posisiPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        presenstiTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Data Kategori");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jDesktopPane1.setBackground(new java.awt.Color(153, 255, 153));
        jDesktopPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        headPanel.setBackground(new java.awt.Color(255, 255, 255));

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logosimtel.jpg"))); // NOI18N

        menuLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        menuLabel.setText("Menu Transaksi Gaji Karyawan");

        fungsiLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        fungsiLabel.setText("Digunakan menghitung transaksi gaji & rekap karyawan per bulan/per tahun");

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
        jDesktopPane1.add(headPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelStatus1.setBounds(0, 650, 1020, 50);
        jDesktopPane1.add(panelStatus1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        cmdKeluar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cmdKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/24/Printer.gif"))); // NOI18N
        cmdKeluar.setText("Cetak");
        cmdKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdKeluarActionPerformed(evt);
            }
        });
        cmdKeluar.setBounds(900, 610, 110, 40);
        jDesktopPane1.add(cmdKeluar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        inputPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        bulanLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        bulanLabel.setText("Bulan :");

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

        org.jdesktop.layout.GroupLayout inputPanelLayout = new org.jdesktop.layout.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(namaDepartmentLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .add(departmentLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(departmentCombo, 0, 200, Short.MAX_VALUE)
                    .add(nilaiNamaDepartment, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .add(457, 457, 457)
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(inputPanelLayout.createSequentialGroup()
                        .add(bulanLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(18, 18, 18)
                        .add(monthChooser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(yearChooser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(45, 45, 45))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, inputPanelLayout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(prosesButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 145, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(73, 73, 73))))
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                        .add(bulanLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(monthChooser, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(yearChooser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(departmentLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(departmentCombo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(namaDepartmentLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(nilaiNamaDepartment, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 35, Short.MAX_VALUE)
                .add(prosesButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        inputPanel.setBounds(0, 70, 1020, 150);
        jDesktopPane1.add(inputPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        posisiPanel.setBackground(new java.awt.Color(204, 204, 204));
        posisiPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Daftar Posisi"));

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        presenstiTable.setAutoCreateRowSorter(true);
        presenstiTable.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        presenstiTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "NIP", "Nama Karyawan", "S", "I", "A", "T", "M"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        presenstiTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                presenstiTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(presenstiTable);

        org.jdesktop.layout.GroupLayout posisiPanelLayout = new org.jdesktop.layout.GroupLayout(posisiPanel);
        posisiPanel.setLayout(posisiPanelLayout);
        posisiPanelLayout.setHorizontalGroup(
            posisiPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 1008, Short.MAX_VALUE)
        );
        posisiPanelLayout.setVerticalGroup(
            posisiPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(posisiPanelLayout.createSequentialGroup()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 291, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 62, Short.MAX_VALUE))
        );

        posisiPanel.setBounds(0, 220, 1020, 380);
        jDesktopPane1.add(posisiPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jDesktopPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 1020, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jDesktopPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        jDesktopPane1.getAccessibleContext().setAccessibleName("");
        jDesktopPane1.getAccessibleContext().setAccessibleDescription("");

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1036)/2, (screenSize.height-738)/2, 1036, 738);
    }// </editor-fold>//GEN-END:initComponents

    private void presenstiTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_presenstiTableMouseClicked
        int row = presenstiTable.getSelectedRow();
        String kodegroup = presenstiTable.getValueAt(row, 0).toString();
        String namagroup = presenstiTable.getValueAt(row, 1).toString();

        DetailPresensiDialog detailDialog = new DetailPresensiDialog(this, rootPaneCheckingEnabled, kodegroup, namagroup);
        detailDialog.setVisible(true);

    }//GEN-LAST:event_presenstiTableMouseClicked
    private void isitable() {
    }

    private void cmdKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdKeluarActionPerformed

        this.dispose();
}//GEN-LAST:event_cmdKeluarActionPerformed

    private void departmentComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentComboActionPerformed
        // TODO add your handling code here:
        if (departmentCombo.getSelectedItem() != null) {
            String pilih = String.valueOf(departmentCombo.getSelectedItem());
            if (pilih != null) {
                try {
                    activeDepartment = DaoFactory.getTransaksiGajiDao().getNamaDepartmentByCode(pilih);
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

    private void prosesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prosesButtonActionPerformed
        // TODO add your handling code here:
        Date date = new Date();
        if (monthChooser.getMonth() >= date.getMonth() && yearChooser.getYear() >= (date.getYear() + 1900)) {
            JOptionPane.showMessageDialog(this, "Data yang diminta belum direkap ", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            GregorianCalendar gc = new GregorianCalendar();
            gc.set(yearChooser.getYear(), monthChooser.getMonth(), date.getDate());
            String year = String.valueOf(yearChooser.getYear());
            String month = String.valueOf(monthChooser.getMonth()+1);
            String day = String.valueOf(gc.getActualMaximum(GregorianCalendar.DAY_OF_MONTH));
            String maxDayOfMonth = year+"-"+month+"-"+day;
            
            String kode_department = String.valueOf(departmentCombo.getSelectedItem());
            try {
                List<Karyawan> karyawans = DaoFactory.getTransaksiGajiDao().getAllKaryawanByDepartmentCode(kode_department);
                while (!karyawans.isEmpty()) {
                    Karyawan karyawan=karyawans.remove(0);
                    System.out.println(karyawan.getNip());
                    DaoFactory.getTransaksiGajiDao().callInsertAlfa(maxDayOfMonth,"98");
                }
            } catch (SQLException ex) {
            }
        }
    }//GEN-LAST:event_prosesButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
            //UIManager.setLookAndFeel(new smooth.windows.SmoothLookAndFeel());

        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TransaksiGajiForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new TransaksiGajiForm().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TransaksiGajiForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bulanLabel;
    private javax.swing.JButton cmdKeluar;
    private javax.swing.JComboBox departmentCombo;
    private javax.swing.JLabel departmentLabel;
    private javax.swing.JLabel fungsiLabel;
    private javax.swing.JPanel headPanel;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel menuLabel;
    private com.toedter.calendar.JMonthChooser monthChooser;
    private javax.swing.JLabel namaDepartmentLabel;
    private javax.swing.JLabel nilaiNamaDepartment;
    private com.sistem.panelstatus.PanelStatus panelStatus1;
    private javax.swing.JPanel posisiPanel;
    private javax.swing.JTable presenstiTable;
    private javax.swing.JButton prosesButton;
    private com.toedter.calendar.JYearChooser yearChooser;
    // End of variables declaration//GEN-END:variables
}
