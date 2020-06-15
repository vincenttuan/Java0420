package com.myjava.ocp.lab16;

import java.util.Base64;

public class Base64Demo {
    public static void main(String[] args) throws Exception {
        String base64String = Base64.getUrlEncoder().encodeToString("1234".getBytes("utf-8"));
        System.out.println(base64String);
        base64String = Base64.getUrlEncoder().encodeToString("5678".getBytes("utf-8"));
        System.out.println(base64String);
        base64String = Base64.getUrlEncoder().encodeToString("1111".getBytes("utf-8"));
        System.out.println(base64String);
    }
}
