/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.karyawan;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Tinus
 */
public class KaryawanDaoImplemen implements KaryawanDao {

    private final String SQL_INSERT = "insert into karyawan(nip,namaKaryawan) values (?,?)";
    private final String SQL_UPDATE = "update karyawan set namaKategori = ? where nip = ?";
    private final String SQL_DELETE = "delete from karyawan where karyawan like ?";
    private final String SQL_GETBYNIP = "select * from karyawan where nip like ?";
    private final String SQL_GETBYNAMA = "select * from karyawan where namaKaryawan like ?";
    private final String SQL_GETALL = "select * from karyawan";
    private final String SQL_GETALLNIP = "select nip from karyawan";
    private Connection connection;

    public KaryawanDaoImplemen(Connection connection) {
        this.connection = connection;
    }

    
    
    @Override
    public void insert(Karyawan karyawan) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(Karyawan karyawan) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(Karyawan karyawan) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Karyawan getByNIPKaryawan(String nipKaryawan) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Karyawan getByNamaKaryawan(String namaKaryawan) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Karyawan> getAllKaryawan() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
