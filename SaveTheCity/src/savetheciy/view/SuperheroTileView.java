/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savetheciy.view;

import java.util.Scanner;
import savethecity.control.RiddleController;
import savethecity.model.Map;

/**
 * This class displays to the user when they land on a SuperheroTile, which
 * will initiate a Riddle that must be solved to unlock a superhero.
 * 
 * @author willnelson
 */
public class SuperheroTileView extends View {

    public SuperheroTileView(String promptMessage) {
        super("\n"
                + "\n------------------------------"
                + "\nYou have just stumbled upon a"
                + "\nsuperhero. They are willing to"
                + "\nhelp you on your quest, if you"
                + "\ncan answer the question below:"
                + "\n------------------------------");
    }
    
    //Call the riddleController to load a riddle.
    public void getRiddle (){
        
        System.out.println("I need to ask a question here, and get your input.");
        
    }
            
    @Override
    public boolean doAction(Object obj) {
        Scanner keyboard = new Scanner(System.in);
        double userInput = keyboard.nextDouble();
        //NEEDS TO BE CHANGED TO ACCESS LOADED RIDDLE.
        double riddleAnswer = -1;
        
        //See if riddle answer is same as userInput.
        if (userInput == riddleAnswer){
            return true;
        }else{
            return false;
        }
    }
    
}
