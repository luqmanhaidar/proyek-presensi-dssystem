/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.liburNasional;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Eki
 */
public interface LiburNasionalDao {
    
    void insert(LiburNasional liburNasional) throws SQLException;

    void update(LiburNasional liburNasional) throws SQLException;

    void delete(LiburNasional unit) throws SQLException;

    LiburNasional getByTanggalLibur(String tanggal) throws SQLException;

    LiburNasional getByKeteranganLibur(String keterangan) throws SQLException;

    List<LiburNasional> getAllLiburNasional() throws SQLException;
    
}
