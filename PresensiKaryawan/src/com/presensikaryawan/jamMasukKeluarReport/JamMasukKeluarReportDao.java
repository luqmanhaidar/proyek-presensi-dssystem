/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.jamMasukKeluarReport;

import com.presensikaryawan.karyawan.Karyawan;
import java.sql.SQLException;

/**
 *
 * @author Tinus
 */
public interface JamMasukKeluarReportDao {
    Karyawan getKaryawanByNIP(String nip) throws SQLException;
    
}
