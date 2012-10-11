/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.eventlogReport;

import com.presensikaryawan.karyawan.Karyawan;
import com.presensikaryawan.tools.DaoFactory;
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
public class EventlogDaoImplemen implements EventlogReportDao {

    private static final String SQL_GET_EVENTLOG = "SELECT * FROM eventlog WHERE UserId BETWEEN ? AND ? AND datelog LIKE ?";
    private static final String SQL_GET_KARYAWANBYNIP="SELECT * FROM karyawan WHERE nip = ?";
    private Connection connection;

    public EventlogDaoImplemen(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<EventlogReport> eventlogReports(String nip1, String nip2, String bulan) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(SQL_GET_EVENTLOG);
            statement.setString(1, nip1);
            statement.setString(2, nip2);
            statement.setString(3, bulan+"%");

            result = statement.executeQuery();
            List<EventlogReport> eventlogReports = new ArrayList<EventlogReport>();
            int counter = 0;
            while (result.next()) {
                EventlogReport eventlogReport = new EventlogReport();
                eventlogReport.setNo(counter++);
                eventlogReport.setNip(result.getString("UserId"));

                Karyawan karyawan = new Karyawan();
                karyawan = DaoFactory.getEventlogReportDao().getKaryawanByNIP(eventlogReport.getNip());
                eventlogReport.setNama(karyawan.getNama());

                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                String[] tanggalArr = new String[3];
                int counterTgl = 0;
                
                StringTokenizer stoken = new StringTokenizer(result.getString("DateLog"));
                while (stoken.hasMoreElements()) {
                    tanggalArr[counterTgl] = stoken.nextToken("-");
                    counterTgl++;
                }
                String tanggalGabung = tanggalArr[2] + "-" + tanggalArr[1] + "-" + tanggalArr[0];
                Date tanggal = null;
                try {
                    tanggal = sdf.parse(tanggalGabung);
                } catch (ParseException ex) {
                    Logger.getLogger(EventlogReportForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                eventlogReport.setDateLog(sdf.format(tanggal));
                eventlogReport.setTimeLog(result.getString("TimeLog"));
                eventlogReport.setVerify(result.getString("Verify"));
                eventlogReport.setNumCard(result.getString("CardNum"));
                eventlogReport.setFkMode(result.getString("FKMode"));
                eventlogReport.setDeviceID(result.getString("DeviceId"));

                eventlogReports.add(eventlogReport);
            }
            connection.commit();
            return eventlogReports;
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
            Karyawan karyawan = null;

            if (result.next()) {

                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                String[] tanggalArr = new String[3];
                int counter = 0;
                StringTokenizer stoken = new StringTokenizer(result.getString("tanggal_masuk"));
                while (stoken.hasMoreElements()) {

                    tanggalArr[counter] = stoken.nextToken("-");
                    counter++;
                }
                String tanggalGabung = tanggalArr[2] + "-" + tanggalArr[1] + "-" + tanggalArr[0];
                Date tanggal = null;
                try {
                    tanggal = sdf.parse(tanggalGabung);
                } catch (ParseException ex) {
                    Logger.getLogger(EventlogReportForm.class.getName()).log(Level.SEVERE, null, ex);
                }

                karyawan = new Karyawan();
                karyawan.setNip(result.getString("nip"));
                karyawan.setNama(result.getString("nama"));
                karyawan.setAlamat(result.getString("alamat"));
                karyawan.setTanggal_masuk(sdf.format(tanggal));
                karyawan.setKodeGolongan(result.getString("kode_golongan"));
                karyawan.setKodePosisi(result.getString("kode_posisi"));
                karyawan.setKodeOutlet(result.getString("kode_outlet"));
                karyawan.setKodeDepartment(result.getString("kode_department"));
                karyawan.setNo_rekening(result.getString("no_rekening"));
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
}
