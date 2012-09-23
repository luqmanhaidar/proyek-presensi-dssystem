/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.detailpresensikaryawan;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Tinus
 */
public class DetailPresensiTableModel extends AbstractTableModel{
private List<DetailPresensi> detailPresensis = new ArrayList<DetailPresensi>();

    public DetailPresensiTableModel(List<DetailPresensi> detailPresensis) {
        this.detailPresensis = detailPresensis;
    }

    public void deleteLiburPerusahaan(int row){
        detailPresensis.remove(row);
        fireTableRowsDeleted(row, row);
    }

    public void updateLiburPerusahaan(int row, DetailPresensi detailPresensi){
        detailPresensis.set(row,detailPresensi);
        fireTableRowsUpdated(row, row);
    }

    public void addLiburPerusahaan(DetailPresensi detailPresensi) {
        detailPresensis.add(detailPresensi);
        fireTableRowsInserted(getRowCount() - 1, getColumnCount() - 1);
    }
    @Override
    public int getRowCount() {
        return detailPresensis.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        DetailPresensi dP = detailPresensis.get(rowIndex);
        switch (columnIndex) {

            case 0:
                return dP.getTanggal();
            case 1:
                return dP.getKeterangan();
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
