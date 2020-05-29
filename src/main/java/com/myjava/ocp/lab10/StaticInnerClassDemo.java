package com.myjava.ocp.lab10;

class Outer {
    // 一般內部類別
    class Inner {
        void print() {
            System.out.println("Inner class");
        }
    }
    // static內部類別
    static class SInner {
        static void print() {
            System.out.println("SInner class");
        }
    }
}

public class StaticInnerClassDemo {
    
}
