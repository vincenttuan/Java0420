package com.myjava.ocp.lab01;

public class Mask {
    private String color;
    private boolean child;
    public final static int price = 5;
    
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
    
}
