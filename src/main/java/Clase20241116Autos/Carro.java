/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase20241116Autos;

/**
 *
 * @author allan
 */
public class Carro extends Vehiculos {
    private String Modelo;
    private String Combustible;

    public Carro(String Modelo, String Combustible, String Marca, String Color, String Transmision) {
        super(Marca, Color, Transmision);
        this.Modelo = Modelo;
        this.Combustible = Combustible;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getCombustible() {
        return Combustible;
    }

    public void setCombustible(String Combustible) {
        this.Combustible = Combustible;
    }

    
}
