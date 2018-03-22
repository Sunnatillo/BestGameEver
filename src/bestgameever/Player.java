package bestgameever;

import java.util.ArrayList;

public class Player {
    private Inventory inventory;
    
    public Player(){
        inventory = new Inventory();
        
    }
    
    
    public void addItem( Item a ){
        inventory.addItem( a );
    }

    void printItems() {
        inventory.printItems();
    }
    
    public Inventory getInventory(){
        return inventory;
    }
    
    
}
