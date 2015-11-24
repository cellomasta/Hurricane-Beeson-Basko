/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savethecity.control;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import java.util.ArrayList;
import savethecity.model.Villain;

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
    
    public ArrayList<Villain> addVillainHealth() {
        
        //create ArrayList with villainHealth
        Villain[] villain = new Villain[6];
        ArrayList<Villain> villainHealth = new ArrayList<>();
        
        //add objects to ArrayList
        villainHealth.add(new Villain("Mystique",20));
        villainHealth.add(new Villain("DoctorOctopus", 20));
        villainHealth.add(new Villain("MisterFreeze", 25));
        villainHealth.add(new Villain("GreenGoblin", 25));
        villainHealth.add(new Villain("Loki", 30));
        villainHealth.add(new Villain("DemonHead", 50));
        
        return villainHealth;
    }
    
    public void iterateVillainHealth(ArrayList<Villain> villainHealth){
        double average = 0;
        int sum = 0;
        for(Villain villain : villainHealth){
            sum += villain.villainHealth;
            average = sum / villain.length;
                      
        }
        System.out.println("Average Villain attack is " + average + ".");
    }
    
}
