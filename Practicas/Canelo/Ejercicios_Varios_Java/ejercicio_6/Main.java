package ejercicios_canelo.ejercicio_6;

import ejercicios_canelo.ejercicio_6.model.*;

import ejercicios_canelo.ejercicio_6.model.Autor.GeneroLiterario;

public class Main{
    
    public static void main(String[] args){
        Autor clsAutor1 = new Autor("Canelo", "CRC", GeneroLiterario.POESIA);
        Autor clsAutor2 = new Autor("Nacho", "ITA", GeneroLiterario.CIENCIA_FICCION);

        Libro clsLibro1 = new Libro("Codigo 1", "1234", clsAutor1);
        Libro clsLibro2 = new Libro("Coding 2", "5678", clsAutor2);

        Biblioteca clsBiblioteca = new Biblioteca();

        clsBiblioteca.agregarLibro(clsLibro1);
        clsBiblioteca.agregarLibro(clsLibro2);

        clsBiblioteca.mostrarLibros();

    }

}