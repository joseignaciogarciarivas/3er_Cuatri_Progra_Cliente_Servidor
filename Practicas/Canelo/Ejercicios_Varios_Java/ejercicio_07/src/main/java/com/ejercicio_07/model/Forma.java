package com.ejercicio_07.model;

/**
 * <h2>Clase Abstracta Forma</h2>
 *
 * Representa el concepto general de una figura geométrica.
 *
 * <p>
 * Esta clase sirve como base para todas las figuras del sistema,
 * estableciendo un contrato común para el cálculo de área y perímetro.
 * </p>
 *
 * <p>
 * Al ser una clase abstracta, no puede ser instanciada directamente.
 * Debe ser heredada por clases concretas como:
 * </p>
 *
 * <ul>
 *   <li>{@link Circulo}</li>
 *   <li>{@link Cuadrado}</li>
 *   <li>{@link Triangulo}</li>
 * </ul>
 *
 * <p>
 * Cada figura es responsable de implementar sus propias fórmulas
 * geométricas mediante los métodos abstractos definidos en esta clase.
 * </p>
 *
 * <pre>
 * Forma figura = new Circulo(5);
 *
 * System.out.println(figura.getArea());
 * System.out.println(figura.getPerimetro());
 * </pre>
 *
 * <p>
 * Este diseño permite aplicar <b>polimorfismo</b>, ya que distintas
 * figuras pueden ser tratadas como objetos de tipo {@code Forma},
 * independientemente de su implementación concreta.
 * </p>
 *
 * @author Andrés González García
 * @version 1.0
 * @since 1.0
 */
public abstract class Forma {

    /**
     * Calcula el área de la figura geométrica.
     *
     * <p>
     * La fórmula utilizada dependerá de la figura que implemente
     * este método.
     * </p>
     *
     * @return área de la figura.
     */
    public abstract double getArea();

    /**
     * Calcula el perímetro de la figura geométrica.
     *
     * <p>
     * La fórmula utilizada dependerá de la figura que implemente
     * este método.
     * </p>
     *
     * @return perímetro de la figura.
     */
    public abstract double getPerimetro();
}