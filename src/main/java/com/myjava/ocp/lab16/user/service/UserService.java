package com.myjava.ocp.lab16.user.service;

import com.myjava.ocp.lab16.user.dao.UserDAO;
import com.myjava.ocp.lab16.user.po.User;
import java.util.stream.Stream;

public class UserService {
    private UserDAO dao = new UserDAO();
    public boolean login(String username, Integer password) {
        User[] users = dao.query();
        if(users == null) {
            return false;
        }
        return Stream.of(users)
                .anyMatch(u -> u.getUsername().equals(username) && u.getPassword().equals(password));
                
    }
}
