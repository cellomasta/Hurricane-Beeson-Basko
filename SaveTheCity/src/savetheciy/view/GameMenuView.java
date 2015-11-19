/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savetheciy.view;

import savethecity.control.GameControl;
import savethecity.model.InventoryItem;
import savethecity.SaveTheCity;
/**
 *
 * @author Alicia
 */
//public class GameMenuView {
    
  //  void displayMenu(){
    //    System.out.println("displayMenu stub"); 
    //}
//}
public class GameMenuView extends View {
    private static Object SavetheCity;
   
    public GameMenuView(){
        super("\n"
                + "\n----------------------------------"
                + "\n| Game Menu                      |"
                + "\n----------------------------------"
                + "\nT - Travel to new locations"
                + "\nI - List of Inventory Items"
                + "\nE - Exit"
                + "\n----------------------------------");
    }
    
    @Override
    public boolean doAction(Object obj){
        String value = obj.toString();
        
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch(choice){
            case 'T': 
                this.displayMap();
                break;
            case 'I': 
                this.viewInventory();
                break;    
            case 'E':
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
    }
        return false;
    }
    private void viewInventory(){
        //get the sorted list of inventory item for the current gam
        InventoryItem[] inventory = GameControl.getSortedInventoryList();
        
        System.out.println("\nList of Inventory Items");
        System.out.println("Description" + "\t" +
                           "Required" + "\t" +
                           "In Stock");
        
        //for each inventory item
        for (InventoryItem inventoryItem : inventory){
            //Display the description, the requried amount and amount in stock 
            System.out.println(inventoryItem.getDescription());
        }
    }

    public static InventoryItem[] getSortedInventoryList(){
        
        InventoryItem[] originalInventoryList = SaveTheCity.getCurrentGame().getInventory();
        
        //clone (make a copy) originalList
        InventoryItem[] inventoryList = originalInventoryList.clone();
        
        //using a BubbleSort to sort the list of inventoryist by name
        InventoryItem tempInventoryItem;
        for (int i = 0; i < inventoryList.length-1; i++){
            for (int j = 0; j < inventoryList.length-1-i; j++){
                if (inventoryList[j].getDescription().compareToIgnoreCase(inventoryList[j + 1].getDescription())>0){
                    tempInventoryItem = inventoryList[j];
                    inventoryList[j] = inventoryList[j+1];
                    inventoryList[j+1] = tempInventoryItem;
                }
            }
        }
        return inventoryList;
    }
    private void displayMap() {
        SaveTheCity.getCurrentGame().getMap().displayMap();
    }

    void displayMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
          
}