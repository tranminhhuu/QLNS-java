/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import object.ThamSo;

/**
 *
 * @author huu21
 */
public class ThamSoData {

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


    public static boolean Update(ThamSo t) {
           try {
            ps = Connect.getConnect().prepareStatement("UPDATE thamso SET SoLuongNhapItNhat =?, SoLuongTonToiDaTruocKhiNhap = ?, SoTienNoToiDa = ?, SoLuongTonToiThieuSauKhiBan = ?, ApDungQuyDinhSoTienThuKhongVuotQuaSoTienNo =?  where mathamso = ?");
         
            ps.setInt(6, t.getMaThamSo());
            ps.setInt(1, t.getSoLuongNhapItNhat());
            ps.setInt(2, t.getSoLuongTonToiDaTruocKhiNhap());
            ps.setInt(3, t.getSoTienNoToiDa());
            ps.setInt(4, t.getSoLuongTonToiThieuSauKhiBan());
            ps.setInt(5, t.getApDungQuyDinhSoTienThuKhongVuotQuaSoTienNo());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            return false;
        }
       
    }
    public static boolean Delete( String Masach) {
        try {
            ps = Connect.getConnect().prepareStatement("DELETE FROM thamso WHERE  mathamso=?");
            ps.setString(1, Masach);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}
