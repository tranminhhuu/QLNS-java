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
public class ChiTietBaoCaoCongNo {
    int MaChiTietBaoCaoCongNo,MaKhachHang;
    String MaBaoCaoTon;
    int NoDau,Nocuoi,NoPhatSinh;
    public ChiTietBaoCaoCongNo()
    {
        
    }

    public ChiTietBaoCaoCongNo(int MaChiTietBaoCaoCongNo, int MaKhachHang, String MaBaoCaoTon, int NoDau, int Nocuoi, int NoPhatSinh) {
        this.MaChiTietBaoCaoCongNo = MaChiTietBaoCaoCongNo;
        this.MaKhachHang = MaKhachHang;
        this.MaBaoCaoTon = MaBaoCaoTon;
        this.NoDau = NoDau;
        this.Nocuoi = Nocuoi;
        this.NoPhatSinh = NoPhatSinh;
    }

    public int getMaChiTietBaoCaoCongNo() {
        return MaChiTietBaoCaoCongNo;
    }

    public void setMaChiTietBaoCaoCongNo(int MaChiTietBaoCaoCongNo) {
        this.MaChiTietBaoCaoCongNo = MaChiTietBaoCaoCongNo;
    }

    public int getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(int MaKhachHang) {
        this.MaKhachHang = MaKhachHang;
    }

    public String getMaBaoCaoTon() {
        return MaBaoCaoTon;
    }

    public void setMaBaoCaoTon(String MaBaoCaoTon) {
        this.MaBaoCaoTon = MaBaoCaoTon;
    }

    public int getNoDau() {
        return NoDau;
    }

    public void setNoDau(int NoDau) {
        this.NoDau = NoDau;
    }

    public int getNocuoi() {
        return Nocuoi;
    }

    public void setNocuoi(int Nocuoi) {
        this.Nocuoi = Nocuoi;
    }

    public int getNoPhatSinh() {
        return NoPhatSinh;
    }

    public void setNoPhatSinh(int NoPhatSinh) {
        this.NoPhatSinh = NoPhatSinh;
    }

   
    
}
