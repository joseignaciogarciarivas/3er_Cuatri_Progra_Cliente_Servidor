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
public class Automovil extends Vehiculo implements Dibujable {

    private double rendimientoKmPorLitro;

    public Automovil() {
    }

    public Automovil(double rendimientoKmPorLitro) {
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
        sb.append("Automovil{");
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
        return "Automovil";
    }

    @Override
    public void dibujar() {
        JFrame ventana = new JFrame("Automovil");
        JPanel panel = new JPanel() {
            protected void paintComponent(Graphics g) {
                g.fillOval(60, 250, 100, 100);
                g.fillOval(240, 250, 100, 100);
                int[] x = {100,300,320, 380, 380, 350,250, 150, 50, 20, 20, 80};
                int[] y = {100,100, 200, 200, 300, 300, 300, 300, 300, 300, 200, 200};
                g.drawPolygon(x, y, 12);
                
                
            }
        };
        ventana.add(panel);
        ventana.setSize(400, 400);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }

}
