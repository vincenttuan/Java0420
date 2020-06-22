package com.myjava.ocp.lab17.jdbc;

// 建立資料列

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadRecord {
    public static void main(String[] args) {
        String sql = "SELECT id, age, name FROM Student";
        String url = "jdbc:derby://localhost:1527/sample";
        String username = "app";
        String password = "app";
        try(Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);) {
            
            while(rs.next()) {
                int id = rs.getInt("id");
                int age = rs.getInt("age");
                String name = rs.getString("name");
                System.out.printf("%-10d%-10d%-10s\n", id, age, name);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
