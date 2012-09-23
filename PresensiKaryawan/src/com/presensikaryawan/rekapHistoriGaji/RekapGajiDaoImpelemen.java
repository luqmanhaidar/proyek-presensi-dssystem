/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.rekapHistoriGaji;

import com.presensikaryawan.karyawan.Karyawan;
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
public class RekapGajiDaoImpelemen implements RekapGajiDao {

    private final String SQL_GET_REKAPGAJI_BYNIPANDYEAR = "SELECT * FROM penggajian WHERE NIP = ? and tahun = ?";
    private final String SQL_GET_NIPBYKODEDEPARTMENT = "SELECT * FROM karyawan WHERE kode_department = ?";
    private final String SQL_GET_KARYAWANBYNIP = "SELECT * FROM karyawan WHERE nip=?";
    private Connection connection;

    public RekapGajiDaoImpelemen(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<RekapGaji> getRekapGajiByNIPAndYear(String nip, String year) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_GET_REKAPGAJI_BYNIPANDYEAR);
            statement.setString(1, nip);
            statement.setString(2, year);

            result = statement.executeQuery();
            List<RekapGaji> rekapGajis = new ArrayList<RekapGaji>();
            int counter = 1;
            while (result.next()) {
                RekapGaji rekapGaji = new RekapGaji();
                rekapGaji.setNo(counter);
                rekapGaji.setNip(result.getString("nip"));
                rekapGaji.setBulan(result.getString("bulan"));
                rekapGaji.setS(result.getInt("S"));
                rekapGaji.setI(result.getInt("I"));
                rekapGaji.setA(result.getInt("A"));
                rekapGaji.setT(result.getInt("T"));
                rekapGaji.setLembur(result.getInt("lembur"));
                rekapGaji.setGaji_pokok(result.getDouble("gaji_pokok"));
                rekapGaji.setUang_makan(result.getDouble("uang_makan"));
                rekapGaji.setUang_hadir(result.getDouble("uang_hadir"));
                rekapGaji.setUang_lembur(result.getDouble("uang_lembur"));
                rekapGaji.setPotongan_terlambat(result.getDouble("potongan_terlambat"));
                rekapGaji.setPotongan_lain(result.getDouble("potongan_lain"));
                rekapGaji.setLain_lain(result.getDouble("lain"));
                rekapGaji.setTotal(result.getDouble("total"));

                counter++;
                rekapGajis.add(rekapGaji);
            }

            connection.commit();
            return rekapGajis;
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
    public List<Karyawan> getNIPByKodeDepartment(String kode_department) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_GET_NIPBYKODEDEPARTMENT);
            statement.setString(1, kode_department);

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

    @Override
    public Karyawan getKaryawanByNIP(String nip) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_GET_KARYAWANBYNIP);
            statement.setString(1, nip);

            result = statement.executeQuery();
            Karyawan karyawan=null;
            while (result.next()) {
                karyawan = new Karyawan();
                karyawan.setNip(result.getString("nip"));
                karyawan.setNama(result.getString("nama"));
                karyawan.setKodeGolongan(result.getString("kode_golongan"));
            }

            connection.commit();
            return karyawan;
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
