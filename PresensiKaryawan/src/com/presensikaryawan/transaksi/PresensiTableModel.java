/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.transaksi;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Tinus
 */
public class PresensiTableModel extends AbstractTableModel {

    private List<String[]> listString = new ArrayList<String[]>();

    public PresensiTableModel(List<String[]> listString) {
        this.listString = listString;
    }

    @Override
    public int getRowCount() {
        return 1;
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String[] string=listString.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return string[0];
            case 1:
                return string[1];
            case 2:
                return string[2];
            case 3:
                return string[3];
            case 4:
                return string[4];
            case 5:
                return string[5];
            case 6:
                return string[6];
            case 7:
                return string[7];
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "No.";
            case 1:
                return "NIP";
            case 2:
                return "Nama Karyawan";
            case 3:
                return "S";
            case 4:
                return "I";
            case 5:
                return "A";
            case 6:
                return "T";
            case 7:
                return "M";
            default:
                return "";
        }
    }
}
