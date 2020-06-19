/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.ocp.lab16;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author teacher
 */
public class SquareTest {
    
    public SquareTest() {
    }

    @Test
    public void testGetArea() {
        System.out.println("getArea");
        int x = 10;
        int y = 20;
        int h = 4;
        Square instance = new Square();
        int expResult = 60;
        int result = instance.getArea(x, y, h);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testGetAngle() {
        System.out.println("getAngle");
        int x = 10;
        int h = 4;
        Square instance = new Square();
        int expResult = 20;
        int result = instance.getAngle(x, h);
        assertEquals(expResult, result);
        
    }
    
    
}
