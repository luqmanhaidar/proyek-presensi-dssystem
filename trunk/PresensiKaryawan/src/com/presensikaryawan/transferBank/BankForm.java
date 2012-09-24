package com.presensikaryawan.transferBank;

import com.dssystem.umum.ChangeCase;
import com.dssystem.umum.ComponentFocus;
import com.dssystem.bank.Bank;
import com.dssystem.bank.BankDao;
import com.dssystem.bank.BankTableModel;
//import com.contoh.tools.DaoFactory;
import com.presensikaryawan.tools.DaoFactory;
import com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.Color;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class BankForm extends javax.swing.JFrame {
    
//    private DaoFactory service;
    private Bank activeBranded;
    public BankForm() throws SQLException {
        initComponents();
        UIManager.put("nimbusBase", new Color(204,204,255));
        UIManager.put("nimbusBlueGrey", new Color(204,204,255));
        initComponentFocus();
        initChangeCase();
//        namaTextField.setDocument(new ChangeCase().getToUpperCase());
        BankDao dao = DaoFactory.getBankDao();
        List<Bank> banks = dao.getAllBank();
        BankTableModel model = new BankTableModel(banks);
        bankTable.setModel(model);
        for(Bank k :banks){
            kodeCombo.addItem(k.getKodeBank());
        }
        kodeCombo.requestFocus();
    }
    private void initComponentFocus() {
//        namaTextField.addFocusListener(new ComponentFocus(namaTextField));
//        kodeCombo.addFocusListener(new ComponentFocus(kodeCombo));
//        simpanButton.addFocusListener(new ComponentFocus(simpanButton));
    }

    private void initChangeCase() {
//        namaTextField.setDocument(new ChangeCase().getToUpperCase());

        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        cmdKeluar = new javax.swing.JButton();
        panelStatus1 = new com.sistem.panelstatus.PanelStatus();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bankTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        kodeCombo = new javax.swing.JComboBox();
        hapusButton = new javax.swing.JButton();
        bulanMonthChooser = new com.toedter.calendar.JMonthChooser();
        tahunYearChooser = new com.toedter.calendar.JYearChooser();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Data Bank");

        jDesktopPane1.setBackground(new java.awt.Color(153, 255, 153));

        cmdKeluar.setFont(new java.awt.Font("Dialog", 0, 12));
        cmdKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/24/Exit.gif"))); // NOI18N
        cmdKeluar.setText("Keluar");
        cmdKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdKeluarActionPerformed(evt);
            }
        });
        cmdKeluar.setBounds(400, 390, 110, 40);
        jDesktopPane1.add(cmdKeluar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelStatus1.setBounds(0, 430, 550, 50);
        jDesktopPane1.add(panelStatus1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Daftar Bank"));
        jPanel3.setLayout(null);

        bankTable.setAutoCreateRowSorter(true);
        bankTable.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        bankTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NO", "NO REK", "NAMA", "JUMLAH GAJI"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bankTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bankTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(bankTable);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(10, 30, 520, 210);

        jPanel3.setBounds(0, 140, 540, 250);
        jDesktopPane1.add(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabel3.setText("Nama Bank");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabel2.setText("Kode Bank");

        kodeCombo.setEditable(true);
        kodeCombo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        kodeCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodeComboActionPerformed(evt);
            }
        });
        kodeCombo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                kodeComboKeyPressed(evt);
            }
        });

        hapusButton.setFont(new java.awt.Font("Dialog", 0, 12));
        hapusButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/24/Delete.gif"))); // NOI18N
        hapusButton.setMnemonic('H');
        hapusButton.setText("Hapus");
        hapusButton.setToolTipText("Tombol Untuk Hapus");
        hapusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(22, 22, 22)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(kodeCombo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(132, 132, 132)
                                .add(hapusButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(bulanMonthChooser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 109, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(tahunYearChooser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                .add(162, 162, 162))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(kodeCombo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(tahunYearChooser, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                        .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(bulanMonthChooser, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(hapusButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(4, 4, 4))
        );

        jPanel1.setBounds(0, 0, 540, 140);
        jDesktopPane1.add(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logosimtel.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, 60));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18));
        jLabel4.setText("Menu Bank");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 315, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabel5.setText("Digunakan untuk menambah, edit, hapus dan cari bank");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 341, -1));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jDesktopPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
            .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 66, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jDesktopPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 478, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-556)/2, (screenSize.height-576)/2, 556, 576);
    }// </editor-fold>//GEN-END:initComponents
    
    private void hapusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusButtonActionPerformed
        
    }//GEN-LAST:event_hapusButtonActionPerformed
    
    private void bankTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bankTableMouseClicked
        int row = bankTable.getSelectedRow();
        String kodegroup = bankTable.getValueAt(row, 0).toString();
        String namagroup = bankTable.getValueAt(row,1).toString();
//        namaTextField.setText(namagroup);
        kodeCombo.setSelectedItem(kodegroup);
    }//GEN-LAST:event_bankTableMouseClicked
            
    private void cmdKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdKeluarActionPerformed
        this.dispose();
}//GEN-LAST:event_cmdKeluarActionPerformed
    
    private void kodeComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodeComboActionPerformed
String sql="select k.norek, k.nama, r.gaji_total from karyawan k, rekap r where k.bank = 'masnukan' and r.bulan = 'masukan'";    
    }//GEN-LAST:event_kodeComboActionPerformed
        
    private void kodeComboKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kodeComboKeyPressed
        if(evt.getKeyCode() == 10) {
//            namaTextField.requestFocus();
        }        
    }//GEN-LAST:event_kodeComboKeyPressed
   
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(BankForm.class.getName()).log(Level.SEVERE, null, ex);
        }
          java.awt.EventQueue.invokeLater(new Runnable() {        
            @Override
            public void run() {
                try {
                    new BankForm().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(BankForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bankTable;
    private com.toedter.calendar.JMonthChooser bulanMonthChooser;
    private javax.swing.JButton cmdKeluar;
    private javax.swing.JButton hapusButton;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox kodeCombo;
    private com.sistem.panelstatus.PanelStatus panelStatus1;
    private com.toedter.calendar.JYearChooser tahunYearChooser;
    // End of variables declaration//GEN-END:variables
}