/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.shiftSetting;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Tinus
 */
public class ShiftTableModel extends AbstractTableModel {

    private List<Shift> shifts = new ArrayList<Shift>();

    public ShiftTableModel(List<Shift> shifts) {
        this.shifts = shifts;
    }

    public void deleteStatusSetting(int row) {
        shifts.remove(row);
        fireTableRowsDeleted(row, row);
    }

    public void updateStatusSetting(int row, Shift shift) {
        shifts.set(row, shift);
        fireTableRowsUpdated(row, row);
    }

    public void addLiburPerusahaan(Shift shift) {
        shifts.add(shift);
        fireTableRowsInserted(getRowCount() - 1, getColumnCount() - 1);
    }

    @Override
    public int getRowCount() {
        return shifts.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Shift shift = shifts.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return shift.getKodeShift();
            case 1:
                return shift.getNamaShift();
            case 2:
                return shift.getWaktuMulai();
            case 3:
                return shift.getWaktuSelesai();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "KODE SHIFT";
            case 1:
                return "NAMA SHIFT";
            case 2:
                return "WAKTU MULAI";
            case 3:
                return "WAKTU SELESAI";
            default:
                return "";
        }
    }
}
