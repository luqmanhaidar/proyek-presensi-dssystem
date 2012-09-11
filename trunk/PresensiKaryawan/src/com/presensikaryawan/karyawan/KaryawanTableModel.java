/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.karyawan;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Eki
 */
public class KaryawanTableModel extends AbstractTableModel {
    
    private List<Karyawan> karyawans = new ArrayList<Karyawan>();

    public KaryawanTableModel(List<Karyawan> karyawans) {
        this.karyawans = karyawans;
    }

    public void deleteKaryawan(int row){
        karyawans.remove(row);
        fireTableRowsDeleted(row, row);
    }

    public void updateKaryawan(int row, Karyawan karyawan){
        karyawans.set(row,karyawan);
        fireTableRowsUpdated(row, row);
    }

    public void addKaryawan(Karyawan karyawan) {
        karyawans.add(karyawan);
        fireTableRowsInserted(getRowCount() - 1, getColumnCount() - 1);
    }
    @Override
    public int getRowCount() {
        return karyawans.size();
    }

    @Override
    public int getColumnCount() {
        return 8;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Karyawan k = karyawans.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return k.getNip();
            case 1:
                return k.getNama();
            case 2:
                return k.getAlamat();
            case 3:
                return k.getTanggal_masuk();
            case 4:
                return k.getKodeGolongan();
            case 5:
                return k.getKodePosisi();
            case 6:
                return k.getKodeOutlet();
            case 7:
                return k.getKodeDepartment();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "NIP";
            case 1:
                return "NAMA";
            case 2:
                return "ALAMAT";
            case 3:
                return "TANGGAL MASUK";
            case 4:
                return "KODE GOLONGAN";
            case 5:
                return "POSISI";
            case 6:
                return "OUTLET";
            case 7:
                return "DEPARTMENT";
            default:
                return "";
        }
    }
    
}
