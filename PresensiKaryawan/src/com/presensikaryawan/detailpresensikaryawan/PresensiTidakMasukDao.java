/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.detailpresensikaryawan;

import java.sql.SQLException;

/**
 *
 * @author Tinus
 */
public interface PresensiTidakMasukDao {
    void updateDetailPresensi(String tanggal, String nip) throws SQLException;
}
