/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import object.ThamSo;

/**
 *
 * @author huu21
 */
public class ThamSoData {
   
    public static PreparedStatement ps;
    public static ResultSet rs;

    public static ResultSet showTextFile(String sql) {
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            return ps.executeQuery();
        } catch (Exception e) {
            return null;
        }
    }
    
   

 
}
