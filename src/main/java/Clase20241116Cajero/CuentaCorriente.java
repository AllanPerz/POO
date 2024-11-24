/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase20241116Cajero;

/**
 *
 * @author allan
 */
public class CuentaCorriente extends Cajero {
    private String NumeroCuenta;
    private Integer Edad;

    public CuentaCorriente(String NumeroCuenta, Integer Edad, String NombreDeCuenta, Integer Identidad, Double Saldo) {
        super(NombreDeCuenta, Identidad, Saldo);
        this.NumeroCuenta = NumeroCuenta;
        this.Edad = Edad;
    }

    public String getNumeroCuenta() {
        return NumeroCuenta;
    }

    public void setNumeroCuenta(String NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer Edad) {
        this.Edad = Edad;
    }
    
    
    
}
