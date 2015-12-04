/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savethecity.control;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import savethecity.SaveTheCity;
import savethecity.model.Game;
import savethecity.model.InventoryItem;
import savethecity.model.Map;
import savethecity.model.Players;
import savethecity.model.Tiles;
import savethecity.model.Tiles.SceneType;
import savethecity.model.Scene;
import savethecity.exceptions.GameControlException;

/**
 *
 * @author Alicia
 */
public class GameControl {

    public static void getExisitingGame(String filepath)
        throws GameControlException{
            Game currentGame = null;

            try (FileInputStream fips = new FileInputStream(filepath)) {
                ObjectInputStream output = new ObjectInputStream(fips);

                currentGame = (Game) output.readObject(); //read the game object from file
            } catch (FileNotFoundException fnfe) {
                throw new GameControlException(fnfe.getMessage());
            } catch (Exception e) {
                throw new GameControlException(e.getMessage());
            }
        }

    protected final BufferedReader keyboard = SaveTheCity.getInFile();
    protected final PrintWriter console = SaveTheCity.getOutFile();

    public static void createNewGame(Players player) {

        Game game = new Game();//create new game
        SaveTheCity.setCurrentGame(game);//save in SaveTheCity

        game.setPlayer(player); //save player in the game

        //create inventory list and save in game
        InventoryItem[] inventoryList = createInventoryList();
        game.setInventory(inventoryList);

        Map map = MapControl.createMap(); //create new map
        game.setMap(map);

        //move actors to starting position
        MapControl.moveCharactersToStartingLocation(map);
    }

    private static InventoryItem[] createInventoryList() {
        //this.console.println("createInventoryList called in GameControl");
        return null;
    }

    /**
     *
     * @param map
     * @param scenes
     */
    public static void assignScenesToLocations(Map map, Scene[] scenes) {
        Tiles[][] locations = map.getLocations();

        //start point
        locations[0][0].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.empty.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.DemonHead.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.empty.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.Librarian.ordinal()]);
        locations[0][5].setScene(scenes[SceneType.empty.ordinal()]);
        locations[0][6].setScene(scenes[SceneType.empty.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.MisterFreeze.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.empty.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.Batman.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.empty.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.Blacksmith.ordinal()]);
        locations[1][5].setScene(scenes[SceneType.empty.ordinal()]);
        locations[1][6].setScene(scenes[SceneType.Mystique.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.empty.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.Cobbler.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.empty.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.GreenGoblin.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.empty.ordinal()]);
        locations[2][5].setScene(scenes[SceneType.empty.ordinal()]);
        locations[2][6].setScene(scenes[SceneType.WonderWoman.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.empty.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.empty.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.empty.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.Loki.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.empty.ordinal()]);
        locations[3][5].setScene(scenes[SceneType.Tailors.ordinal()]);
        locations[3][6].setScene(scenes[SceneType.empty.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.empty.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.DoctorOctopus.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.empty.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.empty.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.TaxCollector.ordinal()]);
        locations[4][5].setScene(scenes[SceneType.empty.ordinal()]);
        locations[4][6].setScene(scenes[SceneType.empty.ordinal()]);
        locations[5][0].setScene(scenes[SceneType.IronMan.ordinal()]);
        locations[5][1].setScene(scenes[SceneType.empty.ordinal()]);
        locations[5][2].setScene(scenes[SceneType.CaptainAmerica.ordinal()]);
        locations[5][3].setScene(scenes[SceneType.empty.ordinal()]);
        locations[5][4].setScene(scenes[SceneType.Baker.ordinal()]);
        locations[5][5].setScene(scenes[SceneType.empty.ordinal()]);
        locations[5][6].setScene(scenes[SceneType.empty.ordinal()]);
        locations[6][0].setScene(scenes[SceneType.Superman.ordinal()]);
        locations[6][1].setScene(scenes[SceneType.empty.ordinal()]);
        locations[6][2].setScene(scenes[SceneType.empty.ordinal()]);
        locations[6][3].setScene(scenes[SceneType.empty.ordinal()]);
        locations[6][4].setScene(scenes[SceneType.empty.ordinal()]);
        locations[6][5].setScene(scenes[SceneType.empty.ordinal()]);
        locations[6][6].setScene(scenes[SceneType.finish.ordinal()]);

    }

    public static InventoryItem[] getSortedInventoryList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void saveGame(Game currentGame, String filepath)
            throws GameControlException {

        try (FileOutputStream fops = new FileOutputStream(filepath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);

            output.writeObject(currentGame); //write the game object out to file
        } catch (IOException e) {
            throw new GameControlException(e.getMessage());
        }
    }
}
