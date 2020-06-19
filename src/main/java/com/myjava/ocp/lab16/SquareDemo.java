package com.myjava.ocp.lab16;

public class SquareDemo {
    public static void main(String[] args) {
        Square sq = new Square();
        int area1 = sq.getArea(10, 10, 10);
        int area2 = sq.getAngle(10, 10);
        System.out.println(area1);
        System.out.println(area2);
        sq = null;
        System.gc();
        
    }
}
