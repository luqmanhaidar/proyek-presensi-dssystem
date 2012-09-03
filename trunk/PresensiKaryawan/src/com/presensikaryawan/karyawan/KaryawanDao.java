/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.karyawan;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Tinus
 */
public interface KaryawanDao {
    void insert(Karyawan karyawan) throws SQLException;

    void update(Karyawan karyawan) throws SQLException;

    void delete(Karyawan karyawan) throws SQLException;

    Karyawan getByNIPKaryawan(String nipKaryawan) throws SQLException;

    Karyawan getByNamaKaryawan(String namaKaryawan) throws SQLException;

    List<Karyawan> getAllKaryawan() throws SQLException;
}
