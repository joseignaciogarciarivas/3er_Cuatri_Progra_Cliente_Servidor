/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.geometria;

/**
 *
 * @author Laboratorio
 */
public class Geometria {

    public static void main(String[] args) {
        Circulo miCirculo = new Circulo(18.5);
        
        System.out.println("Area del circulo: " + miCirculo.getArea());
        System.out.println("Perimetro del circulo: " + miCirculo.getPerimetro());
        
        Cuadrado miCuadrado = new Cuadrado(3);
        
        System.out.println("Area del Cuadrado: " + miCuadrado.getArea());
        System.out.println("Perimetro del Cuadrado: " + miCuadrado.getPerimetro());
        
        miCirculo.dibujar();
    }
    
}
