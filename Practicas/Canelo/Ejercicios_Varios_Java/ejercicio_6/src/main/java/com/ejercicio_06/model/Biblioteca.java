package com.ejercicio_06.model;

import java.util.ArrayList;

public class Biblioteca {

    // Declaracion de variables globales
    ArrayList<Libro> arrLibros = new ArrayList<>();

    // Métodos y Funciones
    public void agregarLibro(Libro pClsLibro){
        arrLibros.add(pClsLibro);
    }

    public void mostrarLibros(){
        for (int i=0; i<arrLibros.size();i++)
            arrLibros.get(i).toString();
        

        Libro.getCantidadLibros();
    }

}