/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.groupShift;

import com.presensikaryawan.shiftSetting.Shift;

/**
 *
 * @author Tinus
 */
public class GroupShift {
    private String kodeGroupShift;
    private String namaGroupShift;
    private String keterangan;
    private Shift[] shift;

    public GroupShift() {
    }

    /**
     * @return the kodeGroupShift
     */
    public String getKodeGroupShift() {
        return kodeGroupShift;
    }

    /**
     * @param kodeGroupShift the kodeGroupShift to set
     */
    public void setKodeGroupShift(String kodeGroupShift) {
        this.kodeGroupShift = kodeGroupShift;
    }

    /**
     * @return the namaGroupShift
     */
    public String getNamaGroupShift() {
        return namaGroupShift;
    }

    /**
     * @param namaGroupShift the namaGroupShift to set
     */
    public void setNamaGroupShift(String namaGroupShift) {
        this.namaGroupShift = namaGroupShift;
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
     * @return the shift
     */
    public Shift[] getShift() {
        return shift;
    }

    /**
     * @param shift the shift to set
     */
    public void setShift(Shift[] shift) {
        this.shift = shift;
    }
    
    
}
