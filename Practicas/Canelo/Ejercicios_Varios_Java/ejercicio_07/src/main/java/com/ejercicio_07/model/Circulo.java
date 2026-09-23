package com.ejercicio_07.model;

//import com.ejercicio_07.model.Forma;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

//import com.ejercicio_07.model.Dibujable;
//
//import javax.swing.*;
//import java.awt.*;
/**
 *
 * @author Andrés González García
 */
public class Circulo extends Forma implements Dibujable {

    //Declaración de Variables Globales de la Clase
    private double radio;

    //Constructor con todos los parámetros
    public Circulo(double pRadio) {
        this.radio = pRadio;
    }

    //Gets & Sets
    public double getRadio() {
        return radio;
    }

    public void setRadio(double pRadio) {
        this.radio = pRadio;
    }

    //Metodos y Funciones
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Radio: ").append(radio);
        return sb.toString();
    }

    @Override
    public double getArea() {
        //pi * r ^ 2
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double getPerimetro() {
        //2pi * r
        return 2 * Math.PI * radio;
    }

    @Override
    public void dibujar() {
        JFrame ventana = new JFrame();

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {

//                int[] x = {100, 200, 300};
//                int[] y = {200, 100, 200};
//                
//                g.drawPolygon(x, y, 3);
//                
                g.drawLine(200, 300, 300, 200);
                g.drawLine(100, 200, 200, 300);
                g.drawLine(100, 200, 300, 200);
            }
        };

        ventana.add(panel);
        ventana.setSize(400, 400);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }

}
