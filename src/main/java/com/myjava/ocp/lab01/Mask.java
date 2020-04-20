package com.myjava.ocp.lab01;

public class Mask {
    // 物件屬性
    private String color;
    private boolean child;
    public final static int price = 5;
    
    // 建構子
    public Mask(String color, boolean child) {
        this.color = color;
        this.child = child;
    }
    
    public Mask() {
        
    }
    
    // 封裝方法
    public void setColor(String c) {
        color = c;
    }
    public String getColor() {
        return color;
    }

    public boolean isChild() {
        return child;
    }

    public void setChild(boolean child) {
        this.child = child;
    }

    public int getPrice() {
        return price;
    }
    
}
