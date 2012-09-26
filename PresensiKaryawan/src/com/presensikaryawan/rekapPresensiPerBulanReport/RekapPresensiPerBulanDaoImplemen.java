/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.rekapPresensiPerBulanReport;

import com.presensikaryawan.karyawan.Karyawan;
import java.sql.CallableStatement;
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
public class RekapPresensiPerBulanDaoImplemen implements RekapPresensiPerBulanDao {
    private final String SQL_GETKARYAWANBYDEPARTMENT = "SELECT nip, nama FROM karyawan WHERE kode_department LIKE ? order by nip asc";
    private final String SQL_GET_INSERTALFA_SP = "CALL insertAlfa (?,?)";
    private final String SQL_GET_GETPRESENSI_SP = "CALL getPresensi (?,?,?)";
    private Connection connection;

    public RekapPresensiPerBulanDaoImplemen(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void callInsertAlfa(String maxTanggal, String nip) throws SQLException {
        connection.setAutoCommit(false);
        CallableStatement callableStatement;
        callableStatement = connection.prepareCall(SQL_GET_INSERTALFA_SP);
        callableStatement.setString(1, maxTanggal);
        callableStatement.setString(2, nip);
        callableStatement.execute();
        callableStatement.close();
        connection.commit();

    }

    @Override
    public List<RekapPresensiPerBulan> callGetPresensi(String bulan, String tahun, String kode_department) throws SQLException {
        ResultSet result;
        connection.setAutoCommit(false);
        CallableStatement callableStatement;
        callableStatement = connection.prepareCall(SQL_GET_GETPRESENSI_SP);
        if(bulan.length()<2){
            callableStatement.setString(1, "0"+bulan);
        }
        else{
            callableStatement.setString(1, bulan);
        }
        callableStatement.setString(2, tahun);
        callableStatement.setString(3, kode_department);
        result = callableStatement.executeQuery();

        List<RekapPresensiPerBulan> rekapPresensiPerBulans = new ArrayList<RekapPresensiPerBulan>();
        int counter=0;
        while (result.next()) {
            RekapPresensiPerBulan rekapPresensiPerBulan=new RekapPresensiPerBulan();

            rekapPresensiPerBulan.setNo(counter+1);
            rekapPresensiPerBulan.setNip(result.getString("nip"));
            rekapPresensiPerBulan.setNama_karyawan(result.getString("nama"));
            rekapPresensiPerBulan.setJumlah_s(Integer.parseInt(result.getString("S")));
            rekapPresensiPerBulan.setJumlah_i(Integer.parseInt(result.getString("I")));
            rekapPresensiPerBulan.setJumlah_a(Integer.parseInt(result.getString("A")));
            rekapPresensiPerBulan.setJumlah_t(Integer.parseInt(result.getString("T")));
            rekapPresensiPerBulan.setJumlah_m(Integer.parseInt(result.getString("M")));

            
            rekapPresensiPerBulans.add(rekapPresensiPerBulan);
            counter++;
        }
        connection.commit();
        return rekapPresensiPerBulans;

    }

    @Override
    public List<Karyawan> getAllKaryawanByDepartmentCode(String code) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_GETKARYAWANBYDEPARTMENT);
            statement.setString(1, code);

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
