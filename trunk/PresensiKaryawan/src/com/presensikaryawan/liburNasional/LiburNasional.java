/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.liburNasional;

import java.util.GregorianCalendar;

/**
 *
 * @author Tinus
 */
public class LiburNasional {
    private GregorianCalendar tanggal;
    private String keterangan;

    public LiburNasional() {
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
    
    
}
