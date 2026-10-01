package com.ejercicio_10.model;

/**
 *
 * @author andresgonzalezgarcia
 */
public class Autor {

    //Declaración de variables Globales
    private String nombre;
    private String nacionalidad;

    //Constructor vacio
    public Autor() {

    }

    //Constructor parametrizado
    public Autor(String pNombre, String pNacionalidad) {
        this.nombre = pNombre;
        this.nacionalidad = pNacionalidad;
    }

    //Gets & Sets
    public void setNombre(String pNombre) {
        this.nombre = pNombre;
    }

    public void setNacionalidad(String pNacionalidad) {
        this.nacionalidad = pNacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    //Métodos y Funciones
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("\nNombre:\t\t\t").append(nombre);
        sb.append("\nNacionalidad:\t\t").append(nacionalidad);

        return sb.toString();
    }
}
