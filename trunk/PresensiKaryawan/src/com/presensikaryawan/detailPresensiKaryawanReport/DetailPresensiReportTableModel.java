/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.detailPresensiKaryawanReport;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Tinus
 */
public class DetailPresensiReportTableModel extends AbstractTableModel{
  private List<DetailPresensiReport> detailPresensiReports = new ArrayList<DetailPresensiReport>();

    public DetailPresensiReportTableModel(List<DetailPresensiReport> detailPresensiReports) {
        this.detailPresensiReports = detailPresensiReports;
    }

    @Override
    public int getRowCount() {
        return detailPresensiReports.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        DetailPresensiReport dPR = detailPresensiReports.get(rowIndex);
        switch (columnIndex) {

            case 0:
                return dPR.getTanggal();
            case 1:
                return dPR.getKeterangan();
            case 2:
                return dPR.getWaktu();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "TANGGAL";
            case 1:
                return "KETERANGAN";
            case 2:
                return "JAM MASUK";
            default:
                return "";
        }
    }  
}
