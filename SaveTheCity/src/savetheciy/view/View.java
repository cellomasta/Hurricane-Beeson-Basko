/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savetheciy.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import savethecity.SaveTheCity;

/**
 * This is a SuperClass for the view classes
 * @author Alicia
 */
public abstract class View implements ViewInterface {
  
    private String promptMessage;
    
    protected final BufferedReader keyboard = SaveTheCity.getInFile();
    protected final PrintWriter console = SaveTheCity.getOutFile();
    
    public View(String promptMessage){
        this.promptMessage = promptMessage;
    }
    
    @Override
    public void display() {
        String value = "";
        boolean done = false;
        
        do{
            this.console.println(this.promptMessage); //print message
            value = this.getInput(); //get the user selection
            done = this.doAction(value); //do action based on selection
        }
        while (!done);
    }
        
        /* TEAM DISPLAY FUNCTION
        char selection = ' ';
        do{
            this.console.println(this.promptMessage); //display the menu
            
            String input = this.getInput();
            selection = input.charAt(0);
            
            this.doAction(selection);
        } while (selection != 'E');
        */
    
    
    @Override
    public String getInput() {
        
        boolean valid = false; //indicates if the input has been retrieved
        String userInput = null;
        
        while(!valid) { //while a valid input has not been retrieved
            
            //prompt for user input
            this.console.println("Enter menu selection here:");
            
            //get the input from the keyboard
            userInput = this.keyboard.readLine();
            userInput = userInput.trim(); //remove blank spaces
            
            //if the input is invalid (more than one character in length)
            if (userInput.length() > 1) {
                this.console.println("Invalid input - enter one character only");
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
