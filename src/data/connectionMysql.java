/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.applet.Main;
import static sun.applet.Main.main;
import object.SinhVien;

/**
 *
 * @author huu21
 */
public class connectionMysql {

    private static String USERNAME = "root";
    private static String PASSWORD = "1111";
    static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static String URL_DRIVER = "jdbc:mysql://localhost:3306/sach_database?autoTeconnect=true&useSSL=false";
//    static String URL_DRIVER = "jdbc:mysql://localhost:8080/qlns?autoTeconnect=true&useSSL=false";
    static Connection con = null;

    public static Connection getConnection() {
        try {
            // driver register
            Class.forName(JDBC_DRIVER);
            con = DriverManager.getConnection(URL_DRIVER, USERNAME, PASSWORD);
            //System.out.println("Kết nối thành công");
            System.out.println("Connect with "+con);
            //khai báo đối tượng để thực hiện công việc
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(connectionMysql.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(connectionMysql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }

    public static void freeConnection() {
        try {
            con.close();
            System.out.println("Disconnected with "+con);
        } catch (SQLException ex) {
            // Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }

}
