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
public class LocationMenuView extends View {
   
    public LocationMenuView(){
        super("\n"
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
                + "\n----------------------------------");
    }
    @Override
    public boolean doAction(Object obj){
        String value = obj.toString();
        
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch(choice){
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
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try again");
                break;
    }
        return false;
}
    
    private void displaySearchForItemsHere(){
        this.console.println("*** Display menu of items you have ***");

    }
    
    private void displayViewInventory(){
        this.console.println("*** Display inventory ***");
    }
    
    private void displayViewHeroTeam(){
        this.console.println("*** Diplay Heros on your team ***");
    }
    
}