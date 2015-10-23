/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savethecity.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author willnelson
 */
public class RiddleControllerTest {
    
    public RiddleControllerTest() {
    }

    /**
     * Test of userVolume method, of class RiddleController.
     */
    @Test
    public void testUserVolume() {
        System.out.println("userVolume");
        /*****************************
         * Test Case #1
         *****************************/
        System.out.println("\tTest case #1");
        double userWeightInPounds = 100.0;
        int AVG_DENSITY = 1;
        double GRAMS_PER_POUND = 453.6;
        double CC_PER_CUBIC_FOOT = 28316.8;
        RiddleController instance = new RiddleController();
        double expResult = 1.6;
        double result = instance.userVolume(userWeightInPounds, AVG_DENSITY, GRAMS_PER_POUND, CC_PER_CUBIC_FOOT);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testUserVolume2() {
        System.out.println("userVolume");    
        /*****************************
         * Test Case #2
         *****************************/
        System.out.println("\tTest case #2");
        double userWeightInPounds = 1.0;
        int AVG_DENSITY = 1;
        double GRAMS_PER_POUND = 453.6;
        double CC_PER_CUBIC_FOOT = 28316.8;
        RiddleController instance = new RiddleController();
        double expResult = 0.02;
        double result = instance.userVolume(userWeightInPounds, AVG_DENSITY, GRAMS_PER_POUND, CC_PER_CUBIC_FOOT);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testUserVolume3() {
        System.out.println("userVolume");    
        /*****************************
         * Test Case #3
         *****************************/
        System.out.println("\tTest case #3");
        double userWeightInPounds = -1;
        int AVG_DENSITY = 1;
        double GRAMS_PER_POUND = 453.6;
        double CC_PER_CUBIC_FOOT = 28316.8;
        RiddleController instance = new RiddleController();
        double expResult = -1;
        double result = instance.userVolume(userWeightInPounds, AVG_DENSITY, GRAMS_PER_POUND, CC_PER_CUBIC_FOOT);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testUserVolume4() {
        System.out.println("userVolume");    
        /*****************************
         * Test Case #4
         *****************************/
        System.out.println("\tTest case #4");
        double userWeightInPounds = 0;
        int AVG_DENSITY = 1;
        double GRAMS_PER_POUND = 453.6;
        double CC_PER_CUBIC_FOOT = 28316.8;
        RiddleController instance = new RiddleController();
        double expResult = 0;
        double result = instance.userVolume(userWeightInPounds, AVG_DENSITY, GRAMS_PER_POUND, CC_PER_CUBIC_FOOT);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testUserVolume5() {
        System.out.println("userVolume");    
        /*****************************
         * Test Case #5
         *****************************/
        System.out.println("\tTest case #5");
        double userWeightInPounds = 225;
        int AVG_DENSITY = 1;
        double GRAMS_PER_POUND = 453.6;
        double CC_PER_CUBIC_FOOT = 28316.8;
        RiddleController instance = new RiddleController();
        double expResult = 3.6;
        double result = instance.userVolume(userWeightInPounds, AVG_DENSITY, GRAMS_PER_POUND, CC_PER_CUBIC_FOOT);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of containerVolume method, of class RiddleController.
     */
    @Test
    public void testContainerVolume() {
        System.out.println("containerVolume");
        /**************************
         * Test Case #1
         **************************/
        System.out.println("\tTest case #1");
        double containerLength = 10;
        double containerWidth = 10;
        double containerHeight = 10;
        double INCH_TO_GALLON = 0.004329;
        RiddleController instance = new RiddleController();
        double expResult = 4.329;
        double result = instance.containerVolume(containerLength, containerWidth, containerHeight, INCH_TO_GALLON);
        assertEquals(expResult, result, 0.0);
        
    }
    
    @Test
    public void testContainerVolume2() {
        System.out.println("containerVolume");
        /**************************
         * Test Case #2
         **************************/
        System.out.println("\tTest case #2");
        double containerLength = 0.0;
        double containerWidth = 25;
        double containerHeight = 50;
        double INCH_TO_GALLON = 0.004329;
        RiddleController instance = new RiddleController();
        double expResult = -1;
        double result = instance.containerVolume(containerLength, containerWidth, containerHeight, INCH_TO_GALLON);
        assertEquals(expResult, result, 0.0);
        
    }
    
    @Test
    public void testContainerVolume3() {
        System.out.println("containerVolume");
        /**************************
         * Test Case #3
         **************************/
        System.out.println("\tTest case #3");
        double containerLength = -1;
        double containerWidth = 25;
        double containerHeight = 10;
        double INCH_TO_GALLON = 0.004329;
        RiddleController instance = new RiddleController();
        double expResult = -1;
        double result = instance.containerVolume(containerLength, containerWidth, containerHeight, INCH_TO_GALLON);
        assertEquals(expResult, result, 0.0);
        
    }
    
    @Test
    public void testContainerVolume4() {
        System.out.println("containerVolume");
        /**************************
         * Test Case #4
         **************************/
        System.out.println("\tTest case #4");
        double containerLength = 100;
        double containerWidth = 100;
        double containerHeight = 100;
        double INCH_TO_GALLON = 0.004329;
        RiddleController instance = new RiddleController();
        double expResult = 4329;
        double result = instance.containerVolume(containerLength, containerWidth, containerHeight, INCH_TO_GALLON);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
