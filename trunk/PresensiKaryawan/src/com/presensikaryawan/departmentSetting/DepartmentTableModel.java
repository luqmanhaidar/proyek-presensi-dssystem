/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.departmentSetting;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Tinus
 */
public class DepartmentTableModel extends AbstractTableModel {

    private List<Department> departmentSettings = new ArrayList<Department>();

    public DepartmentTableModel(List<Department> departments) {
        this.departmentSettings = departments;
    }

    public void deleteDepartmentSetting(int row) {
        departmentSettings.remove(row);
        fireTableRowsDeleted(row, row);
    }

    public void updateDepartmentSetting(int row, Department department) {
        departmentSettings.set(row, department);
        fireTableRowsUpdated(row, row);
    }

    public void addDepartmentSetting(Department department) {
        departmentSettings.add(department);
        fireTableRowsInserted(getRowCount() - 1, getColumnCount() - 1);
    }

    @Override
    public int getRowCount() {
        return departmentSettings.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Department d = departmentSettings.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return d.getKodeDepartment();
            case 1:
                return d.getNamaDepartment();
            case 2:
                return d.getDeskripsi();
            case 3:
                return d.getGroupShift().getKodeGroupShift();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "KODE DEPARTMENT";
            case 1:
                return "NAMA DEPARTMENT";
            case 2:
                return "DESKRIPSI";
            case 3:
                return "KODE GROUP SHIFT";
            default:
                return "";
        }
    }
}
