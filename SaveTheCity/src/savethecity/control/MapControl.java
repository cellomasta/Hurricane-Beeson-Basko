/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savethecity.control;

import java.awt.Point;
import savethecity.SaveTheCity;
import static savethecity.control.GameControl.assignScenesToLocations;
import savethecity.exceptions.MapControlException;
import savethecity.model.Map;
import savethecity.model.Scene;
import savethecity.model.Character;

/**
 *
 * @author willnelson
 */
public class MapControl {

    public static Map createMap() {
        Map map = new Map(7, 7);

        Scene[] scenes = createScenes();

        assignScenesToLocations(map, scenes);

        return map;
    }

    public static void moveCharactersToStartingLocation(Map map) throws MapControlException {
        Character[] characters = Character.values();

        for (Character character : characters) {
            Point coordinates = character.getCoordinates();
            MapControl.moveCharacterToLocation(character, coordinates);

        }

    }

    private static Scene[] createScenes() {
        return SaveTheCity.getCurrentGame().getMap().createScenes();
    }

    public static void moveCharacterToLocation(Character character, Point coordinates) throws MapControlException {
        Map map = SaveTheCity.getCurrentGame().getMap();
        int newRow = coordinates.x - 1;
        int newColumn = coordinates.y - 1;

        if (newRow < 0 || newRow >= map.getRowTile() || newColumn < 0 || newColumn >= map.getColumnTile()) {
            throw new MapControlException("Cannot move character to location " + coordinates.x + ", "
                    + coordinates.y + ", that location is outside of the map boundary.");
        }
    }

}
