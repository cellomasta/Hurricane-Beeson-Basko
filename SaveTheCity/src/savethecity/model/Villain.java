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
public class Villain implements Serializable{
    private Character character;
    private Tiles tile;
    public String name;
    public int villainHealth;
    public int length;
    
    public Villain(){
    }

    public Villain(String mystique, int i) {
        throw new UnsupportedOperationException("Not supported yet. In villain"); //To change body of generated methods, choose Tools | Templates.
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public Tiles getTile() {
        return tile;
    }

    public void setTile(Tiles tile) {
        this.tile = tile;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.character);
        hash = 97 * hash + Objects.hashCode(this.tile);
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
        final Villain other = (Villain) obj;
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
        return "Villain{" + "character=" + character + ", tile=" + tile + '}';
    }
}