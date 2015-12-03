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
import savethecity.exceptions.RiddleControlException;
import savethecity.model.Tiles;

/**
 * This class displays to the user when they land on a SuperheroTile, which will
 * initiate a Riddle that must be solved to unlock a superhero.
 *
 * @author willnelson
 */
public class SuperheroTileView extends View {

    protected final BufferedReader keyboard = SaveTheCity.getInFile();
    protected final PrintWriter console = SaveTheCity.getOutFile();

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
    public void getRiddle(Tiles[][] locations) {

        //String locations.setRiddle();
        this.console.println("I need to ask a question here, and get your input.");

    }

    @Override
    public boolean doAction(Object obj) {
        boolean valid = false; //indicates if the input has been retrieved
        String userInput = null;
        userInput = this.keyboard.readLine();

        Tiles t = SaveTheCity.getCurrentGame().getMap().getCurrentLocation();
        try {
            t.getRiddle();
        } catch (RiddleControlException re) {
            this.console.println(re.getMessage());
            double userInput = keyboard.readDouble();
            double riddleAnswer = t.getAnswer();
            return (userInput == riddleAnswer);
        }

        return true;

    }

}
