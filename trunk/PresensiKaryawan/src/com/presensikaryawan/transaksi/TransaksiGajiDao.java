/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.transaksi;

import com.presensikaryawan.departmentSetting.Department;
import com.presensikaryawan.karyawan.Karyawan;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Tinus
 */
public interface TransaksiGajiDao {
    List<Karyawan> getAllKaryawanByDepartmentCode(String code) throws SQLException;
    List<Department> getAllDepartments() throws SQLException;
    Department getNamaDepartmentByCode(String code) throws SQLException;
    void callInsertAlfa(String maxTanggal, String nip) throws SQLException;
    List<RekapPresensi> callGetPresensi(String max, String kode_department) throws SQLException;

    List<RekapPresensi> callGetPresensi(String bln, String thn, String kode_department) throws SQLException;

}
