/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.statusSetting;

import com.presensikaryawan.liburPerusahaan.LiburPerusahaan;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Tinus
 */
public interface StatusSettingDao {
    void insert(StatusSetting statusSetting) throws SQLException;

    void update(StatusSetting statusSetting) throws SQLException;

    void delete(StatusSetting statusSetting) throws SQLException;
    
    StatusSetting getByKode(String kode) throws SQLException;

    List<StatusSetting> getAllStatusSetting() throws SQLException;
}
