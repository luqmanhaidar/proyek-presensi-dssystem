/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.gaji;

import com.presensikaryawan.golongan.Golongan;
import com.presensikaryawan.karyawan.Karyawan;

/**
 *
 * @author Tinus
 */
public class Gaji {
    private Karyawan karyawan;
    private Golongan golongan;
    private double gajiPokok;
    private double uangMakan;
    private double uangLembur;

    public Gaji() {
    }

    /**
     * @return the karyawan
     */
    public Karyawan getKaryawan() {
        return karyawan;
    }

    /**
     * @param karyawan the karyawan to set
     */
    public void setKaryawan(Karyawan karyawan) {
        this.karyawan = karyawan;
    }

    /**
     * @return the golongan
     */
    public Golongan getGolongan() {
        return golongan;
    }

    /**
     * @param golongan the golongan to set
     */
    public void setGolongan(Golongan golongan) {
        this.golongan = golongan;
    }

    /**
     * @return the gajiPokok
     */
    public double getGajiPokok() {
        return gajiPokok;
    }

    /**
     * @param gajiPokok the gajiPokok to set
     */
    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    /**
     * @return the uangMakan
     */
    public double getUangMakan() {
        return uangMakan;
    }

    /**
     * @param uangMakan the uangMakan to set
     */
    public void setUangMakan(double uangMakan) {
        this.uangMakan = uangMakan;
    }

    /**
     * @return the uangLembur
     */
    public double getUangLembur() {
        return uangLembur;
    }

    /**
     * @param uangLembur the uangLembur to set
     */
    public void setUangLembur(double uangLembur) {
        this.uangLembur = uangLembur;
    }
    
    
    
}
