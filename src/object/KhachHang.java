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
public class KhachHang {
    String HoTenKhachHang,DiaChi,Emaill,SoDienThoai;
    int SoTienNo;
    String MaKhachHang;

    public KhachHang() {
    }

    public KhachHang(String MaKhachHang, String HoTenKhachHang, String DiaChi, String Emaill, String SoDienThoai, int SoTienNo) {
        this.MaKhachHang = MaKhachHang;
        this.HoTenKhachHang = HoTenKhachHang;
        this.DiaChi = DiaChi;
        this.Emaill = Emaill;
        this.SoDienThoai = SoDienThoai;
        this.SoTienNo =  SoTienNo;
    }

    public String getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(String MaKhachHang) {
        this.MaKhachHang = MaKhachHang;
    }

    public String getHoTenKhachHang() {
        return HoTenKhachHang;
    }

    public void setHoTenKhachHang(String HoTenKhachHang) {
        this.HoTenKhachHang = HoTenKhachHang;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getEmaill() {
        return Emaill;
    }

    public void setEmaill(String Emaill) {
        this.Emaill = Emaill;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    public int getSoTienNo() {
        return SoTienNo;
    }

    public void setSoTienNo(int SoTienNo) {
        this.SoTienNo = SoTienNo;
    }
    
}
