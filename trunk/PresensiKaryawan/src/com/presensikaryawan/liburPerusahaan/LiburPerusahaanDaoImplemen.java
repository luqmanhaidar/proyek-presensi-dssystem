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
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tinus
 */
public class LiburPerusahaanDaoImplemen implements LiburPerusahaanDao {

    private final String SQL_INSERT = "insert into libur_perusahaan(tanggal,keterangan) values (?,?)";
    private final String SQL_UPDATE = "update libur_perusahaan set keterangan = ? where tanggal = ?";
    private final String SQL_DELETE = "delete from libur_perusahaan where tanggal like ?";
    private final String SQL_GETBYTANGGAL = "select * from libur_perusahaan where tanggal like ?";
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


                liburPerusahaan.setTanggal(sdf.format(tanggal));
                liburPerusahaan.setKeterangan(result.getString("keterangan"));
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

    @Override
    public LiburPerusahaan getByTanggal(String tanggal) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(SQL_GETBYTANGGAL);

            statement.setString(1, tanggal);
            result = statement.executeQuery();
//             Kategori kategori = null;
            LiburPerusahaan liburPerusahaan = null;
            if (result.next()) {
//                 kategori = new Kategori();
//                 kategori.setKodeKategori(result.getString("kodeKategori"));
//                 kategori.setNamaKategori(result.getString("namaKategori"));

                liburPerusahaan = new LiburPerusahaan();
                liburPerusahaan.setTanggal(result.getString("tanggal"));
                liburPerusahaan.setKeterangan(result.getString("keterangan"));
            }

            connection.commit();
            return liburPerusahaan;
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
}
