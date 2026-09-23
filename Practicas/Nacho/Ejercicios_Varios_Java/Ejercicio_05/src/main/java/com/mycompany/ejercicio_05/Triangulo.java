package com.mycompany.ejercicio_05;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author José Ignacio Garcia Rivas
 */
  

    public class Triangulo extends Forma implements Dibujable {

        private double base;
        private double altura;
        private double lado;

        public Triangulo() {
        }

        public Triangulo(double base, double altura, double lado) {
            this.base = base;
            this.altura = altura;
            this.lado = lado;
        }

        public double getBase() {
            return base;
        }

        public void setBase(double base) {
            this.base = base;
        }

        public double getAltura() {
            return altura;
        }

        public void setAltura(double altura) {
            this.altura = altura;
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
            sb.append("Triangulo{");
            sb.append("base=").append(base);
            sb.append(", altura=").append(altura);
            sb.append(", lado=").append(lado);
            sb.append('}');
            return sb.toString();
        }

    @Override
    public double getArea() {
        return base * altura;
    }

    @Override
    public double getPerimetro() {
        return lado + lado + lado;
    }

    @Override
    public void dibujar() {

        JFrame ventana = new JFrame("Triangulo");
        JPanel panel = new JPanel() {

            protected void paintComponent(Graphics g) {

                int[] x = {200, 100, 300};
                int[] y = {100, 200, 200};

                g.drawPolygon(x, y, 3);
            }

        };
        ventana.add(panel);
        ventana.setSize(400, 400);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }


}