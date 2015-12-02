/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savethecity.model;

import java.io.Serializable;
import java.util.Objects;
import javax.tools.DocumentationTool;
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
    private int rowTile;
    private int columnTile;
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
    
    public Tiles getCurrentLocation(){
        return locations[rowTile][columnTile];
    }
    
    //private Map[] map;

    public Map() {
    }

    public void displayMap() {
        System.out.println("   1 2 3 4 5 6");
        System.out.println("--------------");
        for(int r = 0; r < locations.length; r++) {
            System.out.print(r+1);
            System.out.print(" |");
            for(int c = 0; c < locations[r].length; c++) {
                locations[r][c].displayTile(); 
                if(c < locations[r].length - 1)
                    System.out.print('|');
            }
            if(r < locations.length - 1)
                System.out.print("\n--------------");
            System.out.println();
        }
        
    }
    
    public Map(int rowTile, int columnTile) {
        
        if (rowTile < 1 || columnTile < 1) {
            System.out.println("The number of rows/columns must be > 0.");
            return;
        }
        this.rowTile = rowTile;
        this.columnTile = columnTile;
        
        //create 2D array for location objects
        this.locations = new Tiles[rowTile][columnTile];
        
        for (int row = 0; row < rowTile; row++){
            for(int column = 0; column < columnTile; column++){
                Tiles location = new Tiles();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);
                
                locations[row][column] = location;
            }
    }
    }
    
    

    public double getRowTile() {
        return rowTile;
    }

    public void setRowTile(int rowTile) {
        this.rowTile = rowTile;
    }

    public double getColumnTile() {
        return columnTile;
    }

    public void setColumnTile(int columnTile) {
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

    public Tiles[][] getLocations() {
        return locations;
    }
    public void setLocations(Tiles[][] tLocations){
        locations = tLocations;
    }
}
