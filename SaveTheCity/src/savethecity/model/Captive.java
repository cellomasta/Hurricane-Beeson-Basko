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
 * @author Alicia
 */
public class Captive implements Serializable{
    private String character;
    private String tile;
    
    public Captive(){
}

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getTile() {
        return tile;
    }

    public void setTile(String tile) {
        this.tile = tile;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.character);
        hash = 17 * hash + Objects.hashCode(this.tile);
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
        final Captive other = (Captive) obj;
        if (!Objects.equals(this.character, other.character)) {
            return false;
        }
        if (!Objects.equals(this.tile, other.tile)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Captive{" + "character=" + character + ", tile=" + tile + '}';
    }
    
}