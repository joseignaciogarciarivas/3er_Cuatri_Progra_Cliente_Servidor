package com.ejercicio_08;

import com.ejercicio_08.model.*;

/**
 *
 * @author andresgonzalezgarcia
 */
public class Ejercicio_08 {

    public static void main(String[] args) {

        Vehiculo vAutomovil = new Automovil("Toyota", "Hilux", 40, 400);

        System.out.println("=== AUTOMOVIL ===");
        System.out.println("Tipo Vehículo: " + vAutomovil.getTipoVehiculo());
        System.out.println(vAutomovil.toString());
        System.out.println("Autonomía: " + vAutomovil.calcularAutonomia());
        
        Dibujable dAutomovil = new Automovil();
        dAutomovil.dibujar();
    }
}
