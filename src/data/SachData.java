/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import object.Sach;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author huu21
 */
public class SachData {

    public static PreparedStatement ps;
    public static ResultSet rs;

    public static ResultSet showTextFile(String sql) {
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            return ps.executeQuery();
        } catch (Exception e) {
            return null;
        }
    }

    public static void Insert(Sach s) {
        String sql = "insert into sach values(?,?,?,?,?,?)";
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            ps.setString(1, s.getMaSach());
            ps.setString(2, s.getTenSach());
            ps.setString(3, s.getTheLoai());
            ps.setString(4, s.getTacGia());
            ps.setInt(5, s.getDonGia());
            ps.setInt(6, s.getSoLuongTon());
            ps.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Thông báo", 1);
        }
    }

    public static boolean Update(Sach s) {
        try {
            ps = Connect.getConnect().prepareStatement("UPDATE sach SET TenSach = ?, TheLoai = ?,TacGia=?,"
                    + "DonGia = ?,SoLuongTon=?  where MaSach = ?");
            ps.setString(6, s.getMaSach());
            ps.setString(1, s.getTenSach());
            ps.setString(2, s.getTheLoai());
            ps.setString(3, s.getTacGia());
            ps.setInt(4, s.getDonGia());
            ps.setInt(5, s.getSoLuongTon());

            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean Delete( String Masach) {
        try {
            ps = Connect.getConnect().prepareStatement("DELETE FROM sach WHERE  masach=?");
            ps.setString(1, Masach);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

}
