package com.ejercicio_07.model;

/**
 * <h2>Interfaz Dibujable</h2>
 *
 * Define el comportamiento necesario para que un objeto pueda ser
 * representado gráficamente.
 *
 * <p>
 * Cualquier clase que implemente esta interfaz deberá proporcionar
 * una implementación del método {@code dibujar()}, encargada de
 * mostrar o renderizar visualmente el objeto.
 * </p>
 *
 * <p>
 * Esta interfaz permite aplicar polimorfismo a objetos que, aunque
 * pertenezcan a clases diferentes, compartan la capacidad de dibujarse.
 * </p>
 *
 * <pre>
 * Dibujable figura1 = new Circulo(5);
 * Dibujable figura2 = new Cuadrado(4);
 * Dibujable figura3 = new Triangulo(6);
 *
 * figura1.dibujar();
 * figura2.dibujar();
 * figura3.dibujar();
 * </pre>
 *
 * <p>
 * Gracias a esta interfaz, distintas figuras geométricas pueden ser
 * tratadas de manera uniforme cuando se desea representar gráficamente
 * su contenido.
 * </p>
 * 
 * <b>Dibujable</b> describe una capacidad o comportamiento
 * ("puede dibujarse"), independientemente de la forma geométrica
 * que implemente dicha funcionalidad.
 *
 * <h3>Clases implementadoras</h3>
 * <ul>
 *   <li>{@link Circulo}</li>
 *   <li>{@link Cuadrado}</li>
 *   <li>{@link TrianguloEquilatero}</li>
 * </ul>
 *
 * @author Andrés González García
 * @version 1.0
 * @since 1.0
 */
public interface Dibujable {

    /**
     * Realiza la representación gráfica del objeto.
     *
     * <p>
     * La forma específica del dibujo dependerá de la clase que implemente
     * esta interfaz.
     * </p>
     */
    void dibujar();
}