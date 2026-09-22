/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionvehiculos.model;

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

    public VehiculoPickup(String marca, String numeroChasis, Motor motor) {
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

    public String getTipoCajon() {
        return tipoCajon;
    }

    public void setTipoCajon(String tipoCajon) {
        this.tipoCajon = tipoCajon;
    }

    public boolean isTieneDoble() {
        return tieneDoble;
    }

    public void setTieneDoble(boolean tieneDoble) {
        this.tieneDoble = tieneDoble;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public Double getAlturaCajon() {
        return alturaCajon;
    }

    public void setAlturaCajon(Double alturaCajon) {
        this.alturaCajon = alturaCajon;
    }

    public Double getLongitudCajon() {
        return longitudCajon;
    }

    public void setLongitudCajon(Double longitudCajon) {
        this.longitudCajon = longitudCajon;
    }

    public String getTipoCabina() {
        return tipoCabina;
    }

    public void setTipoCabina(String tipoCabina) {
        this.tipoCabina = tipoCabina;
    }
    
    
    
    
}
