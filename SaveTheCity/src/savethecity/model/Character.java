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
 * @author CHRIS
 */
public class Character implements Serializable{
    
    private String name;
    private double attackPower;
    private double hitPoints;

    public Character() {
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(double attackPower) {
        this.attackPower = attackPower;
    }

    public double getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(double hitPoints) {
        this.hitPoints = hitPoints;
    }

    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", attackPower=" + attackPower + ", hitPoints=" + hitPoints + '}';
    }

    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.attackPower) ^ (Double.doubleToLongBits(this.attackPower) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.hitPoints) ^ (Double.doubleToLongBits(this.hitPoints) >>> 32));
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
        final Character other = (Character) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (Double.doubleToLongBits(this.attackPower) != Double.doubleToLongBits(other.attackPower)) {
            return false;
        }
        if (Double.doubleToLongBits(this.hitPoints) != Double.doubleToLongBits(other.hitPoints)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
}
