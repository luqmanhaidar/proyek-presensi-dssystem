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
                return rG.getNo();
            case 1:
                return rG.getBulan();
            case 2:
                return rG.getS();
            case 3:
                return rG.getI();
            case 4:
                return rG.getA();
            case 5:
                return rG.getT();
            case 6:
                return rG.getLembur();
            case 7:
                return rG.getGaji_pokok();
            case 8:
                return rG.getUang_makan();
            case 9:
                return rG.getUang_lembur();
            case 10:
                return rG.getUang_hadir();
            case 11:
                return rG.getPotongan_terlambat();
            case 12:
                return rG.getPotongan_lain();
            case 13:
                return rG.getLain_lain();
            case 14:
                return rG.getTotal();
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
