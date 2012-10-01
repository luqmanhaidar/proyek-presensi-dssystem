/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.transaksiDepartment;

import com.presensikaryawan.detailtransaksidepartment.DetailLain;
import com.presensikaryawan.golongan.Golongan;
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
public class TransaksiDepartmentDaoImplemen implements TransaksiDepartmentDao {

    private String bulan;
    private String department;
    private String nip, nama;
    private int s, i, a, t, m, l;
    private double pokok, uangMakan, uangHadir, lain, potonganTelat, potonganLain, total, uanglembur;
    private final String SQL_GETALLGAJI = "call getGaji(?,?,?)";
    private final String SQL_GETALLGAJI2 = "call getGaji2(?,?)";
    private final String SQL_INSERTTEMP = "call inserttemptransaksi(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    private final String SQL_SELECTALL = "select * from temptransaksidepartment where department = ? and bulan like ?";
    private final String SQL_UPDATEPOTONGAN = "call updatePotongan(?,?,?,?)";
    private final String SQL_SELECTLAIN = "select lain_lain, potongan_lain from temptransaksidepartment where nip= ? and bulan like ?";
    private final String SQL_GETGAJIKOTORKARYAWAN="select pokok+hadir+lembur+makan from temptransaksidepartment where nip = ? and bulan like ?";
    private final String SQL_GETGOLONGANBYNIP="SELECT g.nama_golongan FROM karyawan k, golongan g WHERE k.kode_golongan=g.kode_golongan AND k.nip = ?";
    private Connection connection;

    public TransaksiDepartmentDaoImplemen(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<TransaksiDepartment> getAllTransaksiDepartment(String department, int bulan, int tahun) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);

//            statement = connection.prepareStatement(SQL_GETALLGAJI);
            statement = connection.prepareStatement(SQL_SELECTALL);
            statement.setString(1, department);
//            statement.setString(2, "" + tahun);
            if (bulan < 10) {
                statement.setString(2, tahun+"-0" + bulan);
            } else {
                statement.setString(2, tahun+"-" + bulan);
            }
            System.out.println(statement);
            result = statement.executeQuery();
            List<TransaksiDepartment> transaksiDepartments = new ArrayList<TransaksiDepartment>();

            while (result.next()) {
                TransaksiDepartment transaksiDepartment = new TransaksiDepartment();

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
                lain=result.getDouble("lain_lain");
                potonganTelat = result.getDouble("potongan_telat");
                potonganLain=result.getDouble("potongan_lain");
                total = result.getDouble("total");

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

    @Override
    public List<TransaksiDepartment> getAllTransaksiDepartment(String department, String maxdate) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_GETALLGAJI2);
            statement.setString(2, department);
            statement.setString(1, maxdate);
//            System.out.println(tahun+"-0"+bulan+"-%");
            result = statement.executeQuery();
            List<TransaksiDepartment> transaksiDepartments = new ArrayList<TransaksiDepartment>();

            connection.commit();

            while (result.next()) {

                nip = result.getString("nip");
                nama = result.getString("nama");
                m = result.getInt("M");
                s = result.getInt("S");
                i = result.getInt("I");
                a = result.getInt("A");
                t = result.getInt("T");
                l = result.getInt("L");
                pokok = result.getDouble("gaji_pokok");
                uangMakan = result.getDouble("uang_makan") * m;
                uangHadir = result.getDouble("uang_hadir") * m;
                uanglembur = result.getDouble("uang_lembur") * l;
//                lain=result.getDouble("gaji_pokok");
                potonganTelat = result.getDouble("potongan_telat") * t;
//                potonganLain=result.getDouble("gaji_pokok");
                total = pokok + uangMakan + uangHadir + lain + uanglembur - potonganTelat - potonganLain;

                statement = connection.prepareStatement(SQL_INSERTTEMP);
                statement.setString(1, nip);
                statement.setString(2, nama);
                statement.setInt(3, m);
                statement.setInt(4, s);
                statement.setInt(5, i);
                statement.setInt(6, a);
                statement.setInt(7, t);
                statement.setInt(8, l);
                statement.setDouble(9, pokok);
                statement.setDouble(10, uangMakan);
                statement.setDouble(11, uangHadir);
                statement.setDouble(12, uanglembur);
                statement.setDouble(13, lain);
                statement.setDouble(14, potonganTelat);
                statement.setDouble(15, potonganLain);
                statement.setDouble(16, total);
                statement.setString(17, maxdate.substring(0, 7));
                statement.setString(18, department);
                System.out.println(statement);
                statement.executeUpdate();

                connection.commit();


            }

            statement = connection.prepareStatement(SQL_SELECTALL);
            statement.setString(1, department);
            statement.setString(2, maxdate.substring(0, 7));
//            System.out.println(tahun+"-0"+bulan+"-%");
            result = statement.executeQuery();
            while (result.next()) {
                TransaksiDepartment transaksiDepartment = new TransaksiDepartment();
                
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
                lain=result.getDouble("lain_lain");
                potonganTelat = result.getDouble("potongan_telat");
                potonganLain=result.getDouble("potongan_lain");
                total = result.getDouble("total");

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

    @Override
    public void insertTemp(List<TransaksiDepartment> list, String department, String bulantahun) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;

//            System.out.println(tahun+"-0"+bulan+"-%");
        result = statement.executeQuery();
        for (int j = 0; j < list.size(); j++) {
            nip = list.get(i).getNip();
            nama = list.get(i).getNama();
            m = list.get(i).getM();
            s = list.get(i).getS();
            i = list.get(i).getI();
            a = list.get(i).getA();
            t = list.get(i).getT();
            l = list.get(i).getL();
            pokok = list.get(i).getPokok();
            uangMakan = list.get(i).getUangMakan();
            uangHadir = list.get(i).getUangHadir();
            uangHadir = list.get(i).getUangHadir();
            lain = list.get(i).getLain();
            potonganTelat = list.get(i).getPotonganTelat();
            potonganLain = list.get(i).getPotonganLain();
            total = list.get(i).getTotal();

            connection.setAutoCommit(false);



        }
    }

    @Override
    public void updatePotongan(String nip, String bulan, double potongan, double prestasi) throws SQLException {
        PreparedStatement statement = null;
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_UPDATEPOTONGAN);
            statement.setDouble(4, prestasi);
            statement.setDouble(3, potongan);
            statement.setString(2, bulan);
            statement.setString(1, nip);
            statement.executeUpdate();
    }

    @Override
    public double getGajiKotor(String nip, String bulan) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_GETGAJIKOTORKARYAWAN);
            statement.setString(1, nip);
            statement.setString(2, bulan);

            result = statement.executeQuery();
            double gajiKotor=0;
            if (result.next()) {
                gajiKotor= result.getDouble(1);
            }

            connection.commit();
            return gajiKotor;
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
    public Golongan getGolonganByNIP(String nip) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_GETGOLONGANBYNIP);
            statement.setString(1, nip);

            result = statement.executeQuery();
            Golongan golongan=new Golongan();
            if (result.next()) {
                golongan.setNamaGolongan(result.getString(1));
            }

            connection.commit();
            return golongan;
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
    public DetailLain getLain(String nip, String bulan) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_SELECTLAIN);
            statement.setString(1, nip);
            statement.setString(2, bulan);

            result = statement.executeQuery();
            DetailLain detail=new DetailLain();
            if (result.next()) {
                detail.setNip(nip);
                detail.setTanggal(bulan);
                detail.setPotonganLain(result.getDouble("potongan_lain"));
                detail.setPrestasi(result.getDouble("lain_lain"));
            }

            connection.commit();
            return detail;
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
