/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.liburPerusahaan;


import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Tinus
 */
public interface LiburPerusahaanDao {
   void insert(LiburPerusahaan liburPerusahaan) throws SQLException;

    void update(LiburPerusahaan liburPerusahaan) throws SQLException;

    void delete(LiburPerusahaan liburPerusahaan) throws SQLException;

    List<LiburPerusahaan> getAllLiburNasional() throws SQLException;
}
