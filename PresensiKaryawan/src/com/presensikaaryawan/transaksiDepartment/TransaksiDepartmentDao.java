/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaaryawan.transaksiDepartment;


import com.presensikaryawan.liburPerusahaan.*;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Tinus
 */
public interface TransaksiDepartmentDao {
   
    List<TransaksiDepartment> getAllTransaksiDepartment(String department, int bulan, int tahun) throws SQLException;
}
