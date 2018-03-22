
package bestgameever;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BestGameEver {
    
    public static void main(String[] args) {
        //1.2f - f means that the number is expressed as float (4bytes) instead of double (8bytes)
        Item a = new Weapon( "Axe", "Some description", 1.2f, 42 );
        //If we want to use a as weapon, we have to cast it
        Weapon b = (Weapon)a;
        Player p = new Player();
        //Weapon is also item, so addItem() can be used on it
        p.addItem(a);
        try {
            BufferedReader reader = new BufferedReader( new FileReader( "data/weapons.csv" ));
            String line[];
            String wholeLine;
            //Here we read the "nameline" away
            reader.readLine();
            while( true ){
                wholeLine = reader.readLine();
                if( wholeLine == null )
                       break;
                line = wholeLine.split( "," );
                p.addItem(  new Weapon( line[0], line[1], Float.valueOf( line[2] ), Integer.valueOf( line[3])));
            }
            p.printItems();
            p.getInventory().printItems();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BestGameEver.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex ){
            System.out.println("asdsadds");
        }
        
    }
    /*
    public useItem( int num ){
        Item item = inventory.getItem( num );
        if( item != null ){
            if( item instanceof Weapon ){
                Weapon a = (Weapon)item;
                a.attack();
            } else if( item instanceof Armor ){
                Armor a = (Armor)item;
                a.equip();
            }
        }
    }
    */
}
