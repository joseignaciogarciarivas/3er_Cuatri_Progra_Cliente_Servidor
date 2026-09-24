package com.ejercicio_08.model;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author andresgonzalezgarcia
 */
public class Automovil extends Vehiculo implements Dibujable {

    private int rendimientoKmPorLitro;

    //Constructor Vacio
    public Automovil() {

    }

    //Constructor con todos los parámetros
    public Automovil(String pMarca,
            String pModelo,
            int pCombustible,
            int pRendimientoKmPorLitro) {

        super(pMarca, pModelo, pCombustible);

        this.rendimientoKmPorLitro = pRendimientoKmPorLitro;

    }

    @Override
    public int calcularAutonomia() {
        return getCombustible() * rendimientoKmPorLitro;
    }

    @Override
    public eTipoVehiculo getTipoVehiculo() {
        return eTipoVehiculo.AUTOMOVIL;
    }

    @Override
    public void dibujar() {
        JFrame ventana = new JFrame("Automovil");

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                int[] x = {25, 25, 275, 175,100,100};
                int[] y = {100, 150, 150, 50,50,100};
                
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
        sb.append("\nRendimiento (km * L): ").append(rendimientoKmPorLitro);

        return sb.toString();
    }

}
