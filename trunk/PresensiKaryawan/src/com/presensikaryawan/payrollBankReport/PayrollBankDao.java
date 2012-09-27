/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.payrollBankReport;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Tinus
 */
public interface PayrollBankDao {
    List<PayrollBankReport> getPayrollBank(String nip1, String nip2, String bulan) throws SQLException;
}
