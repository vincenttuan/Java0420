package com.myjava.ocp.lab16.user.dao;

import com.google.gson.Gson;
import com.myjava.ocp.lab16.user.po.User;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserDAO {
    public User[] query() {
        File file = new File("src\\main\\java\\com\\myjava\\ocp\\lab16\\user\\db\\users.json");
        String json = null;
        try {
            json = new Scanner(file).useDelimiter("//A").next();
        } catch (FileNotFoundException ex) {
            System.out.println("users.json 檔案位置不正確, " + ex);
            return null;
        }
        User[] users = new Gson().fromJson(json, User[].class);
        return users;
    }
    
    
}
