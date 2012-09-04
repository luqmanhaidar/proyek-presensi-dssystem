/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.liburPerusahaan;

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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tinus
 */
public class LiburPerusahaanDaoImplemen implements LiburPerusahaanDao {

    private final String SQL_INSERT = "insert into libur_perusahaan(tanggal,keterangan) values (?,?)";
    private final String SQL_UPDATE = "update kategori set keterangan = ? where tanggal = ?";
    private final String SQL_DELETE = "delete from libur_perusahaan where tanggal like ?";
    //private final String SQL_GETBYKODE = "select * from libur_perusahaan where kodeKategori like ?";
    //private final String SQL_GETBYNAMA = "select * from libur_perusahaan where namaKategori like ?";
    private final String SQL_GETALL = "select * from libur_perusahaan";
    //private final String SQL_GETALLKODE = "select kodeKategori from libur_perusahaan";
    private Connection connection;

    public LiburPerusahaanDaoImplemen(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insert(LiburPerusahaan liburPerusahaan) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_INSERT);
            statement.setString(1, liburPerusahaan.getTanggal().toString());
            statement.setString(2, liburPerusahaan.getKeterangan());
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
    public void update(LiburPerusahaan liburPerusahaan) throws SQLException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_UPDATE);
            statement.setString(1, liburPerusahaan.getKeterangan());
            statement.setString(2, liburPerusahaan.getTanggal().toString());
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
    public void delete(LiburPerusahaan liburPerusahaan) throws SQLException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_DELETE);
            statement.setString(1, liburPerusahaan.getTanggal().toString());
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
    public List<LiburPerusahaan> getAllLiburPerusahaan() throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_GETALL);

            result = statement.executeQuery();
            List<LiburPerusahaan> liburPerusahaans = new ArrayList<LiburPerusahaan>();
            while (result.next()) {
                LiburPerusahaan liburPerusahaan = new LiburPerusahaan();

                String tanggal = result.getString("tanggal");
//                DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
//                Date parsed = null;
//                try {
//                    parsed = df.parse(tanggal);
//                } catch (ParseException ex) {
//                    Logger.getLogger(LiburPerusahaanDaoImplemen.class.getName()).log(Level.SEVERE, null, ex);
//                }
//                Calendar cal = new GregorianCalendar();
//                cal.setTime(parsed);

                liburPerusahaan.setTanggal(tanggal);
                liburPerusahaan.setKeterangan(result.getString("keterangan"));
                liburPerusahaan.setNo(result.getInt("no"));
                liburPerusahaans.add(liburPerusahaan);

            }

            connection.commit();
            return liburPerusahaans;
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

