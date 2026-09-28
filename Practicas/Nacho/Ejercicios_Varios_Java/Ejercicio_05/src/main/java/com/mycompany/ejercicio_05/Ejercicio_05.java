package com.mycompany.ejercicio_05;

/**
 *
 * @author José Ignacio Garcia Rivas
 */
public class Ejercicio_05 {

    public static void main(String[] args) {
        
        Circulo miCirculo = new Circulo(20);
        
        System.out.println("El area del circulo: " + miCirculo.getArea());
        System.out.println("El perimetro del circulo: " + miCirculo.getPerimetro());
        
        miCirculo.dibujar();
        
        Cuadrado miCuadrado = new Cuadrado(20);
        
        System.out.println("El area del cuadrado: " + miCuadrado.getArea());
        System.out.println("El perimetro del cuadrado: " + miCuadrado.getPerimetro());
        
        miCuadrado.dibujar();
        
        Triangulo miTriangulo = new Triangulo(200, 200, 100);
        
        System.out.println("El area del  Triangulo: " + miTriangulo.getArea());
        System.out.println("El perimetro del  Triangulo: " + miTriangulo.getPerimetro());
        
        miTriangulo.dibujar();
        
    }
}
