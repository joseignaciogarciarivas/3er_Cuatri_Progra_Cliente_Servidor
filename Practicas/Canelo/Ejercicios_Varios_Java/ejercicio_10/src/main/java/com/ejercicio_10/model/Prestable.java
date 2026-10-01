package com.ejercicio_10.model;

/**
 *
 * @author andresgonzalezgarcia
 */
public interface Prestable {

    public void prestar() throws BibliotecaException;

    public void devolver() throws BibliotecaException;

    public void renovarPrestamo (int pDiasPrestamo) throws BibliotecaException;
}
