/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.golongan;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Eki
 */
public class GolonganDaoImplemen implements GolonganDao{
    
    private final String SQL_INSERT = "insert into kategori(kodeKategori,namaKategori) values (?,?)";
    private final String SQL_UPDATE = "update kategori set namaKategori = ? where kodeKategori = ?";
    private final String SQL_DELETE = "delete from kategori where kodeKategori like ?";
    private final String SQL_GETBYKODE = "select * from kategori where kodeKategori like ?";
    private final String SQL_GETBYNAMA = "select * from kategori where namaKategori like ?";
    private final String SQL_GETALL = "select * from kategori";
    private final String SQL_GETALLKODE = "select kodeKategori from kategori";
    private Connection connection;

    public GolonganDaoImplemen(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insert(Golongan golongan) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(Golongan golongan) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(Golongan unit) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Golongan getByKodeGolongan(String kodeGolongan) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Golongan getByNamaGolongan(String namaGolongan) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Golongan> getAllGolongan() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
