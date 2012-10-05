/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.rekapPresensi;

import com.presensikaryawan.departmentSetting.Department;
import com.presensikaryawan.karyawan.Karyawan;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Tinus
 */
public interface RekapPresensiDao {
    List<Karyawan> getAllKaryawanByDepartmentCode(String code) throws SQLException;
    List<Department> getAllDepartments() throws SQLException;
    Department getNamaDepartmentByCode(String code) throws SQLException;
    void callInsertAlfa(String maxTanggal, String nip) throws SQLException;
    List<DetailPresensi> callGetPresensi(String max, String kode_department) throws SQLException;
    List<DetailPresensi> callGetPresensi(String bulan, String tahun, String kode_department) throws SQLException;
}
