/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.transaksi;

import com.presensikaryawan.karyawan.Karyawan;

/**
 *
 * @author Tinus
 */
public class PresensiKaryawan {
    private Karyawan karyawan;
    private String tanggal;
    private String waktu_mulai;
    private String waktu_selesai;

    public PresensiKaryawan() {
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
     * @return the tanggal
     */
    public String getTanggal() {
        return tanggal;
    }

    /**
     * @param tanggal the tanggal to set
     */
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    /**
     * @return the waktu_mulai
     */
    public String getWaktu_mulai() {
        return waktu_mulai;
    }

    /**
     * @param waktu_mulai the waktu_mulai to set
     */
    public void setWaktu_mulai(String waktu_mulai) {
        this.waktu_mulai = waktu_mulai;
    }

    /**
     * @return the waktu_selesai
     */
    public String getWaktu_selesai() {
        return waktu_selesai;
    }

    /**
     * @param waktu_selesai the waktu_selesai to set
     */
    public void setWaktu_selesai(String waktu_selesai) {
        this.waktu_selesai = waktu_selesai;
    }
    
}
