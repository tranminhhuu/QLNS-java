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
public class ChiTietHoaDonbanSach {

    String MaHoaDonBanSach, MaSach;
    int MaChiTietHoaDonBanSach, SoLuongBan, DonGiaBan, ThanhTien;

    public ChiTietHoaDonbanSach() {
    }

    public ChiTietHoaDonbanSach(String MaHoaDonBanSach, String MaSach, int MaChiTietHoaDonBanSach, int SoLuongBan, int DonGiaBan, int ThanhTien) {
        this.MaHoaDonBanSach = MaHoaDonBanSach;
        this.MaSach = MaSach;
        this.MaChiTietHoaDonBanSach = MaChiTietHoaDonBanSach;
        this.SoLuongBan = SoLuongBan;
        this.DonGiaBan = DonGiaBan;
        this.ThanhTien = ThanhTien;
    }

    public String getMaHoaDonBanSach() {
        return MaHoaDonBanSach;
    }

    public void setMaHoaDonBanSach(String MaHoaDonBanSach) {
        this.MaHoaDonBanSach = MaHoaDonBanSach;
    }

    public String getMaSach() {
        return MaSach;
    }

    public void setMaSach(String MaSach) {
        this.MaSach = MaSach;
    }

    public int getMaChiTietHoaDonBanSach() {
        return MaChiTietHoaDonBanSach;
    }

    public void setMaChiTietHoaDonBanSach(int MaChiTietHoaDonBanSach) {
        this.MaChiTietHoaDonBanSach = MaChiTietHoaDonBanSach;
    }

    public int getSoLuongBan() {
        return SoLuongBan;
    }

    public void setSoLuongBan(int SoLuongBan) {
        this.SoLuongBan = SoLuongBan;
    }

    public int getDonGiaBan() {
        return DonGiaBan;
    }

    public void setDonGiaBan(int DonGiaBan) {
        this.DonGiaBan = DonGiaBan;
    }

    public int getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(int ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

}
