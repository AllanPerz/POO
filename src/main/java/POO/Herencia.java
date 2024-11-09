/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author allan
 */
public class Herencia {
    
    public static void main (String [] args){
        Animal p = new Perro("Negro", "SI", "SI", "SI", 4);
        p.sonido();
        
        Animal g = new Gato ("Blanco", "SI", "SI", "SI", 4);
        g.sonido();
    }
    
}
