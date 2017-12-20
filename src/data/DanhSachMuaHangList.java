/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author DELL
 */
public class DanhSachMuaHangList {
    private String MaSach;
    private String TenSach;
    private String ThanhTien;
    private String SoLuong;

    public DanhSachMuaHangList(String MaSach, String TenSach, String ThanhTien, String SoLuong) {
        this.MaSach = MaSach;
        this.TenSach = TenSach;
        this.ThanhTien = ThanhTien;
        this.SoLuong = SoLuong;
    }

    public String getMaSach() {
        return MaSach;
    }

    public void setMaSach(String MaSach) {
        this.MaSach = MaSach;
    }

    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String TenSach) {
        this.TenSach = TenSach;
    }

    public String getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(String ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    public String getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(String SoLuong) {
        this.SoLuong = SoLuong;
    }
    
}
