/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import object.SinhVien;

/**
 *
 * @author huu21
 */
public class SinhVienData {
     public static PreparedStatement ps;
    public static ResultSet rs;

    public static ResultSet showTextFile(String sql) {
        try {
            ps = connectionMysql.getConnection().prepareStatement(sql);
            return ps.executeQuery();
        } catch (Exception e) {
            return null;
        }
    }

    public static void Insert(SinhVien sv) {
        String sql = "insert into sinhvien values(?,?,?)";
        try {
            ps = connectionMysql.getConnection().prepareStatement(sql);
            ps.setString(1, sv.getMaSV());
            ps.setString(2, sv.getHoTen());
            ps.setString(3, sv.getDiaChi());

            ps.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Thông báo", 1);
        }
        connectionMysql.freeConnection();
    }

    public static boolean Update(SinhVien sv) {
        try {
            ps = connectionMysql.getConnection().prepareStatement("UPDATE sinhvien SET hovaten = ? , diachi = ? where masv = ?");
            ps.setString(3, sv.getMaSV());
            ps.setString(1, sv.getHoTen());
            ps.setString(2, sv.getDiaChi());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean Delete(String Masach) {
        try {
            ps = connectionMysql.getConnection().prepareStatement("DELETE FROM sinhvien WHERE  masv=?");
            ps.setString(1, Masach);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}
