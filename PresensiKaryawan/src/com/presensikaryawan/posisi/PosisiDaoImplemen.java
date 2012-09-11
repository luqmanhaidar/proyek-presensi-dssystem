/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.posisi;

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
public class PosisiDaoImplemen implements PosisiDao {

    private final String SQL_INSERT = "insert into posisi(kode_posisi,nama_posisi) values (?,?)";
    private final String SQL_UPDATE = "update posisi set nama_posisi = ? where kode_posisi = ?";
    private final String SQL_DELETE = "delete from posisi where kode_posisi like ?";
    private final String SQL_GETBYKODE = "select * from posisi where kode_posisi like ? order by kode_posisi asc";
    private final String SQL_GETALL = "select * from posisi order by kode_posisi asc";
    private Connection connection;

    public PosisiDaoImplemen(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insert(Posisi posisi) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_INSERT);
            statement.setString(1, posisi.getKode_posisi());
            statement.setString(2, posisi.getNama_posisi());
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
    public void update(Posisi posisi) throws SQLException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_UPDATE);
            statement.setString(1, posisi.getNama_posisi());
            statement.setString(2, posisi.getKode_posisi());
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
    public void delete(Posisi posisi) throws SQLException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_DELETE);
            statement.setString(1, posisi.getKode_posisi());
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
    public Posisi getByKode(String kode) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        if (kode != null) {
            try {
                connection.setAutoCommit(false);
                statement = connection.prepareStatement(SQL_GETBYKODE);

                statement.setString(1, kode);
                result = statement.executeQuery();
                Posisi posisi = null;
                if (result.next()) {
                    posisi = new Posisi();
                    posisi.setKode_posisi(result.getString("kode_posisi"));
                    posisi.setNama_posisi(result.getString("nama_posisi"));
                   
                }

                connection.commit();
                return posisi;
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

    @Override
    public List<Posisi> getAllPosisi() throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_GETALL);

            result = statement.executeQuery();
            List<Posisi> posisis = new ArrayList<Posisi>();
            while (result.next()) {
                Posisi posisi = new Posisi();
                posisi.setKode_posisi(result.getString("kode_posisi"));
                posisi.setNama_posisi(result.getString("nama_posisi"));
                posisis.add(posisi);
            }

            connection.commit();
            return posisis;
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
