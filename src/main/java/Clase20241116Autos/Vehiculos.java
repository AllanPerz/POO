/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase20241116Autos;

/**
 *
 * @author allan
 */
public class Vehiculos {
    private String Marca;
    private String Color;
    private String Transmision;

    public Vehiculos(String Marca, String Color, String Transmision) {
        this.Marca = Marca;
        this.Color = Color;
        this.Transmision = Transmision;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getTransmision() {
        return Transmision;
    }

    public void setTransmision(String Transmision) {
        this.Transmision = Transmision;
    }

    
    
}
