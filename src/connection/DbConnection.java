/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

    public static Connection CON;
    public static final String URL = "jdbc:mysql://";

//  ---== LOCALHOST MARIADB (INTERNAL/LOCAL/PRIVATE DATABASE CONNECTION) ==---
//    public static final String DB_HOST = "localhost";
//    public static final String DB_PORT = "3306";
//    public static final String DB_NAME = "object-persistence";
//    public static final String DB_USERNAME = "root";
//    public static final String DB_PASSWORD = "";
//
//  ---== LOCALHOST MARIADB (INTERNAL/LOCAL DB NAMUN DIREMOTE ACCESS/PORTFORWARD DENGAN BANTUAN NGROK UNTUK SHARE DB) ==---
//    public static final String DB_HOST = "0.tcp.ap.ngrok.io";
//    public static final String DB_PORT = "13355";
//    public static final String DB_NAME = "object-persistence";
//    public static final String DB_USERNAME = "root";
//    public static final String DB_PASSWORD = "";
//
//  ---== GOOGLE CLOUD MYSQL (REMOTE ACCESS, MENGGUNAKAN DATABASE MYSQL DI GOOGLE CLOUD) ==---
//    public static final String DB_HOST = "34.101.141.200";
//    public static final String DB_PORT = "3306";
//    public static final String DB_NAME = "apotek";
//    public static final String DB_USERNAME = "tugasbesarjava";
//    public static final String DB_PASSWORD = "tugasbesarjava";
////
//    public static final String PATH = DB_HOST + ":" + DB_PORT + "/" + DB_NAME;
    public static final String PATH = "localhost:3306/tumbuh_bersama";
    public static final String URLPATH = URL + PATH;

    public Connection makeConnection() {
        System.out.println("[~] Opening Database...");
        try {
            CON = DriverManager.getConnection(URL + PATH,"root","");
            System.out.println("[+] Success Opening Database!");
        } catch (Exception e) {
            System.out.println("[-] Error Opening Database!");
            System.out.println(e);
        }
        return CON;
    }

    public void closeConnection() {
        System.out.println("[~] Closing Database...");
        try {
            CON.close();
            System.out.println("[+] Success Closing Database!");
        } catch (Exception e) {
            System.out.println("[-] Error Closing Database!");
            System.out.println(e);
        }
    }

}
