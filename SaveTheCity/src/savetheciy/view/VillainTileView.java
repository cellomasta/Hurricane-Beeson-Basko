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
public class VillainTileView extends View {
    
    public VillainTileView(String promptMessage) {
        super("\n"
                + "\n------------------------------"
                + "\nYou have just stumbled upon a"
                + "\nvillain. It is gaurding a towns"
                + "\nperson that needs to be resuced."
                + "\nAnswer the question below to free them:"
                + "\n------------------------------");
    }
    
    //Call the riddleController to load a riddle.
    public void getRiddle (){
        System.out.println("Ask a question and get the user input.");
        
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

