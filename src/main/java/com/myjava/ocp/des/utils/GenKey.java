package com.myjava.ocp.des.utils;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Date;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/*
DES演算法為密碼體制中的對稱密碼體制，又被成為美國數據加密標准，是 1972 年美國 IBM 公司研制的對稱密碼體制加密演算法。 
明文按 64 位進行分組, 密鑰長 64 位，密鑰事實上是 56 位參與 DES 運算
（第 8、16、24、32、40、48、56、64 位是校驗位， 使得每個密鑰都有奇數個 1）
分組後的明文組和 56 位的密鑰按位替代或交換的方法形成密文組的加密方法。
 */
public class GenKey {
    // KeyGenerator 提供對稱密鑰生成器的功能，支持各種演算法
    private KeyGenerator keygen;
    // SecretKey 負責保存對稱密鑰
    private SecretKey deskey;
    
    public SecretKey getNewSecretKey() {
        try {
            keygen = KeyGenerator.getInstance("DES");
            // 生成密鑰
            deskey = keygen.generateKey();
        } catch (Exception e) {
            System.out.println("Fail");
        }
        return deskey;
    }
    
    public static void main(String[] args) {
        GenKey genKey = new GenKey();
        SecretKey secretKey = genKey.getNewSecretKey();
        for(byte b : secretKey.getEncoded()) {
            System.out.print(b);
        }
        String path = "src\\main\\java\\com\\myjava\\ocp\\des\\utils\\mydeskey_%d.bin";
        try(FileOutputStream fos = new FileOutputStream(String.format(path, new Date().getTime()));
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            
            oos.writeObject(secretKey);
            System.out.println("金鑰寫檔完成");
            
        } catch (Exception e) {
        }
    }
}
