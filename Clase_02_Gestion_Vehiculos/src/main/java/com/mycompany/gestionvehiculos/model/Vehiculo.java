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
public class Vehiculo {

    private String marca;
    private String numeroChasis;
    private Motor motor;
    private String traccion;
    private int cantPuertas;
    private int cantAsientos;
    private Color color;
    private String modelo;
    private int anioFabricacion;
    private static int cantidadVehiculos = 0;

    public Vehiculo(String marca, String numeroChasis, Motor motor, String traccion, int cantPuertas, int cantAsientos, Color color, String modelo, int anioFabricacion) {
        this.marca = marca;
        this.numeroChasis = numeroChasis;
        this.motor = motor;
        this.traccion = traccion;
        this.cantPuertas = cantPuertas;
        this.cantAsientos = cantAsientos;
        this.color = color;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        
        cantidadVehiculos++;
    }

    public Vehiculo(String marca, String numeroChasis, Motor motor) {
        this.marca = marca;
        this.numeroChasis = numeroChasis;
        this.motor = motor;
        
        cantidadVehiculos++;
    }

    

    public static int getCantidadVehiculos() {
        return cantidadVehiculos;
    }

    public static void setCantidadVehiculos(int aCantidadVehiculos) {
        cantidadVehiculos = aCantidadVehiculos;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumeroChasis() {
        return numeroChasis;
    }

    public void setNumeroChasis(String numeroChasis) {
        this.numeroChasis = numeroChasis;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }

    public int getCantAsientos() {
        return cantAsientos;
    }

    public void setCantAsientos(int cantAsientos) {
        this.cantAsientos = cantAsientos;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehiculo{");
        sb.append("marca=").append(marca);
        sb.append(", numeroChasis=").append(numeroChasis);
        sb.append(", motor=").append(motor);
        sb.append(", traccion=").append(traccion);
        sb.append(", cantPuertas=").append(cantPuertas);
        sb.append(", cantAsientos=").append(cantAsientos);
        sb.append(", color=").append(color);
        sb.append(", modelo=").append(modelo);
        sb.append(", anioFabricacion=").append(anioFabricacion);
        sb.append('}');
        return sb.toString();
    }
    
    

    
    
    
}
