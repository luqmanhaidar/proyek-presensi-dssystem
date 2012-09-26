/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.gajiPerKaryawanReport;

import com.presensikaryawan.karyawan.Karyawan;
import com.presensikaryawan.transaksiDepartment.TransaksiDepartment;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tinus
 */
public class GajiPerKaryawanReportDaoImplemen implements GajiPerKaryawanReportDao {

    private final String SQL_SELECTALL = "SELECT karyawan.*, temptransaksidepartment.*,"
            + "(temptransaksidepartment.pokok+temptransaksidepartment.makan+temptransaksidepartment.hadir+temptransaksidepartment.lembur+temptransaksidepartment.lain_lain)totalkotor, golongan.nama_golongan, department_setting.nama_department"
            + "FROM karyawan, temptransaksidepartment, golongan, department_setting"
            + "WHERE karyawan.nip = temptransaksidepartment.nip"
            + "and karyawan.kode_golongan = golongan.kode_golongan"
            + "and karyawan.kode_department = department_setting.kode_department"
            + "AND karyawan.nip BETWEEN ? AND ?"
            + "and temptransaksidepartment.bulan like ?;";
    private final String SQL_GET_ALLNIP = "SELECT nip FROM karyawan";
    private Connection connection;

    public GajiPerKaryawanReportDaoImplemen(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<TransaksiDepartment> getAllTransaksiDepartment(String nip1, String nip2, String bulan) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(SQL_SELECTALL);
            statement.setString(1, nip1);
            statement.setString(2, nip2);
            statement.setString(3, bulan.substring(0, 7));
//            System.out.println(tahun+"-0"+bulan+"-%");
            result = statement.executeQuery();
            List<TransaksiDepartment> transaksiDepartments = new ArrayList<TransaksiDepartment>();
            while (result.next()) {
                TransaksiDepartment transaksiDepartment = new TransaksiDepartment();

                transaksiDepartment.setNip(result.getString("nip"));
                transaksiDepartment.setNama(result.getString("nama"));
                transaksiDepartment.setM(result.getInt("M"));
                transaksiDepartment.setS(result.getInt("S"));
                transaksiDepartment.setI(result.getInt("I"));
                transaksiDepartment.setA(result.getInt("A"));
                transaksiDepartment.setT(result.getInt("T"));
                transaksiDepartment.setL(result.getInt("L"));
                transaksiDepartment.setPokok(result.getDouble("pokok"));
                transaksiDepartment.setUangMakan(result.getDouble("makan"));
                transaksiDepartment.setUangHadir(result.getDouble("hadir"));
                transaksiDepartment.setLain(result.getDouble("lain_lain"));
                transaksiDepartment.setUanglembur(result.getDouble("lembur"));
                transaksiDepartment.setPotonganTelat(result.getDouble("potongan_telat"));
                transaksiDepartment.setPotonganLain(result.getDouble("potongan_lain"));
                transaksiDepartment.setTotal(result.getDouble("total"));
                transaksiDepartments.add(transaksiDepartment);
            }
            connection.commit();
            return transaksiDepartments;
        } catch (SQLException exception) {
            throw exception;
        } finally {
            try {
                connection.setAutoCommit(true);
                if (result != null) {
                    result.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException exception) {
                throw exception;
            }
        }
    }

    @Override
    public List<Karyawan> getAllNip() throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(SQL_GET_ALLNIP);
//            System.out.println(tahun+"-0"+bulan+"-%");
            result = statement.executeQuery();
            List<Karyawan> karyawans = new ArrayList<Karyawan>();
            while (result.next()) {
                Karyawan karyawan = new Karyawan();

                karyawan.setNip(result.getString("nip"));
                karyawans.add(karyawan);
            }
            connection.commit();
            return karyawans;
        } catch (SQLException exception) {
            throw exception;
        } finally {
            try {
                connection.setAutoCommit(true);
                if (result != null) {
                    result.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException exception) {
                throw exception;
            }
        }
    }
}
