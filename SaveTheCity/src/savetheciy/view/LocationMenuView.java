/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savetheciy.view;

import java.util.Scanner;
import savethecity.SaveTheCity;
import savethecity.control.GameControl;
import savethecity.control.MovementController;

/**
 *
 * @author Alicia
 */
public class LocationMenuView {
   
    private final String MENU = "\n"
                + "\n----------------------------------"
                + "\n| Location Menu                      |"
                + "\n----------------------------------"
                + "\nN - Move North"
                + "\nR - Move East"
                + "\nS - Move South"
                + "\nW - Move West"
                + "\nI - Search for items here"
                + "\nV - View Inventory"
                + "\nH - View Hero Team"
                + "\nE - Exit"
                + "\n----------------------------------";

    public void displayMenu() {
        
        char selection = ' ';
        do{
            System.out.println(MENU); //display the menu
            
            String input = this.getInput();
            selection = input.charAt(0);
            
            this.doAction(selection);
        } while (selection != 'E');
    }
    public void doAction(char choice){
        switch (Character.toUpperCase(choice)){
            case 'N': 
                MovementController.MoveNorth();
                break;
            case 'R': 
                MovementController.MoveEast();
                break;    
            case 'S':
                MovementController.MoveSouth();
                break;
            case 'W': 
                MovementController.MoveWest();
                break;
            case 'I': 
                this.displaySearchForItemsHere();
                break;
            case 'V':
                this.displayViewInventory();
                break;
            case 'H':
                this.displayViewHeroTeam();
                break;
            case 'E':
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
    }
}
    
    private void displaySearchForItemsHere(){
        System.out.println("*** Display menu of items you have ***");

    }
    
    private void displayViewInventory(){
        System.out.println("*** Display inventory ***");
    }
    
    private void displayViewHeroTeam(){
        System.out.println("*** Diplay Heros on your team ***");
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