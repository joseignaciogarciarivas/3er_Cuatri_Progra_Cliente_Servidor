/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionvehiculos.model;

import java.util.Comparator;

/**
 *
 * @author Laboratorio
 */
public class ComparadorCantPuertas implements Comparator<Vehiculo> {
    @Override
    public int compare(Vehiculo v1, Vehiculo v2){
        return Integer.compare(v1.getCantPuertas(), v2.getCantPuertas());
    }
    
}
