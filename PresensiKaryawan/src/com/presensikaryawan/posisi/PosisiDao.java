/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.posisi;

import com.presensikaryawan.statusSetting.StatusSetting;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Tinus
 */
public interface PosisiDao {
        void insert(Posisi posisi) throws SQLException;

    void update(Posisi posisi) throws SQLException;

    void delete(Posisi posisi) throws SQLException;
    
    Posisi getByKode(String kode) throws SQLException;

    List<Posisi> getAllPosisi() throws SQLException;
}
