/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.formas;

/**
 *
 * @author Laboratorio
 */
public class Formas {

    public static void main(String[] args) {
        
        Circulo miCirculo = new Circulo(18.5);
        
        System.out.println("Area del circulo: " + miCirculo.getArea());
        System.out.println("Perimetro del circulo: " + miCirculo.getPerimetro());
        miCirculo.dibujar();
    }
}
