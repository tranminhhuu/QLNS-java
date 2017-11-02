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
public class BaoCaoTon {

    Date ThoiGian;
    String MaBaoCaoTon;

    public BaoCaoTon() {

    }

    public BaoCaoTon(Date ThoiGian, String MaBaoCaoTon) {
        this.ThoiGian = ThoiGian;
        this.MaBaoCaoTon = MaBaoCaoTon;
    }

    public Date getThoiGian() {
        return ThoiGian;
    }

    public void setThoiGian(Date ThoiGian) {
        this.ThoiGian = ThoiGian;
    }

    public String getMaBaoCaoTon() {
        return MaBaoCaoTon;
    }

    public void setMaBaoCaoTon(String MaBaoCaoTon) {
        this.MaBaoCaoTon = MaBaoCaoTon;
    }

}
