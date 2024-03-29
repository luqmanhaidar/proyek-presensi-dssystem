package com.presensikaryawan.karyawan;

import com.dssystem.umum.ChangeCase;
import com.dssystem.umum.ComponentFocus;
import com.dssystem.umum.DateTool;
import com.presensikaryawan.departmentSetting.Department;
import com.presensikaryawan.departmentSetting.DepartmentDao;
import com.presensikaryawan.golongan.*;
import com.presensikaryawan.outletSetting.Outlet;
import com.presensikaryawan.outletSetting.OutletDao;
import com.presensikaryawan.posisi.Posisi;
import com.presensikaryawan.posisi.PosisiDao;
import com.presensikaryawan.tools.DaoFactory;
import com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
public class KaryawanForm extends javax.swing.JFrame {

    private DaoFactory service;
    private Karyawan activeKaryawan;
    GregorianCalendar gc = new GregorianCalendar();
    private JFrame frame;
    private JMenuItem menuItem;

    /**
     * Creates new form masterInventoryGrup
     */
    public KaryawanForm(final JFrame frame, final JMenuItem menuItem) throws SQLException {
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
        tanggalMasukDateChooser.setDate(gc.getTime());
        namaKaryawanTextField.setDocument(new ChangeCase().getToUpperCase());
        alamatKaryawanTextField.setDocument(new ChangeCase().getToUpperCase());
        KaryawanDao dao = DaoFactory.getKaryawanDao();
        List<Karyawan> karyawans = dao.getAllKaryawan();
        KaryawanTableModel model = new KaryawanTableModel(karyawans);
        karyawanTable.setModel(model);
        karyawanTable.getColumnModel().getColumn(2).setPreferredWidth(250);
        karyawanTable.getColumnModel().getColumn(3).setPreferredWidth(200);
        karyawanTable.getColumnModel().getColumn(4).setPreferredWidth(200);
        karyawanTable.getColumnModel().getColumn(7).setPreferredWidth(150);
        karyawanTable.getColumnModel().getColumn(8).setPreferredWidth(200);
        karyawanTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        for (Karyawan k : karyawans) {
            nipKaryawanCombo.addItem(k.getNip());
        }
        GolonganDao dao1 = DaoFactory.getGolonganDao();
        List<Golongan> golongans = dao1.getAllGolongan();
        for (Golongan g : golongans) {
            golonganCombo.addItem(g.getKodeGolongan() + "-" + g.getNamaGolongan());
        }
        PosisiDao dao2 = DaoFactory.getPosisiDao();
        List<Posisi> posisis = dao2.getAllPosisi();
        for (Posisi p : posisis) {
            posisiCombo.addItem(p.getKode_posisi() + "-" + p.getNama_posisi());

        }
        OutletDao dao3 = DaoFactory.getOutletDao();
        List<Outlet> outlets = dao3.getAllOutlet();
        for (Outlet o : outlets) {
            outletCombo.addItem(o.getKodeOutlet() + "-" + o.getNamaOutlet());
        }
        DepartmentDao dao4 = DaoFactory.getDepartmentDao();
        List<Department> departments = dao4.getAllDepartment();
        for (Department d : departments) {
            departmentCombo.addItem(d.getKodeDepartment() + "-" + d.getNamaDepartment());
            departmentCombo.setSelectedIndex(0);
        }
        if (karyawans.isEmpty()) {
            hapusButton.setEnabled(false);
        }
        nipKaryawanCombo.requestFocus();
    }

    private void panelStatus1AncestorResized(java.awt.event.HierarchyEvent evt) {
        // TODO add your handling code here:
        Rectangle r = new Rectangle(panelStatus1.getX(), panelStatus1.getY(), jDesktopPane1.getWidth(), panelStatus1.getHeight());
        panelStatus1.setBounds(r);
    }

    private void cmdKeluarAncestorResized(java.awt.event.HierarchyEvent evt) {
        // TODO add your handling code here:
        int minimumX = this.getWidth() - cmdKeluar.getX();
        if (minimumX != 0) {
            Rectangle r = new Rectangle((this.getWidth() - minimumX), cmdKeluar.getY(), cmdKeluar.getWidth(), cmdKeluar.getHeight());
            cmdKeluar.setBounds(r);
        }
    }

    private void initComponentFocus() {
        namaKaryawanTextField.addFocusListener(new ComponentFocus(namaKaryawanTextField));
        alamatKaryawanTextField.addFocusListener(new ComponentFocus(alamatKaryawanTextField));
        nipKaryawanCombo.addFocusListener(new ComponentFocus(nipKaryawanCombo));
        simpanButton.addFocusListener(new ComponentFocus(simpanButton));
        noRekeningTextField.addFocusListener(new ComponentFocus(noRekeningTextField));
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
        namaKaryawanLabel = new javax.swing.JLabel();
        nipKaryawanLabel = new javax.swing.JLabel();
        namaKaryawanTextField = new javax.swing.JTextField();
        simpanButton = new javax.swing.JButton();
        nipKaryawanCombo = new javax.swing.JComboBox();
        hapusButton = new javax.swing.JButton();
        batalButton = new javax.swing.JButton();
        alamatKaryawanLabel = new javax.swing.JLabel();
        tanggalMasukKaryawanLabel = new javax.swing.JLabel();
        golonganKaryawanLabel = new javax.swing.JLabel();
        posisiKaryawanLabel = new javax.swing.JLabel();
        alamatKaryawanTextField = new javax.swing.JTextField();
        tanggalMasukDateChooser = new com.toedter.calendar.JDateChooser();
        golonganCombo = new javax.swing.JComboBox();
        kodeOutletLabel = new javax.swing.JLabel();
        kodeDepartmentLabel = new javax.swing.JLabel();
        posisiCombo = new javax.swing.JComboBox();
        outletCombo = new javax.swing.JComboBox();
        noRekeningLabel = new javax.swing.JLabel();
        noRekeningTextField = new javax.swing.JTextField();
        departmentCombo = new javax.swing.JComboBox();
        daftarKaryawanPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        karyawanTable = new javax.swing.JTable();
        headPanel = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        menuLabel = new javax.swing.JLabel();
        fungsiLabel = new javax.swing.JLabel();
        panelStatus1 = new com.sistem.panelstatus.PanelStatus();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Master Karyawan");

        jDesktopPane1.setBackground(new java.awt.Color(153, 255, 153));

        cmdKeluar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
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

        namaKaryawanLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        namaKaryawanLabel.setText("Nama Karyawan");

        nipKaryawanLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nipKaryawanLabel.setText("NIP Karyawan");

        namaKaryawanTextField.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        namaKaryawanTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        namaKaryawanTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaKaryawanTextFieldActionPerformed(evt);
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

        nipKaryawanCombo.setEditable(true);
        nipKaryawanCombo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        nipKaryawanCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nipKaryawanComboActionPerformed(evt);
            }
        });
        nipKaryawanCombo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nipKaryawanComboKeyPressed(evt);
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
        batalButton.setToolTipText("Klik untuk batal");
        batalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalButtonActionPerformed(evt);
            }
        });

        alamatKaryawanLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        alamatKaryawanLabel.setText("Alamat");

        tanggalMasukKaryawanLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tanggalMasukKaryawanLabel.setText("Tanggal Masuk");

        golonganKaryawanLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        golonganKaryawanLabel.setText("Golongan");

        posisiKaryawanLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        posisiKaryawanLabel.setText("Posisi");

        alamatKaryawanTextField.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        alamatKaryawanTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        alamatKaryawanTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatKaryawanTextFieldActionPerformed(evt);
            }
        });

        tanggalMasukDateChooser.setDateFormatString("dd-MM-yyyy");
        tanggalMasukDateChooser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tanggalMasukDateChooserPropertyChange(evt);
            }
        });

        golonganCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                golonganComboActionPerformed(evt);
            }
        });

        kodeOutletLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        kodeOutletLabel.setText("Outlet");

        kodeDepartmentLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        kodeDepartmentLabel.setText("Department");

        posisiCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posisiComboActionPerformed(evt);
            }
        });

        outletCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outletComboActionPerformed(evt);
            }
        });

        noRekeningLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        noRekeningLabel.setText("No Rek");

        noRekeningTextField.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        noRekeningTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        noRekeningTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noRekeningTextFieldActionPerformed(evt);
            }
        });

        departmentCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentComboActionPerformed(evt);
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
                        .add(0, 365, Short.MAX_VALUE)
                        .add(simpanButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(hapusButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(batalButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(19, 19, 19))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, inputPanelLayout.createSequentialGroup()
                        .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, inputPanelLayout.createSequentialGroup()
                                .add(noRekeningLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(noRekeningTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 213, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(335, 335, 335))
                            .add(inputPanelLayout.createSequentialGroup()
                                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, posisiKaryawanLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, golonganKaryawanLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, tanggalMasukKaryawanLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, alamatKaryawanLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(namaKaryawanLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(nipKaryawanLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(nipKaryawanCombo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(namaKaryawanTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 360, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(alamatKaryawanTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 535, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(inputPanelLayout.createSequentialGroup()
                                        .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                            .add(golonganCombo, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .add(tanggalMasukDateChooser, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                                            .add(posisiCombo, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .add(32, 32, 32)
                                        .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(inputPanelLayout.createSequentialGroup()
                                                .add(kodeDepartmentLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 83, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                .add(departmentCombo, 0, 216, Short.MAX_VALUE))
                                            .add(inputPanelLayout.createSequentialGroup()
                                                .add(kodeOutletLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 83, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                .add(outletCombo, 0, 216, Short.MAX_VALUE)))))))
                        .addContainerGap(74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(nipKaryawanLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(nipKaryawanCombo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(namaKaryawanLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(namaKaryawanTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(alamatKaryawanLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(alamatKaryawanTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(tanggalMasukKaryawanLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(tanggalMasukDateChooser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(inputPanelLayout.createSequentialGroup()
                        .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(golonganKaryawanLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(golonganCombo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(posisiKaryawanLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(posisiCombo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(inputPanelLayout.createSequentialGroup()
                        .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(kodeOutletLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(outletCombo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(kodeDepartmentLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(departmentCombo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(noRekeningLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(noRekeningTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 11, Short.MAX_VALUE)
                .add(inputPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(simpanButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(hapusButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(batalButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        inputPanel.setBounds(0, 70, 740, 320);
        jDesktopPane1.add(inputPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        daftarKaryawanPanel.setBackground(new java.awt.Color(204, 204, 204));
        daftarKaryawanPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Daftar Karyawan"));

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        karyawanTable.setAutoCreateRowSorter(true);
        karyawanTable.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        karyawanTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NIP", "NAMA", "ALAMAT", "TANGGAL MASUK", "KODE GOLONGAN", "POSISI", "OUTLET", "DEPARTMENT", "NO REKENING"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        karyawanTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                karyawanTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(karyawanTable);
        karyawanTable.getColumnModel().getColumn(0).setResizable(false);
        karyawanTable.getColumnModel().getColumn(0).setPreferredWidth(150);
        karyawanTable.getColumnModel().getColumn(1).setResizable(false);
        karyawanTable.getColumnModel().getColumn(1).setPreferredWidth(200);
        karyawanTable.getColumnModel().getColumn(2).setResizable(false);
        karyawanTable.getColumnModel().getColumn(2).setPreferredWidth(200);
        karyawanTable.getColumnModel().getColumn(3).setResizable(false);
        karyawanTable.getColumnModel().getColumn(3).setPreferredWidth(100);
        karyawanTable.getColumnModel().getColumn(4).setResizable(false);
        karyawanTable.getColumnModel().getColumn(4).setPreferredWidth(100);
        karyawanTable.getColumnModel().getColumn(5).setResizable(false);
        karyawanTable.getColumnModel().getColumn(5).setPreferredWidth(100);
        karyawanTable.getColumnModel().getColumn(6).setResizable(false);
        karyawanTable.getColumnModel().getColumn(7).setResizable(false);
        karyawanTable.getColumnModel().getColumn(8).setResizable(false);
        karyawanTable.getColumnModel().getColumn(8).setPreferredWidth(100);

        org.jdesktop.layout.GroupLayout daftarKaryawanPanelLayout = new org.jdesktop.layout.GroupLayout(daftarKaryawanPanel);
        daftarKaryawanPanel.setLayout(daftarKaryawanPanelLayout);
        daftarKaryawanPanelLayout.setHorizontalGroup(
            daftarKaryawanPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
        );
        daftarKaryawanPanelLayout.setVerticalGroup(
            daftarKaryawanPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
        );

        daftarKaryawanPanel.setBounds(0, 390, 740, 210);
        jDesktopPane1.add(daftarKaryawanPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        headPanel.setBackground(new java.awt.Color(255, 255, 255));

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logosimtel.jpg"))); // NOI18N

        menuLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        menuLabel.setText("Menu Data Karyawan");

        fungsiLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        fungsiLabel.setText("Digunakan untuk menambah, edit dan menghapus data karyawan");

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
                    .add(fungsiLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 472, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(204, Short.MAX_VALUE))
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

        headPanel.setBounds(0, 0, 740, 77);
        jDesktopPane1.add(headPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelStatus1.setBounds(0, 660, 740, 50);
        jDesktopPane1.add(panelStatus1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jDesktopPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jDesktopPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-756)/2, (screenSize.height-749)/2, 756, 749);
    }// </editor-fold>//GEN-END:initComponents

    private void hapusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusButtonActionPerformed
        String nip = String.valueOf(nipKaryawanCombo.getSelectedItem());
        String nama = namaKaryawanTextField.getText();
        activeKaryawan.setNip(nip);
        activeKaryawan.setNama(nama);
        int ok = JOptionPane.showConfirmDialog(null, "Anda Yakin Akan Menghapus Data\nDengan NIP = " + nip + "", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (ok == 0) {
            try {
                DaoFactory.getKaryawanDao().delete(activeKaryawan);
                JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus dengan NIP\n"
                        + "<html><font color=#FF0000>" + nip + "</font></html>", "Pemberitahuan", JOptionPane.INFORMATION_MESSAGE);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Data Gagal Dihapus\n"
                        + "<html><font color=#FF0000>" + ex + "</font></html>", "Error", JOptionPane.ERROR_MESSAGE);

            }

        }
        batalButton.doClick();
    }//GEN-LAST:event_hapusButtonActionPerformed

    private void karyawanTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_karyawanTableMouseClicked
        try {
            int row = karyawanTable.getSelectedRow();
            String nip = karyawanTable.getValueAt(row, 0).toString();
            String nama = karyawanTable.getValueAt(row, 1).toString();
            String alamat = karyawanTable.getValueAt(row, 2).toString();
            String tanggal = karyawanTable.getValueAt(row, 3).toString();
            String golongan = karyawanTable.getValueAt(row, 4).toString();
            String posisi = karyawanTable.getValueAt(row, 5).toString();
            String outlet = karyawanTable.getValueAt(row, 6).toString();
            String department = karyawanTable.getValueAt(row, 7).toString();
            String no_rekening = karyawanTable.getValueAt(row, 8).toString();

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date date = null;
            try {
                date = simpleDateFormat.parse(tanggal);
            } catch (ParseException ex) {
                Logger.getLogger(KaryawanForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            String kode = karyawanTable.getValueAt(row, 4).toString();
            namaKaryawanTextField.setText(nama);
            nipKaryawanCombo.setSelectedItem(nip);
            alamatKaryawanTextField.setText(alamat);
            tanggalMasukDateChooser.setDate(date);
            golonganCombo.setSelectedItem(golongan + "-" + DaoFactory.getGolonganDao().getByKodeGolongan(golongan).getNamaGolongan());
            posisiCombo.setSelectedItem(posisi + "-" + DaoFactory.getPosisiDao().getByKode(posisi).getNama_posisi());
            outletCombo.setSelectedItem(outlet + "-" + DaoFactory.getOutletDao().getByKodeOutlet(outlet).getNamaOutlet());
            departmentCombo.setSelectedItem(department + "-" + DaoFactory.getDepartmentDao().getByKode(department).getNamaDepartment());
            noRekeningTextField.setText(no_rekening);

            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(KaryawanForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_karyawanTableMouseClicked
    private void isitable() {
    }

    private void simpanButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_simpanButtonKeyPressed
        simpanButton.doClick();// TODO add your handling code here:
    }//GEN-LAST:event_simpanButtonKeyPressed

    private void simpanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanButtonActionPerformed
        String nip = String.valueOf(nipKaryawanCombo.getSelectedItem());
        String nama = namaKaryawanTextField.getText();
        String alamat = alamatKaryawanTextField.getText();
        String tanggal = DateTool.dateToString(tanggalMasukDateChooser.getDate(), "yyyy-MM-dd");
        String golongan = golonganCombo.getSelectedItem().toString();
        String kodeGolongan = golongan.substring(0, golongan.indexOf("-"));
        String posisi = posisiCombo.getSelectedItem().toString();
        String kodePosisi = posisi.substring(0, posisi.indexOf("-"));
        String outlet = outletCombo.getSelectedItem().toString();
        String kodeOutlet = outlet.substring(0, outlet.indexOf("-"));
        String department = departmentCombo.getSelectedItem().toString();
        String kodeDepartment = department.substring(0, department.indexOf("-"));
        String no_rekening = noRekeningTextField.getText();
        char[] charArray = nip.toCharArray();
        if (nipKaryawanCombo.getSelectedItem() == null || String.valueOf(nipKaryawanCombo.getSelectedItem()).matches("")
                || namaKaryawanTextField.getText() == null || namaKaryawanTextField.getText().matches("")
                || alamatKaryawanTextField.getText() == null || alamatKaryawanTextField.getText().matches("")
                || noRekeningTextField.getText() == null || noRekeningTextField.getText().matches("")
                || tanggalMasukDateChooser.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Semua field harus terisi", "ERROR", JOptionPane.ERROR_MESSAGE);

        } else if (charArray.length > 10) {
            JOptionPane.showMessageDialog(this, "NIP tidak boleh melibihi 10 karakter", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            Karyawan karyawanBaru = new Karyawan();
            karyawanBaru.setNip(nip);
            karyawanBaru.setNama(nama);
            karyawanBaru.setAlamat(alamat);
            karyawanBaru.setTanggal_masuk(tanggal);
            karyawanBaru.setKodeGolongan(kodeGolongan);
            karyawanBaru.setKodePosisi(kodePosisi);
            karyawanBaru.setKodeOutlet(kodeOutlet);
            karyawanBaru.setKodeDepartment(kodeDepartment);
            karyawanBaru.setNo_rekening(no_rekening);
            if ("Simpan".equals(simpanButton.getText())) {
                try {
                    DaoFactory.getKaryawanDao().insert(karyawanBaru);

                    JOptionPane.showMessageDialog(this, "Data dengan Nama \n"
                            + "<html><font color=#FF0000>" + nama + "</font></html>" + "\nBerhasil diSimpan", "Pemberitahuan", JOptionPane.INFORMATION_MESSAGE);

                    batalButton.doClick();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } else {
                try {
                    Karyawan karyawanLama = DaoFactory.getKaryawanDao().getByNIPKaryawan(nip);
                    karyawanLama.setNip(nip);
                    karyawanLama.setNama(nama);
                    karyawanLama.setAlamat(alamat);
                    karyawanLama.setTanggal_masuk(tanggal);
                    karyawanLama.setKodeGolongan(kodeGolongan);
                    karyawanLama.setKodePosisi(kodePosisi);
                    karyawanLama.setKodeOutlet(kodeOutlet);
                    karyawanLama.setKodeDepartment(kodeDepartment);
                    karyawanLama.setNo_rekening(no_rekening);
                    DaoFactory.getKaryawanDao().update(karyawanLama);
                    JOptionPane.showMessageDialog(this, "Data dengan nama\n"
                            + "<html><font color=#FF0000>" + nama + "</font></html>" + "\nBerhasil diUpdate", "Pemberitahuan", JOptionPane.INFORMATION_MESSAGE);

                    batalButton.doClick();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_simpanButtonActionPerformed

    private void cmdKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdKeluarActionPerformed
        frame.setEnabled(true);
        menuItem.setEnabled(true);
        this.dispose();
}//GEN-LAST:event_cmdKeluarActionPerformed

    private void nipKaryawanComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nipKaryawanComboActionPerformed

        if (nipKaryawanCombo.getSelectedItem() != null) {
            String pilih = String.valueOf(nipKaryawanCombo.getSelectedItem());
            try {
                activeKaryawan = DaoFactory.getKaryawanDao().getByNIPKaryawan(pilih);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            //jika ditemukan
            if (activeKaryawan != null) {
                String tanggal = activeKaryawan.getTanggal_masuk();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
                Date tanggalMasuk = null;
                try {
                    tanggalMasuk = simpleDateFormat.parse(tanggal);
                } catch (ParseException ex) {
                    Logger.getLogger(KaryawanForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                namaKaryawanTextField.setText(activeKaryawan.getNama());
                alamatKaryawanTextField.setText(activeKaryawan.getAlamat());
                tanggalMasukDateChooser.setDate(tanggalMasuk);
                golonganCombo.setSelectedItem(activeKaryawan.getKodeGolongan());
                posisiCombo.setSelectedItem(activeKaryawan.getKodePosisi());
                outletCombo.setSelectedItem(activeKaryawan.getKodeOutlet());
                departmentCombo.setSelectedItem(activeKaryawan.getKodeDepartment());
                noRekeningTextField.setText(activeKaryawan.getNo_rekening());
                simpanButton.setText("Update");
                simpanButton.setMnemonic('U');
                simpanButton.setEnabled(true);
                hapusButton.setEnabled(true);
                nipKaryawanCombo.requestFocus();

            } else {
                namaKaryawanTextField.setText(null);
                alamatKaryawanTextField.setText(null);
                noRekeningTextField.setText(null);
                namaKaryawanTextField.requestFocus();
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
    }//GEN-LAST:event_nipKaryawanComboActionPerformed

    private void namaKaryawanTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaKaryawanTextFieldActionPerformed
        alamatKaryawanTextField.requestFocus();
// TODO add your handling code here:
    }//GEN-LAST:event_namaKaryawanTextFieldActionPerformed

    private void nipKaryawanComboKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nipKaryawanComboKeyPressed
        if (evt.getKeyCode() == 10) {
        }

    }//GEN-LAST:event_nipKaryawanComboKeyPressed

    private void batalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalButtonActionPerformed
        namaKaryawanTextField.setText(null);
        simpanButton.setEnabled(false);
        hapusButton.setEnabled(true);
        tanggalMasukDateChooser.setDate(gc.getTime());
        alamatKaryawanTextField.setText(null);
        noRekeningTextField.setText(null);
        golonganCombo.setSelectedIndex(0);
        posisiCombo.setSelectedIndex(0);
        outletCombo.setSelectedIndex(0);
        departmentCombo.setSelectedIndex(0);
        nipKaryawanCombo.removeAllItems();
        nipKaryawanCombo.requestFocus();
        List<Karyawan> karyawans = null;
        try {
            karyawans = DaoFactory.getKaryawanDao().getAllKaryawan();
        } catch (SQLException ex) {
            Logger.getLogger(KaryawanForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        KaryawanTableModel model = new KaryawanTableModel(karyawans);
        karyawanTable.setModel(model);
        karyawanTable.getColumnModel().getColumn(2).setPreferredWidth(250);
        karyawanTable.getColumnModel().getColumn(3).setPreferredWidth(200);
        karyawanTable.getColumnModel().getColumn(4).setPreferredWidth(200);
        karyawanTable.getColumnModel().getColumn(7).setPreferredWidth(150);
        karyawanTable.getColumnModel().getColumn(8).setPreferredWidth(200);
        karyawanTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        for (Karyawan k : karyawans) {
            nipKaryawanCombo.addItem(k.getNip());
        }

}//GEN-LAST:event_batalButtonActionPerformed

    private void alamatKaryawanTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatKaryawanTextFieldActionPerformed
        // TODO add your handling code here:
        tanggalMasukDateChooser.requestFocus();
    }//GEN-LAST:event_alamatKaryawanTextFieldActionPerformed

private void tanggalMasukDateChooserPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tanggalMasukDateChooserPropertyChange
// TODO add your handling code here:
}//GEN-LAST:event_tanggalMasukDateChooserPropertyChange

private void noRekeningTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noRekeningTextFieldActionPerformed
// TODO add your handling code here:
    simpanButton.setEnabled(true);
    simpanButton.requestFocus();
}//GEN-LAST:event_noRekeningTextFieldActionPerformed

    private void golonganComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_golonganComboActionPerformed
        // TODO add your handling code here:
        outletCombo.requestFocus();
    }//GEN-LAST:event_golonganComboActionPerformed

    private void outletComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outletComboActionPerformed
        // TODO add your handling code here:
        posisiCombo.requestFocus();
    }//GEN-LAST:event_outletComboActionPerformed

    private void posisiComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posisiComboActionPerformed
        // TODO add your handling code here:
        departmentCombo.actionPerformed(evt);
    }//GEN-LAST:event_posisiComboActionPerformed

    private void departmentComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departmentComboActionPerformed

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
                    new KaryawanForm(null, null).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(KaryawanForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alamatKaryawanLabel;
    private javax.swing.JTextField alamatKaryawanTextField;
    private javax.swing.JButton batalButton;
    private javax.swing.JButton cmdKeluar;
    private javax.swing.JPanel daftarKaryawanPanel;
    private javax.swing.JComboBox departmentCombo;
    private javax.swing.JLabel fungsiLabel;
    private javax.swing.JComboBox golonganCombo;
    private javax.swing.JLabel golonganKaryawanLabel;
    private javax.swing.JButton hapusButton;
    private javax.swing.JPanel headPanel;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable karyawanTable;
    private javax.swing.JLabel kodeDepartmentLabel;
    private javax.swing.JLabel kodeOutletLabel;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel menuLabel;
    private javax.swing.JLabel namaKaryawanLabel;
    private javax.swing.JTextField namaKaryawanTextField;
    private javax.swing.JComboBox nipKaryawanCombo;
    private javax.swing.JLabel nipKaryawanLabel;
    private javax.swing.JLabel noRekeningLabel;
    private javax.swing.JTextField noRekeningTextField;
    private javax.swing.JComboBox outletCombo;
    private com.sistem.panelstatus.PanelStatus panelStatus1;
    private javax.swing.JComboBox posisiCombo;
    private javax.swing.JLabel posisiKaryawanLabel;
    private javax.swing.JButton simpanButton;
    private com.toedter.calendar.JDateChooser tanggalMasukDateChooser;
    private javax.swing.JLabel tanggalMasukKaryawanLabel;
    // End of variables declaration//GEN-END:variables
}
