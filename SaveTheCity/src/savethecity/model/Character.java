package savethecity.model;

import java.awt.Point;
import java.io.Serializable;

import java.util.Objects;

/**
 *
 * @author CHRIS
 */
public enum Character implements Serializable{
    
    Batman("He is a rich boy who moonlights as a crimefighter."),
    Superman("He is a superhuman from the planet Krypton."),
    IronMan("He is proof that you can be cool with enough money."),
    CaptainAmerica("He is the result of a science experiment."),
    WonderWoman("She is wonderful."),
    Librarian("She was keeping the library in order when she was kidnapped."),
    Baker("He was making the bread when he was kidnapped."),
    Tailors("She was just starting on the day's work when she was kidnapped."),
    Cobbler("He was just starting on the day's work when he was kidnapped."),
    Blacksmith("He was just starting in on the day's labor when he was kidnapped."),
    TaxCollector("Was just starting his route to collect the taxes from the people when he was kidnapped."),
    Mystique("Came in claiming to be a shopper."),
    DoctorOctopus("Came in scaring all of the customers away."),
    MisterFreeze("He came in and froze everyone in the shop."),
    GreenGoblin("He came in scaring all of the patrons away."),
    Loki("He came in demanding everyone bow down to him which scared the patrons away."),
    DemonHead("AKA Raz al Ghul. His name makes the most skilled fighters quiver in their boots. He is not afraid of killing those that do not obey his word.");
    
    //private final double attackPower;
    //private final double hitPoints;
    private final String description;
    private final Point coordinates;


    
    Character(String description){
        //this.attackPower = attackPower;
        //this.hitPoints = hitPoints;
        this.description = description;
        coordinates = new Point (1,1);
    }

    

    //public double getAttackPower() {
      //  return attackPower;
    //}

    

    //public double getHitPoints() {
    //    return hitPoints;
    //}

    public String getDescription(){
        return description;
}
    public Point getCoordinates(){
        return coordinates;
}

    
    
    
    
    
    
}
