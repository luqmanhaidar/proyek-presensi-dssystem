/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.liburNasional;

import com.presensikaryawan.liburPerusahaan.LiburPerusahaanForm;
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
 * @author Eki
 */
public class LiburNasionalDaoImplemen implements LiburNasionalDao {

    private final String SQL_INSERT = "insert into libur_nasional(tanggal,keterangan) values (?,?)";
    private final String SQL_UPDATE = "update libur_nasional set keterangan = ? where tanggal = ?";
    private final String SQL_DELETE = "delete from libur_nasional where tanggal like ?";
    private final String SQL_GETBYKODE = "select * from libur_nasional where tanggal like ? order by tanggal asc";
    private final String SQL_GETBYNAMA = "select * from libur_nasional where keterangan like ? order by tanggal asc";
    private final String SQL_GETALL = "select * from libur_nasional order by tanggal asc";
    private final String SQL_GETALLKODE = "select tanggal from libur_nasional order by tanggal asc";
    private Connection connection;

    public LiburNasionalDaoImplemen(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insert(LiburNasional liburNasional) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_INSERT);
            statement.setString(1, liburNasional.getTanggal());
            statement.setString(2, liburNasional.getKeterangan());
            statement.executeUpdate();

            connection.commit();
        } catch (SQLException exception) {
            connection.rollback();
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
    public void update(LiburNasional liburNasional) throws SQLException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_UPDATE);
            statement.setString(1, liburNasional.getKeterangan());
            statement.setString(2, liburNasional.getTanggal());
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
    public void delete(LiburNasional unit) throws SQLException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_DELETE);
            statement.setString(1, unit.getTanggal());
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
    public LiburNasional getByTanggalLibur(String tanggal) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(SQL_GETBYKODE);

            statement.setString(1, tanggal);
            result = statement.executeQuery();
            LiburNasional liburNasional = null;
            if (result.next()) {
                liburNasional = new LiburNasional();
                liburNasional.setTanggal(result.getString("tanggal"));
                liburNasional.setKeterangan(result.getString("keterangan"));
            }

            connection.commit();
            return liburNasional;
        } catch (SQLException exception) {
            connection.rollback();
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
    public LiburNasional getByKeteranganLibur(String keterangan) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(SQL_GETBYNAMA);

            statement.setString(1, keterangan);
            result = statement.executeQuery();
            LiburNasional liburNasional = null;
            if (result.next()) {
                liburNasional = new LiburNasional();
                liburNasional.setTanggal(result.getString("tanggal"));
                liburNasional.setKeterangan(result.getString("keterangan"));
            }

            connection.commit();
            return liburNasional;
        } catch (SQLException exception) {
            connection.rollback();
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
    public List<LiburNasional> getAllLiburNasional() throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_GETALL);

            result = statement.executeQuery();
            List<LiburNasional> liburNasionals = new ArrayList<LiburNasional>();
            while (result.next()) {

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
                    Logger.getLogger(LiburPerusahaanForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                LiburNasional liburNasional = new LiburNasional();
                liburNasional.setTanggal(sdf.format(tanggal));
                liburNasional.setKeterangan(result.getString("keterangan"));
                liburNasionals.add(liburNasional);
            }

            connection.commit();
            return liburNasionals;
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
