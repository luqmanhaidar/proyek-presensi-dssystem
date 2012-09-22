/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.detailpresensikaryawan;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Tinus
 */
public class PresensiTidakMasukDaoImplemen implements PresensiTidakMasukDao {

    private final String SQL_UPDATE_GETPRESENSI = "UPDATE detail_presensi set keterangan =?";
    private Connection connection;

    public PresensiTidakMasukDaoImplemen(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void updateDetailPresensi(String tanggal, String nip) throws SQLException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_UPDATE_GETPRESENSI);
            statement.setString(1, tanggal);
            statement.setString(2, nip);
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
}
