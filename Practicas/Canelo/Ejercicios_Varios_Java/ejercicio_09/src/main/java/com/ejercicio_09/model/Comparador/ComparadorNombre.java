package com.ejercicio_09.model.Comparador;

import com.ejercicio_09.model.clsEmpleado.Empleado;
import java.util.Comparator;

/**
 *
 * @author andresgonzalezgarcia
 */
public class ComparadorNombre implements Comparator<Empleado> {

    @Override
    public int compare(Empleado e1, Empleado e2) {
        return e1.getNombre().compareToIgnoreCase(e2.getNombre());
    }
}
