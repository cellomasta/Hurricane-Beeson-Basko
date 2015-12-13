/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savethecity.model;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.Serializable;
import savethecity.SaveTheCity;
import savethecity.control.GameControl;
import savethecity.model.Tiles.SceneType;
import savethecity.model.Scene;

/**
 *
 * @author willnelson
 */
public class Map implements Serializable {

    protected final BufferedReader keyboard = SaveTheCity.getInFile();
    protected final PrintWriter console = SaveTheCity.getOutFile();

    public static Scene[] createScenes() {
        Scene[] scenes = new Scene[SceneType.values().length];

        scenes[SceneType.Baker.ordinal()] = new Scene();
        scenes[SceneType.Baker.ordinal()].setBlocked(true);
        scenes[SceneType.Baker.ordinal()].setDescription("");
        scenes[SceneType.Baker.ordinal()].setMapSymbol("");

        scenes[SceneType.Batman.ordinal()] = new Scene();
        scenes[SceneType.Batman.ordinal()].setBlocked(true);
        scenes[SceneType.Batman.ordinal()].setDescription("");
        scenes[SceneType.Batman.ordinal()].setMapSymbol("");

        scenes[SceneType.Blacksmith.ordinal()] = new Scene();
        scenes[SceneType.Blacksmith.ordinal()].setBlocked(true);
        scenes[SceneType.Blacksmith.ordinal()].setDescription("");
        scenes[SceneType.Blacksmith.ordinal()].setMapSymbol("");

        scenes[SceneType.CaptainAmerica.ordinal()] = new Scene();
        scenes[SceneType.CaptainAmerica.ordinal()].setBlocked(true);
        scenes[SceneType.CaptainAmerica.ordinal()].setDescription("");
        scenes[SceneType.CaptainAmerica.ordinal()].setMapSymbol("");

        scenes[SceneType.Cobbler.ordinal()] = new Scene();
        scenes[SceneType.Cobbler.ordinal()].setBlocked(true);
        scenes[SceneType.Cobbler.ordinal()].setDescription("");
        scenes[SceneType.Cobbler.ordinal()].setMapSymbol("");

        scenes[SceneType.DemonHead.ordinal()] = new Scene();
        scenes[SceneType.DemonHead.ordinal()].setBlocked(true);
        scenes[SceneType.DemonHead.ordinal()].setDescription("");
        scenes[SceneType.DemonHead.ordinal()].setMapSymbol("");

        scenes[SceneType.DoctorOctopus.ordinal()] = new Scene();
        scenes[SceneType.DoctorOctopus.ordinal()].setBlocked(true);
        scenes[SceneType.DoctorOctopus.ordinal()].setDescription("");
        scenes[SceneType.DoctorOctopus.ordinal()].setMapSymbol("");

        scenes[SceneType.GreenGoblin.ordinal()] = new Scene();
        scenes[SceneType.GreenGoblin.ordinal()].setBlocked(true);
        scenes[SceneType.GreenGoblin.ordinal()].setDescription("");
        scenes[SceneType.GreenGoblin.ordinal()].setMapSymbol("");

        scenes[SceneType.IronMan.ordinal()] = new Scene();
        scenes[SceneType.IronMan.ordinal()].setBlocked(true);
        scenes[SceneType.IronMan.ordinal()].setDescription("");
        scenes[SceneType.IronMan.ordinal()].setMapSymbol("");

        scenes[SceneType.Librarian.ordinal()] = new Scene();
        scenes[SceneType.Librarian.ordinal()].setBlocked(true);
        scenes[SceneType.Librarian.ordinal()].setDescription("");
        scenes[SceneType.Librarian.ordinal()].setMapSymbol("");

        scenes[SceneType.Loki.ordinal()] = new Scene();
        scenes[SceneType.Loki.ordinal()].setBlocked(true);
        scenes[SceneType.Loki.ordinal()].setDescription("");
        scenes[SceneType.Loki.ordinal()].setMapSymbol("");

        scenes[SceneType.MisterFreeze.ordinal()] = new Scene();
        scenes[SceneType.MisterFreeze.ordinal()].setBlocked(true);
        scenes[SceneType.MisterFreeze.ordinal()].setDescription("");
        scenes[SceneType.MisterFreeze.ordinal()].setMapSymbol("");

        scenes[SceneType.Mystique.ordinal()] = new Scene();
        scenes[SceneType.Mystique.ordinal()].setBlocked(true);
        scenes[SceneType.Mystique.ordinal()].setDescription("");
        scenes[SceneType.Mystique.ordinal()].setMapSymbol("");

        scenes[SceneType.Superman.ordinal()] = new Scene();
        scenes[SceneType.Superman.ordinal()].setBlocked(true);
        scenes[SceneType.Superman.ordinal()].setDescription("");
        scenes[SceneType.Superman.ordinal()].setMapSymbol("");

        scenes[SceneType.Tailors.ordinal()] = new Scene();
        scenes[SceneType.Tailors.ordinal()].setBlocked(true);
        scenes[SceneType.Tailors.ordinal()].setDescription("");
        scenes[SceneType.Tailors.ordinal()].setMapSymbol("");

        scenes[SceneType.TaxCollector.ordinal()] = new Scene();
        scenes[SceneType.TaxCollector.ordinal()].setBlocked(true);
        scenes[SceneType.TaxCollector.ordinal()].setDescription("");
        scenes[SceneType.TaxCollector.ordinal()].setMapSymbol("");

        scenes[SceneType.WonderWoman.ordinal()] = new Scene();
        scenes[SceneType.WonderWoman.ordinal()].setBlocked(true);
        scenes[SceneType.WonderWoman.ordinal()].setDescription("");
        scenes[SceneType.WonderWoman.ordinal()].setMapSymbol("");

        scenes[SceneType.empty.ordinal()] = new Scene();
        scenes[SceneType.empty.ordinal()].setBlocked(true);
        scenes[SceneType.empty.ordinal()].setDescription("");
        scenes[SceneType.empty.ordinal()].setMapSymbol("");

        scenes[SceneType.finish.ordinal()] = new Scene();
        scenes[SceneType.finish.ordinal()].setBlocked(true);
        scenes[SceneType.finish.ordinal()].setDescription("");
        scenes[SceneType.finish.ordinal()].setMapSymbol("");

        scenes[SceneType.start.ordinal()] = new Scene();
        scenes[SceneType.start.ordinal()].setBlocked(true);
        scenes[SceneType.start.ordinal()].setDescription("");
        scenes[SceneType.start.ordinal()].setMapSymbol("");

        return scenes;
    }

    //class instance variables
    private int rowTile;
    private int columnTile;
    private Tiles[][] locations;

    private static Map createMap() {
        //create the map
        Map map = new Map(6, 6);

        //create scenes for map
        Scene[] scenes = createScenes();

        //assign scenes to locations
        GameControl.assignScenesToLocations(map, scenes);

        return map;
    }

    public Tiles getCurrentLocation() {
        return locations[rowTile][columnTile];
    }

    //private Map[] map;
    public Map() {
    }

    public void displayMap() {
        this.console.println("   1 2 3 4 5 6");
        this.console.println("--------------");
        for (int r = 0; r < locations.length; r++) {
            this.console.print(r + 1);
            this.console.print(" |");
            for (int c = 0; c < locations[r].length; c++) {
                locations[r][c].displayTile();
                if (c < locations[r].length - 1) {
                    this.console.print('|');
                }
            }
            if (r < locations.length - 1) {
                this.console.print("\n--------------");
            }
            this.console.println();
        }

    }

    public Map(int rowTile, int columnTile) {

        if (rowTile < 1 || columnTile < 1) {
            this.console.println("The number of rows/columns must be > 0.");
            return;
        }
        this.rowTile = rowTile;
        this.columnTile = columnTile;

        //create 2D array for location objects
        this.locations = new Tiles[rowTile][columnTile];

        for (int row = 0; row < rowTile; row++) {
            for (int column = 0; column < columnTile; column++) {
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

    public void setLocations(Tiles[][] tLocations) {
        locations = tLocations;
    }
}
