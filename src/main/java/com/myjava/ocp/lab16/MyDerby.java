package com.myjava.ocp.lab16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyDerby {
    public static void main(String[] args) {
        String url = "jdbc:derby://localhost:1527/sample";
        String user = "app";
        String password = "app";
        String sql = "SELECT * FROM product";
        try(Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {
            System.out.println(!conn.isClosed()); 
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
