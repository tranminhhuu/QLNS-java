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
public class ThamSo {


    int MaThamSo;
    int SoLuongNhapItNhat, 
            SoTienNoToiDa, 
            SoLuongTonToiDaTruocKhiNhap, 
            SoLuongTonToiThieuSauKhiBan;
    int ApDungQuyDinhSoTienThuKhongVuotQuaSoTienNo;

    public ThamSo(int MaThamSo, int SoLuongNhapItNhat, int SoTienNoToiDa, int SoLuongTonToiDaTruocKhiNhap, int SoLuongTonToiThieuSauKhiBan, int ApDungQuyDinhSoTienThuKhongVuotQuaSoTienNo) {
        this.MaThamSo = MaThamSo;
        this.SoLuongNhapItNhat = SoLuongNhapItNhat;
        this.SoTienNoToiDa = SoTienNoToiDa;
        this.SoLuongTonToiDaTruocKhiNhap = SoLuongTonToiDaTruocKhiNhap;
        this.SoLuongTonToiThieuSauKhiBan = SoLuongTonToiThieuSauKhiBan;
        this.ApDungQuyDinhSoTienThuKhongVuotQuaSoTienNo = ApDungQuyDinhSoTienThuKhongVuotQuaSoTienNo;
    }

    public ThamSo() {
    }

    public int getMaThamSo() {
        return MaThamSo;
    }

    public void setMaThamSo(int MaThamSo) {
        this.MaThamSo = MaThamSo;
    }

    public int getSoLuongNhapItNhat() {
        return SoLuongNhapItNhat;
    }

    public void setSoLuongNhapItNhat(int SoLuongNhapItNhat) {
        this.SoLuongNhapItNhat = SoLuongNhapItNhat;
    }

    public int getSoTienNoToiDa() {
        return SoTienNoToiDa;
    }

    public void setSoTienNoToiDa(int SoTienNoToiDa) {
        this.SoTienNoToiDa = SoTienNoToiDa;
    }

    public int getSoLuongTonToiDaTruocKhiNhap() {
        return SoLuongTonToiDaTruocKhiNhap;
    }

    public void setSoLuongTonToiDaTruocKhiNhap(int SoLuongTonToiDaTruocKhiNhap) {
        this.SoLuongTonToiDaTruocKhiNhap = SoLuongTonToiDaTruocKhiNhap;
    }

    public int getSoLuongTonToiThieuSauKhiBan() {
        return SoLuongTonToiThieuSauKhiBan;
    }

    public void setSoLuongTonToiThieuSauKhiBan(int SoLuongTonToiThieuSauKhiBan) {
        this.SoLuongTonToiThieuSauKhiBan = SoLuongTonToiThieuSauKhiBan;
    }

    public int getApDungQuyDinhSoTienThuKhongVuotQuaSoTienNo() {
        return ApDungQuyDinhSoTienThuKhongVuotQuaSoTienNo;
    }

    public void setApDungQuyDinhSoTienThuKhongVuotQuaSoTienNo(int ApDungQuyDinhSoTienThuKhongVuotQuaSoTienNo) {
        this.ApDungQuyDinhSoTienThuKhongVuotQuaSoTienNo = ApDungQuyDinhSoTienThuKhongVuotQuaSoTienNo;
    }
   
}
