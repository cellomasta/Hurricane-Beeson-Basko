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
    public void getRiddle() {
        this.console.println("Ask a question and get the user input.");

    }

    @Override
    public boolean doAction(Object obj) {
        boolean valid = false; //indicates if the input has been retrieved
        String userInput = null;
        userInput = this.keyboard.readLine();

        double userInput = keyboard.readDouble();
        //NEEDS TO BE CHANGED TO ACCESS LOADED RIDDLE.
        double riddleAnswer = -1;
        //See if riddle answer is same as userInput.
        if (userInput == riddleAnswer) {
            return true;
        } else {
            return false;
        }
    }

}
