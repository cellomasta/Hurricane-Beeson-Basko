/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savethecity.control;

import static savethecity.control.GameControl.assignScenesToLocations;
import savethecity.model.Map;
import savethecity.model.Scene;

/**
 *
 * @author willnelson
 */
public class MapControl {
    
    public static Map createMap(){
        Map map = new Map(6,6);
        
        Scene[] scenes = createScenes();
        
        assignScenesToLocations(map, scenes);
        
        return map;
    }

    static void moveCharactersToStartingLocation(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static Scene[] createScenes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
