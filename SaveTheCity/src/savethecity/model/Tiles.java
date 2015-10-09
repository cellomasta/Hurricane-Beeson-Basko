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
public class Tiles implements Serializable{
    
    //class instance variables
    private String heroName;
    private String villainName;
    private String itemTile;
    private String emptyTile;
    private String rescueTile;

    public Tiles() {
    }
    
    

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getVillainName() {
        return villainName;
    }

    public void setVillainName(String villainName) {
        this.villainName = villainName;
    }

    public String getItemTile() {
        return itemTile;
    }

    public void setItemTile(String itemTile) {
        this.itemTile = itemTile;
    }

    public String getEmptyTile() {
        return emptyTile;
    }

    public void setEmptyTile(String emptyTile) {
        this.emptyTile = emptyTile;
    }

    public String getRescueTile() {
        return rescueTile;
    }

    public void setRescueTile(String rescueTile) {
        this.rescueTile = rescueTile;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.heroName);
        hash = 71 * hash + Objects.hashCode(this.villainName);
        hash = 71 * hash + Objects.hashCode(this.itemTile);
        hash = 71 * hash + Objects.hashCode(this.emptyTile);
        hash = 71 * hash + Objects.hashCode(this.rescueTile);
        return hash;
    }

    @Override
    public String toString() {
        return "Tiles{" + "heroName=" + heroName + ", villainName=" + villainName + ", itemTile=" + itemTile + ", emptyTile=" + emptyTile + ", rescueTile=" + rescueTile + '}';
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tiles other = (Tiles) obj;
        if (!Objects.equals(this.heroName, other.heroName)) {
            return false;
        }
        if (!Objects.equals(this.villainName, other.villainName)) {
            return false;
        }
        if (!Objects.equals(this.itemTile, other.itemTile)) {
            return false;
        }
        if (!Objects.equals(this.emptyTile, other.emptyTile)) {
            return false;
        }
        if (!Objects.equals(this.rescueTile, other.rescueTile)) {
            return false;
        }
        return true;
    }

    
   
}
