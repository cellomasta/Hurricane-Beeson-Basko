/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savetheciy.view;

import java.util.Scanner;

/**
 *
 * @author willnelson
 */
public class FightView extends View {
    
    public void displayFightVillain(){
        //Get name of villain the player is facing
        Object villainFighting = null;
        System.out.println("\n*Oh no! " + villainFighting+ " is trying to beat you up!*");
        
    }
        public FightView(){
            super("\n"
                + "\n--------------------------------------------"
                + "\n| You Are Being Attacked!                  |"
                + "\n| How many times are you going to hit back?|"
                + "\n--------------------------------------------"
                + "\n1 - Once"
                + "\n2 - Twice"
                + "\n3 - Thrice"
                + "\nE - Exit - Give up and call the coroner"
                + "\n--------------------------------------------");
        }
    
    @Override
    public boolean doAction(Object obj){
        String value = (String) obj;
        
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch(choice){
            case '1': 
                this.playerAttack(1);
                break;
            case '2': 
                this.playerAttack(2);
                break;    
            case '3':
                this.playerAttack(3);
                break;
            case 'E':
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
    }
   return false;
}

    private void playerAttack(int i) {
        System.out.println("Player attack number multiplied by attack strength, total subtracted from villain health.");
        System.out.println("If villain health is less than or equal to zero, villain is defeated.");
    }
    
}