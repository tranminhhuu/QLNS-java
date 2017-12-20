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
    int TongHoaDon;
    String NgayLapHoaDon;
    String MaKhachHang;

    public HoaDonbanSach() {
    }

    public HoaDonbanSach(String MaHoaDonBanSach, String MaKhachHang, int TongHoaDon, String NgayLapHoaDon) {
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

    public String getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(String MaKhachHang) {
        this.MaKhachHang = MaKhachHang;
    }

    public int getTongHoaDon() {
        return TongHoaDon;
    }

    public void setTongHoaDon(int TongHoaDon) {
        this.TongHoaDon = TongHoaDon;
    }

    public String getNgayLapHoaDon() {
        return NgayLapHoaDon;
    }

    public void setNgayLapHoaDon(String NgayLapHoaDon) {
        this.NgayLapHoaDon = NgayLapHoaDon;
    }
    
}
