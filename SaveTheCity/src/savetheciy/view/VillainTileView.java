/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savetheciy.view;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean doAction(Object obj) {
        boolean valid = false; //indicates if the input has been retrieved
        String strInput = null;
        try {
            strInput = this.keyboard.readLine();
        } catch (IOException ex) {
            Logger.getLogger(VillainTileView.class.getName()).log(Level.SEVERE, null, ex);
        }
        double dobInput = -1;
        try{
            dobInput = Double.parseDouble(keyboard.readLine());
        }catch(IOException ex){
            return false;
        }
        //NEEDS TO BE CHANGED TO ACCESS LOADED RIDDLE.
        double riddleAnswer = -1;
        //See if riddle answer is same as userInput.
        return dobInput == riddleAnswer;
    }

}
