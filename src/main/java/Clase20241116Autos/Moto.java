/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase20241116Autos;

/**
 *
 * @author allan
 */
public class Moto extends Vehiculos{
    private String Modelo;

    public Moto(String Modelo, String Marca, String Color, String Transmision) {
        super(Marca, Color, Transmision);
        this.Modelo = Modelo;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    
    
}
