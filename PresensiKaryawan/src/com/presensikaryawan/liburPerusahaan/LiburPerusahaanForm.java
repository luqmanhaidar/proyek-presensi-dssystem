package com.presensikaryawan.liburPerusahaan;


import com.presensikaryawan.liburNasional.*;
import com.presensikaryawan.golongan.*;
import com.presensikaryawan.karyawan.*;
import com.presensikaryawan.golongan.*;
import com.presensikaryawan.tools.DaoFactory;
import com.dssystem.umum.ChangeCase;
import com.dssystem.umum.ComponentFocus;
import com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.Color;
import java.sql.SQLException;
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
 * @author  Als
 */
public class LiburPerusahaanForm extends javax.swing.JFrame {
    
    private DaoFactory service;
    private Golongan activeGolongan;
    /** Creates new form masterInventoryGrup */
    public LiburPerusahaanForm() throws SQLException {
        initComponents();
        UIManager.put("nimbusBase", new Color(204,204,255));
//        UIManager.put("nimbusControl",new Color(153,255,153));
//        UIManager.put("nimbusBlueGrey", new Color(204,204,255));
//        Tampilan();
        // isitable();
        initComponentFocus();
        keteranganTextField.setDocument(new ChangeCase().getToUpperCase());
        LiburPerusahaanDao liburPerusahaanDao=DaoFactory.getLiburPerusahaanDao();
        List<LiburPerusahaan> liburPerusahaans=liburPerusahaanDao.getAllLiburPerusahaan();
        LiburPerusahaanTableModel liburPerusahaanModel=new LiburPerusahaanTableModel(liburPerusahaans);
        liburPerusahaanTable.setModel(liburPerusahaanModel);
        
//        GolonganDao dao = DaoFactory.getGolonganDao();
//        List<Golongan> golongans = dao.getAllGolongan();
//        GolonganTableModel model = new GolonganTableModel(golongans);
        
//        for(Golongan g :golongans){
//            kodeGolonganCombo.addItem(g.getKodeGolongan());
//        }
    }
    private void initComponentFocus() {
        keteranganTextField.addFocusListener(new ComponentFocus(keteranganTextField));
//        kodeGolonganCombo.addFocusListener(new ComponentFocus(kodeGolonganCombo));
        simpanButton.addFocusListener(new ComponentFocus(simpanButton));
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        headPanel = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        menuLabel = new javax.swing.JLabel();
        fungsiLabel = new javax.swing.JLabel();
        cmdKeluar = new javax.swing.JButton();
        inputPanel = new javax.swing.JPanel();
        keteranganLabel = new javax.swing.JLabel();
        tanggalLabel = new javax.swing.JLabel();
        keteranganTextField = new javax.swing.JTextField();
        simpanButton = new javax.swing.JButton();
        hapusButton = new javax.swing.JButton();
        batalButton = new javax.swing.JButton();
        tanggalDateChooser = new com.toedter.calendar.JDateChooser();
        liburPerusahaanPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        liburPerusahaanTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Data Kategori");

        jDesktopPane1.setBackground(new java.awt.Color(153, 255, 153));

        headPanel.setBackground(new java.awt.Color(255, 255, 255));

        menuLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        menuLabel.setText("Menu Libur Perusahaan");

        fungsiLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        fungsiLabel.setText("Digunakan untuk menambah, edit dan menghapus data libur  perusahaan");

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
                    .add(fungsiLabel))
                .addContainerGap(129, Short.MAX_VALUE))
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

        headPanel.setBounds(0, 0, 550, 68);
        jDesktopPane1.add(headPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        cmdKeluar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cmdKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/24/Exit.gif"))); // NOI18N
        cmdKeluar.setText("Keluar");
        cmdKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdKeluarActionPerformed(evt);
            }
        });
        cmdKeluar.setBounds(430, 460, 110, 40);
        jDesktopPane1.add(cmdKeluar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        inputPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        keteranganLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        keteranganLabel.setText("Keterangan");

        tanggalLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tanggalLabel.setText("Tanggal");

        keteranganTextField.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        keteranganTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        keteranganTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keteranganTextFieldActionPerformed(evt);
            }
        });

        simpanButton.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        simpanButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/24/Save.gif"))); // NOI18N
        simpanButton.setMnemonic('S');
        simpanButton.setText("Simpan");
        simpanButton.setToolTipText("Klik Untuk Simpan");
        simpanButton.setEnabled(false);
        simpanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanButtonActionPerformed(evt);
            }
        });
        simpanButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                simpanButtonKeyPressed(evt);
            }
        });

        hapusButton.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        hapusButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/24/Delete.gif"))); // NOI18N
        hapusButton.setMnemonic('H');
        hapusButton.setText("Hapus");
        hapusButton.setToolTipText("Tombol Untuk Hapus");
        hapusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusButtonActionPerformed(evt);
            }
        });

        batalButton.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        batalButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/24/Undo.gif"))); // NOI18N
        batalButton.setText("Batal");
        batalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout inputPanelLayout = new org.jdesktop.layout.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, keteranganLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, tanggalLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(keteranganTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 360, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(tanggalDateChooser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 201, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, inputPanelLayout.createSequentialGroup()
                .addContainerGap(185, Short.MAX_VALUE)
                .add(simpanButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(hapusButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(batalButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(15, 15, 15))
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(tanggalLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(tanggalDateChooser, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(keteranganLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(keteranganTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(hapusButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(batalButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(simpanButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        inputPanel.setBounds(0, 70, 550, 130);
        jDesktopPane1.add(inputPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        liburPerusahaanPanel.setBackground(new java.awt.Color(204, 204, 204));
        liburPerusahaanPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Daftar Libur Nasional"));

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        liburPerusahaanTable.setAutoCreateRowSorter(true);
        liburPerusahaanTable.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        liburPerusahaanTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No", "Tanggal", "Keterangan"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        liburPerusahaanTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                liburPerusahaanTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(liburPerusahaanTable);
        liburPerusahaanTable.getColumnModel().getColumn(0).setResizable(false);
        liburPerusahaanTable.getColumnModel().getColumn(1).setResizable(false);
        liburPerusahaanTable.getColumnModel().getColumn(2).setResizable(false);

        org.jdesktop.layout.GroupLayout liburPerusahaanPanelLayout = new org.jdesktop.layout.GroupLayout(liburPerusahaanPanel);
        liburPerusahaanPanel.setLayout(liburPerusahaanPanelLayout);
        liburPerusahaanPanelLayout.setHorizontalGroup(
            liburPerusahaanPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(liburPerusahaanPanelLayout.createSequentialGroup()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 522, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        liburPerusahaanPanelLayout.setVerticalGroup(
            liburPerusahaanPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(liburPerusahaanPanelLayout.createSequentialGroup()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        liburPerusahaanPanel.setBounds(0, 200, 550, 250);
        jDesktopPane1.add(liburPerusahaanPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jDesktopPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 563, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jDesktopPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-563)/2, (screenSize.height-592)/2, 563, 592);
    }// </editor-fold>//GEN-END:initComponents
    
    private void hapusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusButtonActionPerformed
//        String kodeGolongan = String.valueOf(kodeGolonganCombo.getSelectedItem());
        String namaGolongan = keteranganTextField.getText();
//        activeGolongan.setKodeGolongan(kodeGolongan);
        activeGolongan.setNamaGolongan(namaGolongan);
        int ok = JOptionPane.showConfirmDialog(null,"Anda Yakin Akan Menghapus Data\nDengan Nama = "+namaGolongan+"","Konfirmasi",JOptionPane.YES_NO_OPTION);
        if (ok==0){
            try {
                DaoFactory.getGolonganDao().delete(activeGolongan);
                JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus dengan nama\n" +
                        "<html><font color=#FF0000>"+namaGolongan+"</font></html>", "Pemberitahuan", JOptionPane.INFORMATION_MESSAGE);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Data Gagal Dihapus\n" +
                        "<html><font color=#FF0000>"+ex+"</font></html>", "Error", JOptionPane.ERROR_MESSAGE);

            }

        }
        batalButton.doClick();
    }//GEN-LAST:event_hapusButtonActionPerformed
    
    private void liburPerusahaanTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_liburPerusahaanTableMouseClicked
        int row = liburPerusahaanTable.getSelectedRow();
        String kodegroup = liburPerusahaanTable.getValueAt(row, 0).toString();
        String namagroup = liburPerusahaanTable.getValueAt(row,1).toString();
        keteranganTextField.setText(namagroup);
//        kodeGolonganCombo.setSelectedItem(kodegroup);// TODO add your handling code here:
    }//GEN-LAST:event_liburPerusahaanTableMouseClicked
    private void isitable(){
      
    }
    
    private void simpanButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_simpanButtonKeyPressed
        simpanButton.doClick();// TODO add your handling code here:
    }//GEN-LAST:event_simpanButtonKeyPressed
    
    private void simpanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanButtonActionPerformed
//        String kodeGolongan = String.valueOf(kodeGolonganCombo.getSelectedItem());
        String namaGolongan = keteranganTextField.getText();
        Golongan golonganBaru = new Golongan();
//        golonganBaru.setKodeGolongan(kodeGolongan);
        golonganBaru.setNamaGolongan(namaGolongan);
        if ("Simpan".equals(simpanButton.getText())){
            try {
                DaoFactory.getGolonganDao().insert(golonganBaru);

                JOptionPane.showMessageDialog(this, "Data dengan Nama \n"+
                        "<html><font color=#FF0000>"+namaGolongan+"</font></html>"+"\nBerhasil diSimpan", "Pemberitahuan", JOptionPane.INFORMATION_MESSAGE);

                batalButton.doClick();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }else{
            try {
//                Golongan golonganLama = service.getGolonganDao().getByKodeGolongan(kodeGolongan);
//                golonganLama.setKodeGolongan(kodeGolongan);
//                golonganLama.setNamaGolongan(namaGolongan);
//                service.getGolonganDao().update(golonganLama);
                JOptionPane.showMessageDialog(this, "Data dengan nama\n"+
                        "<html><font color=#FF0000>"+namaGolongan+"</font></html>"+"\nBerhasil diUpdate", "Pemberitahuan", JOptionPane.INFORMATION_MESSAGE);

                batalButton.doClick();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_simpanButtonActionPerformed
    
    private void cmdKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdKeluarActionPerformed
       
      this.dispose();
}//GEN-LAST:event_cmdKeluarActionPerformed
        
    private void keteranganTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keteranganTextFieldActionPerformed
        simpanButton.setEnabled(true);
        simpanButton.requestFocus();
// TODO add your handling code here:
    }//GEN-LAST:event_keteranganTextFieldActionPerformed
    
    private void batalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalButtonActionPerformed
        keteranganTextField.setText(null);
        simpanButton.setEnabled(false);
        hapusButton.setEnabled(true);
//        kodeGolonganCombo.removeAllItems();
//        kodeGolonganCombo.requestFocus();
        List<Golongan> golongans = null;
        try {
            golongans = service.getGolonganDao().getAllGolongan();
        } catch (SQLException ex) {
            Logger.getLogger(KaryawanForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        GolonganTableModel model = new GolonganTableModel(golongans);
        liburPerusahaanTable.setModel(model);

        for(Golongan g :golongans){
//            kodeGolonganCombo.addItem(g.getKodeGolongan());
        }
     
}//GEN-LAST:event_batalButtonActionPerformed
         
  
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
           UIManager.setLookAndFeel(new NimbusLookAndFeel());
           //UIManager.setLookAndFeel(new smooth.windows.SmoothLookAndFeel());

        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(KaryawanForm.class.getName()).log(Level.SEVERE, null, ex);
        }
          java.awt.EventQueue.invokeLater(new Runnable() {
        
            @Override
            public void run() {
                try {
                    new KaryawanForm().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(KaryawanForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batalButton;
    private javax.swing.JButton cmdKeluar;
    private javax.swing.JLabel fungsiLabel;
    private javax.swing.JButton hapusButton;
    private javax.swing.JPanel headPanel;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel keteranganLabel;
    private javax.swing.JTextField keteranganTextField;
    private javax.swing.JPanel liburPerusahaanPanel;
    private javax.swing.JTable liburPerusahaanTable;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel menuLabel;
    private javax.swing.JButton simpanButton;
    private com.toedter.calendar.JDateChooser tanggalDateChooser;
    private javax.swing.JLabel tanggalLabel;
    // End of variables declaration//GEN-END:variables
    
}
