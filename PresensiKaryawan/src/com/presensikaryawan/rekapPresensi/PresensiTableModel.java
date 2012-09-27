/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.rekapPresensi;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Tinus
 */
public class PresensiTableModel extends AbstractTableModel {

    private List<DetailPresensi> detailPresensis = new ArrayList<DetailPresensi>();

    public PresensiTableModel(List<DetailPresensi> detailPresensis) {
        this.detailPresensis = detailPresensis;
    }

    @Override
    public int getRowCount() {
        return detailPresensis.size();
    }

    @Override
    public int getColumnCount() {
        return 8;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        DetailPresensi dP=detailPresensis.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return dP.getNo();
            case 1:
                return dP.getNip();
            case 2:
                return dP.getNama_karyawan();
            case 3:
                return dP.getJumlah_s();
            case 4:
                return dP.getJumlah_i();
            case 5:
                return dP.getJumlah_a();
            case 6:
                return dP.getJumlah_t();
            case 7:
                return dP.getJumlah_m();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "No.";
            case 1:
                return "NIP";
            case 2:
                return "Nama Karyawan";
            case 3:
                return "S";
            case 4:
                return "I";
            case 5:
                return "A";
            case 6:
                return "T";
            case 7:
                return "M";
            default:
                return "";
        }
    }
}
