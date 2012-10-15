/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.jamMasukKeluarReport;

import com.presensikaryawan.eventlogReport.EventlogReportForm;
import com.presensikaryawan.karyawan.Karyawan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tinus
 */
public class JamMasukKeluarReportDaoImplemen implements JamMasukKeluarReportDao {

    private static final String SQL_GET_KARYAWANBYNIP = "SELECT * FROM karyawan WHERE nip = ?";
    private Connection connection;

    public JamMasukKeluarReportDaoImplemen(Connection connection) {
        this.connection = connection;
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
