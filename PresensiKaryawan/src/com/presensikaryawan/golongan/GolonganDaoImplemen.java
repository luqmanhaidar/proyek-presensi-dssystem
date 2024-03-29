/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.golongan;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eki
 */
public class GolonganDaoImplemen implements GolonganDao {

    private final String SQL_INSERT = "insert into golongan(kode_golongan,nama_golongan, gaji_pokok, uang_makan, uang_lembur, uang_hadir, potongan_telat, tunjangan_jabatan, tunjangan_kesehatan, tunjangan_transport, tunjangan_prestasi, bonus) values (?,?,?,?,?,?,?,?,?,?,?,?)";
    private final String SQL_UPDATE = "update golongan set nama_golongan = ?, gaji_pokok = ?, uang_makan = ?, uang_lembur = ?, uang_hadir = ?, potongan_telat = ?, tunjangan_jabatan = ?, tunjangan_kesehatan = ?, tunjangan_transport = ?, tunjangan_prestasi = ?, bonus = ? where kode_golongan = ?";
    private final String SQL_DELETE = "delete from golongan where kode_golongan like ?";
    private final String SQL_GETBYKODE = "select * from golongan where kode_golongan like ?";
    private final String SQL_GETBYNAMA = "select * from golongan where nama_golongan like ?";
    private final String SQL_GETALL = "select * from golongan";
    private final String SQL_GETALLKODE = "select kode_golongan from golongan";
    private Connection connection;

    public GolonganDaoImplemen(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insert(Golongan golongan) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_INSERT);
            statement.setString(1, golongan.getKodeGolongan());
            statement.setString(2, golongan.getNamaGolongan());
            statement.setDouble(3, golongan.getGajiPokok());
            statement.setDouble(4, golongan.getUangMakan());
            statement.setDouble(5, golongan.getUangLembur());
            statement.setDouble(6, golongan.getUangHadir());
            statement.setDouble(7, golongan.getPotonganTelat());
            statement.setDouble(8, golongan.getTunjanganJabatan());
            statement.setDouble(9, golongan.getTunjanganKesehatan());
            statement.setDouble(10, golongan.getTunjanganTransport());
            statement.setDouble(11, golongan.getTunjanganPrestasi());
            statement.setDouble(12, golongan.getBonus());
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
    public void update(Golongan golongan) throws SQLException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_UPDATE);
            statement.setString(1, golongan.getNamaGolongan());
            statement.setDouble(2, golongan.getGajiPokok());
            statement.setDouble(3, golongan.getUangMakan());
            statement.setDouble(4, golongan.getUangLembur());
            statement.setDouble(5, golongan.getUangHadir());
            statement.setDouble(6, golongan.getPotonganTelat());
            statement.setDouble(7, golongan.getTunjanganJabatan());
            statement.setDouble(8, golongan.getTunjanganKesehatan());
            statement.setDouble(9, golongan.getTunjanganTransport());
            statement.setDouble(10, golongan.getTunjanganPrestasi());
            statement.setDouble(11, golongan.getBonus());
            statement.setString(12, golongan.getKodeGolongan());
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
    public void delete(Golongan unit) throws SQLException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_DELETE);
            statement.setString(1, unit.getKodeGolongan());
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
    public Golongan getByKodeGolongan(String kodeGolongan) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(SQL_GETBYKODE);

            statement.setString(1, kodeGolongan);
            result = statement.executeQuery();
            Golongan golongan = null;
            if (result.next()) {
                golongan = new Golongan();
                golongan.setKodeGolongan(result.getString("kode_golongan"));
                golongan.setNamaGolongan(result.getString("nama_golongan"));
                golongan.setGajiPokok(result.getDouble("gaji_pokok"));
                golongan.setUangMakan(result.getDouble("uang_makan"));
                golongan.setUangLembur(result.getDouble("uang_lembur"));
                golongan.setUangHadir(result.getDouble("uang_hadir"));
                golongan.setPotonganTelat(result.getDouble("potongan_telat"));
                golongan.setTunjanganJabatan(result.getDouble("tunjangan_jabatan"));
                golongan.setTunjanganKesehatan(result.getDouble("tunjangan_kesehatan"));
                golongan.setTunjanganTransport(result.getDouble("tunjangan_transport"));
                golongan.setTunjanganPrestasi(result.getDouble("tunjangan_prestasi"));
                golongan.setBonus(result.getDouble("bonus"));
            }

            connection.commit();
            return golongan;
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
    public Golongan getByNamaGolongan(String namaGolongan) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(SQL_GETBYNAMA);

            statement.setString(1, namaGolongan);
            System.out.println(SQL_GETBYNAMA);
            result = statement.executeQuery();
            Golongan golongan = null;
            if (result.next()) {
                golongan = new Golongan();
                golongan.setKodeGolongan(result.getString("kode_golongan"));
                golongan.setNamaGolongan(result.getString("nama_golongan"));
                golongan.setGajiPokok(result.getDouble("gaji_pokok"));
                golongan.setUangMakan(result.getDouble("uang_makan"));
                golongan.setUangLembur(result.getDouble("uang_lembur"));
                golongan.setUangHadir(result.getDouble("uang_hadir"));
                golongan.setPotonganTelat(result.getDouble("potongan_telat"));
                golongan.setTunjanganJabatan(result.getDouble("tunjangan_jabatan"));
                golongan.setTunjanganKesehatan(result.getDouble("tunjangan_kesehatan"));
                golongan.setTunjanganTransport(result.getDouble("tunjangan_transport"));
                golongan.setTunjanganPrestasi(result.getDouble("tunjangan_prestasi"));
                golongan.setBonus(result.getDouble("bonus"));
            }

            connection.commit();
            return golongan;
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
    public List<Golongan> getAllGolongan() throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_GETALL);

            result = statement.executeQuery();
            List<Golongan> golongans = new ArrayList<Golongan>();
            while (result.next()) {
                Golongan golongan = new Golongan();
                golongan.setKodeGolongan(result.getString("kode_golongan"));
                golongan.setNamaGolongan(result.getString("nama_golongan"));
                golongan.setGajiPokok(result.getDouble("gaji_pokok"));
                golongan.setUangMakan(result.getDouble("uang_makan"));
                golongan.setUangLembur(result.getDouble("uang_lembur"));
                golongan.setUangHadir(result.getDouble("uang_hadir"));
                golongan.setPotonganTelat(result.getDouble("potongan_telat"));
                golongan.setTunjanganJabatan(result.getDouble("tunjangan_jabatan"));
                golongan.setTunjanganKesehatan(result.getDouble("tunjangan_kesehatan"));
                golongan.setTunjanganTransport(result.getDouble("tunjangan_transport"));
                golongan.setTunjanganPrestasi(result.getDouble("tunjangan_prestasi"));
                golongan.setBonus(result.getDouble("bonus"));
                golongans.add(golongan);
            }

            connection.commit();
            return golongans;
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
