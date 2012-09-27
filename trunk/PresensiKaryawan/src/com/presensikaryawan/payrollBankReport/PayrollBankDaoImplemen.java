/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.payrollBankReport;

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
public class PayrollBankDaoImplemen implements PayrollBankDao{
    private final String SQL_GET_PAYROLL="SELECT karyawan.*, temptransaksidepartment.*,"
            + "(temptransaksidepartment.pokok+temptransaksidepartment.makan+temptransaksidepartment.hadir+temptransaksidepartment.lembur+temptransaksidepartment.lain_lain)totalkotor, golongan.nama_golongan, department_setting.nama_department "
            + "FROM karyawan, temptransaksidepartment, golongan, department_setting "
            + "WHERE karyawan.nip = temptransaksidepartment.nip "
            + "and karyawan.kode_golongan = golongan.kode_golongan "
            + "and karyawan.kode_department = department_setting.kode_department "
            + "AND karyawan.nip BETWEEN ? AND ? "
            + "and temptransaksidepartment.bulan like ?";
    private final String SQL_GET_ALLNIP = "SELECT nip FROM karyawan";;
    private Connection connection;

    public PayrollBankDaoImplemen(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<PayrollBankReport> getPayrollBank(String nip1, String nip2, String bulan) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(SQL_GET_PAYROLL);
            statement.setString(1, nip1);
            statement.setString(2, nip2);
            statement.setString(3, bulan.substring(0, 7));
//            System.out.println(tahun+"-0"+bulan+"-%");
            result = statement.executeQuery();
            int counter=0;
            List<PayrollBankReport> payrollBankReports = new ArrayList<PayrollBankReport>();
            while (result.next()) {
                PayrollBankReport payrollBankReport = new PayrollBankReport();
                payrollBankReport.setNama(result.getString("nama"));
                payrollBankReport.setNoRekening(result.getString("no_rekening"));
                payrollBankReport.setNo(counter++);
                payrollBankReport.setJumlahGaji(result.getDouble("total"));
                payrollBankReports.add(payrollBankReport);
            }
            connection.commit();
            return payrollBankReports;
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
