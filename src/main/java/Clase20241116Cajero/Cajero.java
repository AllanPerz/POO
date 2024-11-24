/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase20241116Cajero;

/**
 *
 * @author allan
 */
public class Cajero {
    private String NombreDeCuenta;
    private Integer Identidad;
    private Double Saldo;

    public Cajero(String NombreDeCuenta, Integer Identidad, Double Saldo) {
        this.NombreDeCuenta = NombreDeCuenta;
        this.Identidad = Identidad;
        this.Saldo = Saldo;
    }

    public String getNombreDeCuenta() {
        return NombreDeCuenta;
    }

    public void setNombreDeCuenta(String NombreDeCuenta) {
        this.NombreDeCuenta = NombreDeCuenta;
    }

    public Integer getIdentidad() {
        return Identidad;
    }

    public void setIdentidad(Integer Identidad) {
        this.Identidad = Identidad;
    }

    public Double getSaldo() {
        return Saldo;
    }

    public void setSaldo(Double Saldo) {
        this.Saldo = Saldo;
    }
    
    
}
