package com.myjava.ocp.lab17.jdbc;

// 建立資料表

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

    public static void main(String[] args) {
        String sql = "CREATE TABLE Student (\n"
                + "    id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),\n"
                + "    age INTEGER NOT NULL,\n"
                + "    name VARCHAR(20) NOT NULL\n"
                + ");";
        
        String url = "";
        String username = "";
        String password = "";
        try(Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();) {
            int count = stmt.executeUpdate(sql);
            System.out.println("建立 Table : " + count);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
