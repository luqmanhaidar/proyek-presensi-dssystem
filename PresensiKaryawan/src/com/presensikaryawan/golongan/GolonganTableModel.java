/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.golongan;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Eki
 */
public class GolonganTableModel extends AbstractTableModel {

    private List<Golongan> golongans = new ArrayList<Golongan>();

    public GolonganTableModel(List<Golongan> golongans) {
        this.golongans = golongans;
    }

    public void deleteGolongan(int row){
        golongans.remove(row);
        fireTableRowsDeleted(row, row);
    }

    public void updateGolongan(int row, Golongan golongan){
        golongans.set(row,golongan);
        fireTableRowsUpdated(row, row);
    }

    public void addGolongan(Golongan golongan) {
        golongans.add(golongan);
        fireTableRowsInserted(getRowCount() - 1, getColumnCount() - 1);
    }
    @Override
    public int getRowCount() {
        return golongans.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Golongan g = golongans.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return g.getKodeGolongan();
            case 1:
                return g.getNamaGolongan();
            case 2:
                return g.getGajiPokok();
            case 3:
                return g.getUangMakan();
            case 4:
                return g.getUangLembur();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "KODE GOLONGAN";
            case 1:
                return "NAMA GOLONGAN";
            case 2:
                return "GAJI POKOK";
            case 3:
                return "UANG MAKAN";
            case 4:
                return "UANG LEMBUR";
            default:
                return "";
        }
    }
}
