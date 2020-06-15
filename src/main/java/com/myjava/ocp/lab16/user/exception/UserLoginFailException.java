package com.myjava.ocp.lab16.user.exception;

public class UserLoginFailException extends UserException {
    public UserLoginFailException(String string) {
        super(string);
    }
    public void how2do() {
        System.out.println("請重新登入");
    }
}
