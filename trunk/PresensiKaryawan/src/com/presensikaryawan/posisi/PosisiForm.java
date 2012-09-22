package com.presensikaryawan.posisi;

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
 * @author Als
 */
public class PosisiForm extends javax.swing.JFrame {

    private DaoFactory service;
    private Posisi activePosisi;

    /**
     * Creates new form masterInventoryGrup
     */
    public PosisiForm() throws SQLException {
        initComponents();
        UIManager.put("nimbusBase", new Color(204, 204, 255));

        initComponentFocus();
        namaPosisiTextField.setDocument(new ChangeCase().getToUpperCase());
        PosisiDao dao = DaoFactory.getPosisiDao();
        List<Posisi> posisis = dao.getAllPosisi();
        PosisiTableModel model = new PosisiTableModel(posisis);
        posisiTable.setModel(model);
        for (Posisi p : posisis) {
            kodePosisiCombo.addItem(p.getKode_posisi());
        }
        if (posisis.isEmpty()) {
            hapusButton.setEnabled(false);
        }
    }

    private void initComponentFocus() {
        namaPosisiTextField.addFocusListener(new ComponentFocus(namaPosisiTextField));
        kodePosisiCombo.addFocusListener(new ComponentFocus(kodePosisiCombo));
        simpanButton.addFocusListener(new ComponentFocus(simpanButton));
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
        namaPosisiLabel = new javax.swing.JLabel();
        kodePosisiLabel = new javax.swing.JLabel();
        namaPosisiTextField = new javax.swing.JTextField();
        simpanButton = new javax.swing.JButton();
        kodePosisiCombo = new javax.swing.JComboBox();
        hapusButton = new javax.swing.JButton();
        batalButton = new javax.swing.JButton();
        posisiPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        posisiTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Data Kategori");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jDesktopPane1.setBackground(new java.awt.Color(153, 255, 153));
        jDesktopPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        headPanel.setBackground(new java.awt.Color(255, 255, 255));

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logosimtel.jpg"))); // NOI18N

        menuLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        menuLabel.setText("Menu Posisi Karyawan");

        fungsiLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        fungsiLabel.setText("Digunakan untuk menambah, edit dan menghapus data posisi karyawan");

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

        namaPosisiLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        namaPosisiLabel.setText("Nama Posisi");

        kodePosisiLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        kodePosisiLabel.setText("Kode Posisi");

        namaPosisiTextField.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        namaPosisiTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        namaPosisiTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaPosisiTextFieldActionPerformed(evt);
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

        kodePosisiCombo.setEditable(true);
        kodePosisiCombo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        kodePosisiCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodePosisiComboActionPerformed(evt);
            }
        });
        kodePosisiCombo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                kodePosisiComboKeyPressed(evt);
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
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, namaPosisiLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, kodePosisiLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(kodePosisiCombo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(namaPosisiTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 360, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
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
                    .add(kodePosisiLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(kodePosisiCombo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(namaPosisiLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(namaPosisiTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(hapusButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(batalButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(simpanButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        inputPanel.setBounds(0, 70, 550, 130);
        jDesktopPane1.add(inputPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        posisiPanel.setBackground(new java.awt.Color(204, 204, 204));
        posisiPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Daftar Posisi"));

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        posisiTable.setAutoCreateRowSorter(true);
        posisiTable.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        posisiTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Kode Status", "Nama Keterangan"
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
        posisiTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                posisiTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(posisiTable);

        org.jdesktop.layout.GroupLayout posisiPanelLayout = new org.jdesktop.layout.GroupLayout(posisiPanel);
        posisiPanel.setLayout(posisiPanelLayout);
        posisiPanelLayout.setHorizontalGroup(
            posisiPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(posisiPanelLayout.createSequentialGroup()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 522, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        posisiPanelLayout.setVerticalGroup(
            posisiPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(posisiPanelLayout.createSequentialGroup()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        posisiPanel.setBounds(0, 200, 550, 250);
        jDesktopPane1.add(posisiPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

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
        String kodePosisi = String.valueOf(kodePosisiCombo.getSelectedItem());
        String namaPosisi = namaPosisiTextField.getText();
        activePosisi.setKode_posisi(kodePosisi);
        activePosisi.setNama_posisi(namaPosisi);
        int ok = JOptionPane.showConfirmDialog(null, "Anda Yakin Akan Menghapus Posisi Karyawan\nDengan Kode = " + kodePosisi + "", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (ok == 0) {
            try {
                DaoFactory.getPosisiDao().delete(activePosisi);
                JOptionPane.showMessageDialog(this, "Data Posisi Karyawan Berhasil Dihapus Dengan Kode\n"
                        + "<html><font color=#FF0000>" + kodePosisi + "</font></html>", "Pemberitahuan", JOptionPane.INFORMATION_MESSAGE);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Data Gagal Dihapus\n"
                        + "<html><font color=#FF0000>" + ex + "</font></html>", "Error", JOptionPane.ERROR_MESSAGE);

            }

        }
        batalButton.doClick();
    }//GEN-LAST:event_hapusButtonActionPerformed

    private void posisiTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_posisiTableMouseClicked
        int row = posisiTable.getSelectedRow();
        String kodegroup = posisiTable.getValueAt(row, 0).toString();
        String namagroup = posisiTable.getValueAt(row, 1).toString();
        namaPosisiTextField.setText(namagroup);
        kodePosisiCombo.setSelectedItem(kodegroup);// TODO add your handling code here:
    }//GEN-LAST:event_posisiTableMouseClicked
    private void isitable() {
    }

    private void simpanButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_simpanButtonKeyPressed
        simpanButton.doClick();// TODO add your handling code here:
    }//GEN-LAST:event_simpanButtonKeyPressed

    private void simpanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanButtonActionPerformed
        String kodePosisi = String.valueOf(kodePosisiCombo.getSelectedItem());
        String namaPosisi = namaPosisiTextField.getText();
        Posisi posisiBaru = new Posisi();
        posisiBaru.setKode_posisi(kodePosisi);
        posisiBaru.setNama_posisi(namaPosisi);
        if (!namaPosisiTextField.getText().matches("") && !String.valueOf(kodePosisiCombo.getSelectedItem()).matches("")) {
            if ("Simpan".equals(simpanButton.getText())) {
                try {
                    DaoFactory.getPosisiDao().insert(posisiBaru);
                    JOptionPane.showMessageDialog(this, "Data Posisi Karyawan Dengan Kode \n"
                            + "<html><font color=#FF0000>" + kodePosisi + "</font></html>" + "\nBerhasil diSimpan", "Pemberitahuan", JOptionPane.INFORMATION_MESSAGE);

                    batalButton.doClick();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } else {
                try {
                    Posisi posisiLama = DaoFactory.getPosisiDao().getByKode(kodePosisi);
                    posisiLama.setKode_posisi(kodePosisi);
                    posisiLama.setNama_posisi(namaPosisi);
                    DaoFactory.getPosisiDao().update(posisiLama);
                    JOptionPane.showMessageDialog(this, "Data Posisi Karyawan Dengan Kode\n"
                            + "<html><font color=#FF0000>" + kodePosisi + "</font></html>" + "\nBerhasil diUpdate", "Pemberitahuan", JOptionPane.INFORMATION_MESSAGE);

                    batalButton.doClick();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        } else if (String.valueOf(kodePosisiCombo.getSelectedItem()).matches("")) {
            JOptionPane.showMessageDialog(this, "Kode Posisi Belum Diisi");
            kodePosisiCombo.requestFocus();
        } else {
            JOptionPane.showMessageDialog(this, "Nama Posisi Belum Disii");
            namaPosisiTextField.requestFocus();
        }
    }//GEN-LAST:event_simpanButtonActionPerformed

    private void cmdKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdKeluarActionPerformed

        this.dispose();
}//GEN-LAST:event_cmdKeluarActionPerformed

    private void kodePosisiComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodePosisiComboActionPerformed
        if (kodePosisiCombo.getSelectedItem() != null) {
            String pilih = String.valueOf(kodePosisiCombo.getSelectedItem());
            if (pilih != null) {

                try {
                    activePosisi = DaoFactory.getPosisiDao().getByKode(pilih);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
            //jika ditemukan
            if (activePosisi != null) {
                namaPosisiTextField.setText(activePosisi.getNama_posisi());
                simpanButton.setText("Update");
                simpanButton.setMnemonic('U');
                simpanButton.setEnabled(true);
                hapusButton.setEnabled(true);
                kodePosisiCombo.requestFocus();

            } else {
                namaPosisiTextField.setText(null);
                namaPosisiTextField.requestFocus();
                hapusButton.setEnabled(false);
                simpanButton.setText("Simpan");
                simpanButton.setMnemonic('S');
                simpanButton.setEnabled(true);
            }
        } else {
            simpanButton.setEnabled(false);
            hapusButton.setEnabled(false);
        }
// TODO add your handling code here:
    }//GEN-LAST:event_kodePosisiComboActionPerformed

    private void namaPosisiTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaPosisiTextFieldActionPerformed
        simpanButton.setEnabled(true);
        simpanButton.requestFocus();
// TODO add your handling code here:
    }//GEN-LAST:event_namaPosisiTextFieldActionPerformed

    private void kodePosisiComboKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kodePosisiComboKeyPressed
        if (evt.getKeyCode() == 10) {
        }

    }//GEN-LAST:event_kodePosisiComboKeyPressed

    private void batalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalButtonActionPerformed
        namaPosisiTextField.setText(null);
        simpanButton.setEnabled(false);
        hapusButton.setEnabled(true);
        kodePosisiCombo.removeAllItems();
        kodePosisiCombo.requestFocus();
        List<Posisi> posisis = null;
        try {
            posisis = DaoFactory.getPosisiDao().getAllPosisi();
        } catch (SQLException ex) {
            Logger.getLogger(PosisiForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        PosisiTableModel model = new PosisiTableModel(posisis);
        posisiTable.setModel(model);

        if (posisis.isEmpty()) {
            hapusButton.setEnabled(false);
        } else {
            hapusButton.setEnabled(true);
        }
        for (Posisi p : posisis) {
            kodePosisiCombo.addItem(p.getKode_posisi());
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
            Logger.getLogger(PosisiForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new PosisiForm().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(PosisiForm.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JComboBox kodePosisiCombo;
    private javax.swing.JLabel kodePosisiLabel;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel menuLabel;
    private javax.swing.JLabel namaPosisiLabel;
    private javax.swing.JTextField namaPosisiTextField;
    private com.sistem.panelstatus.PanelStatus panelStatus1;
    private javax.swing.JPanel posisiPanel;
    private javax.swing.JTable posisiTable;
    private javax.swing.JButton simpanButton;
    // End of variables declaration//GEN-END:variables
}