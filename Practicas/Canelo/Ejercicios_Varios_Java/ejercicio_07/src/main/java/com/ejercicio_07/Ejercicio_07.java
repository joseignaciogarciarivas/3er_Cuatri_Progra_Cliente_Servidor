package com.ejercicio_07;

import com.ejercicio_07.model.*;

/**
 * <h1>Ejercicio 07: Figuras Geométricas</h1>
 *
 * Aplicación de prueba para demostrar el uso de herencia, clases abstractas,
 * interfaces y polimorfismo en Java.
 *
 * <p>
 * El programa crea instancias de diferentes figuras geométricas y utiliza sus
 * comportamientos comunes definidos por la jerarquía de clases del proyecto.
 * </p>
 *
 * <h2>Conceptos aplicados</h2>
 * <ul>
 *   <li>Herencia mediante la clase abstracta {@link Forma}.</li>
 *   <li>Polimorfismo a través de métodos sobrescritos.</li>
 *   <li>Implementación de la interfaz {@link Dibujable}.</li>
 *   <li>Cálculo de áreas y perímetros.</li>
 *   <li>Dibujo de figuras utilizando la librería Swing.</li>
 * </ul>
 *
 * <h2>Flujo del programa</h2>
 * <ol>
 *   <li>Se crea un {@link Circulo}.</li>
 *   <li>Se crea un {@link Cuadrado}.</li>
 *   <li>Se crea un {@link TrianguloEquilatero}.</li>
 *   <li>Se calculan áreas y perímetros mediante referencias de tipo Forma.</li>
 *   <li>Se dibujan las figuras mediante referencias de tipo Dibujable.</li>
 * </ol>
 *
 * @author Andrés González García
 * @version 1.0
 * @since 1.0
 */
public class Ejercicio_07 {

    /**
     * Punto de entrada de la aplicación.
     *
     * @param args argumentos recibidos desde la línea de comandos.
     */
    public static void main(String[] args) {

        // Polimorfismo mediante la clase abstracta Forma
        Forma fCirculo = new Circulo(5);
        Forma fCuadrado = new Cuadrado(4);
        Forma fTriangulo = new TrianguloEquilatero(6);

        System.out.println("=== CÍRCULO ===");
        System.out.println("Área: " + fCirculo.getArea());
        System.out.println("Perímetro: " + fCirculo.getPerimetro());

        System.out.println("\n=== CUADRADO ===");
        System.out.println("Área: " + fCuadrado.getArea());
        System.out.println("Perímetro: " + fCuadrado.getPerimetro());

        System.out.println("\n=== TRIÁNGULO EQUILÁTERO ===");
        System.out.println("Área: " + fTriangulo.getArea());
        System.out.println("Perímetro: " + fTriangulo.getPerimetro());

        // Polimorfismo mediante la interfaz Dibujable
        Dibujable dCirculo = new Circulo(5);
        Dibujable dCuadrado = new Cuadrado(4);
        Dibujable dTriangulo = new TrianguloEquilatero(6);

        dCirculo.dibujar();
        dCuadrado.dibujar();
        dTriangulo.dibujar();
    }
}