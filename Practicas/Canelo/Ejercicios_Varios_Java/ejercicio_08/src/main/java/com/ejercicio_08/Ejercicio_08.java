package com.ejercicio_08;

import com.ejercicio_08.model.*;

/**
 *
 * @author andresgonzalezgarcia
 */
public class Ejercicio_08 {

    public static void main(String[] args) {

        Vehiculo vAutomovil = new Automovil("Toyota", "Hilux", 40, 400);
        Vehiculo vMotocicleta = new Motocicleta("Yamaha", "Tracer", 20, 400);
        Vehiculo vCamion = new Camion("Izuzu", "Patriot", 120, 40);

        System.out.println("=== AUTOMOVIL ===");
        System.out.println("Tipo Vehículo: " + vAutomovil.getTipoVehiculo());
        System.out.println(vAutomovil.toString());
        System.out.println("Autonomía: " + vAutomovil.calcularAutonomia());
        
        System.out.println("=== MOTOCICLETA ===");
        System.out.println("Tipo Vehículo: " + vMotocicleta.getTipoVehiculo());
        System.out.println(vMotocicleta.toString());
        System.out.println("Autonomía: " + vMotocicleta.calcularAutonomia());
        
        System.out.println("=== CAMIÓN ===");
        System.out.println("Tipo Vehículo: " + vCamion.getTipoVehiculo());
        System.out.println(vCamion.toString());
        System.out.println("Autonomía: " + vCamion.calcularAutonomia());
        
        //Dibujable dAutomovil = new Automovil();
        Dibujable dMotocicleta = new Motocicleta();
        //Dibujable dCamion = new Camion();
        
        //dAutomovil.dibujar();        
        dMotocicleta.dibujar();
        //dCamion.dibujar();
    }
}
