/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.rekapHistoriGaji;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tinus
 */
public class RekapGajiDaoImpelemen implements RekapGajiDao {

    private final String SQL_GET_REKAPGAJI_BYNIPANDYEAR = "SELECT * FROM penggajian WHERE NIP = ? and tahun = ?";
    private Connection connection;

    @Override
    public List<RekapGaji> getRekapGajiByNIPAndYear(String nip, String year) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_GET_REKAPGAJI_BYNIPANDYEAR);

            result = statement.executeQuery();
            List<RekapGaji> rekapGajis = new ArrayList<RekapGaji>();
            int counter=1;
            while (result.next()) {
                RekapGaji rekapGaji = new RekapGaji();
                rekapGaji.setNo(counter);
                rekapGaji.setNip(result.getString("nip"));
                rekapGaji.setBulan(result.getString("bulan"));
                rekapGaji.setS(result.getInt("S"));
                rekapGaji.setI(result.getInt("I"));
                rekapGaji.setA(result.getInt("A"));
                rekapGaji.setT(result.getInt("T"));
                rekapGaji.setLembur(result.getInt("lembur"));
                rekapGaji.setGaji_pokok(result.getDouble("gaji_pokok"));
                rekapGaji.setUang_makan(result.getDouble("uang_makan"));
                rekapGaji.setUang_hadir(result.getDouble("uang_hadir"));
                rekapGaji.setUang_lembur(result.getDouble("uang_lembur"));
                rekapGaji.setPotongan_terlambat(result.getDouble("potongan_terlambat"));
                rekapGaji.setPotongan_lain(result.getDouble("potongan_lain"));
                rekapGaji.setLain_lain(result.getDouble("lain"));
                rekapGaji.setTotal(result.getDouble("total"));

                counter++;
                rekapGajis.add(rekapGaji);
            }

            connection.commit();
            return rekapGajis;
        } catch (SQLException exception) {
            throw exception;
        } finally {
            try {
                connection.setAutoCommit(true);
                if (result != null) {
                    result.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException exception) {
                throw exception;
            }
        }
    }
}

