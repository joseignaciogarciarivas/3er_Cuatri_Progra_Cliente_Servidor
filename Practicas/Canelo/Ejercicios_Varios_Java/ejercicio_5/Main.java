package ejercicios_canelo.ejercicio_5;

import ejercicios_canelo.ejercicio_5.model.*;
import ejercicios_canelo.ejercicio_5.model.Autor.GeneroLiterario;

public class Main{
            
    public static void main(String[] args){
        Autor clsAutor1 = new Autor("Andres","Tico",GeneroLiterario.HISTORIA);
        Autor clsAutor2 = new Autor("Andres","Tico",GeneroLiterario.HISTORIA);

        Libro clsLibro1 = new Libro("100 historias gamer","12345",clsAutor1);
        Libro clsLibro2 = new Libro("100+ historias gamer","67890",clsAutor2);

        Biblioteca clsBiblioteca = new Biblioteca();

        clsBiblioteca.agregarLibro(clsLibro1);
        clsBiblioteca.agregarLibro(clsLibro2);

        clsBiblioteca.mostrarLibros(); 
        
        clsBiblioteca.buscarLibro("12345");
    }

    
    
}