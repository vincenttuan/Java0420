package com.myjava.ocp.lab10;

class Outer {
    static int sx = 9;
    int x = 7;
    // static內部類別
    static class SInner {
        static void print() {
            System.out.println("SInner class, " + sx);
        }
    }
    // 一般內部類別
    class Inner {
        void print() {
            System.out.println("Inner class, " + sx + ", " + x);
            SInner.print();
        }
    }
    
}

public class StaticInnerClassDemo {
    public static void main(String[] args) {
        Outer.Inner in = new Outer().new Inner();
        in.print();
        Outer.SInner sin = new Outer.SInner();
        sin.print();
    }
}
