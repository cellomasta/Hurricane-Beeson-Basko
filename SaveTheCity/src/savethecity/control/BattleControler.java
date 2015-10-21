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
public class BattleControler {
    public Boolean heroAttack(double heroDamage, double numberOfAttacks, double villainHealth){
        	
        double villainHealthEnd = villainHealth - heroDamage * numberOfAttacks;
        
        if (villainHealthEnd < 0 || villainHealthEnd == 0){
	return TRUE;
    }
        else	
	return FALSE;
        
    }
}
