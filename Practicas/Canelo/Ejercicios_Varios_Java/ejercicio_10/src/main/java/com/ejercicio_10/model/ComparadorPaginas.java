package com.ejercicio_10.model;

import java.util.Comparator;

/**
 *
 * @author andresgonzalezgarcia
 */
public class ComparadorPaginas implements Comparator<Libro> {

    @Override
    public int compare(Libro v1, Libro v2) {
        return Integer.compare(v1.getCantidadPaginas(), v2.getCantidadPaginas());
    }
}
