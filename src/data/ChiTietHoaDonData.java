/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import static data.HoaDonData.ps;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import object.ChiTietHoaDonbanSach;
import object.HoaDonbanSach;

/**
 *
 * @author DELL
 */
public class ChiTietHoaDonData {
    
    public static PreparedStatement ps;
    public static ResultSet rs;
    
    public static void Insert(ChiTietHoaDonbanSach hd) {
        String sql = "insert into chitiethoadonbansach values(?,?,?,?,?,?)";
        try {
            ps = connectionMysql.getConnection().prepareStatement(sql);
            ps.setString(1, hd.getMaChiTietHoaDonBanSach());
            ps.setString(2, hd.getSoLuongBan());
            ps.setInt(3, hd.getDonGiaBan());
            ps.setInt(4, hd.getThanhTien());
            ps.setString(5, hd.getMaHoaDonBanSach());
            ps.setString(6, hd.getMaSach());

            ps.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Thông báo", 1);
        }
        connectionMysql.freeConnection();
    }
}
