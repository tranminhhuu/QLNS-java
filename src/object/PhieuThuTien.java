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
public class PhieuThuTien {
    String MaPhieuThuTIen;
    int MaKhachHang;
    Date NgayThu;
    float SoTienThu;

    public PhieuThuTien() {
    }

    public PhieuThuTien(String MaPhieuThuTIen, int MaKhachHang, Date NgayThu, float SoTienThu) {
        this.MaPhieuThuTIen = MaPhieuThuTIen;
        this.MaKhachHang = MaKhachHang;
        this.NgayThu = NgayThu;
        this.SoTienThu = SoTienThu;
    }

    public String getMaPhieuThuTIen() {
        return MaPhieuThuTIen;
    }

    public void setMaPhieuThuTIen(String MaPhieuThuTIen) {
        this.MaPhieuThuTIen = MaPhieuThuTIen;
    }

    public int getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(int MaKhachHang) {
        this.MaKhachHang = MaKhachHang;
    }

    public Date getNgayThu() {
        return NgayThu;
    }

    public void setNgayThu(Date NgayThu) {
        this.NgayThu = NgayThu;
    }

    public float getSoTienThu() {
        return SoTienThu;
    }

    public void setSoTienThu(float SoTienThu) {
        this.SoTienThu = SoTienThu;
    }
    
}
