/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savethecity.control;

import savethecity.SaveTheCity;
import savethecity.model.Game;
import savethecity.model.InventoryItem;
import savethecity.model.Map;
import savethecity.model.Players;

/**
 *
 * @author Alicia
 */
public class GameControl {
    
    public static void createNewGame(Players player) {
        
        Game game = new Game();//create new game
        SaveTheCity.setCurrentGame(game);//save in SaveTheCity
        
        game.setPlayer(player); //save player in the game
        
        //create inventory list and save in game
        InventoryItem[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
        Map map = MapControl.createMap(); //create new map
        game.setMap(map);
        
                     
        //move actors to starting position
        MapControl.moveCharactersToStartingLocation(map);
    }
    
    private static InventoryItem[] createInventoryList() {
        System.out.println("createInventoryList called in GameControl");
        return null;
    }

    public static void assignScenesToLocations(Map map, Map.Scene[] scenes) {
        System.out.println("Assign scenes to location called");
    }
    
}
