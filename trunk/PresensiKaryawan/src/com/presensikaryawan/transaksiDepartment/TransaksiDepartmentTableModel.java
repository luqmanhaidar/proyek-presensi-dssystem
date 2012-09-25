/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.transaksiDepartment;
import com.dssystem.umum.ChangeFormatDoubleToString;
import com.presensikaryawan.posisi.*;

import com.presensikaryawan.statusSetting.StatusSetting;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Tinus
 */
public class TransaksiDepartmentTableModel extends AbstractTableModel{
private List<TransaksiDepartment> transaksiDepartments = new ArrayList<TransaksiDepartment>();

    public TransaksiDepartmentTableModel(List<TransaksiDepartment> transaksiDepartments) {
        this.transaksiDepartments = transaksiDepartments;
    }

    public void deleteStatusSetting(int row){
        transaksiDepartments.remove(row);
        fireTableRowsDeleted(row, row);
    }

    public void updateStatusSetting(int row, TransaksiDepartment transaksiDepartment){
        transaksiDepartments.set(row,transaksiDepartment);
        fireTableRowsUpdated(row, row);
    }

    public void addLiburPerusahaan(TransaksiDepartment transaksiDepartment) {
        transaksiDepartments.add(transaksiDepartment);
        fireTableRowsInserted(getRowCount() - 1, getColumnCount() - 1);
    }
    @Override
    public int getRowCount() {
        return transaksiDepartments.size();
    }

    @Override
    public int getColumnCount() {
        return 16;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        TransaksiDepartment tD=transaksiDepartments.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return tD.getNip();
            case 1:
                return tD.getNama();
            case 2:
                return tD.getM();
            case 3:
                return tD.getS();
            case 4:
                return tD.getI();
            case 5:
                return tD.getA();
            case 6:
                return tD.getT();
            case 7:
                return tD.getL();
            case 8:
                return ChangeFormatDoubleToString.getToString(tD.getPokok());
            case 9:
                return ChangeFormatDoubleToString.getToString(tD.getUangMakan());
            case 10:
                return ChangeFormatDoubleToString.getToString(tD.getUangHadir());
            case 11:
                return ChangeFormatDoubleToString.getToString(tD.getUanglembur());
            case 12:
                return ChangeFormatDoubleToString.getToString(tD.getLain());
            case 13:
                return ChangeFormatDoubleToString.getToString(tD.getPotonganTelat());
            case 14:
                return ChangeFormatDoubleToString.getToString(tD.getPotonganLain());
            case 15:
                return ChangeFormatDoubleToString.getToString(tD.getTotal());
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
                return "M";
            case 3:
                return "S";
            case 4:
                return "I";
            case 5:
                return "A";
            case 6:
                return "T";
            case 7:
                return "L";
            case 8:
                return "POKOK";
            case 9:
                return "MAKAN";
            case 10:
                return "HADIR";
            case 11:
                return "LEMBUR";
            case 12:
                return "LAIN - LAIN";
            case 13:
                return "POTONGAN TELAT";
            case 14:
                return "POTONGAN LAIN";
            case 15:
                return "TOTAL";
            default:
                return "";
        }
    }
    
}
