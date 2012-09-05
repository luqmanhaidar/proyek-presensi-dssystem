/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.statusSetting;

/**
 *
 * @author Tinus
 */
public class StatusSetting {
    private int kodeStatus;
    private String keteranganStatus;

    public StatusSetting() {
    }

    /**
     * @return the kodeStatus
     */
    public int getKodeStatus() {
        return kodeStatus;
    }

    /**
     * @param kodeStatus the kodeStatus to set
     */
    public void setKodeStatus(int kodeStatus) {
        this.kodeStatus = kodeStatus;
    }

    /**
     * @return the keteranganStatus
     */
    public String getKeteranganStatus() {
        return keteranganStatus;
    }

    /**
     * @param keteranganStatus the keteranganStatus to set
     */
    public void setKeteranganStatus(String keteranganStatus) {
        this.keteranganStatus = keteranganStatus;
    }
    
}
