package com.myjava.ocp.lab17.jdbc;

// 建立資料列

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateRecord {
    public static void main(String[] args) {
        String sql = "INSERT INTO Student(age, name) VALUES(21, 'Mary')";
        String url = "jdbc:derby://localhost:1527/sample";
        String username = "app";
        String password = "app";
        try(Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();) {
            int count = stmt.executeUpdate(sql);
            System.out.println("建立資料列 : " + count);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
