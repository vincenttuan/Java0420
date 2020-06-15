package com.myjava.ocp.lab16;

import java.util.Base64;

public class Base64Demo {
    public static void main(String[] args) throws Exception {
        String base64String = Base64.getUrlEncoder().encodeToString("1234".getBytes("utf-8"));
        System.out.println(base64String);
        // MTIzNA==
        byte[] base64bytes = Base64.getDecoder().decode(base64String);
        String ans = new String(base64bytes, "UTF-8");
        System.out.println(ans);
    }
}
