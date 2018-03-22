/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bestgameever;

import java.util.ArrayList;

/**
 *
 * @author roman
 */
public class Inventory {
    private ArrayList<Item> items;
   
    public Inventory() {
        items = new ArrayList<>();
    }
    
    public void addItem( Item a ){
        items.add( a );
    }

    void printItems() {
        int n = 1;
        for( Item i : items ){
            System.out.println( "Item:" + n++ );
            System.out.println(i + "\n");
        }
    }
    
}
