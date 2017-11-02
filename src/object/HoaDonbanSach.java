/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

import java.sql.Date;

/**
 *
 * @author huu21
 */
public class HoaDonbanSach {
    String MaHoaDonBanSach;
    int MaKhachHang,TongHoaDon;
    Date NgayLapHoaDon;

    public HoaDonbanSach() {
    }

    public HoaDonbanSach(String MaHoaDonBanSach, int MaKhachHang, int TongHoaDon, Date NgayLapHoaDon) {
        this.MaHoaDonBanSach = MaHoaDonBanSach;
        this.MaKhachHang = MaKhachHang;
        this.TongHoaDon = TongHoaDon;
        this.NgayLapHoaDon = NgayLapHoaDon;
    }

    public String getMaHoaDonBanSach() {
        return MaHoaDonBanSach;
    }

    public void setMaHoaDonBanSach(String MaHoaDonBanSach) {
        this.MaHoaDonBanSach = MaHoaDonBanSach;
    }

    public int getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(int MaKhachHang) {
        this.MaKhachHang = MaKhachHang;
    }

    public int getTongHoaDon() {
        return TongHoaDon;
    }

    public void setTongHoaDon(int TongHoaDon) {
        this.TongHoaDon = TongHoaDon;
    }

    public Date getNgayLapHoaDon() {
        return NgayLapHoaDon;
    }

    public void setNgayLapHoaDon(Date NgayLapHoaDon) {
        this.NgayLapHoaDon = NgayLapHoaDon;
    }
    
}
