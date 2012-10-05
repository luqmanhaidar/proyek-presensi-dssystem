/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.detailPresensiKaryawanReport;

import com.presensikaryawan.karyawan.Karyawan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tinus
 */
public class DetailPresensiReportDaoImplemen implements DetailPresensiReportDao {

    private final String SQL_GETDETAILPRESENSI_BYNIP = "SELECT tanggal, keterangan FROM detail_presensi where nip = ? and tanggal like ?";
    private final String SQL_GETWAKTU = "select timelog from eventlog where datelog like ? and userid = ? and fkmode = '0'";
    private final String SQL_GETKARYAWANBYDEPARTMENT = "SELECT * FROM karyawan where kode_department = ?";
    private Connection connection;

    public DetailPresensiReportDaoImplemen(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<DetailPresensiReport> getDetailPresensiByNIP(String nip, String bulan) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        ResultSet result2 = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_GETDETAILPRESENSI_BYNIP);
            statement.setString(1, nip);
            statement.setString(2, bulan + "%");

            result = statement.executeQuery();
            List<DetailPresensiReport> detailPresensiReports = new ArrayList<DetailPresensiReport>();
            while (result.next()) {
                DetailPresensiReport detailPresensiReport = new DetailPresensiReport();

                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                String[] tanggalArr = new String[3];
                int counter = 0;
                StringTokenizer stoken = new StringTokenizer(result.getString("tanggal"));
                while (stoken.hasMoreElements()) {

                    tanggalArr[counter] = stoken.nextToken("-");
                    counter++;
                }
                String tanggalGabung = tanggalArr[2] + "-" + tanggalArr[1] + "-" + tanggalArr[0];
                Date tanggal = null;
                try {
                    tanggal = sdf.parse(tanggalGabung);
                } catch (ParseException ex) {
                    Logger.getLogger(DetailPresensiReport.class.getName()).log(Level.SEVERE, null, ex);
                }



                detailPresensiReport.setTanggal(sdf.format(tanggal));
                detailPresensiReport.setKeterangan(result.getString("keterangan"));

                statement = connection.prepareStatement(SQL_GETWAKTU);
                statement.setString(1, result.getString("tanggal"));
                statement.setString(2, nip);
                result2 = statement.executeQuery();
                if (!result.getString("keterangan").matches("T") && !result.getString("keterangan").matches("M")) {
                    detailPresensiReport.setWaktu("-");
                }
                while (result2.next()) {
                    detailPresensiReport.setWaktu(result2.getString("timelog"));
                }
                detailPresensiReports.add(detailPresensiReport);

            }

            connection.commit();
            return detailPresensiReports;
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
    public List<Karyawan> getKaryawanByDepartmentCode(String kode_department) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_GETKARYAWANBYDEPARTMENT);
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
}
