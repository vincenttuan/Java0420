package com.myjava.ocp.pattern;

public class SideDish extends Food {
    protected Food food;

    public SideDish(Food food) {
        this.food = food;
    }
    
    @Override
    protected String getName() {
        return name + " + " + food.getName();
    }

    @Override
    protected int getPrice() {
        return price + food.getPrice();
    }
    
}
