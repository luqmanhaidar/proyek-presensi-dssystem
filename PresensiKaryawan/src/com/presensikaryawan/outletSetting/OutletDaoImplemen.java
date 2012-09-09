/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.outletSetting;

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
public class OutletDaoImplemen implements OutletDao{
    
    private final String SQL_INSERT = "insert into outlet_setting(kode_outlet,nama_outlet, alamat_outlet) values (?,?,?)";
    private final String SQL_UPDATE = "update outlet_setting set nama_outlet = ?, alamat_outlet = ? where kode_outlet = ?";
    private final String SQL_DELETE = "delete from outlet_setting where kode_outlet like ?";
    private final String SQL_GETBYKODE = "select * from outlet_setting where kode_outlet like ?";
    private final String SQL_GETBYNAMA = "select * from outlet_setting where nama_outlet like ?";
    private final String SQL_GETALL = "select * from outlet_setting";
    private final String SQL_GETALLKODE = "select kode_outlet from outlet_setting";
    private Connection connection;

    public OutletDaoImplemen(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insert(Outlet outlet) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_INSERT);
            statement.setString(1, outlet.getKodeOutlet());
            statement.setString(2, outlet.getNamaOutlet());
            statement.setString(3, outlet.getAlamatOutlet());
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
    public void update(Outlet outlet) throws SQLException {
        PreparedStatement statement = null;
         try {
             connection.setAutoCommit(false);

             statement = connection.prepareStatement(SQL_UPDATE);
             statement.setString(1,outlet.getNamaOutlet());
             statement.setString(2,outlet.getKodeOutlet());
             statement.setString(3,outlet.getAlamatOutlet());
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
    public void delete(Outlet unit) throws SQLException {
        PreparedStatement statement = null;
         try {
             connection.setAutoCommit(false);

             statement = connection.prepareStatement(SQL_DELETE);
             statement.setString(1, unit.getKodeOutlet());
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
    public Outlet getByKodeOutlet(String kodeOutlet) throws SQLException {
        PreparedStatement statement = null;
         ResultSet result = null;
         try {
             connection.setAutoCommit(false);
             statement = connection.prepareStatement(SQL_GETBYKODE);

               statement.setString(1, kodeOutlet);
             result = statement.executeQuery();
             Outlet outlet = null;
             if (result.next()) {
                 outlet = new Outlet();
                 outlet.setKodeOutlet(result.getString("kode_outlet"));
                 outlet.setNamaOutlet(result.getString("nama_outlet"));
                 outlet.setAlamatOutlet(result.getString("alamat"));
             }

             connection.commit();
             return outlet;
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
    public Outlet getByNamaOutlet(String namaOutlet) throws SQLException {
        PreparedStatement statement = null;
         ResultSet result = null;
         try {
             connection.setAutoCommit(false);
             statement = connection.prepareStatement(SQL_GETBYNAMA);
            
               statement.setString(1, namaOutlet);
               System.out.println(SQL_GETBYNAMA);
             result = statement.executeQuery();
             Outlet outlet = null;
             if (result.next()) {
                 outlet = new Outlet();
                 outlet.setKodeOutlet(result.getString("kode_golongan"));
                 outlet.setNamaOutlet(result.getString("nama_golongan"));
                 outlet.setAlamatOutlet(result.getString("alamat"));
             }

             connection.commit();
             return outlet;
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
    public List<Outlet> getAllOutlet() throws SQLException {
        PreparedStatement statement = null;
         ResultSet result = null;
         try {
             connection.setAutoCommit(false);

             statement = connection.prepareStatement(SQL_GETALL);

             result = statement.executeQuery();
             List<Outlet> outlets = new ArrayList<Outlet>();
             while (result.next()) {
                 Outlet outlet = new Outlet();
                 outlet.setKodeOutlet(result.getString("kode_outlet"));
                 outlet.setNamaOutlet(result.getString("nama_outlet"));
                 outlet.setAlamatOutlet(result.getString("alamat"));
                 outlets.add(outlet);
             }

             connection.commit();
             return outlets;
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
