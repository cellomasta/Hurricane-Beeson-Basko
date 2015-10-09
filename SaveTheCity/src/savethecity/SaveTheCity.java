/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savethecity;

import savethecity.model.Character;

/**
 *
 * @author CHRIS
 */
public class SaveTheCity {

    public static void main(String[] args) {
        Character characterOne = new Character();
        
        characterOne.setName("Fred Flinstone");
        characterOne.setAttackPower(10);
        characterOne.setHitPoints(100);
        
        String characterInfo = characterOne.toString();
        System.out.println(characterInfo);
        
    }
    
}
