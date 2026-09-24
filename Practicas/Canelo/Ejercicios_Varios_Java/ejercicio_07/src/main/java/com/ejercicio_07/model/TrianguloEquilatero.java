package com.ejercicio_07.model;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * <h2>Figura Geométrica: Triángulo Equilátero</h2>
 *
 * Representa un triángulo equilátero definido por la longitud de uno de sus
 * lados y proporciona operaciones para:
 *
 * <ul>
 * <li>Calcular su área.</li>
 * <li>Calcular su perímetro.</li>
 * <li>Mostrar una representación gráfica en una ventana Swing.</li>
 * </ul>
 *
 * <p>
 * Esta clase hereda de {@link Forma}, implementando los cálculos geométricos
 * requeridos para una figura, e implementa la interfaz {@link Dibujable} para
 * permitir su representación visual.
 * </p>
 *
 * <p>
 * <b>Nota:</b> Se asume que todos los lados del triángulo tienen la misma
 * longitud, cumpliendo la definición de triángulo equilátero.
 * </p>
 *
 * <pre>
 * Ejemplo de uso:
 *
 * Triangulo triangulo = new Triangulo(6);
 *
 * System.out.println("Área: " + triangulo.getArea());
 * System.out.println("Perímetro: " + triangulo.getPerimetro());
 *
 * triangulo.dibujar();
 * </pre>
 *
 * @author Andrés González García
 * @version 1.0
 * @since 1.0
 */
public class TrianguloEquilatero extends Forma implements Dibujable {

    /**
     * Longitud del lado del triángulo equilátero.
     */
    private double lado;

    /**
     * Construye un triángulo equilátero con la longitud de lado especificada.
     *
     * @param pLado longitud del lado del triángulo.
     */
    public TrianguloEquilatero(double pLado) {
        this.lado = pLado;
    }

    /**
     * Obtiene la longitud actual del lado del triángulo.
     *
     * @return longitud del lado.
     */
    public double getLado() {
        return lado;
    }

    /**
     * Modifica la longitud del lado del triángulo.
     *
     * @param pLado nueva longitud del lado.
     */
    public void setLado(double pLado) {
        this.lado = pLado;
    }

    /**
     * Devuelve una representación textual del objeto.
     *
     * @return cadena con la información del lado del triángulo.
     */
    @Override
    public String toString() {
        return "Lado: " + lado;
    }

    /**
     * Calcula el área del triángulo equilátero utilizando la fórmula:
     *
     * <pre>
     * Área = (√3 / 4) × lado²
     * </pre>
     *
     * @return área del triángulo.
     */
    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * Math.pow(lado, 2);
    }

    /**
     * Calcula el perímetro del triángulo equilátero utilizando la fórmula:
     *
     * <pre>
     * Perímetro = 3 × lado
     * </pre>
     *
     * @return perímetro del triángulo.
     */
    @Override
    public double getPerimetro() {
        return lado * 3;
    }

    /**
     * Dibuja una representación gráfica de un triángulo equilátero en una
     * ventana Swing.
     *
     * <p>
     * Se crea un {@link JFrame} que contiene un {@link JPanel}, donde se
     * sobrescribe el método {@code paintComponent(Graphics g)} para renderizar
     * el triángulo mediante la función {@code drawPolygon()}.
     * </p>
     *
     * <p>
     * El triángulo se construye a partir de tres vértices definidos por
     * arreglos de coordenadas X e Y.
     * </p>
     *
     * <pre>
     *       (150,50)
     *           ▲
     *          / \
     *         /   \
     *        /     \
     *       /       \
     * (75,200)----- (225,200)
     * </pre>
     *
     * @see Graphics#drawPolygon(int[], int[], int)
     */
    @Override
    public void dibujar() {

        JFrame ventana = new JFrame("Triángulo Equilátero");

        JPanel panel = new JPanel() {

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                int[] x = {150, 75, 225};
                int[] y = {50, 200, 200};

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
