package savethecity.model;

import java.io.Serializable;

import java.util.Objects;

/**
 *
 * @author CHRIS
 */
public class Players implements Serializable{
    
    private double rank;
    private double highScore;
    private String name;
    
    public Players() {
        
    }

    public double getRank() {
        return rank;
    }

    public void setRank(double rank) {
        this.rank = rank;
    }

    public double getHighScore() {
        return highScore;
    }

    public void setHighScore(double highScore) {
        this.highScore = highScore;
    }

    @Override
    public String toString() {
        return "Players{" + "rank=" + rank + ", highScore=" + highScore + "name=" + name + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.rank) ^ (Double.doubleToLongBits(this.rank) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.highScore) ^ (Double.doubleToLongBits(this.highScore) >>> 32));
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
        final Players other = (Players) obj;
        if (Double.doubleToLongBits(this.rank) != Double.doubleToLongBits(other.rank)) {
            return false;
        }
        if (Double.doubleToLongBits(this.highScore) != Double.doubleToLongBits(other.highScore)) {
            return false;
        }
        return true;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
