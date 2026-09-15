/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clase1.gestordevehiculos.model;

import java.awt.Color;

/**
 *
 * @author Laboratorio
 */
public class VehiculoPickup extends Vehiculo {

    private boolean tieneDoble;
    private int capacidadCarga;
    private Double alturaCajon;
    private Double longitudCajon;
    private String tipoCabina;
    private String tipoCajon;
    
    public VehiculoPickup(String marca, String numeroChasis, Motor motor){
        super(marca, numeroChasis, motor);
    }

    public VehiculoPickup(boolean tieneDoble, int capacidadCarga, Double alturaCajon, Double longitudCajon, String tipoCabina, String tipoCajon, String marca, String numeroChasis, Motor motor, String traccion, int cantPuertas, int cantAsientos, Color color, String modelo, int anioFabricacion) {
        super(marca, numeroChasis, motor, traccion, cantPuertas, cantAsientos, color, modelo, anioFabricacion);
        this.tieneDoble = tieneDoble;
        this.capacidadCarga = capacidadCarga;
        this.alturaCajon = alturaCajon;
        this.longitudCajon = longitudCajon;
        this.tipoCabina = tipoCabina;
        this.tipoCajon = tipoCajon;
    }
    
    
    
}
