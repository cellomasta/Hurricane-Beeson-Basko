/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savetheciy.view;

import java.util.Scanner;
import savethecity.SaveTheCity;
import savethecity.control.GameControl;

/**
 *
 * @author Alicia
 */
public class HelpMenuView extends View {
   
    public HelpMenuView(){
        super("\n"
                + "\n----------------------------------"
                + "\n| Help Menu                      |"
                + "\n----------------------------------"
                + "\nO - Game Objective"
                + "\nM - Move Instructions"
                + "\nC - Combat Instructions"
                + "\nE - Exit"
                + "\n----------------------------------");
    }
    
    @Override
    public boolean doAction(Object obj){
        String value = obj.toString();
        
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch(choice){
            case 'O': 
                this.displayGameObejective();
                break;
            case 'M': 
                this.displayMoveInstructions();
                break;    
            case 'C':
                this.displayCombatInstructions();
                break;
            case 'E':
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
    }
        return false;
    }
    private void displayGameObejective(){
        System.out.println("*** Display game objectives ***");

    }
    
    private void displayMoveInstructions(){
        System.out.println("*** Display how to move ***");
    }
    
    private void displayCombatInstructions(){
        System.out.println("*** Diplay Combat instructions ***");
    }
          
}