/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.transaksiDepartment;

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
                m=result.getInt("M");
                s=result.getInt("S");
                i=result.getInt("I");
                a=result.getInt("A");
                t=result.getInt("T");
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
            
            while (result.next()) {
                TransaksiDepartment transaksiDepartment = new TransaksiDepartment();
                
                nip=result.getString("nip");
                nama=result.getString("nama");
                m=result.getInt("M");
                s=result.getInt("S");
                i=result.getInt("I");
                a=result.getInt("A");
                t=result.getInt("T");
                l=result.getInt("L");
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
