/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author allan
 */
public class Queco extends Animal {
    
    public Queco (String Pelo, String Boca, String Cola, String Ojo, Integer Pata){
        super (Pelo, Boca, Cola, Ojo, Pata);
    }
    
    public void sonido(){
        System.out.println("EL Queco hace tac tac");
}
}
