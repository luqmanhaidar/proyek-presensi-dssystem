/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.golongan;

import com.dssystem.umum.ChangeFormatDoubleToString;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Eki
 */
public class GolonganTableModel extends AbstractTableModel {

    private List<Golongan> golongans = new ArrayList<Golongan>();

    public GolonganTableModel(List<Golongan> golongans) {
        this.golongans = golongans;
    }

    public void deleteGolongan(int row) {
        golongans.remove(row);
        fireTableRowsDeleted(row, row);
    }

    public void updateGolongan(int row, Golongan golongan) {
        golongans.set(row, golongan);
        fireTableRowsUpdated(row, row);
    }

    public void addGolongan(Golongan golongan) {
        golongans.add(golongan);
        fireTableRowsInserted(getRowCount() - 1, getColumnCount() - 1);
    }

    @Override
    public int getRowCount() {
        return golongans.size();
    }

    @Override
    public int getColumnCount() {
        return 12;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Golongan g = golongans.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return g.getKodeGolongan();
            case 1:
                return g.getNamaGolongan();
            case 2:
                return ChangeFormatDoubleToString.getToString(g.getGajiPokok());
            case 3:
                return ChangeFormatDoubleToString.getToString(g.getUangMakan());
            case 4:
                return ChangeFormatDoubleToString.getToString(g.getUangLembur());
            case 5:
                return ChangeFormatDoubleToString.getToString(g.getUangHadir());
            case 6:
                return ChangeFormatDoubleToString.getToString(g.getPotonganTelat());
            case 7:
                return ChangeFormatDoubleToString.getToString(g.getTunjanganJabatan());
            case 8:
                return ChangeFormatDoubleToString.getToString(g.getTunjanganKesehatan());
            case 9:
                return ChangeFormatDoubleToString.getToString(g.getTunjanganTransport());
            case 10:
                return ChangeFormatDoubleToString.getToString(g.getTunjanganPrestasi());
            case 11:
                return ChangeFormatDoubleToString.getToString(g.getBonus());
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
                return "NAMA GOLONGAN";
            case 2:
                return "GAJI POKOK";
            case 3:
                return "UANG MAKAN";
            case 4:
                return "UANG LEMBUR";
            case 5:
                return "UANG HADIR";
            case 6:
                return "POTONGAN TELAT";
            case 7:
                return "TUNJANGAN JABATAN";
            case 8:
                return "TUNJANGAN KESEHATAN";
            case 9:
                return "TUNJANGAN TRANSPORT";
            case 10:
                return "TUNJANGAN PRESTASI";
            case 11:
                return "BONUS";
            default:
                return "";
        }
    }
}
