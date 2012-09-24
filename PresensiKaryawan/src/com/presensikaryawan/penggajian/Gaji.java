/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.penggajian;

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
    private double uangHadir;
    private double lain_lain;
    private double potongan_t;
    private double potongan_l;
    private double total;

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

    /**
     * @return the uangHadir
     */
    public double getUangHadir() {
        return uangHadir;
    }

    /**
     * @param uangHadir the uangHadir to set
     */
    public void setUangHadir(double uangHadir) {
        this.uangHadir = uangHadir;
    }

    /**
     * @return the lain_lain
     */
    public double getLain_lain() {
        return lain_lain;
    }

    /**
     * @param lain_lain the lain_lain to set
     */
    public void setLain_lain(double lain_lain) {
        this.lain_lain = lain_lain;
    }

    /**
     * @return the potongan_t
     */
    public double getPotongan_t() {
        return potongan_t;
    }

    /**
     * @param potongan_t the potongan_t to set
     */
    public void setPotongan_t(double potongan_t) {
        this.potongan_t = potongan_t;
    }

    /**
     * @return the potongan_l
     */
    public double getPotongan_l() {
        return potongan_l;
    }

    /**
     * @param potongan_l the potongan_l to set
     */
    public void setPotongan_l(double potongan_l) {
        this.potongan_l = potongan_l;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }
    
    
    
}
