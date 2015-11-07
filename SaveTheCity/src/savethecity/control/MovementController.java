/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savethecity.control;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import java.text.DecimalFormat;

/**
 *
 * @author Alicia
 */
public class MovementController {
    public Boolean EQSolver(double multiplier){
        	
        double EQ = multiplier * 7 + 6;
        
        if (EQ == 48){
	return TRUE;
    }
        else	
	return FALSE;
        
    }
    public Boolean AnswerSolver (double input){
     
            double ans = 8 * 7 + 34; 
            
            if (input == ans){
                return TRUE;
            }
            else
                return FALSE;
    }
    public static void MoveNorth(){
    }
    public static void MoveSouth(){
    }
    public static void MoveEast(){
    }
    public static void MoveWest(){
    }
}