/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savethecity.control;

import java.util.Random;

/**
 *
 * @author Alicia
 */
public class RiddleController {
    //Randomly select from available functions
    //int which = (int)(Math.random() * 1);
    //switch(which){
    
    //Calculate Volume of User
    final int AVG_DENSITY = 1;
    final double GRAMS_PER_POUND = 453.6;
    final double CC_PER_CUBIC_FOOT = 28316.8;
    
    //Volume of Container
    final double INCH_TO_GALLON = 0.004329;
    
    public double userVolume(double userWeightInPounds, int AVG_DENSITY, double GRAMS_PER_POUND, double CC_PER_CUBIC_FOOT) {
        if (userWeightInPounds >= 0){
            double userMass = userWeightInPounds * GRAMS_PER_POUND;
            double userVolume = (userMass * AVG_DENSITY) / CC_PER_CUBIC_FOOT;
            return userVolume;
        }
        else{
            return -1;
        }
    }
    public double containerVolume(double containerLength, double containerWidth, double containerHeight, double INCH_TO_GALLON){
        double volumeOfBox = containerLength * containerWidth * containerHeight;
        if (volumeOfBox > 0){
            double gallonCapacity = volumeOfBox * INCH_TO_GALLON;
            return gallonCapacity;
        }
        else{
            return -1;
        }
    }
    
}
