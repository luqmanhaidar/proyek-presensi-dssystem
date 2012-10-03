/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.detailtransaksidepartment;

import com.dssystem.umum.ChangeFormatDoubleToString;
import com.presensikaryawan.tools.DaoFactory;
import com.presensikaryawan.transaksiDepartment.TransaksiDepartment;
import com.presensikaryawan.transaksiDepartment.TransaksiDepartmentTableModel;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Tinus
 */
public class DetailLainDialog extends javax.swing.JDialog {

    int bln;
    int thn;
    JTable presensiTable;
    String kode_department;
    double potongan, prestasi;

    /**
     * Creates new form DetailLainDialog
     */
    public DetailLainDialog(java.awt.Frame parent, boolean modal, String nip, String nama, int bulan, int tahun, JTable presensiTable, String kodeDepartment) throws SQLException {
        super(parent, modal);
        initComponents();
        nilaiNamaLabel.setText(nama);
        nilaiNIPLabel.setText(nip);
        if (bulan < 10) {
            nilaiTanggalLabel.setText(tahun + "-0" + bulan);
        } else {
            nilaiTanggalLabel.setText(tahun + "-" + bulan);
        }
        this.presensiTable = presensiTable;
        this.kode_department = kodeDepartment;
        bln = bulan;
        thn = tahun;
        DetailLain d=new DetailLain();
        d=DaoFactory.getTransaksiDepartmentDao().getLain(nip, nilaiTanggalLabel.getText());
       potongan=d.getPotonganLain();
       prestasi=d.getPrestasi();
        potonganTextField.setText(ChangeFormatDoubleToString.getToString(d.getPotonganLain()));
        prestasiTextField.setText(ChangeFormatDoubleToString.getToString(d.getPrestasi()));
//        this.kode_department=kode_department;
//        List<DetailLain> detailLains = DaoFactory.getPresensiTidakMasukDao().getDetailPresensiByNIP(nip, bulan, tahun);
//        DetailLainTableModel model=new DetailLainTableModel(detailPresensis);
//        detailPresensiTableModel.setModel(model);

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
        Potongan = new javax.swing.JLabel();
        potonganTextField = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        batalButton = new javax.swing.JButton();
        nilaiTanggalLabel = new javax.swing.JLabel();
        kembaliButton = new javax.swing.JButton();
        Potongan1 = new javax.swing.JLabel();
        prestasiTextField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        namaLabel.setFont(new java.awt.Font("Dialog", 0, 12));
        namaLabel.setText("Nama");

        nipLabel.setFont(new java.awt.Font("Dialog", 0, 12));
        nipLabel.setText("NIP");

        nilaiNamaLabel.setFont(new java.awt.Font("Dialog", 0, 12));
        nilaiNamaLabel.setText("nilai Nama");

        nilaiNIPLabel.setFont(new java.awt.Font("Dialog", 0, 12));
        nilaiNIPLabel.setText("nilai NIP");

        tanggalLabel.setFont(new java.awt.Font("Dialog", 0, 12));
        tanggalLabel.setText("Bulan");

        Potongan.setFont(new java.awt.Font("Dialog", 0, 12));
        Potongan.setText("Potongan Lain");

        potonganTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                potonganTextFieldMouseClicked(evt);
            }
        });
        potonganTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potonganTextFieldActionPerformed(evt);
            }
        });
        potonganTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                potonganTextFieldKeyReleased(evt);
            }
        });

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

        nilaiTanggalLabel.setFont(new java.awt.Font("Dialog", 0, 12));
        nilaiTanggalLabel.setText("-");

        kembaliButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/24/Left.gif"))); // NOI18N
        kembaliButton.setText("Kembali");
        kembaliButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliButtonActionPerformed(evt);
            }
        });

        Potongan1.setFont(new java.awt.Font("Dialog", 0, 12));
        Potongan1.setText("Lain - lain / Prestasi");

        prestasiTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prestasiTextFieldMouseClicked(evt);
            }
        });
        prestasiTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prestasiTextFieldActionPerformed(evt);
            }
        });
        prestasiTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                prestasiTextFieldKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panelUtamaLayout = new javax.swing.GroupLayout(panelUtama);
        panelUtama.setLayout(panelUtamaLayout);
        panelUtamaLayout.setHorizontalGroup(
            panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUtamaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelUtamaLayout.createSequentialGroup()
                        .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nipLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(namaLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(tanggalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nilaiNamaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nilaiNIPLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUtamaLayout.createSequentialGroup()
                                .addComponent(nilaiTanggalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                .addGap(340, 340, 340)))
                        .addGap(137, 137, 137))
                    .addGroup(panelUtamaLayout.createSequentialGroup()
                        .addComponent(kembaliButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 420, Short.MAX_VALUE)
                        .addComponent(batalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateButton))
                    .addGroup(panelUtamaLayout.createSequentialGroup()
                        .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Potongan1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUtamaLayout.createSequentialGroup()
                                .addComponent(Potongan, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(prestasiTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(potonganTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))))
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 733, Short.MAX_VALUE)
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
                    .addComponent(tanggalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(nilaiTanggalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(potonganTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(Potongan, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prestasiTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(Potongan1, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(batalButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kembaliButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelUtama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelUtama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-749)/2, (screenSize.height-336)/2, 749, 336);
    }// </editor-fold>//GEN-END:initComponents

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        if (!nilaiTanggalLabel.getText().matches("-") && potonganTextField.getText() != null) {
//            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String tanggal = nilaiTanggalLabel.getText();
//            tanggal = tanggal.substring(6, 10)+"-"+tanggal.substring(3, 5)+"%";
//            System.out.println(tanggal);
//            Date date = null;
//            try {
//                date = dateFormat.parse(tanggal);
//                System.out.println(date);
//            } catch (ParseException ex) {
//                Logger.getLogger(DetailLainDialog.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            tanggal = dateFormat.format(date);
//            System.out.println(tanggal);
            String nip = nilaiNIPLabel.getText();
            try {
                System.out.println("masuk");

                if (!potonganTextField.getText().matches("") || !prestasiTextField.getText().matches("")) {
                    if (potonganTextField.getText().matches("")) {
                        DaoFactory.getTransaksiDepartmentDao().updatePotongan(nip, tanggal, 0, Double.parseDouble(prestasiTextField.getText().replace(".", "")));
                    } else if (prestasiTextField.getText().matches("")) {
                        DaoFactory.getTransaksiDepartmentDao().updatePotongan(nip, tanggal, Double.parseDouble(potonganTextField.getText().replace(".", "")), 0);
                    } else {
                        DaoFactory.getTransaksiDepartmentDao().updatePotongan(nip, tanggal, Double.parseDouble(potonganTextField.getText().replace(".", "")), Double.parseDouble(prestasiTextField.getText().replace(".", "")));
                    }
                }
//                List<DetailLain> detailPresensis = DaoFactory.getDetailLainDao().getDetailPresensiByNIP(nip, bln, thn);
//                DetailLainTableModel model=new DetailLainTableModel(detailPresensis);
//                detailPresensiTableModel.setModel(model);
                List<TransaksiDepartment> transaksi = DaoFactory.getTransaksiDepartmentDao().getAllTransaksiDepartment(kode_department, bln, thn);
                TransaksiDepartmentTableModel model = new TransaksiDepartmentTableModel(transaksi);
                presensiTable.setModel(model);

//        List<TransaksiDepartment> transaksiDepartments = dao.getAllTransaksiDepartment(department, maxDayOfMonth);
//        
//        TransaksiDepartmentTableModel model = new TransaksiDepartmentTableModel(transaksiDepartments);
//        karyawanTable1.setModel(model);


            } catch (SQLException ex) {
                ex.getMessage();
            }
        } else {
            JOptionPane.showMessageDialog(this, "<html><font color=#FF0000>" + "Tanggal dan Keterangan Harus Diisi" + "</font></html>", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void batalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalButtonActionPerformed
        // TODO add your handling code here:
//        nilaiNIPLabel.setText(null);
//        nilaiTanggalLabel.setText("-");
        potonganTextField.setText(ChangeFormatDoubleToString.getToString(potongan));
        prestasiTextField.setText(ChangeFormatDoubleToString.getToString(prestasi));
    }//GEN-LAST:event_batalButtonActionPerformed

    private void kembaliButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_kembaliButtonActionPerformed

private void potonganTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potonganTextFieldActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_potonganTextFieldActionPerformed

private void prestasiTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prestasiTextFieldActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_prestasiTextFieldActionPerformed

private void potonganTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_potonganTextFieldKeyReleased
// TODO add your handling code here:
    if(!potonganTextField.getText().replace(".", "").matches("[0-9]*")){
        evt.consume();
        if(!potonganTextField.getText().replaceAll("[^\\dxX]+", "").isEmpty())
            potonganTextField.setText(ChangeFormatDoubleToString.getToString(Double.parseDouble(potonganTextField.getText().replaceAll("[^\\dxX]+", ""))));
        else
            potonganTextField.setText(potonganTextField.getText().replaceAll("[^\\dxX]+", ""));
//        JOptionPane.showMessageDialog(this, "Masukan harus berupa angka", "ERROR", JOptionPane.ERROR_MESSAGE);
    } else {
        if (!potonganTextField.getText().isEmpty()) {
            double gaji = Double.parseDouble(potonganTextField.getText().replace(".", ""));
            potonganTextField.setText(ChangeFormatDoubleToString.getToString(gaji));
        }
    }
}//GEN-LAST:event_potonganTextFieldKeyReleased

private void prestasiTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prestasiTextFieldKeyReleased
// TODO add your handling code here:
    if(!prestasiTextField.getText().replace(".", "").matches("[0-9]*")){
        evt.consume();
        if(!prestasiTextField.getText().replaceAll("[^\\dxX]+", "").isEmpty())
            prestasiTextField.setText(ChangeFormatDoubleToString.getToString(Double.parseDouble(prestasiTextField.getText().replaceAll("[^\\dxX]+", ""))));
        else
            prestasiTextField.setText(prestasiTextField.getText().replaceAll("[^\\dxX]+", ""));
//        JOptionPane.showMessageDialog(this, "Masukan harus berupa angka", "ERROR", JOptionPane.ERROR_MESSAGE);
    } else {
        if (!prestasiTextField.getText().isEmpty()) {
            double gaji = Double.parseDouble(prestasiTextField.getText().replace(".", ""));
            prestasiTextField.setText(ChangeFormatDoubleToString.getToString(gaji));
        }
    }
}//GEN-LAST:event_prestasiTextFieldKeyReleased

private void potonganTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_potonganTextFieldMouseClicked
// TODO add your handling code here:
potonganTextField.setText(null);
}//GEN-LAST:event_potonganTextFieldMouseClicked

private void prestasiTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prestasiTextFieldMouseClicked
// TODO add your handling code here:
    prestasiTextField.setText(null);
}//GEN-LAST:event_prestasiTextFieldMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Potongan;
    private javax.swing.JLabel Potongan1;
    private javax.swing.JButton batalButton;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton kembaliButton;
    private javax.swing.JLabel namaLabel;
    private javax.swing.JLabel nilaiNIPLabel;
    private javax.swing.JLabel nilaiNamaLabel;
    private javax.swing.JLabel nilaiTanggalLabel;
    private javax.swing.JLabel nipLabel;
    private javax.swing.JPanel panelUtama;
    private javax.swing.JTextField potonganTextField;
    private javax.swing.JTextField prestasiTextField;
    private javax.swing.JLabel tanggalLabel;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
