package com.tarea1;

import java.util.Comparator;

/**
 *
 * @author Usuario
 */
public abstract class Empleado implements Comparable<Empleado>{

    private String id;
    private String nombre;
    private String numeroTel;
    private String correo;

    public abstract double calcularPago();

    public Empleado() {
    }

    public Empleado(String pId, String pNombre, String pNumeroTel, String pCorreo) {

        this.id = pId;
        this.nombre = pNombre;
        this.numeroTel = pNumeroTel;
        this.correo = pCorreo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws EmpleadoExceptions {

        if (nombre.trim().length() == 0) {
            throw new EmpleadoExceptions(1, "El nombre no tiene caracteres");
        }

        this.nombre = nombre;
    }

    public String getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(String numeroTel) throws EmpleadoExceptions {
        if (numeroTel.trim().length() == 0) {
            throw new EmpleadoExceptions(2, "El numero no tiene caracteres");
        }

        this.numeroTel = numeroTel;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) throws EmpleadoExceptions {
        if (correo.trim().length() == 0) {
            throw new EmpleadoExceptions(3, "El correo no tiene caracteres");
        }

        this.correo = correo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("cedula=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", numeroTel=").append(numeroTel);
        sb.append(", correo=").append(correo);
        sb.append('}');
        return sb.toString();
    }
    
    @Override
    public int compareTo(Empleado otro) {
        return this.id.compareToIgnoreCase(otro.id);
    }
}
