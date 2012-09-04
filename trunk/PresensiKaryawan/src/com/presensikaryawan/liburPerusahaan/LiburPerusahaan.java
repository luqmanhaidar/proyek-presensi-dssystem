/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.liburPerusahaan;

import java.util.GregorianCalendar;

/**
 *
 * @author Tinus
 */
public class LiburPerusahaan {
    private int no;
    private GregorianCalendar tanggal;
    private String keterangan;

    public LiburPerusahaan() {
    }

    /**
     * @return the tanggal
     */
    public GregorianCalendar getTanggal() {
        return tanggal;
    }

    /**
     * @param tanggal the tanggal to set
     */
    public void setTanggal(GregorianCalendar tanggal) {
        this.tanggal = tanggal;
    }

    /**
     * @return the keterangan
     */
    public String getKeterangan() {
        return keterangan;
    }

    /**
     * @param keterangan the keterangan to set
     */
    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    /**
     * @return the no
     */
    public int getNo() {
        return no;
    }

    /**
     * @param no the no to set
     */
    public void setNo(int no) {
        this.no = no;
    }
    
    
}
