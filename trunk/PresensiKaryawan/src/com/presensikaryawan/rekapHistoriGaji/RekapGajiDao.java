/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.rekapHistoriGaji;

import com.presensikaryawan.karyawan.Karyawan;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Tinus
 */
public interface RekapGajiDao {
    List<RekapGaji> getRekapGajiByNIPAndYear(String nip, String year) throws SQLException;
    List<Karyawan> getNIPByKodeDepartment(String kode_department) throws SQLException;
    Karyawan getKaryawanByNIP(String nip) throws SQLException;
}
