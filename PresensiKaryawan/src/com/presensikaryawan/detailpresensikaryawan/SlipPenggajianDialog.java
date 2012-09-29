/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.detailpresensikaryawan;


import java.sql.SQLException;
import javax.swing.JTable;

/**
 *
 * @author Tinus
 */
public class SlipPenggajianDialog extends javax.swing.JDialog {
    
    String bln;
    String thn;
    JTable presensiTable;
    String kode_department;

    /**
     * Creates new form DetailPresensiDialog
     */
    public SlipPenggajianDialog(java.awt.Frame parent, boolean modal, String nip, String nama, String bulan, String tahun, JTable presensiTable,
            String kode_department) throws SQLException {
        super(parent, modal);
        initComponents();
        nilaiNamaLabel.setText(nama);
        nilaiNIPLabel.setText(nip);
        this.presensiTable=presensiTable;
        bln=bulan;
        thn=tahun;
        this.kode_department=kode_department;


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
        kembaliButton = new javax.swing.JButton();
        cetakButton = new javax.swing.JButton();
        uangHadirLabel = new javax.swing.JLabel();
        uangLemburLabel = new javax.swing.JLabel();
        nilaiPotonganTerlambat = new javax.swing.JLabel();
        totalNetLabel = new javax.swing.JLabel();
        lainLabel = new javax.swing.JLabel();
        departmentLabel = new javax.swing.JLabel();
        nilaiDepartmentLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        uangMakanLabel = new javax.swing.JLabel();
        gajiPokokLabel = new javax.swing.JLabel();
        nilaiGajiPokokLabel = new javax.swing.JLabel();
        nilaiUangMakanLabel = new javax.swing.JLabel();
        nilaiUangHadirLabel = new javax.swing.JLabel();
        nilaiUangLemburLabel = new javax.swing.JLabel();
        nilaiLainLabel = new javax.swing.JLabel();
        nilaiTotalKotorLabel = new javax.swing.JLabel();
        potonganTerlambatLabel = new javax.swing.JLabel();
        nilaiPotonganLainLabel = new javax.swing.JLabel();
        nilaiTotalBersihLabel = new javax.swing.JLabel();
        potonganLainLabel1 = new javax.swing.JLabel();
        totalKotorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        namaLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        namaLabel.setText("Nama");

        nipLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nipLabel.setText("NIP");

        nilaiNamaLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nilaiNamaLabel.setText("nilai Nama");

        nilaiNIPLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nilaiNIPLabel.setText("nilai NIP");

        kembaliButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/24/Left.gif"))); // NOI18N
        kembaliButton.setText("Kembali");
        kembaliButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliButtonActionPerformed(evt);
            }
        });

        cetakButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/24/Printer.gif"))); // NOI18N
        cetakButton.setText("Cetak");
        cetakButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakButtonActionPerformed(evt);
            }
        });

        uangHadirLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        uangHadirLabel.setText("Uang Hadir");

        uangLemburLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        uangLemburLabel.setText("Uang Lembur");

        nilaiPotonganTerlambat.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nilaiPotonganTerlambat.setText("Potongan Terlambat");

        totalNetLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        totalNetLabel.setText("Total Net                      :");

        lainLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lainLabel.setText("Lain-lain");

        departmentLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        departmentLabel.setText("Department");

        nilaiDepartmentLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nilaiDepartmentLabel.setText("nilai NIP");

        uangMakanLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        uangMakanLabel.setText("Uang Makan");

        gajiPokokLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        gajiPokokLabel.setText("Gaji Pokok");

        nilaiGajiPokokLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nilaiGajiPokokLabel.setText("Nilai Gaji Pokok");

        nilaiUangMakanLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nilaiUangMakanLabel.setText("Nilai Uang Makan");

        nilaiUangHadirLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nilaiUangHadirLabel.setText("Nilai Uang Hadir");

        nilaiUangLemburLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nilaiUangLemburLabel.setText("Nilai Uang Lembur");

        nilaiLainLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nilaiLainLabel.setText("Nilai Lain-lain");

        nilaiTotalKotorLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        nilaiTotalKotorLabel.setText("Nilai Total Kotor");

        potonganTerlambatLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        potonganTerlambatLabel.setText("Potongan Terlambat");

        nilaiPotonganLainLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nilaiPotonganLainLabel.setText("Potongan Terlambat");

        nilaiTotalBersihLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        nilaiTotalBersihLabel.setText("Nilai Total Bersih");

        potonganLainLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        potonganLainLabel1.setText("Potongan Lain");

        totalKotorLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        totalKotorLabel.setText("Total Kotor                  :");

        javax.swing.GroupLayout panelUtamaLayout = new javax.swing.GroupLayout(panelUtama);
        panelUtama.setLayout(panelUtamaLayout);
        panelUtamaLayout.setHorizontalGroup(
            panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panelUtamaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelUtamaLayout.createSequentialGroup()
                        .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(departmentLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nipLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(namaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(47, 47, 47)
                        .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nilaiNamaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nilaiNIPLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nilaiDepartmentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(463, 463, 463))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUtamaLayout.createSequentialGroup()
                        .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelUtamaLayout.createSequentialGroup()
                                .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelUtamaLayout.createSequentialGroup()
                                        .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(uangHadirLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(uangLemburLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(uangMakanLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(gajiPokokLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(potonganTerlambatLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(potonganLainLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(155, 155, 155))
                                    .addGroup(panelUtamaLayout.createSequentialGroup()
                                        .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(totalKotorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(totalNetLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nilaiPotonganTerlambat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nilaiLainLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nilaiUangMakanLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nilaiUangHadirLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nilaiGajiPokokLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nilaiUangLemburLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nilaiTotalKotorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nilaiPotonganLainLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nilaiTotalBersihLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelUtamaLayout.createSequentialGroup()
                                .addComponent(kembaliButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cetakButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(167, 167, 167))))
        );
        panelUtamaLayout.setVerticalGroup(
            panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUtamaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelUtamaLayout.createSequentialGroup()
                        .addComponent(namaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nipLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(departmentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUtamaLayout.createSequentialGroup()
                        .addComponent(nilaiNamaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nilaiNIPLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nilaiDepartmentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelUtamaLayout.createSequentialGroup()
                        .addComponent(gajiPokokLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uangMakanLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uangHadirLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uangLemburLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelUtamaLayout.createSequentialGroup()
                        .addComponent(nilaiGajiPokokLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nilaiUangMakanLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nilaiUangHadirLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nilaiUangLemburLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nilaiLainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nilaiTotalKotorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalKotorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nilaiPotonganTerlambat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(potonganTerlambatLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nilaiPotonganLainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(potonganLainLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nilaiTotalBersihLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalNetLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cetakButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kembaliButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(101, 101, 101))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelUtama, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelUtama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-545)/2, (screenSize.height-621)/2, 545, 621);
    }// </editor-fold>//GEN-END:initComponents

    private void kembaliButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_kembaliButtonActionPerformed

    private void cetakButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cetakButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cetakButton;
    private javax.swing.JLabel departmentLabel;
    private javax.swing.JLabel gajiPokokLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton kembaliButton;
    private javax.swing.JLabel lainLabel;
    private javax.swing.JLabel namaLabel;
    private javax.swing.JLabel nilaiDepartmentLabel;
    private javax.swing.JLabel nilaiGajiPokokLabel;
    private javax.swing.JLabel nilaiLainLabel;
    private javax.swing.JLabel nilaiNIPLabel;
    private javax.swing.JLabel nilaiNamaLabel;
    private javax.swing.JLabel nilaiPotonganLainLabel;
    private javax.swing.JLabel nilaiPotonganTerlambat;
    private javax.swing.JLabel nilaiTotalBersihLabel;
    private javax.swing.JLabel nilaiTotalKotorLabel;
    private javax.swing.JLabel nilaiUangHadirLabel;
    private javax.swing.JLabel nilaiUangLemburLabel;
    private javax.swing.JLabel nilaiUangMakanLabel;
    private javax.swing.JLabel nipLabel;
    private javax.swing.JPanel panelUtama;
    private javax.swing.JLabel potonganLainLabel1;
    private javax.swing.JLabel potonganTerlambatLabel;
    private javax.swing.JLabel totalKotorLabel;
    private javax.swing.JLabel totalNetLabel;
    private javax.swing.JLabel uangHadirLabel;
    private javax.swing.JLabel uangLemburLabel;
    private javax.swing.JLabel uangMakanLabel;
    // End of variables declaration//GEN-END:variables
}