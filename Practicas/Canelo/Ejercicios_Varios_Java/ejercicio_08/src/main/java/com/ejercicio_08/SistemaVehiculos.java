package com.ejercicio_08;

import com.ejercicio_08.model.*;
import com.ejercicio_08.model.Vehiculo.eTipoVehiculo;
import java.util.ArrayList;

/**
 *
 * @author andresgonzalezgarcia
 */
public class SistemaVehiculos {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        //Se crea un Automovil, Motocicleta y Camión
        //Reto Extra 2: Polimorfismo
        Vehiculo vAutomovil = new Automovil("Toyota", "Corrolla", 40, 400);
        Vehiculo vMotocicleta = new Motocicleta("Yamaha", "Tracer", 20, 400);
        Vehiculo vCamion = new Camion("Izuzu", "Patriot", 120, 40);

        ArrayList<Vehiculo> arrVehiculos = new ArrayList<>();

        arrVehiculos.add(vAutomovil);
        arrVehiculos.add(vMotocicleta);
        arrVehiculos.add(vCamion);

        for (Vehiculo vehiculo : arrVehiculos) {
            //Se muestra información de cada objeto y autonomía

            switch (vehiculo.getTipoVehiculo()) {
                case AUTOMOVIL -> System.out.println("\n=== AUTOMOVIL ===\n");
                case MOTOCICLETA -> System.out.println("\n=== MOTOCICLETA ===\n");
                case CAMION -> System.out.println("\n=== CAMIÓN ===\n");
                default -> throw new AssertionError(vehiculo.getTipoVehiculo().name());
            }
            
            System.out.println("\tTipo Vehículo: " + vehiculo.getTipoVehiculo());
            System.out.println(vehiculo.toString());
            System.out.println("\tAutonomía: " + vehiculo.calcularAutonomia());
        }

        //Se dibuja cada Vehículo
        //Reto Extra 2: Polimorfismo
        Dibujable dAutomovil = new Automovil();
        Dibujable dMotocicleta = new Motocicleta();
        Dibujable dCamion = new Camion();

        dAutomovil.dibujar();
        dMotocicleta.dibujar();
        dCamion.dibujar();
    }
}
