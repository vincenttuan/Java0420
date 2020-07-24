package com.myjava.ocp.pattern;

public abstract class Food {
    protected String name;
    protected int price;
    protected abstract String getName();
    protected abstract int getPrice();
}
