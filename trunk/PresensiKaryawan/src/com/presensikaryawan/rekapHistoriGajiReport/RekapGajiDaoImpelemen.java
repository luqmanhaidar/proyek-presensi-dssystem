/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.rekapHistoriGajiReport;

import com.presensikaryawan.golongan.Golongan;
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

    private final String SQL_GET_NAMAGOLONGANBYCODE="SELECT nama_golongan FROM golongan WHERE kode_golongan = ?";
    private final String SQL_GET_TOTALGAJI="SELECT SUM(Total) FROM temptransaksidepartment WHERE nip = ? and bulan like ?";
    private final String SQL_GET_REKAPGAJI_BYNIPANDYEAR = "SELECT * FROM temptransaksidepartment WHERE NIP BETWEEN ? AND ? and bulan like ?";
    private final String SQL_GET_NIPBYKODEDEPARTMENT = "SELECT * FROM karyawan WHERE kode_department = ?";
    private final String SQL_GET_KARYAWANBYNIP = "SELECT * FROM karyawan WHERE nip=?";
    private Connection connection;

    public RekapGajiDaoImpelemen(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<RekapGaji> getRekapGajiByNIPAndYear(String nip1, String nip2, String year) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_GET_REKAPGAJI_BYNIPANDYEAR);
            statement.setString(1, nip1);
            statement.setString(2, nip2);
            statement.setString(3, year+"%");

            result = statement.executeQuery();
            List<RekapGaji> rekapGajis = new ArrayList<RekapGaji>();
            int counter = 1;
            while (result.next()) {
                RekapGaji rekapGaji = new RekapGaji();
                Karyawan karyawan=getKaryawanByNIP(result.getString("nip"));
                
                String bulan=result.getString("bulan").substring(5, 7);
                if (bulan.matches("01")){
                    bulan="JAN";
                }else if (bulan.matches("02")){
                    bulan="FEB";
                }else if (bulan.matches("03")){
                    bulan="MAR";
                }else if (bulan.matches("04")){
                    bulan="APR";
                }else if (bulan.matches("05")){
                    bulan="MEI";
                }else if (bulan.matches("06")){
                    bulan="JUNI";
                }else if (bulan.matches("07")){
                    bulan="JULI";
                }else if (bulan.matches("08")){
                    bulan="AGT";
                }else if (bulan.matches("09")){
                    bulan="SEPT";
                }else if (bulan.matches("10")){
                    bulan="OKT";
                }else if (bulan.matches("11")){
                    bulan="NOV";
                }else if (bulan.matches("12")){
                    bulan="DES";
                }
                
                rekapGaji.setNo(counter);
                rekapGaji.setNip(result.getString("nip"));
                rekapGaji.setNama(karyawan.getNama());
                rekapGaji.setBulan(bulan);
                rekapGaji.setS(result.getInt("S"));
                rekapGaji.setI(result.getInt("I"));
                rekapGaji.setA(result.getInt("A"));
                rekapGaji.setT(result.getInt("T"));
                rekapGaji.setLembur(result.getInt("L"));
                rekapGaji.setGaji_pokok(result.getDouble("pokok"));
                rekapGaji.setUang_makan(result.getDouble("makan"));
                rekapGaji.setUang_hadir(result.getDouble("hadir"));
                rekapGaji.setUang_lembur(result.getDouble("lembur"));
                rekapGaji.setPotongan_terlambat(result.getDouble("potongan_telat"));
                rekapGaji.setPotongan_lain(result.getDouble("potongan_lain"));
                rekapGaji.setLain_lain(result.getDouble("lain_lain"));
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

            return karyawan;
        } catch (SQLException exception) {
            throw exception;
        } finally {
            try {
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
    public double getTotalGajiSetahun(String nip1, String nip2, String year) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_GET_TOTALGAJI);
            statement.setString(1, nip1);
            statement.setString(2, nip2);
            statement.setString(3, year+"%");

            result = statement.executeQuery();
            RekapGaji rekapGaji=null;
            if  (result.next()) {
                rekapGaji = new RekapGaji();
                rekapGaji.setTotal(result.getDouble(1));
            }

            connection.commit();
            return rekapGaji.getTotal();
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
    public String getGolonganByCode(String kode_golongan) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_GET_NAMAGOLONGANBYCODE);
            statement.setString(1, kode_golongan);

            result = statement.executeQuery();
            Golongan golongan=null;
            if  (result.next()) {
                golongan = new Golongan();
                golongan.setNamaGolongan(result.getString("nama_golongan"));
            }

            connection.commit();
            return golongan.getNamaGolongan();
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
