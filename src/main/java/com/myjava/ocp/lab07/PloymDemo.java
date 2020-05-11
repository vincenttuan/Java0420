package com.myjava.ocp.lab07;

class Base {
    public void test() {
        System.out.println("Base ");
    }
}
class DerivedA extends Base {
    public void test() {
        System.out.println("DerivedA ");
    }
}
class DerivedB extends DerivedA {
    public void test() {
        System.out.println("DerivedB ");
    }
}

public class PloymDemo {
    public static void main(String[] args) {
        Base b1 = new DerivedB();
        Base b2 = new DerivedA();
        Base b3 = new DerivedB();
        b1 = (Base) b3;
        Base b4 = (DerivedA)b3;
        b1.test(); // DerivedB
        b4.test(); // DerivedB
        b4 = b2; // 轉換實體
        b4.test(); // DerivedA
        ((DerivedB)b4).test(); // 向下轉型, 所以會失敗
    }
}
