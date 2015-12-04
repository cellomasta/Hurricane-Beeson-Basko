/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savethecity.control;

import savethecity.model.InventoryItem;
import java.util.ArrayList;
import savethecity.exceptions.InventoryControllerException;

/**
 *
 * @author Alicia
 */
public class InventoryController {
    private ArrayList<InventoryItem> inventory;
    
    public InventoryController(){
    }

    public void addInventoryItem(InventoryItem item) throws InventoryControllerException {
       try {
           inventory.add(item);
       } catch (Exception e){
           throw new InventoryControllerException(e.getMessage());
       }
    }
    
    public int getInventoryValue()
    {
        int total = 0;
        for(InventoryItem item : inventory){
            total += item.getValue();
        }   
        return total;
    }
            
}
