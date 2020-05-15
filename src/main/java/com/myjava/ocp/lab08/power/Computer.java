package com.myjava.ocp.lab08.power;

import com.myjava.ocp.lab08.power.spec.Device;
import com.myjava.ocp.lab08.power.spec.Price;

public class Computer implements Device, Price {

    @Override
    public int getVolt() {
        return 110;
    }

    @Override
    public int getPower() {
        return 300; // 瓦
    }

    @Override
    public int getCost() {
        return 30000;
    }

    @Override
    public String toString() {
        return "Computer{" + '}';
    }
 
	
	 
}
 
