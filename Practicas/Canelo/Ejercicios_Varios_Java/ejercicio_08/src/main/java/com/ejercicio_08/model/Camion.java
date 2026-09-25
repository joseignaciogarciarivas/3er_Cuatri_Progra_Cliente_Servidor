package com.ejercicio_08.model;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
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

                Graphics2D g2 = (Graphics2D) g;
                g2.setStroke(new BasicStroke(2));

                g2.setRenderingHint(
                        RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON
                );

                //Cabezal
                int[] x = {10, 10, 75, 75, 160, 160};
                int[] y = {250, 200, 200, 150, 150, 250};
                g.setColor(Color.GRAY);
                g.fillPolygon(x, y, 6);
                g.setColor(Color.BLACK);
                g.drawPolygon(x, y, 6);

                //Trailer
                x = new int[]{175, 175, 375, 375};
                y = new int[]{250, 150, 150, 250};
                g.setColor(Color.GRAY);
                g.fillPolygon(x, y, 4);
                g.setColor(Color.BLACK);
                g.drawPolygon(x, y, 4);

                // Ruedas cabezal
                g.setColor(Color.GRAY);
                g.fillOval(27, 235, 35, 35);
                //g.fillOval(75, 235, 35, 35);
                g.fillOval(115, 235, 35, 35);

                g.setColor(Color.BLACK);
                g.drawOval(27, 235, 35, 35);
                //g.drawOval(75, 235, 35, 35);
                g.drawOval(115, 235, 35, 35);

                // Ruedas trailer
                g.setColor(Color.GRAY);
                g.fillOval(285, 235, 35, 35);
                g.fillOval(325, 235, 35, 35);

                g.setColor(Color.BLACK);
                g.drawOval(285, 235, 35, 35);
                g.drawOval(325, 235, 35, 35);
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

        sb.append("\tMarca: ").append(getMarca());
        sb.append("\n\tModelo: ").append(getModelo());
        sb.append("\n\tCombustible ").append(getCombustible());
        sb.append("\n\tCarga en Toneladas: ").append(cargaToneladas);

        return sb.toString();
    }

}
