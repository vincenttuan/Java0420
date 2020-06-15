package com.myjava.ocp.lab16.user.service;

import com.myjava.ocp.lab16.user.dao.UserDAO;
import com.myjava.ocp.lab16.user.exception.UserLoginFailException;
import com.myjava.ocp.lab16.user.po.User;
import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.stream.Stream;

public class UserService {
    private UserDAO dao = new UserDAO();
    public boolean login(String username, String password) throws UserLoginFailException {
        User[] users = dao.query();
        if(users == null) {
            return false;
        }
        
        boolean check = Stream.of(users)
                .anyMatch(u -> u.getUsername().equals(username) && decodeBase64(u.getPassword()).equals(password));
        
        if(check) {
            return true;
        } else {
            UserLoginFailException e = new UserLoginFailException("登入失敗");
            throw e;
        }
        
    }

    private String decodeBase64(String base64String) {
        byte[] base64bytes = Base64.getDecoder().decode(base64String);
        String ans = null;
        try {
            ans = new String(base64bytes, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            System.out.println("編碼失敗");
        }
        return ans;
    }
}
