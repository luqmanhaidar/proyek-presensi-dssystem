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
        return 18;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        TransaksiGajiDepartmentReport tD=transaksiGajiDepartmentReports.get(rowIndex);
        int counter=0;
        switch (columnIndex) {
            case 0:
                return String.valueOf(rowIndex+1);
            case 1:
                return tD.getDepartment();
            case 2:
                return tD.getNip();
            case 3:
                return tD.getNama();
            case 4:
                return String.valueOf(tD.getM());
            case 5:
                return String.valueOf(tD.getS());
            case 6:
                return String.valueOf(tD.getI());
            case 7:
                return String.valueOf(tD.getA());
            case 8:
                return String.valueOf(tD.getT());
            case 9:
                return String.valueOf(tD.getL());
            case 10:
                return ChangeFormatDoubleToString.getToString(tD.getPokok());
            case 11:
                return ChangeFormatDoubleToString.getToString(tD.getUangMakan());
            case 12:
                return ChangeFormatDoubleToString.getToString(tD.getUangHadir());
            case 13:
                return ChangeFormatDoubleToString.getToString(tD.getUanglembur());
            case 14:
                return ChangeFormatDoubleToString.getToString(tD.getLain());
            case 15:
                return ChangeFormatDoubleToString.getToString(tD.getPotonganTelat());
            case 16:
                return ChangeFormatDoubleToString.getToString(tD.getPotonganLain());
            case 17:
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
                return "NAMA DEPARTMENT";
            case 2:
                return "NIP";
            case 3:
                return "NAMA";
            case 4:
                return "M";
            case 5:
                return "S";
            case 6:
                return "I";
            case 7:
                return "A";
            case 8:
                return "T";
            case 9:
                return "L";
            case 10:
                return "POKOK";
            case 11:
                return "MAKAN";
            case 12:
                return "HADIR";
            case 13:
                return "LEMBUR";
            case 14:
                return "LAIN";
            case 15:
                return "P. TELAT";
            case 16:
                return "P. LAIN";
            case 17:
                return "TOTAL";
            default:
                return "";
        }
    }
}
