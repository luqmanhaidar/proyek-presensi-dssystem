/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.eventlogReport;

import com.presensikaryawan.karyawan.Karyawan;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Tinus
 */
public interface EventlogReportDao {
    List<EventlogReport> eventlogReports(String nip1, String nip2, String bulan) throws SQLException;
    Karyawan getKaryawanByNIP(String nip) throws SQLException;
}
