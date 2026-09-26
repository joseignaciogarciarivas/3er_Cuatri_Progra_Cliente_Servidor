/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_06;

/**
 *
 * @author Jose Ignacio Garcia Rivas
 */
public class Ejercicio_06 {

    public static void main(String[] args) {
        Automovil miAutomovil = new Automovil(300000);
        System.out.println("El tipo de vehiculo es: " + miAutomovil.getTipoVehiculo());
        System.out.println("La autonomia del Automovil es: " + miAutomovil.calcularAutonomia());
        
        miAutomovil.dibujar();
               
        Motocicleta miMotocicleta = new Motocicleta(30000);
        System.out.println("El tipo de vehiculo es: " + miMotocicleta.getTipoVehiculo());
        System.out.println("La autonomia de la Motocicleta es: " + miMotocicleta.calcularAutonomia());
        
        miMotocicleta.dibujar();
        
        Camion miCamion = new Camion(30000);
        System.out.println("El tipo de vehiculo es: " + miCamion.getTipoVehiculo());
        System.out.println("La autonomia de la Camion es: " + miCamion.calcularAutonomia());
        
        miCamion.dibujar();
    }
}
