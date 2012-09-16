/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.transaksi;

import com.presensikaryawan.departmentSetting.Department;
import com.presensikaryawan.golongan.Golongan;
import com.presensikaryawan.karyawan.Karyawan;
import com.presensikaryawan.shiftSetting.Shift;
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
public class TransaksiGajiDaoImplemen implements TransaksiGajiDao {

    private final String SQL_GETDEPARTMENTCODE = "SELECT d.kode_department, d.nama_department FROM department_setting d, karyawan k WHERE k.kode_department=d.kode_department AND k.nip LIKE ? OR k.nama LIKE ? order by kode_department asc";
    private final String SQL_GETWAKTU = "SELECT s.waktu_mulai, s.waktu_selesai FROM department_setting d, group_shift gs, shift_setting s"
            + "WHERE d.kode_group_shift = gs.kode_group_shift AND gs.senin_code = s.kode_shift AND gs.selasa_code = s.kode_shift"
            + "AND gs.rabu_code = s.kode_shift AND gs.rabu_code = s.kode_shift AND gs.kamis_code = s.kode_shift AND gs.jumat_code = s.kode_shift"
            + "AND gs.sabtu_code = s.kode_shift AND gs.minggu_code = s.kode_shift AND d.kode_department like ?";
    private final String SQL_GETNAMADANNIP = "SELECT distinct k.nip,k.nama,k.kode_golongan FROM karyawan k, department_setting d, golongan g WHERE k.kode_department=d.kode_department AND k.kode_golongan=g.kode_golongan AND d.kode_department LIKE ? OR g.kode_golongan LIKE ? OR k.nama LIKE ? order by nip asc";
    private final String SQL_GETPRESENSIDANAKTUMULAI = "SELECT e.DateLog, e.TimeLog, e.UserId, k.nama FROM eventlog e, karyawan k WHERE e.UserId=k.nip AND e.FKMode = '0' OR e.UserId LIKE ? OR e.DateLog LIKE ? order by e.DateLog asc";
    private final String SQL_GETWAKTUSELESAI = "SELECT e.TimeLog FROM eventlog e, karyawan k WHERE e.UserId=k.nip AND e.FKMode = 1 AND e.UserId LIKE ? AND e.DateLog LIKE ? order by e.DateLog asc";
    private final String SQL_GETGOLONGAN="SELECT DISTINCT g.kode_golongan FROM golongan g, karyawan k WHERE g.kode_golongan=k.kode_golongan AND (k.nip LIKE ? OR k.nama LIKE ?)";
    private Connection connection;

    public TransaksiGajiDaoImplemen(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<Department> getAllDepartmentCodeByAnything(String nip, String nama) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_GETDEPARTMENTCODE);
            statement.setString(1, nip);
            statement.setString(2, nama);

            result = statement.executeQuery();
            List<Department> departments = new ArrayList<Department>();
            while (result.next()) {
                Department department = new Department();
                department.setKodeDepartment(result.getString("kode_department"));
                department.setNamaDepartment(result.getString("nama_department"));
                departments.add(department);
            }

            connection.commit();
            return departments;
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

    @Override
    public List<Shift> getWaktuMulaiDanSelesaiByDepartment(String kode_department) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_GETWAKTU);
            statement.setString(1, kode_department);

            result = statement.executeQuery();
            List<Shift> shifts = new ArrayList<Shift>();
            while (result.next()) {
                Shift shift = new Shift();
                shift.setWaktuMulai(result.getString("waktu_mulai"));
                shift.setWaktuSelesai(result.getString("waktu_selesai"));
                shifts.add(shift);
            }

            connection.commit();
            return shifts;
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

    @Override
    public List<Karyawan> getNamaDanNIPKaryawanByAnything(String kode_department, String kode_golongan, String nama) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_GETNAMADANNIP);
            statement.setString(1, kode_department);
            statement.setString(2, kode_golongan);
            statement.setString(3, nama);

            result = statement.executeQuery();
            List<Karyawan> karyawans = new ArrayList<Karyawan>();
            while (result.next()) {
                Karyawan karyawan = new Karyawan();
                karyawan.setNip(result.getString("nip"));
                karyawan.setNama(result.getString("nama"));
                karyawan.setKodeGolongan(result.getString("kode_golongan"));
                karyawans.add(karyawan);
            }

            connection.commit();
            return karyawans;
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

    @Override
    public List<PresensiKaryawan> getPresensiByMonth(String bulan, String nip) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_GETPRESENSIDANAKTUMULAI);
            statement.setString(1, nip);
            statement.setString(2, bulan);

            result = statement.executeQuery();
            List<PresensiKaryawan> presensiKaryawans = new ArrayList<PresensiKaryawan>();
//            List<PresensiKaryawan> presensiKaryawansDummy = getWaktuSelesaiByNIP(bulan, nip);
            int index = 0;
            while (result.next()) {
                Karyawan karyawan = new Karyawan();
                karyawan.setNip(result.getString("UserID"));
                karyawan.setNama(result.getString("nama"));
                PresensiKaryawan presensiKaryawan = new PresensiKaryawan();
                presensiKaryawan.setWaktu_mulai(result.getString("TimeLog"));
//                if (presensiKaryawansDummy.isEmpty()) {
//                    presensiKaryawan.setWaktu_selesai("");
//                } else {
//                    presensiKaryawan.setWaktu_selesai(presensiKaryawansDummy.remove(index).getWaktu_selesai());
//                }
                presensiKaryawan.setTanggal(result.getString("DateLog"));
                presensiKaryawan.setKaryawan(karyawan);
                index++;
                presensiKaryawans.add(presensiKaryawan);
            }

            connection.commit();
            return presensiKaryawans;
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

    @Override
    public List<PresensiKaryawan> getWaktuSelesaiByNIP(String bulan, String nip) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_GETWAKTUSELESAI);
            statement.setString(1, nip);
            statement.setString(2, bulan);

            result = statement.executeQuery();
            List<PresensiKaryawan> presensiKaryawans = new ArrayList<PresensiKaryawan>();
            while (result.next()) {
                PresensiKaryawan presensiKaryawan = new PresensiKaryawan();
                presensiKaryawan.setWaktu_selesai(result.getString("TimeLog"));
                presensiKaryawans.add(presensiKaryawan);
            }

            connection.commit();
            return presensiKaryawans;
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

    @Override
    public List<Golongan> getGolonganByNIPOrNama(String nama, String nip) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(SQL_GETGOLONGAN);
            statement.setString(1, nip);
            statement.setString(2, nama);

            result = statement.executeQuery();
            List<Golongan> golongans = new ArrayList<Golongan>();
            while (result.next()) {
                Golongan gol=new Golongan();
                gol.setKodeGolongan(result.getString("kode_golongan"));
                golongans.add(gol);
            }

            connection.commit();
            return golongans;
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
