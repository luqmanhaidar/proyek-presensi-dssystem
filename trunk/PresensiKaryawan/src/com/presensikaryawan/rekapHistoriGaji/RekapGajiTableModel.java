/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.rekapHistoriGaji;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Tinus
 */
public class RekapGajiTableModel extends AbstractTableModel {

    private List<RekapGaji> rekapGajis = new ArrayList<RekapGaji>();

    public RekapGajiTableModel(List<RekapGaji> rekapGajis) {
        this.rekapGajis = rekapGajis;
    }

    public void deleteStatusSetting(int row) {
        rekapGajis.remove(row);
        fireTableRowsDeleted(row, row);
    }

    public void updateStatusSetting(int row, RekapGaji rekapGaji) {
        rekapGajis.set(row, rekapGaji);
        fireTableRowsUpdated(row, row);
    }

    public void addLiburPerusahaan(RekapGaji rekapGaji) {
        rekapGajis.add(rekapGaji);
        fireTableRowsInserted(getRowCount() - 1, getColumnCount() - 1);
    }

    @Override
    public int getRowCount() {
        return rekapGajis.size();
    }

    @Override
    public int getColumnCount() {
        return 15;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        RekapGaji rG = rekapGajis.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return String.valueOf(rG.getNo());
            case 1:
                return rG.getBulan();
            case 2:
                return String.valueOf(rG.getS());
            case 3:
                return String.valueOf(rG.getI());
            case 4:
                return String.valueOf(rG.getA());
            case 5:
                return String.valueOf(rG.getT());
            case 6:
                return String.valueOf(rG.getLembur());
            case 7:
                return String.valueOf(rG.getGaji_pokok());
            case 8:
                return String.valueOf(rG.getUang_makan());
            case 9:
                return String.valueOf(rG.getUang_hadir());
            case 10:
                return String.valueOf(rG.getUang_lembur());
            case 11:
                return String.valueOf(rG.getPotongan_terlambat());
            case 12:
                return String.valueOf(rG.getPotongan_lain());
            case 13:
                return String.valueOf(rG.getLain_lain());
            case 14:
                return String.valueOf(rG.getTotal());
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
             case 0:
                return "No";
            case 1:
                return "Bulan";
            case 2:
                return "S";
            case 3:
                return "I";
            case 4:
                return "A";
            case 5:
                return "T";
            case 6:
                return "L";
            case 7:
                return "Gaji Pokok";
            case 8:
                return "Uang Makan";
            case 9:
                return "Uang Hadir";
            case 10:
                return "Uang Lembur";
            case 11:
                return "P. Terlambat";
            case 12:
                return "P. Lain";
            case 13:
                return "Lain";
            case 14:
                return "Total";
            default:
                return "";
        }
    }
}
