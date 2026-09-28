package com.ejercicio_07.model;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * <h2>Figura Geométrica: Círculo</h2>
 *
 * Representa un círculo definido por su radio y proporciona operaciones para:
 *
 * <ul>
 *   <li>Calcular su área.</li>
 *   <li>Calcular su perímetro o circunferencia.</li>
 *   <li>Mostrar una representación gráfica en una ventana Swing.</li>
 * </ul>
 *
 * <p>
 * Esta clase hereda de {@link Forma}, por lo que implementa los cálculos
 * básicos de una figura geométrica, e implementa la interfaz
 * {@link Dibujable} para permitir su representación visual.
 * </p>
 *
 * <p>
 * <b>Nota:</b> El dibujo generado por el método {@code dibujar()} tiene un
 * tamaño fijo y se utiliza únicamente con fines demostrativos.
 * </p>
 *
 * <pre>
 * Ejemplo de uso:
 *
 * Circulo circulo = new Circulo(10);
 *
 * System.out.println("Área: " + circulo.getArea());
 * System.out.println("Perímetro: " + circulo.getPerimetro());
 *
 * circulo.dibujar();
 * </pre>
 *
 * @author Andrés González García
 * @version 1.0
 * @since 1.0
 */
public class Circulo extends Forma implements Dibujable {

    /**
     * Radio del círculo.
     */
    private double radio;

    /**
     * Construye un círculo con el radio especificado.
     *
     * @param pRadio valor del radio del círculo.
     */
    public Circulo(double pRadio) {
        this.radio = pRadio;
    }

    /**
     * Obtiene el radio actual del círculo.
     *
     * @return radio del círculo.
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Modifica el radio del círculo.
     *
     * @param pRadio nuevo valor del radio.
     */
    public void setRadio(double pRadio) {
        this.radio = pRadio;
    }

    /**
     * Devuelve una representación textual del objeto.
     *
     * @return cadena con la información del radio.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Radio: ").append(radio);
        return sb.toString();
    }

    /**
     * Calcula el área del círculo utilizando la fórmula:
     *
     * <pre>
     * Área = π × r²
     * </pre>
     *
     * @return área del círculo.
     */
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    /**
     * Calcula el perímetro o circunferencia del círculo utilizando la fórmula:
     *
     * <pre>
     * Perímetro = 2 × π × r
     * </pre>
     *
     * @return perímetro del círculo.
     */
    @Override
    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

    /**
     * Dibuja una representación gráfica del círculo en una ventana Swing.
     *
     * <p>
     * Se crea un {@link JFrame} que contiene un {@link JPanel}, donde
     * se sobrescribe el método {@code paintComponent(Graphics g)}
     * para renderizar un círculo mediante la función
     * {@code drawOval()}.
     * </p>
     *
     * @see Graphics#drawOval(int, int, int, int)
     */
    @Override
    public void dibujar() {
        JFrame ventana = new JFrame();

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                g.drawOval(50, 50, 150, 150);
            }
        };

        ventana.add(panel);
        ventana.setSize(400, 400);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}