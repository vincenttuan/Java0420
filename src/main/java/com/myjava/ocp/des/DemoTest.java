package com.myjava.ocp.des;

import com.myjava.ocp.des.utils.EncrypDES;

public class DemoTest {
    public static void main(String[] args) throws Exception {
        String article = "紅鏈收購台鏈 郭台銘震驚";
        String path = "src\\main\\java\\com\\myjava\\ocp\\des\\utils\\mydeskey_1595245668740.bin";
        EncrypDES des = new EncrypDES(path);
        byte[] article_des = des.Encrytor(article);
        byte[] article_dedes = des.Decryptor(article_des);
        System.out.println("明文: " + article);
        System.out.println("加密後: " + new String(article_des));
        System.out.println("解密後: " + new String(article_dedes));
    }
}
