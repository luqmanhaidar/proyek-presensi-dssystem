/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.jamMasukKeluarReport;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Tinus
 */
public class JamMasukKeluarTableModel extends AbstractTableModel{
private List<JamMasukKeluarReport> jamMasukKeluarReports = new ArrayList<JamMasukKeluarReport>();

    public JamMasukKeluarTableModel(List<JamMasukKeluarReport> jamMasukKeluarReports) {
        this.jamMasukKeluarReports = jamMasukKeluarReports;
    }

    @Override
    public int getRowCount() {
        return jamMasukKeluarReports.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        JamMasukKeluarReport jMK = jamMasukKeluarReports.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return jMK.getNo();
            case 1:
                return jMK.getNip();
            case 2:
                return jMK.getNama();
            case 3:
                return jMK.getTanggal();
            case 4:
                return jMK.getJamMasuk();
            case 5:
                return jMK.getJamKeluar();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
           case 0:
                return "NO";
            case 1:
                return "NIP";
            case 2:
                return "NAMA";
            case 3:
                return "TANGGAL";
            case 4:
                return "JAM MASUK";
            case 5:
                return "JAM KELUAR";
            default:
                return "";
        }
    }
    
}
