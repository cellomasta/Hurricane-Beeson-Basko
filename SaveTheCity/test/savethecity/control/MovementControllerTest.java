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
 * @author Alicia
 */
public class MovementControllerTest {
    
    public MovementControllerTest() {
    }

    /**
     * Test of EQSolver method, of class MovementController.
     */
    @Test
    public void testEQSolver() {
        System.out.println("EQSolver");
        
        System.out.println("\t Test 1");
        double multiplier = 6.0;
        MovementController instance = new MovementController();
        Boolean expResult = true;
        Boolean result = instance.EQSolver(multiplier);
        assertEquals(expResult, result);
    }
    @Test
    public void testEQSolver2() {
        
        System.out.println("\t Test 2");
        double multiplier = 5.0;
        MovementController instance = new MovementController();
        Boolean expResult = false;
        Boolean result = instance.EQSolver(multiplier);
        assertEquals(expResult, result);
    }
    @Test
    public void testEQSolver3() {
        System.out.println("\t Test 3");
        double multiplier = 7.0;
        MovementController instance = new MovementController();
        Boolean expResult = false;
        Boolean result = instance.EQSolver(multiplier);
        assertEquals(expResult, result);
    }

    /**
     * Test of AnswerSolver method, of class MovementController.
     */
    @Test
    public void testAnswerSolver() {
        System.out.println("AnswerSolver");
        
        System.out.println("\t Ans Test 1");
        double input = 90.0;
        MovementController instance = new MovementController();
        Boolean expResult = true;
        Boolean result = instance.AnswerSolver(input);
        assertEquals(expResult, result);
    }
    @Test
    public void testAnswerSolver2() {        
        System.out.println("\t Ans Test 2");
        double input = 89.0;
        MovementController instance = new MovementController();
        Boolean expResult = false;
        Boolean result = instance.AnswerSolver(input);
        assertEquals(expResult, result);
    }
    @Test
    public void testAnswerSolver3() {       
        System.out.println("\t Ans Test 3");
        double input = 91.0;
        MovementController instance = new MovementController();
        Boolean expResult = false;
        Boolean result = instance.AnswerSolver(input);
        assertEquals(expResult, result);
    }
}
