package com.myjava.ocp.lab10;

public class MethodInnerClass {
    
    public void foo() {
        int x = 100;
        final int y = 200;
        
        class Bar {
            public void foo() {
                System.out.println(y);
                System.out.println(x);
            }
        }
        new Bar().foo();
    }
    
    public static void main(String[] args) {
        new MethodInnerClass().foo();
    }
    
}
