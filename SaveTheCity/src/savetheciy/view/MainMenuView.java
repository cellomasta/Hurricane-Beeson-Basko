/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savetheciy.view;

import java.util.Scanner;

/**
 *
 * @author willnelson
 */
public class MainMenuView {
    
    private final String MENU = "\n"
                + "\n----------------------------------"
                + "\n| Main Menu                      |"
                + "\n----------------------------------"
                + "\nG - Start game"
                + "\nH - Help"
                + "\nS - Save game"
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

    private String getInput() {
        
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
            }else{
                switch(userInput){
                    case "g","G","h","H","s","S","e","E" : userInput = ;//not sure what to put here
                        break;
                    default: System.out.println("Invalid menu selection.");
                }
            }
            break; //out of the (exit) the repetition
        }
        return userInput; //return the input
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
    
}
