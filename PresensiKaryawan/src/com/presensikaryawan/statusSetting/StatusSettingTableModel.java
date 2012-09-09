/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.statusSetting;

import com.presensikaryawan.liburPerusahaan.LiburPerusahaan;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Tinus
 */
public class StatusSettingTableModel extends AbstractTableModel{
        private List<StatusSetting> statusSettings = new ArrayList<StatusSetting>();

    public StatusSettingTableModel(List<StatusSetting> statusSettings) {
        this.statusSettings = statusSettings;
    }

    public void deleteStatusSetting(int row){
        statusSettings.remove(row);
        fireTableRowsDeleted(row, row);
    }

    public void updateStatusSetting(int row, StatusSetting statusSetting){
        statusSettings.set(row,statusSetting);
        fireTableRowsUpdated(row, row);
    }

    public void addStatusSetting(StatusSetting statusSetting) {
        statusSettings.add(statusSetting);
        fireTableRowsInserted(getRowCount() - 1, getColumnCount() - 1);
    }
    @Override
    public int getRowCount() {
        return statusSettings.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        StatusSetting sS=statusSettings.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return sS.getKodeStatus();
            case 1:
                return sS.getKeteranganStatus();
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
                return "KETERANGAN";
            default:
                return "";
        }
    }
}
