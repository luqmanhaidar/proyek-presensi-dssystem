/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.transaksiDepartment;


import com.presensikaryawan.departmentSetting.Department;
import com.presensikaryawan.golongan.Golongan;
import com.presensikaryawan.liburPerusahaan.*;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Tinus
 */
public interface TransaksiDepartmentDao {
    Golongan getGolonganByNIP(String nip) throws SQLException;
    double getGajiKotor(String nip, String bulan) throws SQLException; 
    List<TransaksiDepartment> getAllTransaksiDepartment(String department, int bulan, int tahun) throws SQLException;
    List<TransaksiDepartment> getAllTransaksiDepartment(String department, String maxdate) throws SQLException;
    void insertTemp(List<TransaksiDepartment> list, String department, String bulantahun) throws SQLException;
    void updatePotongan(String nip, String bulan, double potongan, double prestasi) throws SQLException;
}
