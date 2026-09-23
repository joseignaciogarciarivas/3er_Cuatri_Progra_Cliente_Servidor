package com.ejercicio_04;

import com.ejercicio_04.model.Biblioteca;
import com.ejercicio_04.model.Libro;
import com.ejercicio_04.model.Autor;

public class Main {
    
    public static void main(String[] args) {
        
        Autor autor1 = new Autor("Gabriel García Márquez", "Colombiano", Autor.generoLiterario.NOVELA);
        
        Autor autor2 = new Autor("Pablo Neruda", "Chileno", Autor.generoLiterario.POESIA);
        
        Libro libro1 = new Libro("Cien Años de Soledad", "978-3-16-148410-0", autor1);
        
        Libro libro2 = new Libro("Veinte Poemas de Amor y una Canción Desesperada", "978-3-16-148410-1", autor2);
        
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        
        biblioteca.mostrarLibrosForMejorado();
        System.out.println("\n\nCantidad de libros en la biblioteca: " + Libro.getCantidadLibros());
    }
}