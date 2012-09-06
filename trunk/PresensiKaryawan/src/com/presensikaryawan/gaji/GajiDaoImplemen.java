/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.gaji;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Tinus
 */
public class GajiDaoImplemen implements GajiDao{
    private final String SQL_INSERT = "insert into gaji(gaji_pokok, uang_makan, uang_lembur, golongan, nip) values (?,?,?,?,?)";
    private final String SQL_UPDATE = "update gaji set nama_golongan = ? where kode_golongan = ?";
    private final String SQL_DELETE = "delete from gaji where nip like ?";
    private final String SQL_GETBYKODE = "select * from gaji where golongan like ?";
    private final String SQL_GETBYNIP = "select * from gaji where nip like ?";
    private final String SQL_GETALL = "select * from gaji";
    private Connection connection;

    public GajiDaoImplemen(Connection connection) {
        this.connection = connection;
    }
    
    
    @Override
    public void insert(Gaji gaji) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(Gaji gaji) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(Gaji gaji) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Gaji getByKodeGolongan(String kodeGolongan) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Gaji getByNIPKaryawan(String namaGolongan) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Gaji> getAllGaji() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
