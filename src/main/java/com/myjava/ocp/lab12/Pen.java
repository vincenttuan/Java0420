package com.myjava.ocp.lab12;

public class Pen {
    private String color;

    public Pen() {
    }

    public Pen(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Pen{" + "color=" + color + '}';
    }
    
    
    
}
