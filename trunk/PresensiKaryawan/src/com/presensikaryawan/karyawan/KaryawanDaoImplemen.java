/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.karyawan;

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
public class KaryawanDaoImplemen implements KaryawanDao {

    private final String SQL_INSERT = "insert into karyawan(nip, nama, alamat, tanggal_masuk, kode_golongan, kode_posisi, kode_outlet, kode_department, no_rekening) values (?,?,?,?,?,?,?,?,?)";
    private final String SQL_UPDATE = "update karyawan set nama = ? , alamat = ? , tanggal_masuk = ? , kode_golongan = ? , kode_posisi = ? , kode_outlet = ? , kode_department = ?, no_rekening=?  where nip = ?";
    private final String SQL_DELETE = "delete from karyawan where nip like ?";
    private final String SQL_GETBYNIP = "select * from karyawan where nip like ?";
    private final String SQL_GETBYGOLONGAN = "select * from karyawan where kode_golongan like ?";
    private final String SQL_GETBYNAMA = "select * from karyawan where nama like ?";
    private final String SQL_GETALL = "select * from karyawan";
    private final String SQL_GETALLNIP = "select nip from karyawan";
    private Connection connection;

    public KaryawanDaoImplemen(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insert(Karyawan karyawan) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_INSERT);
            statement.setString(1, karyawan.getNip());
            statement.setString(2, karyawan.getNama());
            statement.setString(3, karyawan.getAlamat());
            statement.setString(4, karyawan.getTanggal_masuk());
            statement.setString(5, karyawan.getKodeGolongan());
            statement.setString(6, karyawan.getKodePosisi());
            statement.setString(7, karyawan.getKodeOutlet());
            statement.setString(8, karyawan.getKodeDepartment());
            statement.setString(9, karyawan.getNo_rekening());
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
    public void update(Karyawan karyawan) throws SQLException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_UPDATE);
            statement.setString(1, karyawan.getNama());
            statement.setString(2, karyawan.getAlamat());
            statement.setString(3, karyawan.getTanggal_masuk());
            statement.setString(4, karyawan.getKodeGolongan());
            statement.setString(5, karyawan.getKodePosisi());
            statement.setString(6, karyawan.getKodeOutlet());
            statement.setString(7, karyawan.getKodeDepartment());
            statement.setString(8, karyawan.getNo_rekening());
            statement.setString(9, karyawan.getNip());
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
    public void delete(Karyawan unit) throws SQLException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_DELETE);
            statement.setString(1, unit.getNip());
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
    public Karyawan getByNIPKaryawan(String nipKaryawan) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(SQL_GETBYNIP);

            statement.setString(1, nipKaryawan);
            result = statement.executeQuery();
            Karyawan karyawan = null;
            if (result.next()) {
                karyawan = new Karyawan();
                karyawan.setNip(result.getString("nip"));
                karyawan.setNama(result.getString("nama"));
                karyawan.setAlamat(result.getString("alamat"));
                karyawan.setTanggal_masuk(result.getString("tanggal_masuk"));
                karyawan.setKodeGolongan(result.getString("kode_golongan"));
                karyawan.setKodePosisi(result.getString("kode_posisi"));
                karyawan.setKodeOutlet(result.getString("kode_outlet"));
                karyawan.setKodeDepartment(result.getString("kode_department"));
                karyawan.setNo_rekening(result.getString("no_rekening"));
            }

            connection.commit();
            return karyawan;
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
    public Karyawan getByNamaKaryawan(String namaKaryawan) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(SQL_GETBYNAMA);

            statement.setString(1, namaKaryawan);
            System.out.println(SQL_GETBYNAMA);
            result = statement.executeQuery();
            Karyawan karyawan = null;
            if (result.next()) {
                karyawan = new Karyawan();
                karyawan.setNip(result.getString("nip"));
                karyawan.setNama(result.getString("nama"));
                karyawan.setAlamat(result.getString("alamat"));
                karyawan.setTanggal_masuk(result.getString("tanggal_masuk"));
                karyawan.setKodeGolongan(result.getString("kode_golongan"));
                karyawan.setKodePosisi(result.getString("kode_posisi"));
                karyawan.setKodeOutlet(result.getString("kode_outlet"));
                karyawan.setKodeDepartment(result.getString("kode_department"));
                karyawan.setNo_rekening(result.getString("no_rekening"));
            }

            connection.commit();
            return karyawan;
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
    public List<Karyawan> getAllKaryawan() throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_GETALL);

            result = statement.executeQuery();
            List<Karyawan> karyawans = new ArrayList<Karyawan>();
            while (result.next()) {
                Karyawan karyawan = new Karyawan();
                karyawan.setNip(result.getString("nip"));
                karyawan.setNama(result.getString("nama"));
                karyawan.setAlamat(result.getString("alamat"));
                karyawan.setTanggal_masuk(result.getString("tanggal_masuk"));
                karyawan.setKodeGolongan(result.getString("kode_golongan"));
                karyawan.setKodePosisi(result.getString("kode_posisi"));
                karyawan.setKodeOutlet(result.getString("kode_outlet"));
                karyawan.setKodeDepartment(result.getString("kode_department"));
                karyawan.setNo_rekening(result.getString("no_rekening"));
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

    @Override
    public List<Karyawan> getAllKaryawanByGolongan(String golongan) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_GETBYGOLONGAN);
            statement.setString(1, golongan);

            result = statement.executeQuery();
            List<Karyawan> karyawans = new ArrayList<Karyawan>();
            while (result.next()) {
                Karyawan karyawan = new Karyawan();
                karyawan.setNip(result.getString("nip"));
                karyawan.setNama(result.getString("nama"));
                karyawan.setAlamat(result.getString("alamat"));
                karyawan.setTanggal_masuk(result.getString("tanggal_masuk"));
                karyawan.setKodeGolongan(result.getString("kode_golongan"));
                karyawan.setKodePosisi(result.getString("kode_posisi"));
                karyawan.setKodeOutlet(result.getString("kode_outlet"));
                karyawan.setKodeDepartment(result.getString("kode_department"));
                karyawan.setNo_rekening(result.getString("no_rekening"));
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
