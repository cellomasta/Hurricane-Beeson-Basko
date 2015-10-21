/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savethecity.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alicia
 */
public class BattleControlerTest {
    
    public BattleControlerTest() {
    }

    /**
     * Test of heroAttack method, of class BattleControler.
     */
    @Test
    public void testHeroAttack() {
        System.out.println("HeroAttack");
        
        System.out.println("\tTest 1");
        double heroDamage = 15.0;
        double numberOfAttacks = 1.0;
        double villainHealth = 14.0;
        BattleControler instance = new BattleControler();
        Boolean expResult = true;
        Boolean result = instance.heroAttack(heroDamage, numberOfAttacks, villainHealth);
        assertEquals(expResult, result);
    }
    @Test
    public void testHeroAttack2() {
        
        System.out.println("\tTest 2");
        double heroDamage = 15.0;
        double numberOfAttacks = 1.0;
        double villainHealth = 14.0;
        BattleControler instance = new BattleControler();
        Boolean expResult = true;
        Boolean result = instance.heroAttack(heroDamage, numberOfAttacks, villainHealth);
        assertEquals(expResult, result);
    }
    @Test
    public void testHeroAttack3() {
        
        System.out.println("\tTest 3");
        double heroDamage = 15.0;
        double numberOfAttacks = 1.0;
        double villainHealth = 100.0;
        BattleControler instance = new BattleControler();
        Boolean expResult = false;
        Boolean result = instance.heroAttack(heroDamage, numberOfAttacks, villainHealth);
        assertEquals(expResult, result);
    }
    @Test
    public void testHeroAttack4() {        
        System.out.println("\tTest 4");
        double heroDamage = 15.0;
        double numberOfAttacks = 1.0;
        double villainHealth = 0.0;
        BattleControler instance = new BattleControler();
        Boolean expResult = true;
        Boolean result = instance.heroAttack(heroDamage, numberOfAttacks, villainHealth);
        assertEquals(expResult, result);
    }
    @Test
    public void testHeroAttack5() {   
        System.out.println("\tTest 5");
        double heroDamage = -15.0;
        double numberOfAttacks = 1.0;
        double villainHealth = 15.0;
        BattleControler instance = new BattleControler();
        Boolean expResult = false;
        Boolean result = instance.heroAttack(heroDamage, numberOfAttacks, villainHealth);
        assertEquals(expResult, result);
    }
    @Test
    public void testHeroAttack6() {
        System.out.println("\tTest 6");
        double heroDamage = 15.0;
        double numberOfAttacks = 1.0;
        double villainHealth = -15.0;
        BattleControler instance = new BattleControler();
        Boolean expResult = true;
        Boolean result = instance.heroAttack(heroDamage, numberOfAttacks, villainHealth);
        assertEquals(expResult, result);
        
    }
    
}
