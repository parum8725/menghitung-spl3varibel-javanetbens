/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project_uas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author M S I
 */
public class Projk {
    public static Connection db;
    public static Connection ConfigDB() throws SQLException {
        try {
         if (db != null) { 
             return db;
         }

         String dbName = "db_paket";
         String user="root";
         String pass="";

         String url="jdbc:mysql://localhost:3306/" + dbName;

         DriverManager.registerDriver(new com.mysql.jdbc.Driver());

         db = DriverManager.getConnection(url, user, pass);

          System.out.println("DB Success connect " + dbName);
        } catch (SQLException e) {
          System.err.println("Koneksi Gagal"+e.getMessage());
         }

      return db;
    }
    
    
}
