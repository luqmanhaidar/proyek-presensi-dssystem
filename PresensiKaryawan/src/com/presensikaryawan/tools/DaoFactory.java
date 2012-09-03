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

    private static Connection connection;
 
    private static Properties prop;
    private static GolonganDao golonganDao;
    private static BankDao bankDao;
    
    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            try {
                FileInputStream in = new FileInputStream("C:\\WINDOWS\\ipAddressContoh.xml");
                prop = new Properties();
                prop.loadFromXML(in);

            } catch (IOException ex) {
                Logger.getLogger(DaoFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
            DriverManager.registerDriver(new Driver());
            String alamatIp = prop.getProperty("IPADDRESS");
            String namaDB = prop.getProperty("NAMADB");

            String url = "jdbc:mysql://" + alamatIp + "/" + namaDB;
            String user = "root";
            String password = "admin";
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
 public static BankDao getBankDao() throws SQLException {
        if (bankDao == null) {
            bankDao = new BankDaoImplemen(getConnection());
        }
        return bankDao;
    }

  
}
