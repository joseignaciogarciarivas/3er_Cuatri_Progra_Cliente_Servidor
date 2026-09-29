/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestionvehiculos;
import com.mycompany.gestionvehiculos.model.*;
import com.mycompany.gestionvehiculos.view.VehiculoPickupGUI;
import javax.swing.SwingUtilities;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author Laboratorio
 */
public class GestionVehiculos {

    public static void main(String[] args) {
        final int CANTIDAD_PUERTAS = 4;
        List<Vehiculo> vehiculos = new ArrayList<>();
        Motor miMotor = new Motor(4,TiposCombustible.DIESEL);
        Vehiculo vehiculo1 = new Vehiculo("Toyota","DHFK1545DFFDG154FFV",miMotor);
        vehiculo1.setCantPuertas(4);
        vehiculos.add(vehiculo1);
        System.out.println(vehiculo1.toString());
        System.out.println("Vehiculos creados: " + Vehiculo.getCantidadVehiculos());
        System.out.println("----------------------------------");
        Vehiculo vehiculo2 = new Vehiculo("HYUNDAI","DHFK455UGTFDG154PLM",miMotor);
        vehiculo2.setCantPuertas(5);
        vehiculos.add(vehiculo2);
                
        System.out.println(vehiculo2.toString());
        System.out.println("Vehiculos creados: " + Vehiculo.getCantidadVehiculos());
        System.out.println("----------------------------------");
        
        /*SwingUtilities.invokeLater(()->{
            new VehiculoPickupGUI();
        });*/
        
        VehiculoPickup Dmax = new VehiculoPickup("Isuzu", "454dff5f6ghg45gg", miMotor);
        Dmax.setCantPuertas(2);
        vehiculos.add(Dmax);
        try{
            Dmax.acelerar();
            Dmax.detener();
            Dmax.girar();
        }catch(VehiculoException e){
            System.out.println("Error num: (" + e.getCodError() + "): " + e.getMessage());
        }
        
        for(Vehiculo v: vehiculos){
            System.out.println(v.getMarca() + " - " + v.getMotor().getCombustible().toString());
        }
        
        System.out.println("--------------------------------------");
        
        Collections.sort(vehiculos);
        
        for(Vehiculo v: vehiculos){
            System.out.println(v.getMarca() + " - " + v.getMotor().getCombustible().toString());
        }
        
        Collections.sort(vehiculos, new ComparadorCantPuertas());
        
        System.out.println("--------------------------------------");
        
        for(Vehiculo v: vehiculos){
            System.out.println(v.getMarca() + " - " + v.getCantPuertas());
        }
        
        Collections.sort(vehiculos, new ComparadorCantPuertasDesc());
        
        System.out.println("--------------------------------------");
        
        for(Vehiculo v: vehiculos){
            System.out.println(v.getMarca() + " - " + v.getCantPuertas());
        }
    }
}
