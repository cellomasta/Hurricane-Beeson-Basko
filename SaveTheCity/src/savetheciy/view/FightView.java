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
public class FightView {
    
    public void displayFightVillain(){
        //Get name of villain the player is facing
        villainFighting = null;
        System.out.println("\n*Oh no! " +villainFighting+ " is trying to beat you up!*");
        
    }
    private final String FIGHTMENU = "\n"
                + "\n--------------------------------------------"
                + "\n| You Are Being Attacked!                  |"
                + "\n| How many times are you going to hit back?|"
                + "\n--------------------------------------------"
                + "\n1 - Once"
                + "\n2 - Twice"
                + "\n3 - Thrice"
                + "\nE - Exit - Give up and call the coroner"
                + "\n--------------------------------------------";
    
    public void fightDisplay(){
        char selection = ' ';
        do{
            System.out.println(FIGHTMENU); //display the fight options
            
            String input = this.getInput();
            selection = input.charAt(0);
            
            this.doAction(selection);
        } while (selection != 'E');
    }
    public void doAction(char choice){
        switch (choice){
            case '1': 
                this.playerAttack(1);
                break;
            case '2': 
                this.playerAttack(2);
                break;    
            case '3':
                this.playerAttack(3);
                break;
            case 'E':
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
    }
    
}

    private void playerAttack(int i) {
        System.out.println("Player attack number multiplied by attack strength, total subtracted from villain health.");
        System.out.println("If villain health is less than or equal to zero, villain is defeated.");
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
        return userInput;
    }
    
}