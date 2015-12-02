/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savetheciy.view;

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
        System.out.println("I need to ask a question here, and get your input.");

    }

    @Override
    public boolean doAction(Object obj) {
        Scanner keyboard = new Scanner(System.in);
        Tiles t = SaveTheCity.getCurrentGame().getMap().getCurrentLocation();
        try {
            t.getRiddle();
        } catch (RiddleControlException re) {
            System.out.println(re.getMessage());
            double userInput = keyboard.nextDouble();
            double riddleAnswer = t.getAnswer();
            return (userInput == riddleAnswer);
        }

        return true;

    }

}
