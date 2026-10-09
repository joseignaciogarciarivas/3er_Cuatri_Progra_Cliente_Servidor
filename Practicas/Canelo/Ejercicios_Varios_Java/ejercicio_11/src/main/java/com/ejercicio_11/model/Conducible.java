package com.ejercicio_11.model;

/**
 *
 * @author Laboratorio
 */
public interface Conducible {
    public void encender() throws VehiculoException;
    public void apagar() throws VehiculoException;
    public void acelerar() throws VehiculoException;
    public void detener() throws VehiculoException;
    public void girar() throws VehiculoException;
}
