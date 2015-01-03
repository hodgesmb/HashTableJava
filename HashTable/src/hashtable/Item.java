/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashtable;

/**
 *
 * @author hodgesmb1
 */
public class Item {
    
    private String itemName;
    private int itemID;
    
    public Item(String name, int id){
        
        itemName = name;
        itemID = id;
        
    }
    
    public String getName(){
        
        return this.itemName;
        
    }
    
    public int getID(){
        
        return this.itemID;
        
    }
 
}