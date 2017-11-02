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
public class ChiTietBaoCaoTon {
    String MaSach, MaBaoCaoTon;
    
    int TonDau,TonCuoi ,TonPhatSinh,MaChiTietBaoCaoTon;

    public ChiTietBaoCaoTon() {
    }

    public ChiTietBaoCaoTon(int MaChiTietBaoCaoTon, String MaSach, String MaBaoCaoTon, int TonDau, int TonCuoi, int TonPhatSinh) {
        this.MaChiTietBaoCaoTon = MaChiTietBaoCaoTon;
        this.MaSach = MaSach;
        this.MaBaoCaoTon = MaBaoCaoTon;
        this.TonDau = TonDau;
        this.TonCuoi = TonCuoi;
        this.TonPhatSinh = TonPhatSinh;
    }

    public int getMaChiTietBaoCaoTon() {
        return MaChiTietBaoCaoTon;
    }

    public void setMaChiTietBaoCaoTon(int MaChiTietBaoCaoTon) {
        this.MaChiTietBaoCaoTon = MaChiTietBaoCaoTon;
    }

    public String getMaSach() {
        return MaSach;
    }

    public void setMaSach(String MaSach) {
        this.MaSach = MaSach;
    }

    public String getMaBaoCaoTon() {
        return MaBaoCaoTon;
    }

    public void setMaBaoCaoTon(String MaBaoCaoTon) {
        this.MaBaoCaoTon = MaBaoCaoTon;
    }

    public int getTonDau() {
        return TonDau;
    }

    public void setTonDau(int TonDau) {
        this.TonDau = TonDau;
    }

    public int getTonCuoi() {
        return TonCuoi;
    }

    public void setTonCuoi(int TonCuoi) {
        this.TonCuoi = TonCuoi;
    }

    public int getTonPhatSinh() {
        return TonPhatSinh;
    }

    public void setTonPhatSinh(int TonPhatSinh) {
        this.TonPhatSinh = TonPhatSinh;
    }
    
}
