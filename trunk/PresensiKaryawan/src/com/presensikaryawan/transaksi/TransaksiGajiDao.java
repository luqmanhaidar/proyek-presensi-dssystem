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
    List<Karyawan> getKaryawanByDepartment(String kode_department) throws SQLException;
}
