/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.rekapHistoriGajiReport;

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
                return rG.getNip();
            case 3:
                return rG.getNama();
            case 4:
                return String.valueOf(rG.getS());
            case 5:
                return String.valueOf(rG.getI());
            case 6:
                return String.valueOf(rG.getA());
            case 7:
                return String.valueOf(rG.getT());
            case 8:
                return String.valueOf(rG.getLembur());
            case 9:
                return String.valueOf(rG.getGaji_pokok());
            case 10:
                return String.valueOf(rG.getUang_makan());
            case 11:
                return String.valueOf(rG.getUang_hadir());
            case 12:
                return String.valueOf(rG.getUang_lembur());
            case 13:
                return String.valueOf(rG.getPotongan_terlambat());
            case 14:
                return String.valueOf(rG.getPotongan_lain());
            case 15:
                return String.valueOf(rG.getLain_lain());
            case 16:
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
                return "NIP";
            case 3:
                return "Nama";
            case 4:
                return "S";
            case 5:
                return "I";
            case 6:
                return "A";
            case 7:
                return "T";
            case 8:
                return "L";
            case 9:
                return "Gaji Pokok";
            case 10:
                return "Uang Makan";
            case 11:
                return "Uang Hadir";
            case 12:
                return "Uang Lembur";
            case 13:
                return "P. Terlambat";
            case 14:
                return "P. Lain";
            case 15:
                return "Lain";
            case 16:
                return "Total";
            default:
                return "";
        }
    }
}
