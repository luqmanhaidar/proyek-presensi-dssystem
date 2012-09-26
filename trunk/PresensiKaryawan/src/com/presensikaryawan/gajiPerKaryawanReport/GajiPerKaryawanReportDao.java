/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.gajiPerKaryawanReport;

import com.presensikaryawan.karyawan.Karyawan;
import com.presensikaryawan.transaksiDepartment.TransaksiDepartment;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Tinus
 */
public interface GajiPerKaryawanReportDao {
    List<TransaksiDepartment> getAllTransaksiDepartment(String nip1, String nip2, String bulan) throws SQLException;
    List<Karyawan> getAllNip() throws SQLException;
}
