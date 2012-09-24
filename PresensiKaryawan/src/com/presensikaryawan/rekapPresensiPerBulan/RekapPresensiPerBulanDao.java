/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.rekapPresensiPerBulan;

import com.presensikaryawan.karyawan.Karyawan;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Tinus
 */
public interface RekapPresensiPerBulanDao {
    List<Karyawan> getAllKaryawanByDepartmentCode(String code) throws SQLException;
    void callInsertAlfa(String maxTanggal, String nip) throws SQLException;
    List<RekapPresensiPerBulan> callGetPresensi(String bulan, String tahun, String kode_department) throws SQLException;
}
