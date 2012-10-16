/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.jamMasukKeluarReport;

import com.presensikaryawan.karyawan.Karyawan;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Tinus
 */
public interface JamMasukKeluarReportDao {
    Karyawan getKaryawanByNIP(String nip) throws SQLException;
    List<JamMasukKeluarReport> getJamMasukKeluarReport(String nip1, String nip2, String bulanTahun) throws SQLException;
}
