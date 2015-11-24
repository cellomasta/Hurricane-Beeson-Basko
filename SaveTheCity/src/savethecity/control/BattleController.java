/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savethecity.control;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

/**
 *
 * @author Alicia
 */
public class BattleController {
    public Boolean heroAttack(double heroDamage, double numberOfAttacks, double villainHealth){
        	
        double villainHealthEnd = villainHealth - heroDamage * numberOfAttacks;
        
        if (villainHealthEnd < 0 || villainHealthEnd == 0){
	return TRUE;
    }
        else	
	return FALSE;
        
    }
    
    public ArrayList<Item> addVillainHealth() {
        
        //create ArrayList with villainHealth
        ArrayList<Item> villainHealthList = new ArrayList<>();
        
        //add objects to ArrayList
        Item mystique = new Item("Mystique", 20);
        villainHealthList.add(mystique);
        villainHealthList.add(new Item("DoctorOctopus", 20));
        villainHealthList.add(new Item("MisterFreeze", 25));
        villainHealthList.add(new Item("GreenGoblin", 25));
        villainHealthList.add(new Item("Loki", 30));
        villainHealthList.add(new Item("DemonHead", 50));
        
        return villainHealthList;
    }
}
