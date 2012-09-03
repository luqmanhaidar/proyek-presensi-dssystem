/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.tools;

/**
 *
 * @author dalvins
 */
public class SettingNo {

    public SettingNo() {
    }
    private String noFakturPenjualan;
    private String noFakturPenjualanToko;
    private String noAwalFakturPenjualan;
    private String noAwalFakturPembelian;
    private String noKonsolidasi;
    private String noPembelian;
    private String noKasMasuk;
    private String noKasKeluar;
    private String noPelunasan;
    private String noPelunasanPembelian;
    private String noSetorBg;
    private String noCairBg;
    private String noOrderPembelian;
    private String noOrderPenjualan;
    private String noNotaKredit;
    private String noOrderReturJual;
    private String noNotaDebet;
    private String noReturPembelian;
    private String noTagihan;
    private String noTagihanPembelian;
    private String noKasBon;
    private String noTukarBarang;
    private String noMutasiGudang;
    private String noJurnalUmum;
    private String noPengambilanMotoris;
    private String noPengembalianMotoris;
    private String noKasMasukKantorPusat;
    private String noPenyesuaianPersediaan;
    private String NoKasBankSetor;
    private String NoKasBankTerima;
    private String NoKasAdminBank;
    private String NoMergerBarang;
    private String NoPisahMergerBarang;

    public String getNoMergerBarang() {
        return "MB1";
    }

    public String getNoKasBankTerima() {
        return "KT1";
    }

    public void setNoKasBankTerima(String NoKasBankTerima) {
        this.NoKasBankTerima = NoKasBankTerima;
    }

    public String getNoKasBankSetor() {
        return "KB1";
    }

    public void setNoKasBankSetor(String NoKasBankSetor) {
        this.NoKasBankSetor = NoKasBankSetor;
    }

    public String getNoPenyesuaianPersediaan() {
        return "PE1";
    }

    public void setNoPenyesuaianPersediaan(String noPenyesuaianPersediaan) {
        this.noPenyesuaianPersediaan = noPenyesuaianPersediaan;
    }

    /**
     * @return the noFakturPenjualan
     */
    public String getNoHarianKasir(String kodeKasir) {
        return "HK1" + kodeKasir;
    }

    public String getNoFakturPenjualan(String kodeKasir) {
        return "MK1" + kodeKasir;
    }

    /**
     * @return the noFakturPenjualan
     */
    public String getNoFakturPenjualan() {
        return "MD1";
    }

    /**
     * @param noFakturPenjualan the noFakturPenjualan to set
     */
    public void setNoFakturPenjualan(String noFakturPenjualan) {
        this.noFakturPenjualan = noFakturPenjualan;
    }

    /**
     * @return the noPembelian
     */
    public String getNoPembelian() {
        return "PB1";
    }

    /**
     * @param noPembelian the noPembelian to set
     */
    public void setNoPembelian(String noPembelian) {
        this.noPembelian = noPembelian;
    }

    /**
     * @return the noKasMasuk
     */
    public String getNoKasMasuk() {
        return "KM1";
    }

    /**
     * @param noKasMasuk the noKasMasuk to set
     */
    public void setNoKasMasuk(String noKasMasuk) {
        this.noKasMasuk = noKasMasuk;
    }

    /**
     * @return the noSetorBg
     */
    public String getNoSetorBg() {
        return "KS1";
    }

    /**
     * @param noSetorBg the noSetorBg to set
     */
    public void setNoSetorBg(String noSetorBg) {
        this.noSetorBg = noSetorBg;
    }

    /**
     * @return the noKasKeluar
     */
    public String getNoKasKeluar() {
        return "KK1";
    }

    /**
     * @param noSetorBg the noSetorBg to set
     */
    public void setNoCairBg(String noCairBg) {
        this.noCairBg = noCairBg;
    }

    public String getNoCairBg() {
        return "KC1";
    }

    /**
     * @param noKasKeluar the noKasKeluar to set
     */
    public void setNoKasKeluar(String noKasKeluar) {
        this.noKasKeluar = noKasKeluar;
    }

    /**
     * @return the noPelunasan
     */
    public String getNoPelunasan() {
        return "KP1";
    }

    /**
     * @param noPelunasan the noPelunasan to set
     */
    public void setNoPelunasan(String noPelunasan) {
        this.noPelunasan = noPelunasan;
    }

    /**
     * @return the noPelunasan
     */
    public String getNoPelunasanPembelian() {
        return "KB1";
    }

    /**
     * @param noPelunasan the noPelunasan to set
     */
    public void setNoPelunasanPembelian(String noPelunasan) {
        this.noPelunasan = noPelunasan;
    }

    /**
     * @return the noOrderPembelian
     */
    public String getNoOrderPembelian() {
        return "PO1";
    }

    /**
     * @param noOrderPembelian the noOrderPembelian to set
     */
    public void setNoOrderPembelian(String noOrderPembelian) {
        this.noOrderPembelian = noOrderPembelian;
    }

    /**
     * @return the noNotaKredit
     */
    public String getNoNotaKredit() {
        return "CN1";
    }

    /**
     * @param noNotaKredit the noNotaKredit to set
     */
    public void setNoNotaKredit(String noNotaKredit) {
        this.noNotaKredit = noNotaKredit;
    }

    /**
     * @return the noOrderPenjualan
     */
    public String getNoOrderPenjualan() {
        return "SO1";
    }

    /**
     * @param noOrderPenjualan the noOrderPenjualan to set
     */
    public void setNoOrderPenjualan(String noOrderPenjualan) {
        this.noOrderPenjualan = noOrderPenjualan;
    }

    /**
     * @return the noOrderReturJual
     */
    public String getNoOrderReturJual() {
        return "RJ1";
    }

    /**
     * @param noOrderReturJual the noOrderReturJual to set
     */
    public void setNoOrderReturJual(String noOrderReturJual) {
        this.noOrderReturJual = noOrderReturJual;
    }

    /**
     * @return the noNotaDebet
     */
    public String getNoNotaDebet() {
        return "DN1";
    }

    /**
     * @param noNotaDebet the noNotaDebet to set
     */
    public void setNoNotaDebet(String noNotaDebet) {
        this.noNotaDebet = noNotaDebet;
    }

    /**
     * @return the noReturPembelian
     */
    public String getNoReturPembelian() {
        return "RB1";
    }

    /**
     * @param noReturPembelian the noReturPembelian to set
     */
    public void setNoReturPembelian(String noReturPembelian) {
        this.noReturPembelian = noReturPembelian;
    }

    /**
     * @return the noTagihan
     */
    public String getNoTagihan() {
        return "TP1";
    }

    /**
     * @param noTagihan the noTagihan to set
     */
    public void setNoTagihan(String noTagihan) {
        this.noTagihan = noTagihan;
    }

    /**
     * @return the noTagihanPembelian
     */
    public String getNoTagihanPembelian() {
        return "TB1";
    }

    /**
     * @param noTagihanPembelian the noTagihanPembelian to set
     */
    public void setNoTagihanPembelian(String noTagihanPembelian) {
        this.noTagihanPembelian = noTagihanPembelian;
    }

    /**
     * @return the noKasBon
     */
    public String getNoKasBon() {
        return "BS1";
    }

    /**
     * @param noKasBon the noKasBon to set
     */
    public void setNoKasBon(String noKasBon) {
        this.noKasBon = noKasBon;
    }

    /**
     * @return the noFakturPenjualanAwal
     */
    public String getNoAwalFakturPenjualan() {
        return "MA1";
    }

    /**
     * @param noFakturPenjualanAwal the noFakturPenjualanAwal to set
     */
    public void setNoAwalFakturPenjualan(String noAwalFakturPenjualan) {
        this.noAwalFakturPenjualan = noAwalFakturPenjualan;
    }

    /**
     * @return the noTukarBarang
     */
    public String getNoTukarBarang() {
        return "TB1";
    }

    /**
     * @param noTukarBarang the noTukarBarang to set
     */
    public void setNoTukarBarang(String noTukarBarang) {
        this.noTukarBarang = noTukarBarang;
    }

    /**
     * @return the noMutasiGudang
     */
    public String getNoMutasiGudang() {
        return "MG1";
    }

    /**
     * @param noMutasiGudang the noMutasiGudang to set
     */
    public void setNoMutasiGudang(String noMutasiGudang) {
        this.noMutasiGudang = noMutasiGudang;
    }

    /**
     * @return the noJurnalUmum
     */
    public String getNoJurnalUmum() {
        return "JU1";
    }

    /**
     * @param noJurnalUmum the noJurnalUmum to set
     */
    public void setNoJurnalUmum(String noJurnalUmum) {
        this.noJurnalUmum = noJurnalUmum;
    }

    /**
     * @return the noPengambilanMotoris
     */
    public String getNoPengambilanMotoris() {
        return "OM1";
    }

    /**
     * @param noPengambilanMotoris the noPengambilanMotoris to set
     */
    public void setNoPengambilanMotoris(String noPengambilanMotoris) {
        this.noPengambilanMotoris = noPengambilanMotoris;
    }

    /**
     * @return the noPengembalianMotoris
     */
    public String getNoPengembalianMotoris() {
        return "MP1";
    }

    /**
     * @param noPengembalianMotoris the noPengembalianMotoris to set
     */
    public void setNoPengembalianMotoris(String noPengembalianMotoris) {
        this.noPengembalianMotoris = noPengembalianMotoris;
    }

    /**
     * @return the noKonsolidasi
     */
    public String getNoKonsolidasi() {
        return "NK1";
    }

    /**
     * @param noKonsolidasi the noKonsolidasi to set
     */
    public void setNoKonsolidasi(String noKonsolidasi) {
        this.noKonsolidasi = noKonsolidasi;
    }

    /**
     * @return the noKasMasukKantorPusat
     */
    public String getNoKasMasukKantorPusat() {
        return "KT1";
    }

    /**
     * @param noKasMasukKantorPusat the noKasMasukKantorPusat to set
     */
    public void setNoKasMasukKantorPusat(String noKasMasukKantorPusat) {
        this.noKasMasukKantorPusat = noKasMasukKantorPusat;
    }

    /**
     * @return the noAwalFakturPembelian
     */
    public String getNoAwalFakturPembelian() {
        return "PA1";
    }

    /**
     * @param noAwalFakturPembelian the noAwalFakturPembelian to set
     */
    public void setNoAwalFakturPembelian(String noAwalFakturPembelian) {
        this.noAwalFakturPembelian = noAwalFakturPembelian;
    }

    /**
     * @return the noFakturPenjualanToko
     */
    public String getNoFakturPenjualanToko() {
        return "MK1";
    }

    /**
     * @param noFakturPenjualanToko the noFakturPenjualanToko to set
     */
    public void setNoFakturPenjualanToko(String noFakturPenjualanToko) {
        this.noFakturPenjualanToko = noFakturPenjualanToko;
    }

    /**
     * @return the NoKasAdminBank
     */
    public String getNoKasAdminBank() {
        return "KN1";
    }

    /**
     * @param NoKasAdminBank the NoKasAdminBank to set
     */
    public void setNoKasAdminBank(String NoKasAdminBank) {
        this.NoKasAdminBank = NoKasAdminBank;
    }

    /**
     * @return the NoPisahMergerBarang
     */
    public String getNoPisahMergerBarang() {
        return "PM1";
    }

    /**
     * @param NoPisahMergerBarang the NoPisahMergerBarang to set
     */
    public void setNoPisahMergerBarang(String NoPisahMergerBarang) {
        this.NoPisahMergerBarang = NoPisahMergerBarang;
    }
}
