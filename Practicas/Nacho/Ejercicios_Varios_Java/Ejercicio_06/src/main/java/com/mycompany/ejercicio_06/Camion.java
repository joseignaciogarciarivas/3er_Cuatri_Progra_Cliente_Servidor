/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_06;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Jose Ignacio Garcia Rivas
 */
public class Camion extends Vehiculo implements Dibujable {

    private double cargaToneladas;

    public Camion() {
    }

    public Camion(double cargaToneladas) {
        this.cargaToneladas = cargaToneladas;
    }

    public double getCargaToneladas() {
        return cargaToneladas;
    }

    public void setCargaToneladas(double cargaToneladas) {
        this.cargaToneladas = cargaToneladas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Camion{");
        sb.append("cargaToneladas=").append(cargaToneladas);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calcularAutonomia() {
        return (getCombustible() * 4) - (10 * cargaToneladas);
    }

    @Override
    public String getTipoVehiculo() {
        return "Camion";
    }

    @Override
    public void dibujar() {
        JFrame ventana = new JFrame("Camion");
        JPanel panel = new JPanel() {
            protected void paintComponent(Graphics g) {
                
                int[] x = {};
                int[] y = {};

                g.drawPolygon(x, y, 0);
            }
        };
        ventana.add(panel);
        ventana.setSize(400, 400);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);

    }
}
