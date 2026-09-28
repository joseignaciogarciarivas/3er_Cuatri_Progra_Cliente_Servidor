/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_06;

/**
 *
 * @author Jose Ignacio Garcia Rivas
 */
public abstract class Vehiculo {

    private String marca;
    private String modelo;
    private int combustible;

    public abstract int calcularAutonomia();

    public abstract TipoVehiculo getTipoVehiculo();

    public Vehiculo() {
    }

    public Vehiculo(String pMarca, String pModelo, int pCombustible) {
        this.marca = pMarca;
        this.modelo = pModelo;
        this.combustible = pCombustible;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCombustible() {
        return combustible;
    }

    public enum TipoVehiculo {
        AUTOMOVIL,
        MOTOCICLETA,
        CAMION;
    }

}
