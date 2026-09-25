package com.ejercicio_08.model;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author andresgonzalezgarcia
 */
public class Camion extends Vehiculo implements Dibujable {

    private int cargaToneladas;

    //Constructor Vacio
    public Camion() {

    }

    //Constructor con todos los parámetros
    public Camion(String pMarca,
            String pModelo,
            int pCombustible,
            int pCargaToneladas) {

        super(pMarca, pModelo, pCombustible);

        this.cargaToneladas = pCargaToneladas;

    }

    @Override
    public int calcularAutonomia() {
        return ((getCombustible() * 4) - (10 * cargaToneladas));
    }

    @Override
    public eTipoVehiculo getTipoVehiculo() {
        return eTipoVehiculo.CAMION;
    }

    @Override
    public void dibujar() {
        JFrame ventana = new JFrame("Camión");

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                int[] x = {25, 25, 275, 175, 100, 100};
                int[] y = {100, 150, 150, 50, 50, 100};

                g.drawOval(50, 150, 50, 50);
                g.drawOval(200, 150, 50, 50);
                g.drawPolygon(x, y, 6);
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

        sb.append("\nMarca: ").append(getMarca());
        sb.append("\nModelo: ").append(getModelo());
        sb.append("\nCombustible ").append(getCombustible());
        sb.append("\nCarga en Toneladas: ").append(cargaToneladas);

        return sb.toString();
    }

}
