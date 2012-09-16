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
        return presensiKaryawans.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        PresensiKaryawan pK = presensiKaryawans.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return pK.getKaryawan().getNip();
            case 1:
                return pK.getKaryawan().getNama();
            case 2:
                return pK.getTanggal();
            case 3:
                return pK.getWaktu_mulai();
            case 4:
                return pK.getWaktu_selesai();
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
                return "TANGGAL";
            case 3:
                return "WAKTU MULAI";
            case 4:
                return "WAKTU SELESAI";
            default:
                return "";
        }
    }
}
