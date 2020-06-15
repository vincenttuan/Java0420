package com.myjava.ocp.lab16.user.client;

import com.myjava.ocp.lab16.user.exception.UserLoginFailException;
import com.myjava.ocp.lab16.user.service.UserService;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserClient {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("請輸入 username:");
            String username = sc.next();
            System.out.println("請輸入 password:");
            String password = sc.next();
            UserService userService = new UserService();
            boolean check = userService.login(username, password);
            System.out.println("登入成功, " + check);
        } catch (InputMismatchException e) {
            System.out.println("輸入錯誤(密碼請輸入數字) !");
        } catch (UserLoginFailException e) {
            System.out.println(e);
            e.how2do();
        }

    }
}
