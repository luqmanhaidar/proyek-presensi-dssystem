/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaaryawan.transaksiDepartment;
import com.presensikaryawan.liburPerusahaan.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tinus
 */
public class TransaksiDepartmentDaoImplemen implements TransaksiDepartmentDao {

    private String bulan;
    private String department;
    private String nip, nama;
    private int s, i, a, t, m, l;
    private double pokok, uangMakan, uangHadir, lain, potonganTelat, potonganLain, total;
//    private final String SQL_INSERT = "insert into libur_perusahaan(tanggal,keterangan) values (?,?)";
//    private final String SQL_UPDATE = "update libur_perusahaan set keterangan = ? where tanggal = ?";
//    private final String SQL_DELETE = "delete from libur_perusahaan where tanggal like ?";
//    private final String SQL_GETBYTANGGAL = "select * from libur_perusahaan where tanggal like ?";
    //private final String SQL_GETBYNAMA = "select * from libur_perusahaan where namaKategori like ?";
    private final String SQL_GETALL = "SELECT k.nip, k.nama, COUNT(e.UserId)M, g.* "
            + "FROM karyawan k, eventlog e, golongan g "
            + "WHERE k.kode_department = ? "
            + "AND e.UserId = k.nip "
            + "AND e.DateLog LIKE ? "
            + "AND k.kode_golongan = g.kode_golongan "
            + "GROUP BY e.UserId";
    //private final String SQL_GETALLKODE = "select kodeKategori from libur_perusahaan";
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

            statement = connection.prepareStatement(SQL_GETALL);
            statement.setString(1, department);
            if(bulan<10)
            statement.setString(2, tahun+"-0"+bulan+"-%");
            else
                statement.setString(2, tahun+"-"+bulan+"-%");
            System.out.println(tahun+"-0"+bulan+"-%");
            result = statement.executeQuery();
            List<TransaksiDepartment> transaksiDepartments = new ArrayList<TransaksiDepartment>();
            while (result.next()) {
                TransaksiDepartment transaksiDepartment = new TransaksiDepartment();
                
                nip=result.getString("nip");
                nama=result.getString("nama");
                m=result.getInt("M");
                s=result.getInt("M");
                i=result.getInt("M");
                a=result.getInt("M");
                t=result.getInt("M");
                l=result.getInt("M");
                pokok=result.getDouble("gaji_pokok")*m;
                uangMakan=result.getDouble("uang_makan")*m;
                uangHadir=result.getDouble("uang_hadir")*m;
//                lain=result.getDouble("gaji_pokok");
                potonganTelat=result.getDouble("potongan_telat")*t;
//                potonganLain=result.getDouble("gaji_pokok");
                total=pokok+uangMakan+uangHadir+lain-potonganTelat-potonganLain;
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
