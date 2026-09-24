package com.ejercicio_07.model;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * <h2>Figura Geométrica: Cuadrado</h2>
 *
 * Representa un cuadrado definido por la longitud de uno de sus lados y
 * proporciona operaciones para:
 *
 * <ul>
 *   <li>Calcular su área.</li>
 *   <li>Calcular su perímetro.</li>
 *   <li>Mostrar una representación gráfica en una ventana Swing.</li>
 * </ul>
 *
 * <p>
 * Esta clase hereda de {@link Forma}, implementando los cálculos geométricos
 * requeridos por una figura, e implementa la interfaz {@link Dibujable}
 * para permitir su representación visual.
 * </p>
 *
 * <p>
 * <b>Nota:</b> El dibujo mostrado por el método {@code dibujar()} tiene un
 * tamaño fijo y se utiliza con fines educativos y demostrativos.
 * </p>
 *
 * <pre>
 * Ejemplo de uso:
 *
 * Cuadrado cuadrado = new Cuadrado(5);
 *
 * System.out.println("Área: " + cuadrado.getArea());
 * System.out.println("Perímetro: " + cuadrado.getPerimetro());
 *
 * cuadrado.dibujar();
 * </pre>
 *
 * @author Andrés González García
 * @version 1.0
 * @since 1.0
 */
public class Cuadrado extends Forma implements Dibujable {

    /**
     * Longitud de uno de los lados del cuadrado.
     */
    private double lado;

    /**
     * Construye un cuadrado con la longitud de lado especificada.
     *
     * @param pLado longitud del lado del cuadrado.
     */
    public Cuadrado(double pLado) {
        this.lado = pLado;
    }

    /**
     * Obtiene la longitud actual del lado del cuadrado.
     *
     * @return longitud del lado.
     */
    public double getLado() {
        return lado;
    }

    /**
     * Modifica la longitud del lado del cuadrado.
     *
     * @param pLado nueva longitud del lado.
     */
    public void setLado(double pLado) {
        this.lado = pLado;
    }

    /**
     * Devuelve una representación textual del objeto.
     *
     * @return cadena con la información del lado del cuadrado.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Lado: ").append(lado);
        return sb.toString();
    }

    /**
     * Calcula el área del cuadrado utilizando la fórmula:
     *
     * <pre>
     * Área = lado²
     * </pre>
     *
     * @return área del cuadrado.
     */
    @Override
    public double getArea() {
        return Math.pow(lado, 2);
    }

    /**
     * Calcula el perímetro del cuadrado utilizando la fórmula:
     *
     * <pre>
     * Perímetro = lado × 4
     * </pre>
     *
     * @return perímetro del cuadrado.
     */
    @Override
    public double getPerimetro() {
        return lado * 4;
    }

    /**
     * Dibuja una representación gráfica del cuadrado en una ventana Swing.
     *
     * <p>
     * Se crea un {@link JFrame} que contiene un {@link JPanel}, donde
     * se sobrescribe el método {@code paintComponent(Graphics g)}
     * para renderizar un cuadrado mediante la función
     * {@code drawRect()}.
     * </p>
     *
     * @see Graphics#drawRect(int, int, int, int)
     */
    @Override
    public void dibujar() {
        JFrame ventana = new JFrame("Cuadrado");

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                g.drawRect(50, 50, 150, 150);
            }
        };

        ventana.add(panel);
        ventana.setSize(400, 400);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}