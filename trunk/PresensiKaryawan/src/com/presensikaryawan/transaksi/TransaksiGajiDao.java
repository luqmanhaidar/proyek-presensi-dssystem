/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.transaksi;

import com.presensikaryawan.departmentSetting.Department;
import com.presensikaryawan.golongan.Golongan;
import com.presensikaryawan.karyawan.Karyawan;
import com.presensikaryawan.shiftSetting.Shift;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Tinus
 */
public interface TransaksiGajiDao {
    List<Department> getAllDepartmentCodeByAnything(String nip, String nama) throws SQLException;
    List<Shift> getWaktuMulaiDanSelesaiByDepartment(String kode_department) throws SQLException;
    List<Karyawan> getNamaDanNIPKaryawanByAnything(String kode_department, String kode_golongan, String nama) throws SQLException;
    List<PresensiKaryawan> getPresensiByMonth(String bulan, String nip) throws SQLException;   
    List<PresensiKaryawan> getWaktuSelesaiByNIP(String bulan, String nip) throws SQLException;
    List<Golongan> getGolonganByNIPOrNama(String nama, String nip) throws SQLException;
}
