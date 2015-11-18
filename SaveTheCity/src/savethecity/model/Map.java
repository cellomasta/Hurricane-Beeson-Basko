/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savethecity.model;

import java.io.Serializable;
import java.util.Objects;
import savethecity.control.GameControl;
/**
 *
 * @author willnelson
 */
public class Map implements Serializable{

    private static Scene[] createScenes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //class instance variables
    private double rowTile;
    private double columnTile;
    private Tiles[][] locations;
    
    private static Map createMap(){
        //create the map
        Map map = new Map (6, 6);
        
        //create scenes for map
        Scene[] scenes = createScenes();
        
        //assign scenes to locations
        GameControl.assignScenesToLocations(map, scenes);
        
        return map;
    }
    
    
    //private Map[] map;

    public Map() {
    }

    private Map(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.rowTile) ^ (Double.doubleToLongBits(this.rowTile) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.columnTile) ^ (Double.doubleToLongBits(this.columnTile) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Map{" + "rowTile=" + rowTile + ", columnTile=" + columnTile + '}';
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
        
        return true;
    }

    private static class Scene {

        public Scene() {
        }
    }
    
    
}
