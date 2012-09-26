/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.rekapPresensiPerBulanReport;

import com.presensikaryawan.rekapPresensi.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Tinus
 */
public class RekapPresensiPerBulanTableModel extends AbstractTableModel {

    private List<RekapPresensiPerBulan> rekapPresensiPerBulans = new ArrayList<RekapPresensiPerBulan>();

    public RekapPresensiPerBulanTableModel(List<RekapPresensiPerBulan> rekapPresensiPerBulans) {
        this.rekapPresensiPerBulans = rekapPresensiPerBulans;
    }

    @Override
    public int getRowCount() {
        return 1;
    }

    @Override
    public int getColumnCount() {
        return 8;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        RekapPresensiPerBulan rP=rekapPresensiPerBulans.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return String.valueOf(rP.getNo());
            case 1:
                return rP.getNip();
            case 2:
                return rP.getNama_karyawan();
            case 3:
                return String.valueOf(rP.getJumlah_s());
            case 4:
                return String.valueOf(rP.getJumlah_i());
            case 5:
                return String.valueOf(rP.getJumlah_a());
            case 6:
                return String.valueOf(rP.getJumlah_t());
            case 7:
                return String.valueOf(rP.getJumlah_m());
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
                return "Nama";
            case 3:
                return "Jum. S";
            case 4:
                return "Jum. I";
            case 5:
                return "Jum. A";
            case 6:
                return "Jum. T";
            case 7:
                return "Jum. M";
            default:
                return "";
        }
    }
}
