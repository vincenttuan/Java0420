package com.myjava.ocp.lab16.user.service;

import com.myjava.ocp.lab16.user.dao.UserDAO;
import com.myjava.ocp.lab16.user.exception.UserLoginFailException;
import com.myjava.ocp.lab16.user.po.User;
import java.util.stream.Stream;

public class UserService {
    private UserDAO dao = new UserDAO();
    public boolean login(String username, Integer password) throws UserLoginFailException {
        User[] users = dao.query();
        if(users == null) {
            return false;
        }
        
        boolean check = Stream.of(users)
                .anyMatch(u -> u.getUsername().equals(username) && u.getPassword().equals(password));
        
        if(check) {
            return true;
        } else {
            UserLoginFailException e = new UserLoginFailException("登入失敗");
            throw e;
        }
        
    }
}
