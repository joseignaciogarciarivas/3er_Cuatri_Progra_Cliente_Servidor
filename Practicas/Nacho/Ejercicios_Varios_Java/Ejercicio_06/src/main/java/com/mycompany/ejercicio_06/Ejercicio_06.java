
package com.mycompany.ejercicio_06;

import java.util.ArrayList;

/**
 *
 * @author Jose Ignacio Garcia Rivas
 */
public class Ejercicio_06 {

    public static void main(String[] args) {
        Vehiculo miAutomovil = new Automovil("Nissan", "Qashqai", 40, 400);
        Vehiculo miMotocicleta = new Motocicleta("Honda", "mamalona", 20, 400);
        Vehiculo miCamion = new Camion("Kia", "Bongo", 120, 40);
        
        Dibujable dAutomovil = new Automovil();
        dAutomovil.dibujar();
        
        Dibujable dMotocicleta = new Motocicleta();
        dMotocicleta.dibujar();

        Dibujable dCamion = new Camion();
        dCamion.dibujar();

        ArrayList<Vehiculo> arrVehiculos = new ArrayList<>();

        arrVehiculos.add(miAutomovil);
        arrVehiculos.add(miMotocicleta);
        arrVehiculos.add(miCamion);

        for (Vehiculo vehiculo : arrVehiculos) {
            switch (vehiculo.getTipoVehiculo()) {
                case AUTOMOVIL -> System.out.println("\n AUTOMOVIL \n");
                case MOTOCICLETA -> System.out.println("\n MOTOCICLETA \n");
                case CAMION -> System.out.println("\n CAMION \n");
                   
            }

            System.out.println("\t Tipo de vehiculo: " + vehiculo.getTipoVehiculo());
            System.out.println(vehiculo.toString());
            System.out.println("\t Calcular autonomia: " + vehiculo.calcularAutonomia());
        }
    }
}
