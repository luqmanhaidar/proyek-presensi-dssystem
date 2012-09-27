/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.transaksiGajiDepartmentTotalReport;

import com.dssystem.umum.ChangeFormatDoubleToString;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Tinus
 */
public class TransaksiGajiDepartmentReportTableModel extends AbstractTableModel{
    private List<TransaksiGajiDepartmentReport> transaksiGajiDepartmentReports = new ArrayList<TransaksiGajiDepartmentReport>();

    public TransaksiGajiDepartmentReportTableModel(List<TransaksiGajiDepartmentReport> transaksiGajiDepartmentReports) {
        this.transaksiGajiDepartmentReports = transaksiGajiDepartmentReports;
    }
    @Override
    public int getRowCount() {
        return transaksiGajiDepartmentReports.size();
    }

    @Override
    public int getColumnCount() {
        return 17;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        TransaksiGajiDepartmentReport tD=transaksiGajiDepartmentReports.get(rowIndex);
        int counter=0;
        switch (columnIndex) {
            case 0:
                return String.valueOf(rowIndex+1);
            case 1:
                return tD.getNip();
            case 2:
                return tD.getNama();
            case 3:
                return String.valueOf(tD.getM());
            case 4:
                return String.valueOf(tD.getS());
            case 5:
                return String.valueOf(tD.getI());
            case 6:
                return String.valueOf(tD.getA());
            case 7:
                return String.valueOf(tD.getT());
            case 8:
                return String.valueOf(tD.getL());
            case 9:
                return ChangeFormatDoubleToString.getToString(tD.getPokok());
            case 10:
                return ChangeFormatDoubleToString.getToString(tD.getUangMakan());
            case 11:
                return ChangeFormatDoubleToString.getToString(tD.getUangHadir());
            case 12:
                return ChangeFormatDoubleToString.getToString(tD.getUanglembur());
            case 13:
                return ChangeFormatDoubleToString.getToString(tD.getLain());
            case 14:
                return ChangeFormatDoubleToString.getToString(tD.getPotonganTelat());
            case 15:
                return ChangeFormatDoubleToString.getToString(tD.getPotonganLain());
            case 16:
                return ChangeFormatDoubleToString.getToString(tD.getTotal());
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
                return "M";
            case 4:
                return "S";
            case 5:
                return "I";
            case 6:
                return "A";
            case 7:
                return "T";
            case 8:
                return "L";
            case 9:
                return "POKOK";
            case 10:
                return "MAKAN";
            case 11:
                return "HADIR";
            case 12:
                return "LEMBUR";
            case 13:
                return "LAIN";
            case 14:
                return "P. TELAT";
            case 15:
                return "P. LAIN";
            case 16:
                return "TOTAL";
            default:
                return "";
        }
    }
}
