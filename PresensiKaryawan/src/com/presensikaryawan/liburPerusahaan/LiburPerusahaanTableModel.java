/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.liburPerusahaan;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Eki
 */
public class LiburPerusahaanTableModel extends AbstractTableModel {

    private List<LiburPerusahaan> liburPerusahaans = new ArrayList<LiburPerusahaan>();

    public LiburPerusahaanTableModel(List<LiburPerusahaan> liburPerusahaans) {
        this.liburPerusahaans = liburPerusahaans;
    }

    public void deleteLiburPerusahaan(int row){
        liburPerusahaans.remove(row);
        fireTableRowsDeleted(row, row);
    }

    public void updateLiburPerusahaan(int row, LiburPerusahaan liburPerusahaan){
        liburPerusahaans.set(row,liburPerusahaan);
        fireTableRowsUpdated(row, row);
    }

    public void addLiburPerusahaan(LiburPerusahaan liburPerusahaan) {
        liburPerusahaans.add(liburPerusahaan);
        fireTableRowsInserted(getRowCount() - 1, getColumnCount() - 1);
    }
    @Override
    public int getRowCount() {
        return liburPerusahaans.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        LiburPerusahaan lP = liburPerusahaans.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return lP.getNo();
            case 1:
                return lP.getTanggal();
            case 2:
                return lP.getKeterangan();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "NO";
            case 1:
                return "TANGGAL";
            case 2:
                return "KETERANGAN";
            default:
                return "";
        }
    }
}
