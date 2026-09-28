package com.ejercicio_06.model;

public class Autor {

    // Declaracion de Variables Globales
    private String nombre;
    private String nacionalidad;
    private GeneroLiterario genLit;

    // Constructor Vacio
    public Autor() {

    }

    // Constructor con todos los atributos
    public Autor(String pNombre, String pNacionalidad, GeneroLiterario pGenLit){
        this.nombre = pNombre;
        this.nacionalidad = pNacionalidad;
        this.genLit = pGenLit;
    }

    // Función ENUM
    public enum GeneroLiterario {
        NOVELA,
        POESIA,
        CIENCIA_FICCION,
        HISTORIA;
    }

    // Reescritura Método toString()
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Nombre: " + nombre);
        sb.append("Nacionalidad: " + nacionalidad);
        sb.append("Genero literario: " + genLit);

        return sb.toString();
    }
}
