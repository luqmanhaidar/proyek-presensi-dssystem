/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.laporan;

import com.presensikaryawan.liburNasional.*;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Eki
 */
public interface ReportDao {
    
    void update(LiburNasional liburNasional) throws SQLException;

    List<LiburNasional> getAllByBulanDepartment() throws SQLException;
    
}
