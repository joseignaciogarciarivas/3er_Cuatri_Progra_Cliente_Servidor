package com.ejercicios_nacho.Ejercicio_04;

import java.util.ArrayList;

public class Biblioteca{

    ArrayList <Libro> arrLibros = new ArrayList<>();
    

    public void AgregarLibro(Libro plibro){
        arrLibro.add(agregarLibro);
    }

    public String mostrarLibros(){
        for(int i; i<= arrLibros.size(); i++){
            System.out.println(arrLibros(i).toString());
        }
        System.out.println(Libro.getCantidadLibros());
    }
}