/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.transaksi;

import com.presensikaryawan.departmentSetting.Department;
import com.presensikaryawan.karyawan.Karyawan;
import java.sql.CallableStatement;
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
public class TransaksiGajiDaoImplemen implements TransaksiGajiDao {

    private final String SQL_GETALLDEPARTMENT = "SELECT * from department_setting order by kode_department asc";
    private final String SQL_GETKARYAWANBYDEPARTMENT = "SELECT nip, nama FROM karyawan WHERE kode_department LIKE ? order by nip asc";
    private final String SQL_GETDEPARTMENTNAME_BYCODE = "SELECT nama_department from department_setting where kode_department LIKE ?";
    private final String SQL_GET_INSERTALFA_SP = "CALL insertAlfa (?,?)";
    private final String SQL_GET_GETPRESENSI_SP="CALL getPresensi (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    private Connection connection;

    public TransaksiGajiDaoImplemen(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void callInsertAlfa(String maxTanggal, String nip) throws SQLException {
        connection.setAutoCommit(false);
        CallableStatement callableStatement;
        callableStatement = connection.prepareCall(SQL_GET_INSERTALFA_SP);
        callableStatement.setString(1, maxTanggal);
        callableStatement.setString(2, nip);
        callableStatement.execute();
        callableStatement.close();
        connection.commit();

    }

    @Override
    public List<Karyawan> getAllKaryawanByDepartmentCode(String code) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_GETKARYAWANBYDEPARTMENT);
            statement.setString(1, code);

            result = statement.executeQuery();
            List<Karyawan> karyawans = new ArrayList<Karyawan>();
            while (result.next()) {
                Karyawan karyawan = new Karyawan();
                karyawan.setNip(result.getString("nip"));
                karyawans.add(karyawan);
            }

            connection.commit();
            return karyawans;
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
    public List<Department> getAllDepartments() throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_GETALLDEPARTMENT);

            result = statement.executeQuery();
            List<Department> departments = new ArrayList<Department>();
            while (result.next()) {
                Department department = new Department();
                department.setKodeDepartment(result.getString("kode_department"));
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

    @Override
    public Department getNamaDepartmentByCode(String code) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_GETDEPARTMENTNAME_BYCODE);
            statement.setString(1, code);

            result = statement.executeQuery();
            Department department = new Department();
            if (result.next()) {
                department.setNamaDepartment(result.getString("nama_department"));
            }

            connection.commit();
            return department;
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
    public List<String[]> callGetPresensi(String bulan, String tahun, String kode_department) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
