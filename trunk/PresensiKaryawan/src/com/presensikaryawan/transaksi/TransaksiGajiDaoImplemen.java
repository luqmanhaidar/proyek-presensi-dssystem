/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.transaksi;

import com.presensikaryawan.karyawan.Karyawan;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Tinus
 */
public class TransaksiGajiDaoImplemen implements TransaksiGajiDao {
    private final String SQL_GETKARYAWANBYDEPARTMENT="SELECT nip, nama FROM karyawan WHERE kode_department LIKE ?";
    private Connection connection;
    @Override
    public List<Karyawan> getKaryawanByDepartment(String kode_department) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
