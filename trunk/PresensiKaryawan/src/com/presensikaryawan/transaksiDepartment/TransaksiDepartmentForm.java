package com.presensikaryawan.transaksiDepartment;

import com.presensikaryawan.tools.DaoFactory;
import com.dssystem.umum.ComponentFocus;
import com.presensikaryawan.departmentSetting.Department;
import com.presensikaryawan.departmentSetting.DepartmentDao;
import com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.Color;
import java.sql.SQLException;
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
 * @author  Als
 */
public class TransaksiDepartmentForm extends javax.swing.JFrame {

    private DaoFactory service;
    private TransaksiDepartment activeTransaksiDepartment;
    private Department activeDepartment;
    GregorianCalendar gc = new GregorianCalendar();

    /** Creates new form masterInventoryGrup */
    public TransaksiDepartmentForm() throws SQLException {
        initComponents();
        UIManager.put("nimbusBase", new Color(204, 204, 255));
//        UIManager.put("nimbusControl",new Color(153,255,153));
//        UIManager.put("nimbusBlueGrey", new Color(204,204,255));
//        Tampilan();
        // isitable();
        initComponentFocus();
//        tanggalMasukDateChooser.setDate(gc.getTime());
//        namaKaryawanTextField.setDocument(new ChangeCase().getToUpperCase());
//        alamatKaryawanTextField.setDocument(new ChangeCase().getToUpperCase());
//        KaryawanDao dao = DaoFactory.getKaryawanDao();
//        List<Karyawan> karyawans = dao.getAllKaryawan();
//        KaryawanTableModel model = new KaryawanTableModel(karyawans);
//        karyawanTable.setModel(model);
//        for (Karyawan k : karyawans) {
//            departmentCombo.addItem(k.getNip());
//        }
//        GolonganDao dao1 = DaoFactory.getGolonganDao();
//        List<Golongan> golongans = dao1.getAllGolongan();
//        KaryawanTableModel model = new KaryawanTableModel(karyawans);
//        karyawanTable.setModel(model);
//        for (Golongan g : golongans) {
//            golonganCombo.addItem(g.getKodeGolongan() + "-" + g.getNamaGolongan());
//        }
//        PosisiDao dao2 = DaoFactory.getPosisiDao();
//        List<Posisi> posisis = dao2.getAllPosisi();
//        for (Posisi p : posisis) {
//            posisiCombo.addItem(p.getKode_posisi() + "-" + p.getNama_posisi());
//            
//        }
//        OutletDao dao3 = DaoFactory.getOutletDao();
//        List<Outlet> outlets = dao3.getAllOutlet();
//        for (Outlet o : outlets) {
//            outletCombo.addItem(o.getKodeOutlet() + "-" + o.getNamaOutlet());
//        }
        DepartmentDao dao4 = DaoFactory.getDepartmentDao();
        List<Department> departments = dao4.getAllDepartment();
        for (Department d : departments) {
            departmentCombo.addItem(d.getKodeDepartment());
        }

    }

    private void initComponentFocus() {
//        namaKaryawanTextField.addFocusListener(new ComponentFocus(namaKaryawanTextField));
//        alamatKaryawanTextField.addFocusListener(new ComponentFocus(alamatKaryawanTextField));
        departmentCombo.addFocusListener(new ComponentFocus(departmentCombo));
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
        namaKaryawanLabel = new javax.swing.JLabel();
        departmentLabel = new javax.swing.JLabel();
        simpanButton = new javax.swing.JButton();
        departmentCombo = new javax.swing.JComboBox();
        bulanMonthChooser = new com.toedter.calendar.JMonthChooser();
        tahunYearChooser1 = new com.toedter.calendar.JYearChooser();
        namaDepartmentLabel = new javax.swing.JLabel();
        nilaiNamaDepartment = new javax.swing.JLabel();
        daftarKaryawanPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        karyawanTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Data Kategori");

        jDesktopPane1.setBackground(new java.awt.Color(153, 255, 153));

        headPanel.setBackground(new java.awt.Color(255, 255, 255));

        menuLabel.setFont(new java.awt.Font("Dialog", 1, 18));
        menuLabel.setText("Menu Data Karyawan");

        fungsiLabel.setFont(new java.awt.Font("Dialog", 0, 12));
        fungsiLabel.setText("Digunakan untuk menambah, edit dan menghapus data  karyawan");

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
                .addContainerGap(289, Short.MAX_VALUE))
        );
        headPanelLayout.setVerticalGroup(
            headPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(headPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(headPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(logoLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .add(headPanelLayout.createSequentialGroup()
                        .add(menuLabel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(fungsiLabel)))
                .addContainerGap())
        );

        headPanel.setBounds(0, 0, 740, 68);
        jDesktopPane1.add(headPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        cmdKeluar.setFont(new java.awt.Font("Dialog", 0, 12));
        cmdKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/24/Exit.gif"))); // NOI18N
        cmdKeluar.setText("Keluar");
        cmdKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdKeluarActionPerformed(evt);
            }
        });
        cmdKeluar.setBounds(620, 600, 110, 40);
        jDesktopPane1.add(cmdKeluar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        inputPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        namaKaryawanLabel.setFont(new java.awt.Font("Dialog", 0, 12));
        namaKaryawanLabel.setText("Bulan");

        departmentLabel.setFont(new java.awt.Font("Dialog", 0, 12));
        departmentLabel.setText("Department");

        simpanButton.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        simpanButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/24/Search_d.gif"))); // NOI18N
        simpanButton.setMnemonic('S');
        simpanButton.setText("Proses");
        simpanButton.setToolTipText("Klik Untuk Simpan");
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

        departmentCombo.setEditable(true);
        departmentCombo.setFont(new java.awt.Font("Arial", 0, 11));
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

        namaDepartmentLabel.setFont(new java.awt.Font("Dialog", 0, 12));
        namaDepartmentLabel.setText("Nama Department");

        nilaiNamaDepartment.setFont(new java.awt.Font("Dialog", 0, 12));
        nilaiNamaDepartment.setText("Nilai Nama Department");

        org.jdesktop.layout.GroupLayout inputPanelLayout = new org.jdesktop.layout.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, inputPanelLayout.createSequentialGroup()
                        .add(simpanButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(33, 33, 33))
                    .add(inputPanelLayout.createSequentialGroup()
                        .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(inputPanelLayout.createSequentialGroup()
                                .add(departmentLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(28, 28, 28))
                            .add(inputPanelLayout.createSequentialGroup()
                                .add(namaDepartmentLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)))
                        .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(inputPanelLayout.createSequentialGroup()
                                .add(nilaiNamaDepartment, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                .add(433, 433, 433))
                            .add(inputPanelLayout.createSequentialGroup()
                                .add(departmentCombo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(69, 69, 69)
                                .add(namaKaryawanLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(bulanMonthChooser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 109, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(18, 18, 18)
                                .add(tahunYearChooser1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                                .add(25, 25, 25))))))
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(departmentLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(departmentCombo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, tahunYearChooser1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, namaKaryawanLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, bulanMonthChooser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(namaDepartmentLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(nilaiNamaDepartment, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(47, 47, 47)
                .add(simpanButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(115, 115, 115))
        );

        inputPanel.setBounds(0, 70, 740, 170);
        jDesktopPane1.add(inputPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        daftarKaryawanPanel.setBackground(new java.awt.Color(204, 204, 204));
        daftarKaryawanPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Daftar Karyawan"));

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        karyawanTable.setAutoCreateRowSorter(true);
        karyawanTable.setFont(new java.awt.Font("Arial", 0, 11));
        karyawanTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NIP", "Nama", "M", "S", "I", "A", "T", "Pokok", "Uang Makan", "Uang hadir", "Lain - lain", "Potongan Tlt", "Potongan Lain", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        karyawanTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                karyawanTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(karyawanTable);

        org.jdesktop.layout.GroupLayout daftarKaryawanPanelLayout = new org.jdesktop.layout.GroupLayout(daftarKaryawanPanel);
        daftarKaryawanPanel.setLayout(daftarKaryawanPanelLayout);
        daftarKaryawanPanelLayout.setHorizontalGroup(
            daftarKaryawanPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
        );
        daftarKaryawanPanelLayout.setVerticalGroup(
            daftarKaryawanPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(daftarKaryawanPanelLayout.createSequentialGroup()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        daftarKaryawanPanel.setBounds(0, 240, 740, 360);
        jDesktopPane1.add(daftarKaryawanPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jDesktopPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jDesktopPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-756)/2, (screenSize.height-698)/2, 756, 698);
    }// </editor-fold>//GEN-END:initComponents

    private void karyawanTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_karyawanTableMouseClicked
//        try {
//            int row = karyawanTable.getSelectedRow();
//            String nip = karyawanTable.getValueAt(row, 0).toString();
//            String nama = karyawanTable.getValueAt(row, 1).toString();
//            String alamat = karyawanTable.getValueAt(row, 2).toString();
//            String tanggal = karyawanTable.getValueAt(row, 3).toString();
//            String golongan = karyawanTable.getValueAt(row, 4).toString();
//    //        String kodeGolongan = golongan.substring(0, golongan.indexOf("-"));
//            String posisi = karyawanTable.getValueAt(row, 5).toString();
//    //        String kodePosisi = golongan.substring(0, posisi.indexOf("-"));
//            String outlet = karyawanTable.getValueAt(row, 6).toString();
//    //        String kodeOutlet = golongan.substring(0, outlet.indexOf("-"));
//            String department = karyawanTable.getValueAt(row, 7).toString();
//    //        String kodeDepartment = golongan.substring(0, department.indexOf("-"));
//            int year = Integer.parseInt(tanggal.substring(0, 4));
//            year=year-1900;
//            int month = Integer.parseInt(tanggal.substring(5, 7));
//            month=month-1;
//            int day = Integer.parseInt(tanggal.substring(8, 10));
////            System.out.println(tanggal+"   "+year+"   "+month+"   "+day);
//            Date date = new Date(year, month, day);
//            String kode = karyawanTable.getValueAt(row, 4).toString();
//            namaKaryawanTextField.setText(nama);
//            departmentCombo.setSelectedItem(nip);
//            alamatKaryawanTextField.setText(alamat);
//            tanggalMasukDateChooser.setDate(date);
//            golonganCombo.setSelectedItem(golongan+"-"+DaoFactory.getGolonganDao().getByKodeGolongan(golongan).getNamaGolongan());
//            posisiCombo.setSelectedItem(posisi+"-"+DaoFactory.getPosisiDao().getByKode(posisi).getNama_posisi());
//            outletCombo.setSelectedItem(outlet+"-"+DaoFactory.getOutletDao().getByKodeOutlet(outlet).getNamaOutlet());
//            departmentCombo.setSelectedItem(department+"-"+DaoFactory.getDepartmentDao().getByKode(department).getNamaDepartment());
//
//            // TODO add your handling code here:
//        } catch (SQLException ex) {
//            Logger.getLogger(TransaksiDepartmentForm.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_karyawanTableMouseClicked
    private void isitable() {
    }

    private void cmdKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdKeluarActionPerformed

        this.dispose();
}//GEN-LAST:event_cmdKeluarActionPerformed

    private void departmentComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentComboActionPerformed
        if (departmentCombo.getSelectedItem() != null) {
            String pilih = String.valueOf(departmentCombo.getSelectedItem());
            if (pilih != null) {
                try {
                    activeDepartment = DaoFactory.getTranskasiGajiDao().getNamaDepartmentByCode(pilih);
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
        if (evt.getKeyCode() == 10) {
        }

    }//GEN-LAST:event_departmentComboKeyPressed

private void simpanButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_simpanButtonKeyPressed
    simpanButton.doClick();// TODO add your handling code here:
}//GEN-LAST:event_simpanButtonKeyPressed

private void simpanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanButtonActionPerformed
    String department = departmentCombo.getSelectedItem().toString();
    int bulan = bulanMonthChooser.getMonth() + 1;
    int tahun = tahunYearChooser1.getYear();
//    System.out.println(department+" "+bulan+" "+ tahun);
    try {
        TransaksiDepartmentDao dao = DaoFactory.getTransaksiDepartmentDao();
        List<TransaksiDepartment> transaksiDepartments = dao.getAllTransaksiDepartment(department, bulan, tahun);
        TransaksiDepartmentTableModel model = new TransaksiDepartmentTableModel(transaksiDepartments);
        karyawanTable.setModel(model);


    } catch (SQLException ex) {
        Logger.getLogger(TransaksiDepartmentForm.class.getName()).log(Level.SEVERE, null, ex);
    }
}//GEN-LAST:event_simpanButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
            //UIManager.setLookAndFeel(new smooth.windows.SmoothLookAndFeel());

        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TransaksiDepartmentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                try {
                    new TransaksiDepartmentForm().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TransaksiDepartmentForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JMonthChooser bulanMonthChooser;
    private javax.swing.JButton cmdKeluar;
    private javax.swing.JPanel daftarKaryawanPanel;
    private javax.swing.JComboBox departmentCombo;
    private javax.swing.JLabel departmentLabel;
    private javax.swing.JLabel fungsiLabel;
    private javax.swing.JPanel headPanel;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable karyawanTable;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel menuLabel;
    private javax.swing.JLabel namaDepartmentLabel;
    private javax.swing.JLabel namaKaryawanLabel;
    private javax.swing.JLabel nilaiNamaDepartment;
    private javax.swing.JButton simpanButton;
    private com.toedter.calendar.JYearChooser tahunYearChooser1;
    // End of variables declaration//GEN-END:variables
}
