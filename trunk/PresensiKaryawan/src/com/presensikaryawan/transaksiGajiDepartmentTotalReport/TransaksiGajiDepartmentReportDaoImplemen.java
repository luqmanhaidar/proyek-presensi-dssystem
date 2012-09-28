/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.transaksiGajiDepartmentTotalReport;

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
public class TransaksiGajiDepartmentReportDaoImplemen implements TransaksiGajiDepartmentReportDao {

    private String bulan;
    private String department;
    private String nip, nama;
    private int s, i, a, t, m, l;
    private double pokok, uangMakan, uangHadir, lain, potonganTelat, potonganLain, total, uanglembur;
    
    private final String SQL_GETALLGAJI2 = "select t.*, d.nama_department "
            + "from temptransaksidepartment t, department_setting d, karyawan k "
            + "where k.nip=t.nip and k.kode_department = d.kode_department "
            + "and d.kode_department between ? and ? "
            + "and t.bulan like ?";
    private Connection connection;

    public TransaksiGajiDepartmentReportDaoImplemen(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<TransaksiGajiDepartmentReport> getAllTransaksiDepartment(String kode_department1, String kode_department2, String maxdate) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);

//            statement = connection.prepareStatement(SQL_GETALLGAJI);
            statement = connection.prepareStatement(SQL_GETALLGAJI2);
            statement.setString(3, maxdate);
            statement.setString(2, kode_department2);
            statement.setString(1, kode_department1);
            result = statement.executeQuery();
            List<TransaksiGajiDepartmentReport> transaksiDepartments = new ArrayList<TransaksiGajiDepartmentReport>();

            while (result.next()) {
                TransaksiGajiDepartmentReport transaksiDepartment = new TransaksiGajiDepartmentReport();

                department = result.getString("nama_department");
                nip = result.getString("nip");
                nama = result.getString("nama");
                m = result.getInt("M");
                s = result.getInt("S");
                i = result.getInt("I");
                a = result.getInt("A");
                t = result.getInt("T");
                l = result.getInt("L");
                pokok = result.getDouble("pokok");
                uangMakan = result.getDouble("makan");
                uangHadir = result.getDouble("hadir");
                uanglembur = result.getDouble("lembur");
                lain = result.getDouble("lain_lain");
                potonganTelat = result.getDouble("potongan_telat");
                potonganLain = result.getDouble("potongan_lain");
                total = result.getDouble("total");

                transaksiDepartment.setDepartment(department);
                transaksiDepartment.setNip(nip);
                transaksiDepartment.setNama(nama);
                transaksiDepartment.setM(m);
                transaksiDepartment.setS(s);
                transaksiDepartment.setI(i);
                transaksiDepartment.setA(a);
                transaksiDepartment.setT(t);
                transaksiDepartment.setL(l);
                transaksiDepartment.setPokok(pokok);
                transaksiDepartment.setUangMakan(uangMakan);
                transaksiDepartment.setUangHadir(uangHadir);
                transaksiDepartment.setLain(lain);
                transaksiDepartment.setUanglembur(uanglembur);
                transaksiDepartment.setPotonganTelat(potonganTelat);
                transaksiDepartment.setPotonganLain(potonganLain);
                transaksiDepartment.setTotal(total);
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

    
}
