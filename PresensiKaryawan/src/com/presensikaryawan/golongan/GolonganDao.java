/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.golongan;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Eki
 */
public interface GolonganDao {
    
    void insert(Golongan golongan) throws SQLException;

    void update(Golongan golongan) throws SQLException;

    void delete(Golongan unit) throws SQLException;

    Golongan getByKodeGolongan(String kodeGolongan) throws SQLException;

    Golongan getByNamaGolongan(String namaGolongan) throws SQLException;

    List<Golongan> getAllGolongan() throws SQLException;
    
}
