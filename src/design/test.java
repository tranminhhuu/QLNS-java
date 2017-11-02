/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design;

/**
 *
 * @author huu21
 */


 

import data.ThamSoData;
import data.Update;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

 
public class test  {
static String sqlts = "select * from thamso";
    public static void main(String[] args) {
      ResultSet rs= ThamSoData.showTextFile(sqlts);
   
    try {
         if (rs.next()) {
        System.out.println(rs.getString("mathamso"));
         }
    } catch (SQLException ex) {
        Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
    }
        
         
    }
  
  
}