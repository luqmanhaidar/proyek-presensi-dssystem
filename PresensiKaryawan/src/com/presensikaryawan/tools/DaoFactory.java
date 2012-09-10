 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.tools;

import com.presensikaryawan.golongan.GolonganDao;
import com.presensikaryawan.golongan.GolonganDaoImplemen;
import com.dssystem.bank.BankDao;
import com.dssystem.bank.BankDaoImplemen;
import java.sql.Connection;
import com.mysql.jdbc.Driver;
import com.presensikaryawan.gaji.GajiDao;
import com.presensikaryawan.gaji.GajiDaoImplemen;
import com.presensikaryawan.groupShift.GroupShift;
import com.presensikaryawan.groupShift.GroupShiftDao;
import com.presensikaryawan.groupShift.GroupShiftDaoImplemen;
import com.presensikaryawan.karyawan.KaryawanDao;
import com.presensikaryawan.karyawan.KaryawanDaoImplemen;
import com.presensikaryawan.liburNasional.LiburNasionalDao;
import com.presensikaryawan.liburNasional.LiburNasionalDaoImplemen;
import com.presensikaryawan.liburPerusahaan.LiburPerusahaanDao;
import com.presensikaryawan.liburPerusahaan.LiburPerusahaanDaoImplemen;
import com.presensikaryawan.outletSetting.OutletDao;
import com.presensikaryawan.outletSetting.OutletDaoImplemen;
import com.presensikaryawan.posisi.PosisiDao;
import com.presensikaryawan.posisi.PosisiDaoImplemen;
import com.presensikaryawan.shiftSetting.ShiftDao;
import com.presensikaryawan.shiftSetting.ShiftDaoImplemen;
import com.presensikaryawan.statusSetting.StatusSettingDao;
import com.presensikaryawan.statusSetting.StatusSettingDaoImplemen;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dalvins
 */
public class DaoFactory {

    private static LiburPerusahaanDao liburPerusahaanDao;
    private static LiburNasionalDao liburNasionalDao;
    private static StatusSettingDao statusSettingDao;
    private static GolonganDao golonganDao;
    private static PosisiDao posisiDao;
    private static ShiftDao shiftDao;
    private static OutletDao outletDao;
    private static GroupShiftDao groupShiftDao;
    private static Connection connection;
    private static Properties prop;
    private static KaryawanDao karyawanDao;
    private static GajiDao gajiDao;
//    private static BankDao bankDao;

    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            try {
                FileInputStream in = new FileInputStream("C:\\WINDOWS\\ipAddressDatabasePresensi.xml");
                prop = new Properties();
                prop.loadFromXML(in);

            } catch (IOException ex) {
                Logger.getLogger(DaoFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
            DriverManager.registerDriver(new Driver());
            String alamatIp = prop.getProperty("IPADDRESS");
            String namaDB = prop.getProperty("NAMADB");

            String url = "jdbc:mysql://" + alamatIp + "/" + namaDB;
            String user = "presensi";
            String password = "adminpresensi";
            connection = DriverManager.getConnection(url, user, password);
        }
        return connection;
    }

    public static GolonganDao getGolonganDao() throws SQLException {
        if (golonganDao == null) {
            golonganDao = new GolonganDaoImplemen(getConnection());
        }
        return golonganDao;
    }

    public static KaryawanDao getKaryawanDao() throws SQLException {
        if (karyawanDao == null) {
            karyawanDao = new KaryawanDaoImplemen(getConnection());

        }
        return karyawanDao;
    }

    public static LiburPerusahaanDao getLiburPerusahaanDao() throws SQLException {
        if (liburPerusahaanDao == null) {
            liburPerusahaanDao = new LiburPerusahaanDaoImplemen(getConnection());
        }
        return liburPerusahaanDao;
    }

//    public static BankDao getBankDao() throws SQLException {
//        if (bankDao == null) {
//            bankDao = new BankDaoImplemen(getConnection());
//        }
//        return bankDao;
//    }
    public static LiburNasionalDao getLiburNasionalDao() throws SQLException {
        if (liburNasionalDao == null) {
            liburNasionalDao = new LiburNasionalDaoImplemen(getConnection());
        }
        return liburNasionalDao;
    }

    public static StatusSettingDao getStatusSettingDao() throws SQLException {
        if (statusSettingDao == null) {
            statusSettingDao = new StatusSettingDaoImplemen(getConnection());
        }
        return statusSettingDao;
    }

    public static GajiDao getGajiDao() throws SQLException {
        if (gajiDao == null) {
            gajiDao = new GajiDaoImplemen(getConnection());
        }
        return gajiDao;
    }

    public static PosisiDao getPosisiDao() throws SQLException {
        if (posisiDao == null) {
            posisiDao = new PosisiDaoImplemen(getConnection());
        }
        return posisiDao;
    }
    
    public static ShiftDao getShiftDao() throws SQLException {
        if (shiftDao == null) {
            shiftDao = new ShiftDaoImplemen(getConnection());
        }
        return shiftDao;
    }
    
    public static OutletDao getOutletDao() throws SQLException {
        if (outletDao == null) {
            outletDao = new OutletDaoImplemen(getConnection());
        }
        return outletDao;
    }
    
     public static GroupShiftDao getGroupShiftDao() throws SQLException {
        if (groupShiftDao == null) {
            groupShiftDao = new GroupShiftDaoImplemen(getConnection());
        }
        return groupShiftDao;
    }
}