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

    private int cargaToneladas;

    public Camion() {
    }

    public Camion(String pMarca, String pModelo, int pCombustible, int cargaToneladas) {
        super(pMarca, pModelo, pCombustible);
        this.cargaToneladas = cargaToneladas;
    }

    public int getCargaToneladas() {
        return cargaToneladas;
    }

    public void setCargaToneladas(int cargaToneladas) {
        this.cargaToneladas = cargaToneladas;
    }

    @Override
    public int calcularAutonomia() {
        return (getCombustible() * 4) - (10 * cargaToneladas);
    }

    @Override
    public TipoVehiculo getTipoVehiculo() {
        return TipoVehiculo.CAMION;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\t rendimientoKmPorLitro = ").append(cargaToneladas);
        sb.append("\n\t Marca: ").append(getMarca());
        sb.append("\n\t Modelo: ").append(getModelo());
        sb.append("\n\t Combustible: ").append(getCombustible() + ("L"));
        return sb.toString();
    }
}
