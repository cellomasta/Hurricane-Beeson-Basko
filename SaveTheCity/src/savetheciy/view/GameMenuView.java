/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savetheciy.view;

import java.io.PrintWriter;
import savethecity.control.GameControl;
import savethecity.model.InventoryItem;
import savethecity.SaveTheCity;
/**
 *
 * @author Alicia
 */
//public class GameMenuView {
    
  //  void displayMenu(){
    //    this.console.println("displayMenu stub"); 
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
                + "\nP - Print Inventory List"
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
            case 'P':
                this.printInventory();
                break;
            case 'E':
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try again");
                break;
    }
        return false;
    }
    private void viewInventory(){
        //get the sorted list of inventory item for the current gam
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

    private void printInventory() {
        //Prompt user for file path
        this.console.println("\n\nEnter the path for file where the game" + "is to be saved.");
        //get file path
        String filePath = this.getInput();
        try{
           this.console.println(printOutInventory());
           }catch (Exception ex){
               ErrorView.display("GameMenuView", ex.getMessage());
           }
        }
        //call printOutInventory() function to print report
        //display success message
        //catch runtime exceptions
    public String printOutInventory(){
        try{
            SaveTheCity.outFile = new PrintWriter(System.out, true);
        }catch (Throwable e){
            this.console.println("Error: "+ e.getMessage());
        }
        return null;
    }
          
}