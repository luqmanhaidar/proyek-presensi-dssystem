package com.presensikaryawan.golongan;


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
public class GolonganForm extends javax.swing.JFrame {
    
    private DaoFactory service;
    private Golongan activeGolongan;
    /** Creates new form masterInventoryGrup */
    public GolonganForm() throws SQLException {
        initComponents();
        UIManager.put("nimbusBase", new Color(204,204,255));
//        UIManager.put("nimbusControl",new Color(153,255,153));
//        UIManager.put("nimbusBlueGrey", new Color(204,204,255));
//        Tampilan();
        // isitable();
        initComponentFocus();
        namaGolonganTextField.setDocument(new ChangeCase().getToUpperCase());
        GolonganDao dao = DaoFactory.getGolonganDao();
        List<Golongan> golongans = dao.getAllGolongan();
        GolonganTableModel model = new GolonganTableModel(golongans);
        golonganTable.setModel(model);
        for(Golongan g :golongans){
            kodeGolonganCombo.addItem(g.getKodeGolongan());
        }
    }
    private void initComponentFocus() {
        namaGolonganTextField.addFocusListener(new ComponentFocus(namaGolonganTextField));
        kodeGolonganCombo.addFocusListener(new ComponentFocus(kodeGolonganCombo));
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
        panelStatus1 = new com.sistem.panelstatus.PanelStatus();
        cmdKeluar = new javax.swing.JButton();
        inputPanel = new javax.swing.JPanel();
        namaGolonganLabel = new javax.swing.JLabel();
        kodeGolonganLabel = new javax.swing.JLabel();
        namaGolonganTextField = new javax.swing.JTextField();
        simpanButton = new javax.swing.JButton();
        kodeGolonganCombo = new javax.swing.JComboBox();
        hapusButton = new javax.swing.JButton();
        batalButton = new javax.swing.JButton();
        golonganPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        golonganTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Data Kategori");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jDesktopPane1.setBackground(new java.awt.Color(153, 255, 153));
        jDesktopPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        headPanel.setBackground(new java.awt.Color(255, 255, 255));

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logosimtel.jpg"))); // NOI18N

        menuLabel.setFont(new java.awt.Font("Dialog", 1, 18));
        menuLabel.setText("Menu Golongan Karyawan");

        fungsiLabel.setFont(new java.awt.Font("Dialog", 0, 12));
        fungsiLabel.setText("Digunakan untuk menambah, edit dan menghapus data golongan karyawan");

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
                .addContainerGap(49, Short.MAX_VALUE))
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

        headPanel.setBounds(0, 0, 550, 77);
        jDesktopPane1.add(headPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelStatus1.setBounds(0, 510, 560, 50);
        jDesktopPane1.add(panelStatus1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        cmdKeluar.setFont(new java.awt.Font("Dialog", 0, 12));
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

        namaGolonganLabel.setFont(new java.awt.Font("Dialog", 0, 12));
        namaGolonganLabel.setText("Nama Golongan");

        kodeGolonganLabel.setFont(new java.awt.Font("Dialog", 0, 12));
        kodeGolonganLabel.setText("Kode Golongan");

        namaGolonganTextField.setFont(new java.awt.Font("Arial", 0, 11));
        namaGolonganTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        namaGolonganTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaGolonganTextFieldActionPerformed(evt);
            }
        });

        simpanButton.setFont(new java.awt.Font("Dialog", 0, 12));
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

        kodeGolonganCombo.setEditable(true);
        kodeGolonganCombo.setFont(new java.awt.Font("Arial", 0, 11));
        kodeGolonganCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodeGolonganComboActionPerformed(evt);
            }
        });
        kodeGolonganCombo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                kodeGolonganComboKeyPressed(evt);
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

        batalButton.setFont(new java.awt.Font("Dialog", 0, 12));
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
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, namaGolonganLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, kodeGolonganLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(kodeGolonganCombo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(namaGolonganTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 360, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
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
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(kodeGolonganLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(kodeGolonganCombo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(namaGolonganLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(namaGolonganTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(hapusButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(batalButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(simpanButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        inputPanel.setBounds(0, 70, 550, 130);
        jDesktopPane1.add(inputPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        golonganPanel.setBackground(new java.awt.Color(204, 204, 204));
        golonganPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Daftar Golongan"));

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        golonganTable.setAutoCreateRowSorter(true);
        golonganTable.setFont(new java.awt.Font("Arial", 0, 11));
        golonganTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Kode Golongan", "Nama Golongan"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        golonganTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                golonganTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(golonganTable);

        org.jdesktop.layout.GroupLayout golonganPanelLayout = new org.jdesktop.layout.GroupLayout(golonganPanel);
        golonganPanel.setLayout(golonganPanelLayout);
        golonganPanelLayout.setHorizontalGroup(
            golonganPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(golonganPanelLayout.createSequentialGroup()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 522, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        golonganPanelLayout.setVerticalGroup(
            golonganPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(golonganPanelLayout.createSequentialGroup()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        golonganPanel.setBounds(0, 200, 550, 250);
        jDesktopPane1.add(golonganPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

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

        jDesktopPane1.getAccessibleContext().setAccessibleName("");
        jDesktopPane1.getAccessibleContext().setAccessibleDescription("");

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-563)/2, (screenSize.height-592)/2, 563, 592);
    }// </editor-fold>//GEN-END:initComponents
    
    private void hapusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusButtonActionPerformed
        String kodeGolongan = String.valueOf(kodeGolonganCombo.getSelectedItem());
        String namaGolongan = namaGolonganTextField.getText();
        activeGolongan.setKodeGolongan(kodeGolongan);
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
    
    private void golonganTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_golonganTableMouseClicked
        int row = golonganTable.getSelectedRow();
        String kodegroup = golonganTable.getValueAt(row, 0).toString();
        String namagroup = golonganTable.getValueAt(row,1).toString();
        namaGolonganTextField.setText(namagroup);
        kodeGolonganCombo.setSelectedItem(kodegroup);// TODO add your handling code here:
    }//GEN-LAST:event_golonganTableMouseClicked
    private void isitable(){
      
    }
    
    private void simpanButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_simpanButtonKeyPressed
        simpanButton.doClick();// TODO add your handling code here:
    }//GEN-LAST:event_simpanButtonKeyPressed
    
    private void simpanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanButtonActionPerformed
        String kodeGolongan = String.valueOf(kodeGolonganCombo.getSelectedItem());
        String namaGolongan = namaGolonganTextField.getText();
        Golongan golonganBaru = new Golongan();
        golonganBaru.setKodeGolongan(kodeGolongan);
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
                Golongan golonganLama = service.getGolonganDao().getByKodeGolongan(kodeGolongan);
                golonganLama.setKodeGolongan(kodeGolongan);
                golonganLama.setNamaGolongan(namaGolongan);
                service.getGolonganDao().update(golonganLama);
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
    
    private void kodeGolonganComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodeGolonganComboActionPerformed
        String pilih = String.valueOf(kodeGolonganCombo.getSelectedItem());
        
        try {
            activeGolongan = service.getGolonganDao().getByKodeGolongan(pilih);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        //jika ditemukan
        if(activeGolongan!=null){
            namaGolonganTextField.setText(activeGolongan.getNamaGolongan());
            simpanButton.setText("Update");
            simpanButton.setMnemonic('U');
            simpanButton.setEnabled(true);
            hapusButton.setEnabled(true);
            kodeGolonganCombo.requestFocus();

        } else{
            namaGolonganTextField.setText(null);
            namaGolonganTextField.requestFocus();
            hapusButton.setEnabled(false);
            simpanButton.setText("Simpan");
            simpanButton.setMnemonic('S');
            simpanButton.setEnabled(true);
        }
        
// TODO add your handling code here:
    }//GEN-LAST:event_kodeGolonganComboActionPerformed
    
    private void namaGolonganTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaGolonganTextFieldActionPerformed
        simpanButton.setEnabled(true);
        simpanButton.requestFocus();
// TODO add your handling code here:
    }//GEN-LAST:event_namaGolonganTextFieldActionPerformed
    
    private void kodeGolonganComboKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kodeGolonganComboKeyPressed
        if(evt.getKeyCode() == 10) {
            
        }
        
    }//GEN-LAST:event_kodeGolonganComboKeyPressed

    private void batalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalButtonActionPerformed
        namaGolonganTextField.setText(null);
        simpanButton.setEnabled(false);
        hapusButton.setEnabled(true);
        kodeGolonganCombo.removeAllItems();
        kodeGolonganCombo.requestFocus();
        List<Golongan> golongans = null;
        try {
            golongans = service.getGolonganDao().getAllGolongan();
        } catch (SQLException ex) {
            Logger.getLogger(GolonganForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        GolonganTableModel model = new GolonganTableModel(golongans);
        golonganTable.setModel(model);

        for(Golongan g :golongans){
            kodeGolonganCombo.addItem(g.getKodeGolongan());
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
            Logger.getLogger(GolonganForm.class.getName()).log(Level.SEVERE, null, ex);
        }
          java.awt.EventQueue.invokeLater(new Runnable() {
        
            @Override
            public void run() {
                try {
                    new GolonganForm().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(GolonganForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batalButton;
    private javax.swing.JButton cmdKeluar;
    private javax.swing.JLabel fungsiLabel;
    private javax.swing.JPanel golonganPanel;
    private javax.swing.JTable golonganTable;
    private javax.swing.JButton hapusButton;
    private javax.swing.JPanel headPanel;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox kodeGolonganCombo;
    private javax.swing.JLabel kodeGolonganLabel;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel menuLabel;
    private javax.swing.JLabel namaGolonganLabel;
    private javax.swing.JTextField namaGolonganTextField;
    private com.sistem.panelstatus.PanelStatus panelStatus1;
    private javax.swing.JButton simpanButton;
    // End of variables declaration//GEN-END:variables
    
}