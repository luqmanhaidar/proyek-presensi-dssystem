/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.statusSetting;

import com.presensikaryawan.liburPerusahaan.LiburPerusahaan;
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
public class StatusSettingDaoImplemen implements StatusSettingDao {

    private final String SQL_INSERT = "insert into status_setting(kode,keterangan) values (?,?)";
    private final String SQL_UPDATE = "update status_setting set keterangan = ? where kode = ?";
    private final String SQL_DELETE = "delete from status_setting where kode like ?";
    private final String SQL_GETBYKODE = "select * from status_setting where kode like ? order by kode asc";
    private final String SQL_GETALL = "select * from status_setting order by kode asc";
    private Connection connection;

    public StatusSettingDaoImplemen(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insert(StatusSetting statusSetting) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_INSERT);
            statement.setInt(1, Integer.parseInt(statusSetting.getKodeStatus()));
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
            statement.setInt(2, Integer.parseInt(statusSetting.getKodeStatus()));
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
            statement.setInt(1, Integer.parseInt(statusSetting.getKodeStatus()));
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
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_GETALL);

            result = statement.executeQuery();
            List<StatusSetting> statusSettings = new ArrayList<StatusSetting>();
            while (result.next()) {
                StatusSetting statusSetting = new StatusSetting();
                statusSetting.setKodeStatus(String.valueOf(result.getInt("kode")));
                statusSetting.setKeteranganStatus(result.getString("keterangan"));
                statusSettings.add(statusSetting);
            }

            connection.commit();
            return statusSettings;
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
    public StatusSetting getByKode(String kode) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        if (kode != null) {
            try {
                connection.setAutoCommit(false);
                statement = connection.prepareStatement(SQL_GETBYKODE);

                statement.setInt(1, Integer.parseInt(kode));
                result = statement.executeQuery();
                StatusSetting statusSetting = null;
                if (result.next()) {
                    statusSetting = new StatusSetting();
                    statusSetting.setKodeStatus(String.valueOf(result.getInt("kode")));
                    statusSetting.setKeteranganStatus(result.getString("keterangan"));
                }

                connection.commit();
                return statusSetting;
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
        }else{
            return null;
        }
    }
}
