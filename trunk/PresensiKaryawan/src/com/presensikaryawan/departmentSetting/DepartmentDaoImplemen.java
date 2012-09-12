/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.departmentSetting;

import com.presensikaryawan.groupShift.GroupShift;
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
public class DepartmentDaoImplemen implements DepartmentDao {

    private final String SQL_INSERT = "insert into department_setting(kode_department,nama_department, deskripsi, kode_group_shift) values (?,?,?,?)";
    private final String SQL_UPDATE = "update department_setting set nama_department = ?, deskripsi=?, kode_group_shift=? where kode_department = ?";
    private final String SQL_DELETE = "delete from department_setting where kode_department like ?";
    private final String SQL_GETBYKODE = "select * from department_setting where kode_department like ? order by kode_department asc";
    private final String SQL_GETALL = "select * from department_setting order by kode_department asc";
    private Connection connection;

    public DepartmentDaoImplemen(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insert(Department departmentSetting) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_INSERT);
            statement.setString(1, departmentSetting.getKodeDepartment());
            statement.setString(2, departmentSetting.getNamaDepartment());
            statement.setString(3, departmentSetting.getDeskripsi());
            statement.setString(4, departmentSetting.getGroupShift().getKodeGroupShift());
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
    public void update(Department departmentSetting) throws SQLException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_UPDATE);
            statement.setString(1, departmentSetting.getNamaDepartment());
            statement.setString(2, departmentSetting.getDeskripsi());
            statement.setString(3, departmentSetting.getGroupShift().getKodeGroupShift());
            statement.setString(4, departmentSetting.getKodeDepartment());
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
    public void delete(Department departmentSetting) throws SQLException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_DELETE);
            statement.setString(1, departmentSetting.getKodeDepartment());
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
    public Department getByKode(String kode) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        if (kode != null) {
            try {
                connection.setAutoCommit(false);
                statement = connection.prepareStatement(SQL_GETBYKODE);

                statement.setString(1, kode);
                result = statement.executeQuery();
                Department department = null;
                if (result.next()) {
                    department = new Department();
                    department.setKodeDepartment(result.getString("kode_department"));
                    department.setNamaDepartment(result.getString("nama_department"));
                    department.setDeskripsi(result.getString("deskripsi"));
                    GroupShift groupShift = new GroupShift();
                    groupShift.setKodeGroupShift(result.getString("kode_group_shift"));
                    department.setGroupShift(groupShift);

                }

                connection.commit();
                return department;
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
    public List<Department> getAllDepartment() throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_GETALL);

            result = statement.executeQuery();
            List<Department> departments = new ArrayList<Department>();
            while (result.next()) {
                Department department = new Department();
                department.setKodeDepartment(result.getString("kode_department"));
                department.setNamaDepartment(result.getString("nama_department"));
                department.setDeskripsi(result.getString("deskripsi"));
                GroupShift groupShift = new GroupShift();
                groupShift.setKodeGroupShift(result.getString("kode_group_shift"));
                department.setGroupShift(groupShift);
                departments.add(department);
            }

            connection.commit();
            return departments;
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
