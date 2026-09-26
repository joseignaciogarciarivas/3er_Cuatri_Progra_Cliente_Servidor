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
public class Motocicleta extends Vehiculo implements Dibujable {

    private double rendimientoKmPorLitro;

    public Motocicleta() {
    }

    public Motocicleta(double rendimientoKmPorLitro) {
        this.rendimientoKmPorLitro = rendimientoKmPorLitro;
    }

    public double getRendimientoKmPorLitro() {
        return rendimientoKmPorLitro;
    }

    public void setRendimientoKmPorLitro(double rendimientoKmPorLitro) {
        this.rendimientoKmPorLitro = rendimientoKmPorLitro;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Motocicleta{");
        sb.append("rendimientoKmPorLitro=").append(rendimientoKmPorLitro);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calcularAutonomia() {
        return getCombustible() * rendimientoKmPorLitro;
    }

    @Override
    public String getTipoVehiculo() {
        return "Motocicleta";
    }

    @Override
    public void dibujar() {
        JFrame ventana = new JFrame("Motocicleta");
        JPanel panel = new JPanel() {
            protected void paintComponent(Graphics g) {

                int[] x = {300,300, 275, 250,285, 225, 200, 250, 125, 25, 50, 125,225};
                int[] y = {100, 150, 125, 75, 175, 125, 175, 175, 125, 125,200, 250, 250};
                g.drawPolygon(x, y, 13);
            }
        };
        ventana.add(panel);
        ventana.setSize(400, 400);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);

    }

}
