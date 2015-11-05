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
public class HelpMenuView {
   
    private final String HMENU = "\n"
                + "\n----------------------------------"
                + "\n| Help Menu                      |"
                + "\n----------------------------------"
                + "\nO - Game Objective"
                + "\nM - Move Instructions"
                + "\nC - Combat Instructions"
                + "\nE - Exit"
                + "\n----------------------------------";

    public void displayMenu() {
        
        char selection = ' ';
        do{
            System.out.println(HMENU); //display the menu
            
            String input = this.getInput();
            selection = input.charAt(0);
            
            this.doAction(selection);
        } while (selection != 'E');
    }
    public void doAction(char choice){
        switch (Character.toUpperCase(choice)){
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
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
    }
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
          
    public String getInput() {
        
        boolean valid = false; //indicates if the input has been retrieved
        String userInput = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input
        
        while(!valid) { //while a valid input has not been retrieved
            
            //prompt for user input
            System.out.println("Enter menu selection here:");
            
            //get the input from the keyboard
            userInput = keyboard.nextLine();
            userInput = userInput.trim(); //remove blank spaces
            
            //if the input is invalid (more than one character in length)
            if (userInput.length() > 1) {
                System.out.println("Invalid input - enter one character only");
                continue; //and repeat again
            }
            break; //out of the (exit) the repetition
        }
        return userInput; //return the input
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }  
    
}