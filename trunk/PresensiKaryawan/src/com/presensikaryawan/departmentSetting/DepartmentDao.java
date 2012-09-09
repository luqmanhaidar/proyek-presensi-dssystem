/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.departmentSetting;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Tinus
 */
public interface DepartmentDao {
    void insert(Department departmentSetting) throws SQLException;

    void update(Department departmentSetting) throws SQLException;

    void delete(Department departmentSetting) throws SQLException;
    
    Department getByKode(String kode) throws SQLException;

    List<Department> getAllDepartment() throws SQLException;
}
