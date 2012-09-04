/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.liburNasional;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Eki
 */
public class LiburNasionalTableModel extends AbstractTableModel {
    
    private List<LiburNasional> liburNasionals = new ArrayList<LiburNasional>();

    public LiburNasionalTableModel(List<LiburNasional> liburNasionals) {
        this.liburNasionals = liburNasionals;
    }

    public void deleteKategori(int row){
        liburNasionals.remove(row);
        fireTableRowsDeleted(row, row);
    }

    public void updateKategori(int row, LiburNasional liburNasional){
        liburNasionals.set(row,liburNasional);
        fireTableRowsUpdated(row, row);
    }

    public void addKategori(LiburNasional liburNasional) {
        liburNasionals.add(liburNasional);
        fireTableRowsInserted(getRowCount() - 1, getColumnCount() - 1);
    }
    @Override
    public int getRowCount() {
        return liburNasionals.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        LiburNasional l = liburNasionals.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return l.getTanggal();
            case 1:
                return l.getKeterangan();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "TANGGAL";
            case 1:
                return "KETERANGAN";
            default:
                return "";
        }
    }
    
}
