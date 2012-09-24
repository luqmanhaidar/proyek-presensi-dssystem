/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.penggajian;

import com.presensikaryawan.golongan.Golongan;
import com.presensikaryawan.karyawan.Karyawan;
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
public class GajiDaoImplemen implements GajiDao {

    private final String SQL_INSERT = "insert into gaji(gaji_pokok, uang_makan, uang_lembur, kode_golongan, nip, nama_karyawan) values (?,?,?,?,?,?)";
    private final String SQL_UPDATE = "update gaji set gaji_pokok = ?, uang_makan=?, uang_lembur=? where kode_golongan = ? and nip=?";
    private final String SQL_DELETE = "delete from gaji where nip like ? and kode_golongan like ?";
    private final String SQL_GETBYKODE = "select * from gaji where kode_golongan like ? order by nip asc";
    private final String SQL_GETBYNIPANDKODE = "select * from gaji where nip like ? and kode_golongan like ?";
    private final String SQL_GETALL = "select * from gaji order by kode_golongan asc";
    private Connection connection;

    public GajiDaoImplemen(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insert(Gaji gaji) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_INSERT);
            statement.setDouble(1, gaji.getGajiPokok());
            statement.setDouble(2, gaji.getUangMakan());
            statement.setDouble(3, gaji.getUangLembur());
            statement.setString(4, gaji.getGolongan().getKodeGolongan());
            statement.setString(5, gaji.getKaryawan().getNip());
            statement.setString(6, gaji.getKaryawan().getNama());
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
    public void update(Gaji gaji) throws SQLException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_UPDATE);
            statement.setDouble(1, gaji.getGajiPokok());
            statement.setDouble(2, gaji.getUangMakan());
            statement.setDouble(3, gaji.getUangLembur());
            statement.setString(4, gaji.getGolongan().getKodeGolongan());
            statement.setString(5, gaji.getKaryawan().getNip());
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
    public void delete(Gaji gaji) throws SQLException {
        PreparedStatement statement = null;
         try {
             connection.setAutoCommit(false);

             statement = connection.prepareStatement(SQL_DELETE);
             statement.setString(1, gaji.getKaryawan().getNip());
             statement.setString(2, gaji.getGolongan().getKodeGolongan());
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
    public List<Gaji> getAllGaji() throws SQLException {
        PreparedStatement statement = null;
         ResultSet result = null;
         try {
             connection.setAutoCommit(false);

             statement = connection.prepareStatement(SQL_GETALL);

             result = statement.executeQuery();
             List<Gaji> gajis = new ArrayList<Gaji>();
             while (result.next()) {
                 Gaji gaji = new Gaji();
                 gaji.setGajiPokok(result.getDouble("gaji_pokok"));
                 gaji.setUangMakan(result.getDouble("uang_makan"));
                 gaji.setUangLembur(result.getDouble("uang_lembur"));
                 
                 Karyawan karyawan=new Karyawan();
                 karyawan.setNip(result.getString("nip"));
                 karyawan.setNama(result.getString("nama_karyawan"));
                 gaji.setKaryawan(karyawan);
                 
                 Golongan golongan=new Golongan();
                 golongan.setKodeGolongan(result.getString("kode_golongan"));
                 gaji.setGolongan(golongan);
                 gajis.add(gaji);
             }

             connection.commit();
             return gajis;
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
    public Gaji getByKodeGolonganAndNip(String kodeGolongan, String nip) throws SQLException {
        PreparedStatement statement = null;
         ResultSet result = null;
         try {
             connection.setAutoCommit(false);
             statement = connection.prepareStatement(SQL_GETBYNIPANDKODE);

             statement.setString(1, nip);
             statement.setString(2, kodeGolongan);
             result = statement.executeQuery();
             Gaji gaji=null;
             Golongan golongan;
             Karyawan karyawan;
             if (result.next()) {
                 golongan = new Golongan();
                 golongan.setKodeGolongan(result.getString("kode_golongan"));
                
                 karyawan=new Karyawan();
                 karyawan.setNip(result.getString("nip"));
                 karyawan.setNama(result.getString("nama_karyawan"));
                 
                 gaji=new Gaji();
                 gaji.setGajiPokok(result.getDouble("gaji_pokok"));
                 gaji.setUangLembur(result.getDouble("uang_lembur"));
                 gaji.setUangMakan(result.getDouble("uang_makan"));
                 gaji.setGolongan(golongan);
                 gaji.setKaryawan(karyawan);
             }

             connection.commit();
             return gaji;
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
    public List<Gaji> getAllGajiByGolongan(String golongan) throws SQLException {
                PreparedStatement statement = null;
         ResultSet result = null;
         try {
             connection.setAutoCommit(false);

             statement = connection.prepareStatement(SQL_GETBYKODE);
             statement.setString(1, golongan);

             result = statement.executeQuery();
             List<Gaji> gajis = new ArrayList<Gaji>();
             while (result.next()) {
                 Gaji gaji = new Gaji();
                 gaji.setGajiPokok(result.getDouble("gaji_pokok"));
                 gaji.setUangMakan(result.getDouble("uang_makan"));
                 gaji.setUangLembur(result.getDouble("uang_lembur"));
                 
                 Karyawan karyawan=new Karyawan();
                 karyawan.setNip(result.getString("nip"));
                 karyawan.setNama(result.getString("nama_karyawan"));
                 gaji.setKaryawan(karyawan);
                 
                 Golongan golongan2=new Golongan();
                 golongan2.setKodeGolongan(result.getString("kode_golongan"));
                 gaji.setGolongan(golongan2);
                 gajis.add(gaji);
             }

             connection.commit();
             return gajis;
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
