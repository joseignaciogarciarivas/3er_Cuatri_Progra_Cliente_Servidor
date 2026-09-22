package com.ejercicio_07;

import com.ejercicio_07.formas.Circulo;

public class Formas {

    public static void main(String[] args) {

        Circulo miCirculo = new Circulo(18.5);

        System.out.println("Area del circulo: " + miCirculo.getArea());
        System.out.println("Perimetro del circulo: " + miCirculo.getPerimetro());
        miCirculo.dibujar();
    }
}
