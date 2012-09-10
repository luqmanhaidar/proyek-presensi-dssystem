/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.groupShift;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Tinus
 */
public interface GroupShiftDao {

    void insert(GroupShift groupShift) throws SQLException;

    void update(GroupShift groupShift) throws SQLException;

    void delete(GroupShift groupShift) throws SQLException;

    GroupShift getByKode(String kode) throws SQLException;

    GroupShift getByDayShiftKode(String kodeSenin, String kodeSelasa, String kodeRabu, String kodeKamis, String kodeJumat, String kodeSabtu, String kodeMinggu) throws SQLException;

    List<GroupShift> getAllGroupShift() throws SQLException;
}
