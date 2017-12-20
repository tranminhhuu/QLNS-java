/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import object.HoaDonbanSach;
import object.SinhVien;

/**
 *
 * @author DELL
 */
public class HoaDonData {

    public static PreparedStatement ps;
    public static ResultSet rs;
    
    
    public static void Insert(HoaDonbanSach hd) {
        String sql = "insert into hoadonbansach values(?,?,?,?)";
        try {
            ps = connectionMysql.getConnection().prepareStatement(sql);
            ps.setString(1, hd.getMaHoaDonBanSach());
            ps.setString(2, hd.getNgayLapHoaDon());
            ps.setInt(3, hd.getTongHoaDon());
            ps.setString(4, hd.getMaKhachHang());

            ps.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Thông báo", 1);
        }
        connectionMysql.freeConnection();
    }
}
