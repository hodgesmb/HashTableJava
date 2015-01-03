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
public class Table {
    
    private String tableName;
    private int tableSize;
    private int itemCount;
    private Item[][] hashTable;
    
    public Table(String name, int size){
        
        tableName = name;
        tableSize = size;
        hashTable = new Item[size][2];
        itemCount = 0;
        
    }
    
    public void addItem(Item newItem){
        
    }
    
    public String findItem(Item selectedItem){
        
        int hashAddr = hashItem(selectedItem.getName());
        
        return hashTable[hashAddr][]
        
        
    }
    
    public String deleteItem(Item selectedItem){
        
        
    }
    
    public void printTable(){
        
        Item currentItem;
        System.out.println("==============" + tableName + "==============");
        
        for(int rowIndex = 0; rowIndex < tableSize; rowIndex++){
            
            currentItem = hashTable[rowIndex][1];
            System.out.println(currentItem.getName());
            
        }
        
        System.out.println("Total number of items in table is " + this.getItemCount() + ".");
    
    }
    
    public void printTableCount(){
        
        System.out.println("There are currently " + this.itemCount + " items in the table.");
        
    }
    
    public int getItemCount(){
        
        return this.itemCount;
        
    }
    
    private int hashItem(String item){
        
    }
       
}