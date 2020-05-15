package com.myjava.ocp.lab08.power;

import com.myjava.ocp.lab08.power.spec.Device;
import com.myjava.ocp.lab08.power.spec.Price;

public class Phone implements Device, Price {

    @Override
    public int getVolt() {
        return 5;
    }

    @Override
    public int getPower() {
        return 40;
    }

    @Override
    public int getCost() {
        return 5000;
    }

    @Override
    public String toString() {
        return "Phone{" + '}';
    }
 
	
	 
}
 
