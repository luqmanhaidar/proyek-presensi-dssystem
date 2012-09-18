/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.transaksi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Tinus
 */
public class TransaksiGajiDaoImplemen implements TransaksiGajiDao {

    private final String SQL_GETKARYAWANBYDEPARTMENT = "SELECT nip, nama FROM karyawan WHERE kode_department LIKE ?";
    private final String SQL_GET_SENINCODE_MINGGUCODE = "SELECT gs.senin_code, gs.selasa_code, gs.rabu_code, gs.kamis_code, gs.jumat_code, gs.sabtu_code, gs.minggu_code "
            + "FROM group_shift gs, department_setting d "
            + "WHERE d.kode_group_shift=gs.kode_group_shift "
            + "AND d.kode_department LIKE ?";
    private final String SQL_GET_WAKTUMULAI = "SELECT waktu_mulai FROM shift_setting WHERE kode_shift LIKE ?";
    private Connection connection;

    public TransaksiGajiDaoImplemen(Connection connection) {
        this.connection = connection;
    }

    @Override
    public String[] getSeninTillMingguCode(String kode_department) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        if (kode_department != null) {
            try {
                connection.setAutoCommit(false);
                statement = connection.prepareStatement(SQL_GET_SENINCODE_MINGGUCODE);

                statement.setString(1, kode_department);
                result = statement.executeQuery();
                String[] shiftCodes = new String[7];

                if (result.next()) {
                    shiftCodes[0] = result.getString("senin_code");
                    shiftCodes[1] = result.getString("selasa_code");
                    shiftCodes[2] = result.getString("rabu_code");
                    shiftCodes[3] = result.getString("kamis_code");
                    shiftCodes[4] = result.getString("jumat_code");
                    shiftCodes[5] = result.getString("sabtu_code");
                    shiftCodes[6] = result.getString("minggu_code");
                }
                connection.commit();
                return shiftCodes;
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
    public String getWaktuMulaiByShiftCode(String kode_shift) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        if (kode_shift != null) {
            try {
                connection.setAutoCommit(false);
                statement = connection.prepareStatement(SQL_GET_WAKTUMULAI);

                statement.setString(1, kode_shift);
                result = statement.executeQuery();
                String waktu_mulai = null;
                if (result.next()) {
                    waktu_mulai = result.getString("waktu_mulai");
                }
                connection.commit();
                return waktu_mulai;
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
}
