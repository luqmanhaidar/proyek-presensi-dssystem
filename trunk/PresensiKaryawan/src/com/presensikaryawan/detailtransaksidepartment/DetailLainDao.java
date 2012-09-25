/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.detailtransaksidepartment;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Tinus
 */
public interface DetailLainDao {
    void updateLainPresensi(String tanggal, String nip, double lain) throws SQLException;
    //List<DetailLain> getDetailPresensiByNIP(String nip, String bulan, String keterangan) throws SQLException;
}
