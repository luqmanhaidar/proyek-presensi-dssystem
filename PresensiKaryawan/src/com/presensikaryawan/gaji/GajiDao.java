/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.gaji;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Tinus
 */
public interface GajiDao {

    void insert(Gaji gaji) throws SQLException;

    void update(Gaji gaji) throws SQLException;

    void delete(Gaji gaji) throws SQLException;

    Gaji getByKodeGolongan(String kodeGolongan) throws SQLException;

    Gaji getByNIPKaryawan(String namaGolongan) throws SQLException;

    List<Gaji> getAllGaji() throws SQLException;
}
