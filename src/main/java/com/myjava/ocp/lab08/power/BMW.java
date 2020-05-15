package com.myjava.ocp.lab08.power;

import com.myjava.ocp.lab08.power.spec.Car;
import com.myjava.ocp.lab08.power.spec.Price;

public class BMW implements Car, Price {

    @Override
    public int speed() {
        return 400;
    }

    @Override
    public int getPower() {
        return 3000;
    }

    @Override
    public int getCost() {
        return 200_0000;
    }

    @Override
    public String toString() {
        return "BMW{" + '}';
    }
    
    
	 
}
 
