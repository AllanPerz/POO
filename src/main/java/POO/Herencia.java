/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author allan
 */
public class Herencia {
    
    public static void main (String [] args){
        Animal p = new Perro("Negro", "SI", "SI", "SI", 4);
        //p.Sonido();
        
        Animal g = new Gato ("Blanco", "SI", "SI", "SI", 4);
        //g.Sonido();
        
        List<Animal> lista = new ArrayList<>();
        lista.add(p);
        lista.add(g);
        lista.add(new Queco("NO", "SI", "SI", "SI", 4));
        
        for (Animal item : lista){
            item.Sonido();
        }
        
        
    }
    
}
