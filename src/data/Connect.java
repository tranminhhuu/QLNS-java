/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author huu21
 */
public class Connect {
    
    public static Connection con = null;
    Statement st = null;

     public static Connection getConnect(){
        try {
            //load driver jdbc
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Load driver không thành công" +ex);  
        }
        try {
           
            //ket noi toi mysql
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sach_database?useUnicode=true&characterEncoding=UTF8",
                    "root","1111");
            
        } catch (Exception e) {
            System.out.println("Kết nối tới mysql không thành công" +e);   
        }
        return con;
    }
    
    //Ngắt kết nối tới csdl
    public  static void FreeConnection() {
        try {
            con.close();
            System.out.println("Disconnected with "+con);
        } catch (SQLException ex) {
            // Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
          System.out.println("Đóng kết nối không thành công" +ex); 
        }
    }
    //test Connect
    public static String TestConnect() {
        try{
           
            con =Connect.getConnect();
            return "Connect with "+con;
        }
        catch(Exception e) {
            return "Fail connection";
        }
    } 
    
    public static void main(String[] args) {
         System.out.println(TestConnect());
        FreeConnection();
    }
}
