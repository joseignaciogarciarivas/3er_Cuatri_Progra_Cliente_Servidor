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
public class VehiculoPickup extends Vehiculo implements Conducible{
    private boolean tieneDoble;
    private int capacidadCarga;
    private Double alturaCajon;
    private Double longitudCajon;
    private String tipoCabina;
    private String tipoCajon;
    private boolean encendido;
    private boolean enMovimiento;

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

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public boolean isEnMovimiento() {
        return enMovimiento;
    }

    public void setEnMovimiento(boolean enMovimiento) {
        this.enMovimiento = enMovimiento;
    }

    @Override
    public void encender() throws VehiculoException {
        if (this.isEncendido()){
            throw new VehiculoException(01, "Vehiculo ya se encuentra encendido");
        }
        
        this.setEncendido(true);
        System.out.println("Vehiculo ya se encendio");
    }

    @Override
    public void apagar() throws VehiculoException {
        if(!this.isEncendido()){
            throw new VehiculoException(02, "Vehiculo ya se encuentra apagado");
        }
        
        if(this.isEnMovimiento()){
            throw new VehiculoException(03, "Vehiculo en movimiento");
        }
        
        this.setEncendido(false);
        System.out.println("Vehiculo apagado");
    }   
    

    @Override
    public void acelerar() throws VehiculoException {
        if(!this.isEncendido()){
            throw new VehiculoException(04, "Se debe encender el vehiculo");
        }
        
        this.setEnMovimiento(true);
        System.out.println("Vehiculo está en movimiento.");
    }

    @Override
    public void detener() throws VehiculoException {
        if(!this.isEnMovimiento()){
            throw new VehiculoException(05, "Vehiculo ya se encuentra detenido");
        }
        this.setEnMovimiento(false);
        System.out.println("Se ha detenido el vehiculo");
    }

    @Override
    public void girar() throws VehiculoException {
        if(!this.isEnMovimiento()){
            throw new VehiculoException(06, "Vehiculo no está en movimiento");
        }
        
        System.out.println("Vehiculo esta girando");
    }
    
    
    
    
}
