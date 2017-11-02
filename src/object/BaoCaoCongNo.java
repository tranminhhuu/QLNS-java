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
public class BaoCaoCongNo {

    Date ThoiGian;
    String MaBaoCaoCongNo;

    public BaoCaoCongNo() {

    }

    public BaoCaoCongNo(Date ThoiGian, String MaBaoCaoCongNo) {
        this.ThoiGian = ThoiGian;
        this.MaBaoCaoCongNo = MaBaoCaoCongNo;
    }

    public Date getThoiGian() {
        return ThoiGian;
    }

    public void setThoiGian(Date ThoiGian) {
        this.ThoiGian = ThoiGian;
    }

    public String getMaBaoCaoCongNo() {
        return MaBaoCaoCongNo;
    }

    public void setMaBaoCaoCongNo(String MaBaoCaoCongNo) {
        this.MaBaoCaoCongNo = MaBaoCaoCongNo;
    }

}
