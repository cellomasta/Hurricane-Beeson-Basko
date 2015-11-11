/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savetheciy.view;

import java.util.Scanner;

/**
 *
 * @author Alicia
 */
public abstract class View implements ViewInterface {
  
    private String promptMessage;
    
    public View(String promptMessage){
        this.promptMessage = promptMessage;
    }
    
    @Override
    public void display() {
        
        char selection = ' ';
        do{
            System.out.println(this.promptMessage); //display the menu
            
            String input = this.getInput();
            selection = input.charAt(0);
            
            this.doAction(selection);
        } while (selection != 'E');
    }
    
    @Override
    public String getInput() {
        
        Scanner keyboard = new Scanner(System.in); //keyboard input
        boolean valid = false; //indicates if the input has been retrieved
        String userInput = null;
        
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
        return userInput;
    }
    
    public String getPromptMessage(){
        return promptMessage;
    }
    
    public void setPromptMessage(String message){
        this.promptMessage = message;
    }
}
