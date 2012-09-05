/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.statusSetting;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Tinus
 */
public class StatusSettingDaoImplemen implements StatusSettingDao {

    private final String SQL_INSERT = "insert into status_setting(kode,keterangan) values (?,?)";
    private final String SQL_UPDATE = "update status_setting set keterangan = ? where kode = ?";
    private final String SQL_DELETE = "delete from status_setting where kode like ?";
    private final String SQL_GETBYKODE = "select * from status_setting where kode like ?";
    private final String SQL_GETALL = "select * from status_setting";
    private Connection connection;

    
    
    @Override
    public void insert(StatusSetting statusSetting) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_INSERT);
            statement.setInt(1, statusSetting.getKodeStatus());
            statement.setString(2, statusSetting.getKeteranganStatus());
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
    public void update(StatusSetting statusSetting) throws SQLException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_UPDATE);
            statement.setString(1, statusSetting.getKeteranganStatus());
            statement.setInt(2, statusSetting.getKodeStatus());
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
    public void delete(StatusSetting statusSetting) throws SQLException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_DELETE);
            statement.setInt(1, statusSetting.getKodeStatus());
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
    public List<StatusSetting> getAllStatusSetting() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
