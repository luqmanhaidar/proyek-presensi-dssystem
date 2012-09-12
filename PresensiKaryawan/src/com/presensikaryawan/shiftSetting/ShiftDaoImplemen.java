/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.shiftSetting;

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
public class ShiftDaoImplemen implements ShiftDao {

    private final String SQL_INSERT = "insert into shift_setting(kode_shift,nama_shift,waktu_mulai, waktu_selesai) values (?,?,?,?)";
    private final String SQL_UPDATE = "update shift_setting set nama_shift = ?, waktu_mulai = ?, waktu_selesai = ? where kode_shift = ?";
    private final String SQL_DELETE = "delete from shift_setting where kode_shift like ?";
    private final String SQL_GETBYKODE = "select * from shift_setting where kode_shift like ? order by kode_shift asc";
    private final String SQL_GETALL = "select * from shift_setting order by kode_shift asc";
    private Connection connection;

    public ShiftDaoImplemen(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insert(Shift shift) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_INSERT);
            statement.setString(1, shift.getKodeShift());
            statement.setString(2, shift.getNamaShift());
            statement.setString(3, shift.getWaktuMulai());
            statement.setString(4, shift.getWaktuSelesai());
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
    public void update(Shift shift) throws SQLException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_UPDATE);
            statement.setString(1, shift.getNamaShift());
            statement.setString(2, shift.getWaktuMulai());
            statement.setString(3, shift.getWaktuSelesai());
            statement.setString(4, shift.getKodeShift());
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
    public void delete(Shift shift) throws SQLException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_DELETE);
            statement.setString(1, shift.getKodeShift());
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
    public Shift getByKode(String kode) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        if (kode != null) {
            try {
                connection.setAutoCommit(false);
                statement = connection.prepareStatement(SQL_GETBYKODE);

                statement.setString(1, kode);
                result = statement.executeQuery();
                Shift shift = null;
                if (result.next()) {
                    shift = new Shift();
                    shift.setKodeShift(result.getString("kode_shift"));
                    shift.setNamaShift(result.getString("nama_shift"));
                    String waktu_mulai = result.getString("waktu_mulai").substring(0, 2) + ":" + result.getString("waktu_mulai").substring(3, 5);
                    shift.setWaktuMulai(waktu_mulai);
                    String waktu_selesai = result.getString("waktu_selesai").substring(0, 2) + ":" + result.getString("waktu_selesai").substring(3, 5);
                    shift.setWaktuSelesai(waktu_selesai);

                }

                connection.commit();
                return shift;
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
        } else {
            return null;
        }
    }

    @Override
    public List<Shift> getAllShift() throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_GETALL);

            result = statement.executeQuery();
            List<Shift> shifts = new ArrayList<Shift>();
            while (result.next()) {
                Shift shift = new Shift();
                shift.setKodeShift(result.getString("kode_shift"));
                shift.setNamaShift(result.getString("nama_shift"));
                String waktu_mulai = result.getString("waktu_mulai").substring(0, 2) + ":" + result.getString("waktu_mulai").substring(3, 5);
                shift.setWaktuMulai(waktu_mulai);
                String waktu_selesai = result.getString("waktu_selesai").substring(0, 2) + ":" + result.getString("waktu_selesai").substring(3, 5);
                shift.setWaktuSelesai(waktu_selesai);
                shifts.add(shift);
            }

            connection.commit();
            return shifts;
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
