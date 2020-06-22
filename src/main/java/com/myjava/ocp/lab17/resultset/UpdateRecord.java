package com.myjava.ocp.lab17.resultset;

// 建立資料列

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UpdateRecord {
    public static void main(String[] args) {
        String sql = "INSERT INTO Student(age, name) VALUES(21, 'Mary')";
        String url = "jdbc:derby://localhost:1527/sample";
        String username = "app";
        String password = "app";
        try(Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("SELECT * FROM Student WHERE name = 'pcschool'");) {
            
            if(rs.last()) {
                rs.updateInt("age", 99);
                rs.updateRow();
            }
            System.out.println("修改完成");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
