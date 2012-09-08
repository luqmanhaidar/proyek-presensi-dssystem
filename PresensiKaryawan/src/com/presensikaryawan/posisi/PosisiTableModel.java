/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.posisi;

import com.presensikaryawan.statusSetting.StatusSetting;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Tinus
 */
public class PosisiTableModel extends AbstractTableModel{
private List<Posisi> posisis = new ArrayList<Posisi>();

    public PosisiTableModel(List<Posisi> posisis) {
        this.posisis = posisis;
    }

    public void deleteStatusSetting(int row){
        posisis.remove(row);
        fireTableRowsDeleted(row, row);
    }

    public void updateStatusSetting(int row, Posisi posisi){
        posisis.set(row,posisi);
        fireTableRowsUpdated(row, row);
    }

    public void addLiburPerusahaan(Posisi posisi) {
        posisis.add(posisi);
        fireTableRowsInserted(getRowCount() - 1, getColumnCount() - 1);
    }
    @Override
    public int getRowCount() {
        return posisis.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Posisi pS=posisis.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return pS.getKode_posisi();
            case 1:
                return pS.getNama_posisi();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "KODE";
            case 1:
                return "POSISI";
            default:
                return "";
        }
    }
    
}
