/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.transaksiGajiDepartmentTotalReport;

import com.presensikaryawan.golongan.Golongan;
import com.presensikaryawan.transaksiDepartment.TransaksiDepartment;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Tinus
 */
public interface TransaksiGajiDepartmentReportDao {

   

    List<TransaksiGajiDepartmentReport> getAllTransaksiDepartment(String kode_department1, String kode_department2, String maxdate) throws SQLException;


}
