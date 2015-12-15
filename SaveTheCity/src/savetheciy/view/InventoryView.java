/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savetheciy.view;

import savethecity.control.GameControl;
import savethecity.model.InventoryItem;

/**
 *
 * @author willnelson
 */
public class InventoryView extends View {

    public InventoryView(String promptMessage) {
        super(promptMessage);
    }

    @Override
    public boolean doAction(Object obj) {
        try{
            
        //get the sorted list of inventory items for the current game
        InventoryItem[] inventory = GameControl.getSortedInventoryList();
        
        this.console.println("\nList of Inventory Items");
        this.console.println("Description" + "\t" +
                           "Required" + "\t" +
                           "In Stock");
        
        //for each inventory item
        for (InventoryItem inventoryItem : inventory){
            //Display the description, the requried amount and amount in stock 
            this.console.println(inventoryItem.getDescription());
        }
    
        }catch (Exception ex){
            ErrorView.display("InventoryView", ex.getMessage());
        }
        //throw new UnsupportedOperationException("Not supported yet. In inventory"); //To change body of generated methods, choose Tools | Templates.
        return true;
    }
    
}
