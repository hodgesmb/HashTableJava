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

import java.util.Scanner;

public class HashTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NullPointerException{
        
        String tableName;
        String item;
        String hashVal;
        String[] hashTable;
        int numItems;
        int menuSelect;
        int tableIndex = 0;

        Scanner kbd = new Scanner(System.in);
        System.out.println("Hash Table Program");
        System.out.println("==================");
        System.out.println("This program creates a hash table from user input.  It uses a count of the letters from each item to create the hash.");
        System.out.println("To begin, enter the name of the table: ");
        tableName = kbd.next();
        System.out.println("You've chosen the name " + tableName + " as your table name.");
        System.out.println("Enter the number of items that will be in this table:");
        numItems = kbd.nextInt();
        
        while(numItems <= 0){
            
            System.out.println("Please enter a positive number greater than zero.");
            System.out.println("Enter the number of items that will be in this table:");
            numItems = kbd.nextInt();
            
        }
        
        System.out.println("You've chosen the table size to be " + numItems + ". \n A table named " + tableName+ " with " + numItems + " item slots will be created.");
        hashTable = new String[numItems];
        
        try{
        
            while(item.compareToIgnoreCase("-1") != 0 || item == null){
                
                printMenu();
                menuSelect = kbd.nextInt();
                
                if(menuSelect < 1 || menuSelect > 5){
                    
                    System.out.println("Please enter a number between 1 and 5 inclusive.");
                    menuSelect = kbd.nextInt();
                    
                }
                
                switch(menuSelect){
                    
                    case 1:
                        
                        addItems();
                        break;
                        
                    case 2:
                        
                        deleteItem();
                        break;
                        
                    case 3:
                        
                        printTable();
                        break;
                        
                    case 4:
                        
                        printTableCount();
                        break;
                        
                    case 5:
                        
                        emptyTable();
                        break;
                        
                    case 6:
                        
                        exitProg();
                        break;
                        
                    default:
                        
                        printTable();
                        break;
                        
                }
                                
            }
                        
        }
        
        catch(NullPointerException n){
            
            System.err.println("ERROR: item variable is not initialized!");
            System.exit(1);
            
        }
        
    }
        
    private static void clearScreen(){
            
        final String ANSI_CLS = "\u001b[2J";
        final String ANSI_HOME = "\u001b[H";
        System.out.print(ANSI_CLS + ANSI_HOME);
        System.out.flush();
            
    }
                
    public static void printMenu(){
        
        clearScreen();
        System.out.println("Enter the number for what you wish to do:");
        System.out.println("1.) Add items to table.");
        System.out.println("2.) Remove an item from table.");
        System.out.println("3.) Print table.");
        System.out.println("4.) Print table count.");
        System.out.println("5.) Empty table.");
        System.out.println("6.) Exit program.");
        
    }
    
    public static int addItems(){
        
        String itemHolder;
        int hashHolder;
        clearScreen();
        System.out.println("There are " + printTableCount() + " remaining.  Please enter an item name:");
        itemHolder = kbd.next();
        hashHolder = hashItem(itemHolder);
        
        
        
        
        
        
        
        
    }
    
    private static int hashItem(String inputStr){
        
        return inputStr.length();

    }
      
    private static void exitProg(){
        
        System.exit(0);
        
    }
    
    
}