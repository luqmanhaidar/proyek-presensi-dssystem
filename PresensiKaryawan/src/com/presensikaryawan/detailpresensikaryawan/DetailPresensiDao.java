/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.detailpresensikaryawan;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Tinus
 */
public interface DetailPresensiDao {
    void updateDetailPresensi(String tanggal, String nip, String keterangan) throws SQLException;
    List<DetailPresensi> getDetailPresensiByNIP(String nip, String bulan, String keterangan) throws SQLException;
}
