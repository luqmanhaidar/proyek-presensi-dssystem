/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.rekapHistoriGaji;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Tinus
 */
public interface RekapGajiDao {
    List<RekapGaji> getRekapGajiByNIPAndYear(String nip, String year) throws SQLException;
}
