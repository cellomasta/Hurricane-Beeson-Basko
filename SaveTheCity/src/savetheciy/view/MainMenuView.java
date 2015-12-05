/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savetheciy.view;

import java.util.logging.Level;
import java.util.logging.Logger;
import savethecity.SaveTheCity;
import savethecity.control.GameControl;
import savethecity.exceptions.MapControlException;

/**
 *
 * @author willnelson
 */
public class MainMenuView extends View {
    
    public MainMenuView(){
        super("\n"
                + "\n----------------------------------"
                + "\n| Main Menu                      |"
                + "\n----------------------------------"
                + "\nN - Start New game"
                + "\nP - Start existing game"
                + "\nH - Help"
                + "\nS - Save game"
                + "\nE - Exit"
                + "\n----------------------------------");
    }
    @Override
    public boolean doAction(Object obj){
        String value = obj.toString();
        
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch(choice){
            case 'N': 
                this.startNewGame();
                break;
            case 'P': 
                this.startExistingGame();
                break;    
            case 'H':
                this.displayHelpMenu();
                break;
            case 'S':
                this.saveGame();
                break;
            case 'E':
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try again");
                break;
    }
        return false;
}
    
    private void startNewGame(){
        try {
            GameControl.createNewGame(SaveTheCity.getPlayer());
            
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.displayMenu();
        } catch (MapControlException ex) {
            Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    private void startExistingGame(){

        //protmt for and get the name of the file to save the game in 
        this.console.println("\n\nEnter the file path for file where the game" + "is to be save.");
        
        String filePath = this.getInput();
        
        try {
            //start a saved game
            GameControl.getExisitingGame(filePath);
        }catch (Exception ex){
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
        
    }
    
    private void saveGame(){
        this.console.println("Enter the file path for the file where the game" + "is to be saved.");
        String filePath = this.getInput();
        
        try{
            //save the game to the specified file
            GameControl.saveGame(SaveTheCity.getCurrentGame(), filePath);
        }catch (Exception ex){
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }
    
    private void displayHelpMenu(){

        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
}
