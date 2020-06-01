package com.myjava.ocp.lab12;

public class BoxDemo {
    public static void main(String[] args) {
        Pen pen = new Pen();
        pen.setColor("Red");
        
        Paper paper = new Paper();
        paper.setSize("A4");
        
        Box<Pen> b1 = new Box<>();
        b1.set(pen);
        System.out.println(b1.get().getColor());
        
        Box<Paper> b2 = new Box<>();
        b2.set(paper);
        System.out.println(b2.get().getSize());
        
        Box[] boxs = {b1, b2};
        for(Box box : boxs) {
            if(box.get() instanceof Pen) {
                System.out.println(((Pen)box.get()).getColor());
            } else if(box.get() instanceof Paper) {
                System.out.println(((Paper)box.get()).getSize());
            }
        }
    }
}
