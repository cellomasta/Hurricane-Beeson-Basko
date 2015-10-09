/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savethecity.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author willnelson
 */
public class Map implements Serializable{
    
    //class instance variables
    private double rowTile;
    private double columnTile;
    private String heroName;

    public Map() {
    }
    
    

    public double getRowTile() {
        return rowTile;
    }

    public void setRowTile(double rowTile) {
        this.rowTile = rowTile;
    }

    public double getColumnTile() {
        return columnTile;
    }

    public void setColumnTile(double columnTile) {
        this.columnTile = columnTile;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.rowTile) ^ (Double.doubleToLongBits(this.rowTile) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.columnTile) ^ (Double.doubleToLongBits(this.columnTile) >>> 32));
        hash = 37 * hash + Objects.hashCode(this.heroName);
        return hash;
    }

    @Override
    public String toString() {
        return "Map{" + "rowTile=" + rowTile + ", columnTile=" + columnTile + ", heroName=" + heroName + '}';
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (Double.doubleToLongBits(this.rowTile) != Double.doubleToLongBits(other.rowTile)) {
            return false;
        }
        if (Double.doubleToLongBits(this.columnTile) != Double.doubleToLongBits(other.columnTile)) {
            return false;
        }
        if (!Objects.equals(this.heroName, other.heroName)) {
            return false;
        }
        return true;
    }
    
    
}
