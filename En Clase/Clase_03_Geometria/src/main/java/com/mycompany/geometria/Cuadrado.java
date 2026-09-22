/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.geometria;

/**
 *
 * @author Laboratorio
 */
public class Cuadrado extends Forma {
    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cuadraro{");
        sb.append("lado=").append(lado);
        sb.append('}');
        return sb.toString();
    }
    
    public double getArea(){
        double area = 0;
        area = lado * lado;
        return area;
    }
    public double getPerimetro(){
        double perimetro = 0;
        perimetro = lado * 4;
        return perimetro;
    }
}
