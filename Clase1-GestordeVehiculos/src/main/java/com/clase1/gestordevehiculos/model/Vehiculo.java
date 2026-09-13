/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clase1.gestordevehiculos.model;

/**
 *
 * @author Laboratorio
 */
public class Vehiculo {
    
    
    private String marca;
    private String numeroChasis;
    private Motor motor; // Composicion usar una clase dentro de una clase
    private static int cantidadVehiculos = 0;
    

     public Vehiculo(String marca, 
            String numeroChasis, 
            Motor motor) {
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehiculo{");
        sb.append("marca=").append(marca);
        sb.append(", numeroChasis=").append(numeroChasis);
        sb.append(", motor=").append(motor);
        sb.append('}');
        return sb.toString();
    }
    
    
}


