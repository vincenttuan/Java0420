package com.myjava.ocp.lab16;

public class Square {

    public Square() {
        System.out.println("Square 物件開始");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Square 物件結束");
    }

    
    
    
    
    public int getArea(int x, int y, int h) {
        // 梯形
        int area = (x + y) * h / 2;
        return area;
    }
    
    public int getAngle(int x, int h) {
        // 三角形
        int area = x * h / 2;
        return area;
    }
}
