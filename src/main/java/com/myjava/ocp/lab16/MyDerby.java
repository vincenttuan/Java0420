package com.myjava.ocp.lab16;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyDerby {
    public static void main(String[] args) {
        String url = "jdbc:derby://localhost:1527/sample";
        String user = "app";
        String password = "app";
        try(Connection conn = DriverManager.getConnection(url, user, password);) {
            System.out.println(!conn.isClosed()); 
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
