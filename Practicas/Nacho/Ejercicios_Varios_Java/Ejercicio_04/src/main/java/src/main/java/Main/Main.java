package src.main.java.Main;

import src.main.java.model.*;

public class Main {

    public static void main(String[] args) {

        Autor autor1 = new Autor("Miguel de Cervantes", "Español", Autor.GeneroLiterario.NOVELA);
        Autor autor2 = new Autor("Kimi Antonelli", "Italiano", Autor.GeneroLiterario.CIENCIA_FICCION);
        Autor autor3 = new Autor("Jafet Soto", "Neerlandes", Autor.GeneroLiterario.POESIA);
        Libro libro1 = new Libro("Don Quijote", "DHS9834712", 20, autor1);
        Libro libro2 = new Libro("Ana Karenina", "DHF9344560", 100, autor2);
        Libro libro3 = new Libro("El niño que se comio el universo", "DHA93532444", 76, autor3);
        
        Biblioteca biblioteca = new Biblioteca();
        
        biblioteca.AgregarLibro(libro1);
        biblioteca.AgregarLibro(libro2);
        biblioteca.AgregarLibro(libro3);
        
        biblioteca.mostrarLibros();
        Libro.getCantidadLibros();
    }

}
