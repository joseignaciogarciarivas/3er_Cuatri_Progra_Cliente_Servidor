package com.ejercicio_10;

import java.util.ArrayList;
import com.ejercicio_10.model.*;
import java.util.Collections;

/**
 *
 * @author andresgonzalezgarcia
 */
public class GestionBiblioteca {

    public static void main(String[] args) {
        Autor autor1 = new Autor("Gabriel García Márquez", "Nacionalidad 01");
        Autor autor2 = new Autor("Julio Verne", "Nacionalidad 02");
        Autor autor3 = new Autor("Oracle", "Nacionalidad 03");

        System.out.println("=========================================");
        System.out.println("         SISTEMA DE BIBLIOTECA");
        System.out.println("       RECORRIDO MEDIANTE CICLOS");
        System.out.println("=========================================");

        Libro libro1 = new Libro("Cien Años de Soledad", "978123456", autor1, 1967, 471, GeneroLiterario.NOVELA);
        Libro libro2 = new Libro("Viaje al Centro de la Tierra", "978654321", autor2, 1864, 320, GeneroLiterario.CIENCIA);
        Revista revista1 = new Revista("Java Magazine", "10002000", 2025, 98, 25, GeneroLiterario.TECNOLOGIA, autor3);

        ArrayList<Libro> arrMateriales = new ArrayList<>();

        arrMateriales.add(libro1);
        arrMateriales.add(libro2);
        arrMateriales.add(revista1);

        //Recorrido mediante ciclos
        for (Libro libro : arrMateriales) System.out.println(libro.toString());
        
        System.out.println("\nTotal de Materiales: "+Libro.getCantidadLibros());

        System.out.println("\n=========================================");
        System.out.println("   RECORRIDO MEDIANTE ORDEN NATURAL");
        System.out.println("=========================================");

        Collections.sort(arrMateriales);

        //Recorrido mediante sort natural
        for (Libro libro : arrMateriales) {
            System.out.println(String.format("%05d", libro.getCantidadPaginas()) + " "
                    + libro.getTitulo());
        }

        System.out.println("\n=========================================");
        System.out.println("  RECORRIDO MEDIANTE ORDEN ACENDENTE");
        System.out.println("=========================================");

        Collections.sort(arrMateriales, new ComparadorPaginas());

        //Recorrido mediante sort acendente de páginas
        for (Libro libro : arrMateriales) {
            System.out.println(String.format("%05d", libro.getCantidadPaginas()) + " "
                    + libro.getTitulo());
        }

        System.out.println("\n=========================================");
        System.out.println("  RECORRIDO MEDIANTE ORDEN DECENDENTE");
        System.out.println("=========================================");

        Collections.sort(arrMateriales, new ComparadorPaginasDesc());

        //Recorrido mediante sort decendente de páginas
        for (Libro libro : arrMateriales) {
            System.out.println(String.format("%05d", libro.getCantidadPaginas()) + " "
                    + libro.getTitulo());
        }
        
        System.out.println("\n=========================================");
        System.out.println("  QUALITY ASSURANCE");
        System.out.println("=========================================");
                
        try {
            System.out.println("Acción prestar");
            revista1.prestar();
            System.out.println("Acción prestar");
            revista1.prestar();
        } catch (BibliotecaException e) {
            System.out.println("\tError num: (" + e.getCodError() + "): " + e.getMessage());
        }
        
        try {
            System.out.println("Acción devolver");
            revista1.devolver();
            System.out.println("Acción devolver");
            revista1.devolver();
        } catch (BibliotecaException e) {
            System.out.println("\tError num: (" + e.getCodError() + "): " + e.getMessage());
        }
        
        try {
            System.out.println("Acción prestar");
            revista1.prestar();
            System.out.println("Acción Renovar Prestamo");
            revista1.renovarPrestamo(7);
            System.out.println("Acción devolver");
            revista1.devolver();
            System.out.println("Acción Renovar Prestamo");
            revista1.renovarPrestamo(7);
        } catch (BibliotecaException e) {
            System.out.println("\tError num: (" + e.getCodError() + "): " + e.getMessage());
        }
        
        try {            
            System.out.println("Acción dias prestamo negativo");
            revista1.setDiasPrestamo(-1);
        } catch (BibliotecaException e) {
            System.out.println("\tError num: (" + e.getCodError() + "): " + e.getMessage());
        }
        
        
        
        
    }
}
