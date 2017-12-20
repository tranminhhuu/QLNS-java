/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import static data.SachData.ps;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import object.KhachHang;
import object.Sach;
import object.SinhVien;

/**
 *
 * @author DELL
 */
public class KhachHangData {

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
    public static void Insert(KhachHang kh) {
        String sql = "insert into khachhang values(?,?,?,?,?,?)";
        try {
            ps = connectionMysql.getConnection().prepareStatement(sql);
            ps.setString(1, kh.getMaKhachHang());
            ps.setString(2, kh.getHoTenKhachHang());
            ps.setString(4, kh.getDiaChi());
            ps.setString(5, kh.getEmaill());
            ps.setString(3, kh.getSoDienThoai());
            ps.setInt(6, kh.getSoTienNo());

            ps.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Người dùng đã tồn tại trong hệ thống, vui lòng bấn nhập lại.", "Thông báo", 1);
        }
        connectionMysql.freeConnection();
}
    public static boolean Update(KhachHang kh) {
        try {
            ps = Connect.getConnect().prepareStatement("UPDATE khachhang SET HoTenKhachHang = ?, DiaChi = ?, Email=?,"
                    + "DienThoai = ?, SoTienNo =?  where MaKhachHang = ?");
                ps.setString(6, kh.getMaKhachHang());
            ps.setString(1, kh.getHoTenKhachHang());
            ps.setString(2, kh.getDiaChi());
            ps.setString(3, kh.getEmaill());
            ps.setString(4, kh.getSoDienThoai());
            ps.setInt(5, kh.getSoTienNo());


            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            return false;
        }
    }
    
      public static boolean Delete( String MaKhachHang) {
        try {
            ps = Connect.getConnect().prepareStatement("DELETE FROM khachhang WHERE  MaKhachHang=?");
            ps.setString(1, MaKhachHang);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}
