package com.mycompany.ejercicio_05;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author José Ignacio Garcia Rivas
 */
public class Cuadrado extends Forma implements Dibujable{

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
        sb.append("Cuadrado{");
        sb.append("lado=").append(lado);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double getArea() {
        return Math.pow(lado, 2);
    }

    @Override
    public double getPerimetro() {
        return lado * 4;
    }

    @Override
    public void dibujar() {
        JFrame ventana = new JFrame("Cuadrado");

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                g.drawRect(50, 50, 150, 150);
            }

        };
        ventana.add(panel);
        ventana.setSize(270, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}

