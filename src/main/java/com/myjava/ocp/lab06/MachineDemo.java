package com.myjava.ocp.lab06;

public class MachineDemo {
    public static void main(String[] args) {
        Machine m = new Machine();
        System.out.println(m.name);
        m.eat();
        m.play();
        //--------------------------
        Phone p = new Phone();
        System.out.println(p.name);
        p.eat();
        p.play();
        //--------------------------
        Computer c = new Computer();
        System.out.println(c.name);
        c.eat();
        c.play();
    }
}
