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
        try(Connection conn = DriverManager.getConnection(url, user, password); // 資料庫連線物件
            Statement stmt = conn.createStatement(); // 資料庫 SQL語法 敘述物件
            ResultSet rs = stmt.executeQuery(sql)) { // SQL 查詢 -> 得到結果集 ResultSet
            System.out.println(!conn.isClosed()); 
            
            while(rs.next()) {
               int id = rs.getInt("PRODUCT_ID");
               double cost = rs.getDouble("PURCHASE_COST");
               int quantity = rs.getInt("QUANTITY_ON_HAND");
               String desp = rs.getString("DESCRIPTION");
               double subtotal = cost * quantity;
               System.out.printf("%-10d %,10.1f %,10d %,15.1f %-30s\n", id, cost, quantity, subtotal, desp);
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
