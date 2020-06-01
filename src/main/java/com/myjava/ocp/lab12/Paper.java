package com.myjava.ocp.lab12;

public class Paper {
    private String size;

    public Paper() {
    }

    public Paper(String size) {
        this.size = size;
    }
    
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Paper{" + "size=" + size + '}';
    }
    
}
