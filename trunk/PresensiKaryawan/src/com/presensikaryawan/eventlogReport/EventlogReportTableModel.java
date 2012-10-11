/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.eventlogReport;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Tinus
 */
public class EventlogReportTableModel extends AbstractTableModel {

    private List<EventlogReport> eventlogReports = new ArrayList<EventlogReport>();

    public EventlogReportTableModel(List<EventlogReport> eventlogReports) {
        this.eventlogReports = eventlogReports;
    }

    @Override
    public int getRowCount() {
        return eventlogReports.size();
    }

    @Override
    public int getColumnCount() {
        return 9;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        EventlogReport eR = eventlogReports.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return eR.getNo();
            case 1:
                return eR.getNip();
            case 2:
                return eR.getNama();
            case 3:
                return eR.getNumCard();
            case 4:
                return eR.getDateLog();
            case 5:
                return eR.getTimeLog();
            case 6:
                return eR.getVerify();
            case 7:
                return eR.getFkMode();
            case 8:
                return eR.getDeviceID();
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
                return "NUM CARD";
            case 4:
                return "DATELOG";
            case 5:
                return "TIMELOG";
            case 6:
                return "VERIFY";
            case 7:
                return "FKMODE";
            case 8:
                return "DEVICE ID";
            default:
                return "";
        }
    }
}
