/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.shiftSetting;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Tinus
 */
public interface ShiftDao {
    void insert(Shift shift) throws SQLException;

    void update(Shift shift) throws SQLException;

    void delete(Shift shift) throws SQLException;
    
    Shift getByKode(String kode) throws SQLException;

    List<Shift> getAllShift() throws SQLException;
}
