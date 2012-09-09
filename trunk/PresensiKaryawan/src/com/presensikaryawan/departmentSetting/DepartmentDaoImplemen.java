/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.departmentSetting;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Tinus
 */
public class DepartmentDaoImplemen implements DepartmentDao {

    private final String SQL_INSERT = "insert into department_setting(kode_department,nama_department, deskripsi) values (?,?,?)";
    private final String SQL_UPDATE = "update department_setting set kode_department = ?, nama_department = ? where kode = ?";
    private final String SQL_DELETE = "delete from department_setting where kode_department like ?";
    private final String SQL_GETBYKODE = "select * from department_setting where kode_department like ?";
    private final String SQL_GETALL = "select * from department_setting";
    private Connection connection;

    public DepartmentDaoImplemen(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insert(Department departmentSetting) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(Department departmentSetting) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(Department departmentSetting) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Department getByKode(String kode) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Department> getAllDepartment() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
