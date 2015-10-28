/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savethecity.control;

import savethecity.SaveTheCity;
import savethecity.model.Players;

/**
 *
 * @author willnelson
 */
public class ProgramControl {

    public static Players createPlayer(String name) {
        if (name == null) {
            return null;
        }
        Players player = new Players();
        player.setName(name);
        
        SaveTheCity.setPlayer(player); //save the player
        
        return player;
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
