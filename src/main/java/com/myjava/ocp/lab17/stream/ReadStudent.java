package com.myjava.ocp.lab17.stream;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class ReadStudent {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
             Statement statement = conn.createStatement();
             ResultSet rs = statement.executeQuery("SELECT id, name, age FROM Student")) {
            
            List<Student> list = StreamHelper.stream(rs)
                    .map(r -> new Student(r.get("ID", Integer.class), r.get("AGE", Integer.class), r.getString("NAME")))
                    .collect(toList());
            
            System.out.println(list);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
