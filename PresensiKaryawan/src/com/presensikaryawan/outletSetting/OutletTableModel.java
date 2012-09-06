/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.outletSetting;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Eki
 */
public class OutletTableModel extends AbstractTableModel {

    private List<Outlet> outlets = new ArrayList<Outlet>();

    public OutletTableModel(List<Outlet> outlets) {
        this.outlets = outlets;
    }

    public void deleteOutlet(int row){
        outlets.remove(row);
        fireTableRowsDeleted(row, row);
    }

    public void updateOutlet(int row, Outlet outlet){
        outlets.set(row,outlet);
        fireTableRowsUpdated(row, row);
    }

    public void addOutlet(Outlet outlet) {
        outlets.add(outlet);
        fireTableRowsInserted(getRowCount() - 1, getColumnCount() - 1);
    }
    @Override
    public int getRowCount() {
        return outlets.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Outlet o = outlets.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return o.getKodeOutlet();
            case 1:
                return o.getNamaOutlet();
            case 2:
                return o.getAlamatOutlet();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "KODE OUTLET";
            case 1:
                return "NAMA OUTLET";
            case 2:
                return "ALAMAT OUTLET";
            default:
                return "";
        }
    }
}
