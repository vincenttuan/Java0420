package com.myjava.ocp.lab11;

public class Pen {
    private String color;
    private int price;

    public Pen(String color, int price) {
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        
        Pen pen = (Pen)obj;
        if(pen.color.equals(color) && pen.price == price) {
            return true;
        } else {
            return false;
        }
        
    }
    

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pen{" + "color=" + color + ", price=" + price + '}';
    }

    
}
