/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.detailPresensiKaryawanReport;

import com.presensikaryawan.karyawan.Karyawan;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Tinus
 */
public interface DetailPresensiReportDao {
    List<DetailPresensiReport> getDetailPresensiByNIP(String nip, String bulan) throws SQLException;
    List<Karyawan> getKaryawanByDepartmentCode(String kode_department) throws SQLException;
}
