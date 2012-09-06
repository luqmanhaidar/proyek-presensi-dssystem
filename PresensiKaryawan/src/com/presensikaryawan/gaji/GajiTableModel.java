/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.gaji;

import com.presensikaryawan.golongan.Golongan;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Tinus
 */
public class GajiTableModel extends AbstractTableModel{
        private List<Gaji> gajis = new ArrayList<Gaji>();

    public GajiTableModel(List<Gaji> gajis) {
        this.gajis = gajis;
    }

    public void deleteGaji(int row){
        gajis.remove(row);
        fireTableRowsDeleted(row, row);
    }

    public void updateGaji(int row, Gaji gaji){
        gajis.set(row,gaji);
        fireTableRowsUpdated(row, row);
    }

    public void addGaji(Gaji gaji) {
        gajis.add(gaji);
        fireTableRowsInserted(getRowCount() - 1, getColumnCount() - 1);
    }
    @Override
    public int getRowCount() {
        return gajis.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Gaji g = gajis.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return g.getGolongan().getKodeGolongan();
            case 1:
                return g.getKaryawan().getNip();
            case 2:
                return g.getKaryawan().getNama();
            case 3:
                return g.getGajiPokok();
            case 4:
                return g.getUangMakan();
            case 5:
                return g.getUangLembur();
                
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "KODE GOLONGAN";
            case 1:
                return "NIP";
            case 2:
                return "NAMA";
            case 3:
                return "GAJI POKOK";
            case 4:
                return "UANG MAKAN";
            case 5:
                return "UANG LEMBUR";
            default:
                return "";
        }
    }
}
