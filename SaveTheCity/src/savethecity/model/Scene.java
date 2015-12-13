/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savethecity.model;

/**
 *
 * @author Alicia
 */
public class Scene {

    String description;
    String mapSymbol;
    boolean blocked;

    void setDescription(String string) {
        description = string;
    }

    void setMapSymbol(String string) {
        mapSymbol = string;
    }

    void setBlocked(boolean b) {
        blocked = b;
    }

}
