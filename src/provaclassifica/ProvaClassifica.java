/*
 * Esempi di uso di strutture dati per gestire classifiche.
 */
package provaclassifica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

/**
 *
 * @author Docente
 */
public class ProvaClassifica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Squadra> c = new ArrayList<>();
        
        c.add( new Squadra("Roma", 64) );
        c.add( new Squadra("Lazio", 63) );
        c.add( new Squadra("Juventus", 82) );
        
        Collections.sort(c);
        
        System.out.println(c);
        
        
    }
    
}
