/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase20241116Cajero;

/**
 *
 * @author allan
 */
public class Transaccion extends Cajero{
    private Integer CuentaDestino;

    public Transaccion(Integer CuentaDestino, String NombreDeCuenta, Integer Identidad, Double Saldo) {
        super(NombreDeCuenta, Identidad, Saldo);
        this.CuentaDestino = CuentaDestino;
    }

    public Integer getCuentaDestino() {
        return CuentaDestino;
    }

    public void setCuentaDestino(Integer CuentaDestino) {
        this.CuentaDestino = CuentaDestino;
    }

    
    
    
}
