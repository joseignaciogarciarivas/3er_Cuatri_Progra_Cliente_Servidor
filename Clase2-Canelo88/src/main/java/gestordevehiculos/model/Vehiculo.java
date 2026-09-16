package gestordevehiculos.model;

import java.awt.Color;

public class Vehiculo {

    private String marca;
    private String numeroChasis;
    private Motor motor; // Composicion usar una clase dentro de una clase
    private String traccion;
    private int cantPuertas;
    private int cantAsientos;
    private Color color;
    private String modelo;
    private int anioFabricacion;
    private static int cantidadVehiculos = 0;

    public Vehiculo(String marca, String numeroChasis, Motor motor) {
        this.marca = marca;
        this.numeroChasis = numeroChasis;
        this.motor = motor;
    }

    public Vehiculo(String marca, String numeroChasis, Motor motor, String traccion, int cantPuertas, int cantAsientos, Color color, String modelo, int anioFabricacion) {
        this.marca = marca;
        this.numeroChasis = numeroChasis;
        this.motor = motor;
        this.traccion = traccion;
        this.cantPuertas = cantPuertas;
        this.cantAsientos = cantAsientos;
        this.color = color;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;

        cantidadVehiculos++;
    }

    public static int getCantidadVehiculos() {
        return cantidadVehiculos;
    }

    public static void setCantidadVehiculos(int cantidadVehiculos) {
        Vehiculo.cantidadVehiculos = cantidadVehiculos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehiculo{");
        sb.append("marca=").append(marca);
        sb.append(", numeroChasis=").append(numeroChasis);
        sb.append(", motor=").append(motor);
        sb.append(", traccion=").append(traccion);
        sb.append(", cantPuertas=").append(cantPuertas);
        sb.append(", cantAsientos=").append(cantAsientos);
        sb.append(", color=").append(color);
        sb.append(", modelo=").append(modelo);
        sb.append(", anioFabricacion=").append(anioFabricacion);
        sb.append('}');
        return sb.toString();
    }

}
