/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.groupShift;

import com.presensikaryawan.shiftSetting.Shift;
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
public class GroupShiftDaoImplemen implements GroupShiftDao {

    private final String SQL_INSERT = "insert into group_shift(kode_group_shift,nama_group_shift,deskripsi,senin_code,selasa_code,rabu_code,kamis_code,jumat_code,sabtu_code,minggu_code) values (?,?,?,?,?,?,?,?,?,?)";
    private final String SQL_UPDATE = "update group_shift set nama_group_shift = ?, deskripsi = ?, senin_code = ?, selasa_code = ?,rabu_code = ?,kamis_code = ?,jumat_code = ?,sabtu_code = ?,minggu_code = ? where kode_group_shift = ?";
    private final String SQL_DELETE = "delete from group_shift where kode_group_shift like ?";
    private final String SQL_GETBYKODE = "select * from group_shift where kode_group_shift like ?";
    private final String SQL_GETALL = "select * from group_shift";
    private final String SQL_GETBYKODEDAYSHIFT = "select * from group_shift where senin_code like ? and selasa_code like ? and rabu_code like ? and kamis_code like ? and jumat_code like ? and sabtu_code like ? and minggu_code like ?";
    private Connection connection;

    public GroupShiftDaoImplemen(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insert(GroupShift groupShift) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_INSERT);
            statement.setString(1, groupShift.getKodeGroupShift());
            statement.setString(2, groupShift.getNamaGroupShift());
            statement.setString(3, groupShift.getKeterangan());
            int counter = 4;
            for (int i = 0; i < 7; i++) {
                statement.setString(counter, groupShift.getShift()[i].getKodeShift());
                counter++;
            }

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
    public void update(GroupShift groupShift) throws SQLException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_UPDATE);
            statement.setString(1, groupShift.getNamaGroupShift());
            statement.setString(2, groupShift.getKeterangan());
            int counter = 3;
            for (int i = 0; i < 7; i++) {
                statement.setString(counter, groupShift.getShift()[i].getKodeShift());
                counter++;
            }

            statement.setString(10, groupShift.getKodeGroupShift());
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
    public void delete(GroupShift groupShift) throws SQLException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_DELETE);
            statement.setString(1, groupShift.getKodeGroupShift());
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
    public GroupShift getByKode(String kode) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        if (kode != null) {
            try {
                connection.setAutoCommit(false);
                statement = connection.prepareStatement(SQL_GETBYKODE);

                statement.setString(1, kode);
                result = statement.executeQuery();
                GroupShift groupShift = null;
                Shift[] shift = new Shift[7];
                if (result.next()) {
                    groupShift = new GroupShift();
                    groupShift.setKodeGroupShift(result.getString("kode_group_shift"));
                    groupShift.setNamaGroupShift(result.getString("nama_group_shift"));
                    groupShift.setKeterangan(result.getString("deskripsi"));

                    for (int i = 0; i < shift.length; i++) {
                        shift[i] = new Shift();
                    }
                    shift[0].setKodeShift(result.getString("senin_code"));
                    shift[1].setKodeShift(result.getString("selasa_code"));
                    shift[2].setKodeShift(result.getString("rabu_code"));
                    shift[3].setKodeShift(result.getString("kamis_code"));
                    shift[4].setKodeShift(result.getString("jumat_code"));
                    shift[5].setKodeShift(result.getString("sabtu_code"));
                    shift[6].setKodeShift(result.getString("minggu_code"));
                    groupShift.setShift(shift);

                }

                connection.commit();
                return groupShift;
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
    public List<GroupShift> getAllGroupShift() throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_GETALL);

            result = statement.executeQuery();
            List<GroupShift> groupShifts = new ArrayList<GroupShift>();
            while (result.next()) {
                GroupShift groupShift = new GroupShift();
                groupShift.setKodeGroupShift(result.getString("kode_group_shift"));
                groupShift.setNamaGroupShift(result.getString("nama_group_shift"));
                groupShift.setKeterangan(result.getString("deskripsi"));
                Shift[] shift = new Shift[7];
                for (int i = 0; i < shift.length; i++) {
                    shift[i] = new Shift();
                }
                shift[0].setKodeShift(result.getString("senin_code"));
                shift[1].setKodeShift(result.getString("selasa_code"));
                shift[2].setKodeShift(result.getString("rabu_code"));
                shift[3].setKodeShift(result.getString("kamis_code"));
                shift[4].setKodeShift(result.getString("jumat_code"));
                shift[5].setKodeShift(result.getString("sabtu_code"));
                shift[6].setKodeShift(result.getString("minggu_code"));
                groupShift.setShift(shift);
                
                groupShifts.add(groupShift);
            }

            connection.commit();
            return groupShifts;
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
    public GroupShift getByDayShiftKode(String kodeSenin, String kodeSelasa, String kodeRabu, String kodeKamis, String kodeJumat, String kodeSabtu, String kodeMinggu) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        if (kodeSenin != null && kodeSelasa != null && kodeRabu != null && kodeKamis != null && kodeJumat != null && kodeSabtu != null && kodeMinggu != null) {
            try {
                connection.setAutoCommit(false);
                statement = connection.prepareStatement(SQL_GETBYKODEDAYSHIFT);

                statement.setString(1, kodeSenin);
                statement.setString(2, kodeSelasa);
                statement.setString(3, kodeRabu);
                statement.setString(4, kodeKamis);
                statement.setString(5, kodeJumat);
                statement.setString(6, kodeSabtu);
                statement.setString(7, kodeMinggu);

                result = statement.executeQuery();
                GroupShift groupShift = null;
                Shift[] shift = new Shift[7];
                if (result.next()) {
                    groupShift = new GroupShift();
                    groupShift.setKodeGroupShift(result.getString("kode_group_shift"));
                    groupShift.setNamaGroupShift(result.getString("nama_group_shift"));
                    groupShift.setKeterangan(result.getString("deskripsi"));

                    for (int i = 0; i < shift.length; i++) {
                        shift[i] = new Shift();
                    }
                    shift[0].setKodeShift(result.getString("senin_code"));
                    shift[1].setKodeShift(result.getString("selasa_code"));
                    shift[2].setKodeShift(result.getString("rabu_code"));
                    shift[3].setKodeShift(result.getString("kamis_code"));
                    shift[4].setKodeShift(result.getString("jumat_code"));
                    shift[5].setKodeShift(result.getString("sabtu_code"));
                    shift[6].setKodeShift(result.getString("minggu_code"));
                    groupShift.setShift(shift);

                }

                connection.commit();
                return groupShift;
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
