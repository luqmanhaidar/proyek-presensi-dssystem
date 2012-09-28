/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.payrollBankReport;

import com.dssystem.umum.ChangeFormatDoubleToString;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Tinus
 */
public class PayrollBankReportTableModel extends AbstractTableModel{
private List<PayrollBankReport> payrollBankReports = new ArrayList<PayrollBankReport>();

    public PayrollBankReportTableModel(List<PayrollBankReport> payrollBankReports) {
        this.payrollBankReports = payrollBankReports;
    }

    public void deleteStatusSetting(int row){
        payrollBankReports.remove(row);
        fireTableRowsDeleted(row, row);
    }

    public void updateStatusSetting(int row, PayrollBankReport payrollBankReport){
        payrollBankReports.set(row,payrollBankReport);
        fireTableRowsUpdated(row, row);
    }

    public void addLiburPerusahaan(PayrollBankReport payrollBankReport) {
        payrollBankReports.add(payrollBankReport);
        fireTableRowsInserted(getRowCount() - 1, getColumnCount() - 1);
    }
    @Override
    public int getRowCount() {
        return payrollBankReports.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        PayrollBankReport pB=payrollBankReports.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return pB.getNo();
            case 1:
                return pB.getNoRekening();
            case 2:
                return pB.getNama();
            case 3:
                return ChangeFormatDoubleToString.getToString(pB.getJumlahGaji());
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
                return "NO. REKENING";
            case 2:
                return "NAMA";
            case 3:
                return "JUMLAH GAJI";
            default:
                return "";
        }
    }
}
