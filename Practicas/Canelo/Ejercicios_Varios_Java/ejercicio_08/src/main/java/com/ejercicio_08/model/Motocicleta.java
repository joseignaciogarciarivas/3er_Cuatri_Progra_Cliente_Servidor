package com.ejercicio_08.model;

import java.awt.BasicStroke;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 *
 * @author andresgonzalezgarcia
 */
public class Motocicleta extends Vehiculo implements Dibujable {

    private int rendimientoKmPorLitro;

    //Constructor Vacio
    public Motocicleta() {

    }

    //Constructor con todos los parámetros
    public Motocicleta(String pMarca,
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
        return eTipoVehiculo.MOTOCICLETA;
    }

    @Override
    public void dibujar() {
        JFrame ventana = new JFrame("Motocicleta");

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                Graphics2D g2 = (Graphics2D) g;
                g2.setStroke(new BasicStroke(2));
//                //Cuadricula
//                g.drawLine(000, 00, 400, 00);
//                g.drawLine(000, 25, 400, 25);
//                g.drawLine(000, 50, 400, 50);
//                g.drawLine(000, 75, 400, 75);
//                g.drawLine(000, 100, 400, 100);
//                g.drawLine(000, 125, 400, 125);
//                g.drawLine(000, 150, 400, 150);
//                g.drawLine(000, 175, 400, 175);g.setColor(Color.RED);g2.setStroke(new BasicStroke(2));
//                g.drawLine(000, 200, 400, 200);g.setColor(Color.BLACK);g2.setStroke(new BasicStroke(1));
//                g.drawLine(000, 225, 400, 225);
//                g.drawLine(000, 250, 400, 250);
//                g.drawLine(000, 275, 400, 275);
//                g.drawLine(000, 300, 400, 300);
//                g.drawLine(000, 325, 400, 325);
//                g.drawLine(000, 350, 400, 350);
//                g.drawLine(000, 375, 400, 375);
//                g.drawLine(000, 400, 400, 400);
//
//                g.drawLine(0, 000, 000, 400);
//                g.drawLine(25, 000, 25, 400);
//                g.drawLine(50, 000, 50, 400);
//                g.drawLine(75, 000, 75, 400);
//                g.drawLine(100, 000, 100, 400);
//                g.drawLine(125, 000, 125, 400);
//                g.drawLine(150, 000, 150, 400);
//                g.drawLine(175, 000, 175, 400);g.setColor(Color.RED);g2.setStroke(new BasicStroke(2));
//                g.drawLine(200, 000, 200, 400);g.setColor(Color.BLACK);g2.setStroke(new BasicStroke(1));
//                g.drawLine(225, 000, 225, 400);
//                g.drawLine(250, 000, 250, 400);
//                g.drawLine(275, 000, 275, 400);
//                g.drawLine(300, 000, 300, 400);
//                g.drawLine(325, 000, 325, 400);
//                g.drawLine(350, 000, 350, 400);
//                g.drawLine(375, 000, 375, 400);
//                g.drawLine(400, 000, 400, 400);
                
                g2.setRenderingHint(
                        RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON
                );

                Color grisOscuro = new Color(50, 50, 50);
                Color grisMedio = new Color(120, 120, 120);
                Color grisClaro = new Color(190, 190, 190);
                Color grisClaroo = new Color(230, 230, 230);

                //Ruedas
                g.setColor(Color.BLACK);g.fillOval(25, 175, 100, 100);
                g.setColor(Color.WHITE);g.fillOval(35, 185, 80, 80);
                
                g.setColor(grisClaro);g.fillOval(55, 205, 40, 40);                
                
                g.setColor(Color.BLACK);g.fillOval(275, 175, 100, 100);
                g.setColor(Color.WHITE);g.fillOval(285, 185, 80, 80);
                
                g.setColor(grisClaro);g.fillOval(305, 205, 40, 40); 

                //MOTO                
                int[] x = {75, 125, 150};
                int[] y = {225, 175, 200};
                g.setColor(grisClaro);  g.fillPolygon(x, y, 3);
                g.setColor(Color.BLACK);g.drawPolygon(x, y, 3);

                x = new int[]{75, 150, 175};
                y = new int[]{225, 200, 225};
                g.setColor(grisMedio);  g.fillPolygon(x, y, 3);
                g.setColor(Color.BLACK);g.drawPolygon(x, y, 3);

                x = new int[]{125, 175, 175};
                y = new int[]{175, 200, 225};
                g.setColor(grisMedio);  g.fillPolygon(x, y, 3);
                g.setColor(Color.BLACK);g.drawPolygon(x, y, 3);
                
                x = new int[]{150, 150, 175};
                y = new int[]{225, 250, 225};
                g.setColor(grisClaro);  g.fillPolygon(x, y, 3);
                g.setColor(Color.BLACK);g.drawPolygon(x, y, 3);
                
                x = new int[]{250, 150, 175};
                y = new int[]{265, 250, 225};
                g.setColor(grisClaro);  g.fillPolygon(x, y, 3);
                g.setColor(Color.BLACK);g.drawPolygon(x, y, 3);
                
                x = new int[]{250, 250, 175};
                y = new int[]{265, 235, 225};
                g.setColor(grisMedio);  g.fillPolygon(x, y, 3);
                g.setColor(Color.BLACK);g.drawPolygon(x, y, 3);
                
                x = new int[]{250, 250, 265};
                y = new int[]{265, 235, 200};
                g.setColor(grisMedio);  g.fillPolygon(x, y, 3);
                g.setColor(Color.BLACK);g.drawPolygon(x, y, 3);
                
                x = new int[]{175, 250, 265};
                y = new int[]{225, 235, 150};
                g.setColor(grisClaro);  g.fillPolygon(x, y, 3);
                g.setColor(Color.BLACK);g.drawPolygon(x, y, 3);
                
                x = new int[]{285, 250, 265};
                y = new int[]{150, 235, 150};
                g.setColor(grisClaroo);  g.fillPolygon(x, y, 3);
                g.setColor(Color.BLACK);g.drawPolygon(x, y, 3);
                
                x = new int[]{285, 300, 265};
                y = new int[]{150, 125, 150};
                g.setColor(grisMedio);  g.fillPolygon(x, y, 3);
                g.setColor(Color.BLACK);g.drawPolygon(x, y, 3);
                
                x = new int[]{285, 300, 315};
                y = new int[]{150, 125, 150};
                g.setColor(grisOscuro);  g.fillPolygon(x, y, 3);
                g.setColor(Color.BLACK);g.drawPolygon(x, y, 3);
                
                x = new int[]{285, 280, 315};
                y = new int[]{150, 165, 150};
                g.setColor(grisOscuro);  g.fillPolygon(x, y, 3);
                g.setColor(Color.BLACK);g.drawPolygon(x, y, 3);
                
                x = new int[]{325, 280, 290};
                y = new int[]{225, 165, 160};
                g.setColor(grisOscuro);  g.fillPolygon(x, y, 3);
                g.setColor(Color.BLACK);g.drawPolygon(x, y, 3);
                
                x = new int[]{325, 280, 271};
                y = new int[]{225, 165, 185};
                g.setColor(grisMedio);  g.fillPolygon(x, y, 3);
                g.setColor(Color.BLACK);g.drawPolygon(x, y, 3);
                
                x = new int[]{325, 325, 303};
                y = new int[]{225, 175, 185};
                g.setColor(grisClaro);  g.fillPolygon(x, y, 3);
                g.setColor(Color.BLACK);g.drawPolygon(x, y, 3);
                
                x = new int[]{325, 290, 303};
                y = new int[]{175, 160, 185};
                g.setColor(grisMedio);  g.fillPolygon(x, y, 3);
                g.setColor(Color.BLACK);g.drawPolygon(x, y, 3);
                
                x = new int[]{300, 250, 265};
                y = new int[]{125, 125, 100};
                g.setColor(grisClaro);  g.fillPolygon(x, y, 3);
                g.setColor(Color.BLACK);g.drawPolygon(x, y, 3);
                
                x = new int[]{300, 250, 265};
                y = new int[]{125, 125, 150};
                g.setColor(grisOscuro);  g.fillPolygon(x, y, 3);
                g.setColor(Color.BLACK);g.drawPolygon(x, y, 3);
                
                x = new int[]{225, 175, 265};
                y = new int[]{150, 225, 150};
                g.setColor(grisClaroo);  g.fillPolygon(x, y, 3);
                g.setColor(Color.BLACK);g.drawPolygon(x, y, 3);
                
                x = new int[]{225, 175, 175};
                y = new int[]{150, 225, 185};
                g.setColor(grisOscuro);  g.fillPolygon(x, y, 3);
                g.setColor(Color.BLACK);g.drawPolygon(x, y, 3);
                
                x = new int[]{225, 175, 185};
                y = new int[]{150, 185, 150};
                g.setColor(grisOscuro);  g.fillPolygon(x, y, 3);
                g.setColor(Color.BLACK);g.drawPolygon(x, y, 3);
                
                x = new int[]{225, 200, 185};
                y = new int[]{150, 125, 150};
                g.setColor(grisMedio);  g.fillPolygon(x, y, 3);
                g.setColor(Color.BLACK);g.drawPolygon(x, y, 3);
                
                x = new int[]{225, 200, 235};
                y = new int[]{150, 125, 135};
                g.setColor(grisClaroo);  g.fillPolygon(x, y, 3);
                g.setColor(Color.BLACK);g.drawPolygon(x, y, 3);
                
                x = new int[]{225, 257, 235};
                y = new int[]{150, 135, 135};
                g.setColor(grisOscuro);  g.fillPolygon(x, y, 3);
                g.setColor(Color.BLACK);g.drawPolygon(x, y, 3);
                
                x = new int[]{125, 175, 185};
                y = new int[]{130, 185, 150};
                g.setColor(grisMedio);  g.fillPolygon(x, y, 3);
                g.setColor(Color.BLACK);g.drawPolygon(x, y, 3);
                
                x = new int[]{125, 175, 115};
                y = new int[]{130, 185, 130};
                g.setColor(grisMedio);  g.fillPolygon(x, y, 3);
                g.setColor(Color.BLACK);g.drawPolygon(x, y, 3);
                
                x = new int[]{125, 115, 115};
                y = new int[]{130, 115, 130};
                g.setColor(grisMedio);  g.fillPolygon(x, y, 3);
                g.setColor(Color.BLACK);g.drawPolygon(x, y, 3);
                
                x = new int[]{75, 115, 115};
                y = new int[]{125, 115, 130};
                g.setColor(grisClaro);  g.fillPolygon(x, y, 3);
                g.setColor(Color.BLACK);g.drawPolygon(x, y, 3);
                
                x = new int[]{75, 115, 115};
                y = new int[]{125, 145, 130};
                g.setColor(grisOscuro);  g.fillPolygon(x, y, 3);
                g.setColor(Color.BLACK);g.drawPolygon(x, y, 3);
                
                x = new int[]{175, 115, 115};
                y = new int[]{200, 145, 130};
                g.setColor(grisMedio);  g.fillPolygon(x, y, 3);
                g.setColor(Color.BLACK);g.drawPolygon(x, y, 3);
                
                x = new int[]{175, 175, 115};
                y = new int[]{200, 185, 130};
                g.setColor(grisMedio);  g.fillPolygon(x, y, 3);
                g.setColor(Color.BLACK);g.drawPolygon(x, y, 3);

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
        sb.append("\n\tRendimiento (km * L): ").append(rendimientoKmPorLitro);

        return sb.toString();
    }

}
