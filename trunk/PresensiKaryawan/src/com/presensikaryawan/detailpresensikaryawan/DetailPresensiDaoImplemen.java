/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.detailpresensikaryawan;

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
public class DetailPresensiDaoImplemen implements DetailPresensiDao {

    private final String SQL_UPDATE_GETPRESENSI = "UPDATE detail_presensi set keterangan = ? where nip = ? and tanggal = ?";
    private final String SQL_GETDETAILPRESENSI_BYNIP = "SELECT tanggal, keterangan FROM detail_presensi where nip = ? and tanggal like ?";
    private final String SQL_GETWAKTU = "select timelog from eventlog where datelog like ? and userid = ? and fkmode = '0'";
    private final String SQL_UPDATETEMP = "call updateTempTransaksi(?,?)";
    private Connection connection;

    public DetailPresensiDaoImplemen(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void updateDetailPresensi(String tanggal, String nip, String keterangan) throws SQLException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_UPDATE_GETPRESENSI);
            statement.setString(3, tanggal);
            statement.setString(2, nip);
            statement.setString(1, keterangan);
            statement.executeUpdate();

            connection.commit();
        } catch (SQLException exception) {
            connection.rollback();
            throw exception;
        } finally {
            try {
                connection.setAutoCommit(true);
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException exception) {
                throw exception;
            }
        }
    }

    @Override
    public List<DetailPresensi> getDetailPresensiByNIP(String nip, String bulan, String tahun) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        ResultSet result2 = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_GETDETAILPRESENSI_BYNIP);
            statement.setString(1, nip);
            statement.setString(2, tahun + "-" + bulan + "%");

            result = statement.executeQuery();
            List<DetailPresensi> detailPresensis = new ArrayList<DetailPresensi>();
            while (result.next()) {
                DetailPresensi detailPresensi = new DetailPresensi();

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
                    Logger.getLogger(DetailPresensiDialog.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                

                detailPresensi.setTanggal(sdf.format(tanggal));
                detailPresensi.setKeterangan(result.getString("keterangan"));
                
                statement = connection.prepareStatement(SQL_GETWAKTU);
                statement.setString(1, result.getString("tanggal"));
                statement.setString(2, nip);
                result2 = statement.executeQuery();
                if(!result.getString("keterangan").matches("T")&&!result.getString("keterangan").matches("M")){
                    detailPresensi.setWaktu("-");
                }
                while (result2.next()) {
                    detailPresensi.setWaktu(result2.getString("timelog"));
                }
                detailPresensis.add(detailPresensi);

            }

            connection.commit();
            return detailPresensis;
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
    public void updateGaji(String maxday, String nip) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        ResultSet result2 = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_UPDATETEMP);
            statement.setString(1, nip);
            statement.setString(2, maxday);

            statement.executeQuery();
            

            connection.commit();
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
