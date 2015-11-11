/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savetheciy.view;

import java.util.Scanner;
import savethecity.control.ProgramControl;
import savethecity.model.Players;

/**
 *
 * @author willnelson
 */
public class StartProgramView {
    
    public StartProgramView(){
        
    }
    public void startProgram(){
        //BEGIN
        //Display the banner screen
        this.displayBanner();
        //Get the players name
        String playersName = this.getPlayersName();
        //Create a new player
        Players player = ProgramControl.createPlayer(playersName);
        //DISPLAY a customized welcome message
        this.displayWelcomeMessage(player);
        //DISPLAY the main menu
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
        //END 
        
}

    private void displayBanner() {
        System.out.println("\n\n*****************************************************");
        System.out.println("*"
                + "\n* Welcome to Save the City.  In this game you will attempt to *"
                + "\n* save the townspeople from an invasion of villains.          *");
        System.out.println("*"
                + "\n* If you are rescue the townspeople in time, you will be able *"
                + "\n* to defeat the villains that are holding the city hostage.   *"
                + "\n* Afterwards, raindrops and unicorn tears will fall from the  *"
                + "\n* sky and your life will be complete.                         *");
        System.out.println("*"
                + "\n* Good luck.                                                  *");
        System.out.println("********************************************************");
    }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    private String getPlayersName() {
        boolean valid = false; //indicates if the name has been retrieved
        String playersName = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input
        
        while(!valid) { //while a valid name has not been retrieved
            
            //prompt for player's name
            System.out.println("Enter the player's name below:");
            
            //get the name from the keyboard
            playersName = keyboard.nextLine();
            playersName = playersName.trim();
            
            //if the name is invalid (less than two character in length)
            if (playersName.length() < 2) {
                System.out.println("Invalid name - the name must not be blank");
                continue; //and repeat again
            }
            break; //out of the (exit) the repetition
        }
        return playersName; //return the name
    }

    private void displayWelcomeMessage(Players player) {
        System.out.println("\n\n==============================");
        System.out.println("\tWelcome to the game " + player.getName());
        System.out.println("\tGood luck! You're going to need it.");
        System.out.println("==================================");
        }
    }
