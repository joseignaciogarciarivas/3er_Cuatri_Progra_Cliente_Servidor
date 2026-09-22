/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase1.gestordevehiculos;
import com.mycompany.clase1.gestordevehiculos.model.*;
/**
 *
 * @author Laboratorio
 */
public class Clase1GestordeVehiculos {

    public static void main(String[] args) {
        Motor miMotor = new Motor(4,TiposCombustible.DIESEL);
        Vehiculo vehiculo1 = new Vehiculo("Nissan", "DHF345872", miMotor);
        
        System.out.println(vehiculo1.toString());
        System.out.println("Vehiculos creados: " + Vehiculo.getCantidadVehiculos());
        System.out.println("-----------------------------------");
        
        Vehiculo vehiculo2 = new Vehiculo("Hyundai", "DHF345879", miMotor);
        System.out.println(vehiculo1.toString());
        System.out.println("Vehiculos creados: " + Vehiculo.getCantidadVehiculos());
        System.out.println("-----------------------------------");
    }
}
