/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.outletSetting;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Eki
 */
public interface OutletDao {
    
    void insert(Outlet outlet) throws SQLException;

    void update(Outlet outlet) throws SQLException;

    void delete(Outlet unit) throws SQLException;

    Outlet getByKodeOutlet(String kodeOutlet) throws SQLException;

    Outlet getByNamaOutlet(String namaOutlet) throws SQLException;

    List<Outlet> getAllOutlet() throws SQLException;
    
}
