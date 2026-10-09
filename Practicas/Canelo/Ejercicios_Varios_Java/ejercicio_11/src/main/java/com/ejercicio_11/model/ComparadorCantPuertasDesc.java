package com.ejercicio_11.model;

import java.util.Comparator;

/**
 *
 * @author Laboratorio
 */
public class ComparadorCantPuertasDesc implements Comparator<Vehiculo> {
    @Override
    public int compare(Vehiculo v1, Vehiculo v2){
        return Integer.compare(v2.getCantPuertas(), v1.getCantPuertas());
    }
    
}
