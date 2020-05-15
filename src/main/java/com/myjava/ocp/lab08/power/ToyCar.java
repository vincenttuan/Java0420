package com.myjava.ocp.lab08.power;

import com.myjava.ocp.lab08.power.spec.Car;
import com.myjava.ocp.lab08.power.spec.Price;

public class ToyCar implements Car, Price {

    @Override
    public int speed() {
        return 3;
    }

    @Override
    public int getPower() {
        return 2;
    }

    @Override
    public int getCost() {
        return 500;
    }

    @Override
    public String toString() {
        return "ToyCar{" + '}';
    }
 
	
	 
}
 
