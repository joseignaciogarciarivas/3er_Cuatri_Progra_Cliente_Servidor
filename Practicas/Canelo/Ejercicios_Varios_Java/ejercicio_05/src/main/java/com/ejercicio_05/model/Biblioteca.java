package com.ejercicio_05.model;

import java.util.ArrayList;

public class Biblioteca{

    ArrayList<Libro> arr_libros = new ArrayList<>();

    //Metodo para agregar un libro al arreglo
    public void agregarLibro(Libro pLibro){
        arr_libros.add(pLibro);
    }

    //Método para mostrar libros
    public void mostrarLibros(){                
        for (int i=0; i < arr_libros.size(); i++){
            System.out.println(arr_libros.get(i).toString());
        }

        System.out.println(Libro.getContador());

    }

    public void buscarLibro(String pIsbn){
        for (int i=0; i < arr_libros.size(); i++){
            if (arr_libros.get(i).getIsbn()==pIsbn)
                System.out.println(arr_libros.get(i).toString());
        }
    }
}