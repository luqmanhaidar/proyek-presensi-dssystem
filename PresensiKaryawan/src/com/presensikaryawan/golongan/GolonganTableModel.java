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

    public void deleteKategori(int row){
        golongans.remove(row);
        fireTableRowsDeleted(row, row);
    }

    public void updateKategori(int row, Golongan golongan){
        golongans.set(row,golongan);
        fireTableRowsUpdated(row, row);
    }

    public void addKategori(Golongan golongan) {
        golongans.add(golongan);
        fireTableRowsInserted(getRowCount() - 1, getColumnCount() - 1);
    }
    @Override
    public int getRowCount() {
        return golongans.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Golongan g = golongans.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return g.getKodeGolongan();
            case 1:
                return g.getNamaGolongan();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "KODE KATEGORI";
            case 1:
                return "NAMA KATEGORI";
            default:
                return "";
        }
    }
}
