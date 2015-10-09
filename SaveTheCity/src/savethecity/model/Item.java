package savethecity.model;

import java.io.Serializable;

import java.util.Objects;

/**
 *
 * @author CHRIS
 */
public class Item implements Serializable{
    
    private double itemPoints;
    
    public Item() {
    }

    public double getItemPoints() {
        return itemPoints;
    }

    public void setItemPoints(double itemPoints) {
        this.itemPoints = itemPoints;
    }

    
    @Override
    public String toString() {
        return "Item{" + "itemPoints=" + itemPoints + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.itemPoints) ^ (Double.doubleToLongBits(this.itemPoints) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (Double.doubleToLongBits(this.itemPoints) != Double.doubleToLongBits(other.itemPoints)) {
            return false;
        }
        return true;
    }

    
}