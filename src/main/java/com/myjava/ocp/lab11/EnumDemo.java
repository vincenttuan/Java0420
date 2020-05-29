package com.myjava.ocp.lab11;

enum Sex {
   男生, 女生 
}

public class EnumDemo {
    public static void main(String[] args) {
        checkSex(Sex.女生);
    }
    public static void checkSex(Sex sex) {
        switch(sex) {
            case 男生:
                System.out.println("玩樂高");
                break;
            case 女生:
                System.out.println("玩洋娃娃");
                break;    
        }
    }
}
