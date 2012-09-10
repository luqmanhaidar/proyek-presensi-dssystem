/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.laporan;

import com.presensikaryawan.liburNasional.LiburNasional;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Eki
 */
public class ReportDaoImplemen implements ReportDao{
    
    private final String SQL_GETALLKODE = "SELECT k.nama, COUNT(e.UserId) FROM "
            + "karyawan k, eventlog e WHERE k.nip = e.UserId AND e.FKMode = '1' "
            + "GROUP BY e.UserId";

    @Override
    public void update(LiburNasional liburNasional) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<LiburNasional> getAllByBulanDepartment() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
