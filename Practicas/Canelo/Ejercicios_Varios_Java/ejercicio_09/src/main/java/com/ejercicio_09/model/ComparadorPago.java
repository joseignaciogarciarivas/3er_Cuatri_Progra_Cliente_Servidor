package com.ejercicio_09.model;

import java.util.Comparator;

/**
 *
 * @author andresgonzalezgarcia
 */
public class ComparadorPago implements Comparator<Empleado> {

    @Override
    public int compare(Empleado e1, Empleado e2) {
        return Double.compare(e1.CalcularPago(), e2.CalcularPago());
    }
}
