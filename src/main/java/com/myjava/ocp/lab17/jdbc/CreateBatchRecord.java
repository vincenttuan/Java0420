package com.myjava.ocp.lab17.jdbc;

// 建立批次資料列

import com.github.javafaker.Faker;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Random;

public class CreateBatchRecord {
    public static void main(String[] args) {
        String sql = "INSERT INTO Student(age, name) VALUES(?, ?)";
        String url = "jdbc:derby://localhost:1527/sample";
        String username = "app";
        String password = "app";
        try(Connection conn = DriverManager.getConnection(url, username, password);
            PreparedStatement pstmt = conn.prepareStatement(sql);) {
            
            pstmt.setInt(1, new Random().nextInt(40) + 10);
            pstmt.setString(2, new Faker().name().firstName());
            int count = pstmt.executeUpdate();
            System.out.println("建立資料列 : " + count);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
