/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.karyawan;

import com.presensikaryawan.golongan.Golongan;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Tinus
 */
public class Karyawan {
    //golongan, nama, alamat, nip, pelanggan, tgl masuk, posisi

    private String nip;
    private String nama;
    private String alamat;
    private String tanggal_masuk;
//    private Golongan golongan;
    private String kodeGolongan;

    public Karyawan() {
    }

    /**
     * @return the nip
     */
    public String getNip() {
        return nip;
    }

    /**
     * @param nip the nip to set
     */
    public void setNip(String nip) {
        this.nip = nip;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the tanggal_masuk
     */
    public String getTanggal_masuk() {
        return tanggal_masuk;
    }

    /**
     * @param tanggal_masuk the tanggal_masuk to set
     */
    public void setTanggal_masuk(String tanggal_masuk) {
        this.tanggal_masuk = tanggal_masuk;
    }

    /**
     * @return the kodeGolongan
     */
    public String getKodeGolongan() {
        return kodeGolongan;
    }

    /**
     * @param kodeGolongan the kodeGolongan to set
     */
    public void setKodeGolongan(String kodeGolongan) {
        this.kodeGolongan = kodeGolongan;
    }

    /**
     * @return the golongan
     */
//    public Golongan getGolongan() {
//        return golongan;
//    }
//
//    /**
//     * @param golongan the golongan to set
//     */
//    public void setGolongan(Golongan golongan) {
//        this.golongan = golongan;
//    }
//    private String jamban;
}
