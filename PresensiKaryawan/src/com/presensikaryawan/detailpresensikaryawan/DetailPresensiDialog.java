/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.detailpresensikaryawan;

import com.presensikaryawan.tools.DaoFactory;
import com.presensikaryawan.transaksi.PresensiTableModel;
import com.presensikaryawan.transaksi.RekapPresensi;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Tinus
 */
public class DetailPresensiDialog extends javax.swing.JDialog {

    String bln;
    String thn;
    JTable presensiTable;
    String kode_department;

    /**
     * Creates new form DetailPresensiDialog
     */
    public DetailPresensiDialog(java.awt.Frame parent, boolean modal, String nip, String nama, String bulan, String tahun, JTable presensiTable,
            String kode_department) throws SQLException {
        super(parent, modal);
        initComponents();
        nilaiNamaLabel.setText(nama);
        nilaiNIPLabel.setText(nip);
        this.presensiTable = presensiTable;
        bln = bulan;
        thn = tahun;
        this.kode_department = kode_department;
        List<DetailPresensi> detailPresensis = DaoFactory.getPresensiTidakMasukDao().getDetailPresensiByNIP(nip, bulan, tahun);
        DetailPresensiTableModel model = new DetailPresensiTableModel(detailPresensis);
        detailPresensiTableModel.setModel(model);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelUtama = new javax.swing.JPanel();
        namaLabel = new javax.swing.JLabel();
        nipLabel = new javax.swing.JLabel();
        nilaiNamaLabel = new javax.swing.JLabel();
        nilaiNIPLabel = new javax.swing.JLabel();
        tanggalLabel = new javax.swing.JLabel();
        keteranganLabel = new javax.swing.JLabel();
        keteranganTextField = new javax.swing.JTextField();
        tablePanel = new javax.swing.JScrollPane();
        detailPresensiTableModel = new javax.swing.JTable();
        updateButton = new javax.swing.JButton();
        batalButton = new javax.swing.JButton();
        nilaiTanggalLabel = new javax.swing.JLabel();
        kembaliButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Detail Presensi");

        namaLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        namaLabel.setText("Nama");

        nipLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nipLabel.setText("NIP");

        nilaiNamaLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nilaiNamaLabel.setText("nilai Nama");

        nilaiNIPLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nilaiNIPLabel.setText("nilai NIP");

        tanggalLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tanggalLabel.setText("Tanggal");

        keteranganLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        keteranganLabel.setText("Keterangan");

        detailPresensiTableModel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tanggal", "Keterangan", "Jam Masuk"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        detailPresensiTableModel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                detailPresensiTableModelMouseClicked(evt);
            }
        });
        tablePanel.setViewportView(detailPresensiTableModel);

        updateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/24/Edit.gif"))); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        batalButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/24/Exit.gif"))); // NOI18N
        batalButton.setText("Batal");
        batalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalButtonActionPerformed(evt);
            }
        });

        nilaiTanggalLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nilaiTanggalLabel.setText("-");

        kembaliButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/24/Left.gif"))); // NOI18N
        kembaliButton.setText("Kembali");
        kembaliButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelUtamaLayout = new javax.swing.GroupLayout(panelUtama);
        panelUtama.setLayout(panelUtamaLayout);
        panelUtamaLayout.setHorizontalGroup(
            panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUtamaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
                    .addGroup(panelUtamaLayout.createSequentialGroup()
                        .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nipLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(namaLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(tanggalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nilaiNamaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nilaiNIPLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelUtamaLayout.createSequentialGroup()
                                .addComponent(nilaiTanggalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                .addGap(239, 239, 239)
                                .addComponent(keteranganLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(keteranganTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUtamaLayout.createSequentialGroup()
                        .addComponent(kembaliButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 420, Short.MAX_VALUE)
                        .addComponent(batalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateButton)))
                .addContainerGap())
        );
        panelUtamaLayout.setVerticalGroup(
            panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUtamaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nilaiNamaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nipLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nilaiNIPLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(keteranganTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(keteranganLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(tanggalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(nilaiTanggalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(batalButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kembaliButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(67, 67, 67))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelUtama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelUtama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-749)/2, (screenSize.height-533)/2, 749, 533);
    }// </editor-fold>//GEN-END:initComponents

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        if (!nilaiTanggalLabel.getText().matches("-") && keteranganTextField.getText() != null) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String tanggal = nilaiTanggalLabel.getText();
            tanggal = tanggal.substring(6, 10) + "-" + tanggal.substring(3, 5) + "-" + tanggal.substring(0, 2);
            System.out.println(tanggal);
//            Date date = null;
//            try {
//                date = dateFormat.parse(tanggal);
//                System.out.println(date);
//            } catch (ParseException ex) {
//                Logger.getLogger(DetailPresensiDialog.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            tanggal = dateFormat.format(date);
//            System.out.println(tanggal);
            String nip = nilaiNIPLabel.getText();
            try {
                System.out.println("masuk");
                DaoFactory.getPresensiTidakMasukDao().updateDetailPresensi(tanggal, nip, keteranganTextField.getText());
                List<DetailPresensi> detailPresensis = DaoFactory.getPresensiTidakMasukDao().getDetailPresensiByNIP(nip, bln, thn);
                DetailPresensiTableModel model = new DetailPresensiTableModel(detailPresensis);
                detailPresensiTableModel.setModel(model);
            } catch (SQLException ex) {
                ex.getMessage();
            }
            try {
                System.out.println("masuk2");
                List<RekapPresensi> detailPresensis2 = DaoFactory.getTranskasiGajiDao().callGetPresensi(bln, thn, kode_department);
                PresensiTableModel model2 = new PresensiTableModel(detailPresensis2);
                presensiTable.setModel(model2);
                
                    presensiTable.setVisible(true);
            } catch (SQLException ex) {
                ex.getMessage();
            }
            try {
                System.out.println("masuk3");
                String bulan = tanggal.substring(0, 7) + "%";
                System.out.println(bulan + " " + nip);
                DaoFactory.getPresensiTidakMasukDao().updateGaji(bulan, nip);
            } catch (SQLException ex) {
                ex.getMessage();
            }
        } else {
            JOptionPane.showMessageDialog(this, "<html><font color=#FF0000>" + "Tanggal dan Keterangan Harus Diisi" + "</font></html>", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void batalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalButtonActionPerformed
        // TODO add your handling code here:
        nilaiNIPLabel.setText(null);
        nilaiTanggalLabel.setText("-");
    }//GEN-LAST:event_batalButtonActionPerformed

    private void kembaliButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_kembaliButtonActionPerformed

    private void detailPresensiTableModelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailPresensiTableModelMouseClicked
        // TODO add your handling code here:
        int row = detailPresensiTableModel.getSelectedRow();
        String keterangan = detailPresensiTableModel.getValueAt(row, 1).toString();
        String tanggalString = detailPresensiTableModel.getValueAt(row, 0).toString();
        keteranganTextField.setText(keterangan);

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date tanggal = null;
        try {
            tanggal = sdf.parse(tanggalString);
        } catch (ParseException ex) {
            Logger.getLogger(DetailPresensiDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
        nilaiTanggalLabel.setText(sdf.format(tanggal));
    }//GEN-LAST:event_detailPresensiTableModelMouseClicked
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batalButton;
    private javax.swing.JTable detailPresensiTableModel;
    private javax.swing.JButton kembaliButton;
    private javax.swing.JLabel keteranganLabel;
    private javax.swing.JTextField keteranganTextField;
    private javax.swing.JLabel namaLabel;
    private javax.swing.JLabel nilaiNIPLabel;
    private javax.swing.JLabel nilaiNamaLabel;
    private javax.swing.JLabel nilaiTanggalLabel;
    private javax.swing.JLabel nipLabel;
    private javax.swing.JPanel panelUtama;
    private javax.swing.JScrollPane tablePanel;
    private javax.swing.JLabel tanggalLabel;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
