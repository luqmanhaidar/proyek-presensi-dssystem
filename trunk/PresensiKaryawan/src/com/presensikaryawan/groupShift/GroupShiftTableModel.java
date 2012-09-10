/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.groupShift;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Tinus
 */
public class GroupShiftTableModel extends AbstractTableModel {

    private List<GroupShift> groupShifts = new ArrayList<GroupShift>();

    public GroupShiftTableModel(List<GroupShift> groupShifts) {
        this.groupShifts = groupShifts;
    }

    public void deleteGroupShift(int row) {
        groupShifts.remove(row);
        fireTableRowsDeleted(row, row);
    }

    public void updateGroupShift(int row, GroupShift groupShift) {
        groupShifts.set(row, groupShift);
        fireTableRowsUpdated(row, row);
    }

    public void addLiburPerusahaan(GroupShift groupShift) {
        groupShifts.add(groupShift);
        fireTableRowsInserted(getRowCount() - 1, getColumnCount() - 1);
    }

    @Override
    public int getRowCount() {
        return groupShifts.size();
    }

    @Override
    public int getColumnCount() {
        return 10;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        GroupShift groupShift = groupShifts.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return groupShift.getKodeGroupShift();
            case 1:
                return groupShift.getNamaGroupShift();
            case 2:
                return groupShift.getKeterangan();
            case 3:
                return groupShift.getShift()[0].getKodeShift();
            case 4:
                return groupShift.getShift()[1].getKodeShift();
            case 5:
                return groupShift.getShift()[2].getKodeShift();
            case 6:
                return groupShift.getShift()[3].getKodeShift();
            case 7:
                return groupShift.getShift()[4].getKodeShift();
            case 8:
                return groupShift.getShift()[5].getKodeShift();
            case 9:
                return groupShift.getShift()[6].getKodeShift();
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
                return "NAMA";
            case 2:
                return "DESKRIPSI";
            case 3:
                return "SENIN";
            case 4:
                return "SELASA";
            case 5:
                return "RABU";
            case 6:
                return "KAMIS";
            case 7:
                return "JUMAT";
            case 8:
                return "SABTU";
            case 9:
                return "MINGGU";
            default:
                return "";
        }
    }
}
