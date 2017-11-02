/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

/**
 *
 * @author huu21
 */
public class ChiTietPhieuNhap {
    String MaPhieuNhap,MaSach;
    int SoLuongNhap,MaChiTietPhieuNhap;

    public ChiTietPhieuNhap() {
    }

    public ChiTietPhieuNhap(int MaChiTietPhieuNhap, String MaPhieuNhap, String MaSach, int SoLuongNhap) {
        this.MaChiTietPhieuNhap = MaChiTietPhieuNhap;
        this.MaPhieuNhap = MaPhieuNhap;
        this.MaSach = MaSach;
        this.SoLuongNhap = SoLuongNhap;
    }

    public int getMaChiTietPhieuNhap() {
        return MaChiTietPhieuNhap;
    }

    public void setMaChiTietPhieuNhap(int MaChiTietPhieuNhap) {
        this.MaChiTietPhieuNhap = MaChiTietPhieuNhap;
    }

    public String getMaPhieuNhap() {
        return MaPhieuNhap;
    }

    public void setMaPhieuNhap(String MaPhieuNhap) {
        this.MaPhieuNhap = MaPhieuNhap;
    }

    public String getMaSach() {
        return MaSach;
    }

    public void setMaSach(String MaSach) {
        this.MaSach = MaSach;
    }

    public int getSoLuongNhap() {
        return SoLuongNhap;
    }

    public void setSoLuongNhap(int SoLuongNhap) {
        this.SoLuongNhap = SoLuongNhap;
    }
    
}
