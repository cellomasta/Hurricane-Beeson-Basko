/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savetheciy.view;

import savethecity.SaveTheCity;
import savethecity.control.GameControl;

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
        GameControl.createNewGame(SaveTheCity.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }
    
    
    
    private void startExistingGame(){
        this.console.println("*** startExistingGame function called ***");
    }
    
    private void saveGame(){
        this.console.println("*** saveGame function called ***");
    }
    
    private void displayHelpMenu(){
        //        this.console.println("*** display help menu ***");

        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
}
