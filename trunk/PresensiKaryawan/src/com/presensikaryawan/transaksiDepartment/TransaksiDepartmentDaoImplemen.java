/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.transaksiDepartment;
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
    private final String SQL_GETALLGAJI = "call getGaji(?,?,?)";
    private final String SQL_GETGAJI ="SELECT k.nip, k.nama, "
            + "COUNT(DISTINCT a.tanggal)S, "
            + "COUNT(DISTINCT b.tanggal)I, "
            + "COUNT(DISTINCT c.tanggal)A, "
            + "COUNT(DISTINCT d.tanggal)T, "
            + "COUNT(DISTINCT e.tanggal)M, "
            + "g.* FROM golongan g, karyawan k "
            + "LEFT JOIN detilpresensi a ON a.nip = k.nip AND a.keterangan='S'  AND a.tanggal LIKE ?"
            + "LEFT JOIN detilpresensi b ON b.nip = k.nip AND b.keterangan='I'  AND b.tanggal LIKE ?"
            + "LEFT JOIN detilpresensi c ON c.nip = k.nip AND c.keterangan='A'  AND c.tanggal LIKE ?"
            + "LEFT JOIN detilpresensi d ON d.nip = k.nip AND d.keterangan='T'  AND d.tanggal LIKE ?"
            + "LEFT JOIN detilpresensi e ON e.nip = k.nip AND e.keterangan='M'  AND e.tanggal LIKE ?"
            + "WHERE k.kode_department = ? AND k.kode_golongan = g.kode_golongan"
            + "GROUP BY k.nip";
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

            statement = connection.prepareStatement(SQL_GETALLGAJI);
            statement.setString(3, department);
            statement.setString(2, ""+tahun);
            if(bulan<10)
            statement.setString(1, "0"+bulan);
            else
                statement.setString(1, ""+bulan);
//            System.out.println(tahun+"-0"+bulan+"-%");
            result = statement.executeQuery();
            List<TransaksiDepartment> transaksiDepartments = new ArrayList<TransaksiDepartment>();
            while (result.next()) {
                TransaksiDepartment transaksiDepartment = new TransaksiDepartment();
                
                nip=result.getString("nip");
                nama=result.getString("nama");
                m=result.getInt(7);
                s=result.getInt(3);
                i=result.getInt(4);
                a=result.getInt(5);
                t=result.getInt(6);
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
