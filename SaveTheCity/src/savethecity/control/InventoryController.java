/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savethecity.control;

import savethecity.model.InventoryItem;
import java.util.ArrayList;

/**
 *
 * @author Alicia
 */
public class InventoryController {
    private ArrayList<InventoryItem> inventory;
    
    public InventoryController(){
    }

    public void addInventoryItem(InventoryItem item){
       inventory.add(item); 
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
