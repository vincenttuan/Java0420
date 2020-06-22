package com.myjava.ocp.lab17.jdbc;

// 刪除資料列
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteRecord {
    public static void main(String[] args) {
        String sql = "DELETE FROM Student WHERE id = 1";
        String url = "jdbc:derby://localhost:1527/sample";
        String username = "app";
        String password = "app";
        try(Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();) {
            int count = stmt.executeUpdate(sql);
            System.out.println("刪除資料列 : " + count);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
