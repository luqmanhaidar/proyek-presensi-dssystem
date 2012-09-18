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

    private List<PresensiKaryawan> presensiKaryawans = new ArrayList<PresensiKaryawan>();

    public PresensiTableModel(List<PresensiKaryawan> presensiKaryawans) {
        this.presensiKaryawans = presensiKaryawans;
    }

    @Override
    public int getRowCount() {
        return 1;
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
//        PresensiKaryawan pK = presensiKaryawans.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return "095314053";
            case 1:
                return "Agustinus";
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "NIP";
            case 1:
                return "NAMA";
            case 2:
                return "S";
            case 3:
                return "I";
            case 4:
                return "A";
            case 5:
                return "T";
            case 6:
                return "M";
            default:
                return "";
        }
    }
}
