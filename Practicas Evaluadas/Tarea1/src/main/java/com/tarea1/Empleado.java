/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tarea1;

/**
 *
 * @author Usuario
 */
public abstract class Empleado {

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
            throw new EmpleadoExceptions(01, "El nombre no tiene caracteres");
        }

        this.nombre = nombre;
    }

    public String getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(String numeroTel) throws EmpleadoExceptions {
        if (numeroTel.trim().length() == 0) {
            throw new EmpleadoExceptions(02, "El numero no tiene caracteres");
        }

        this.numeroTel = numeroTel;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) throws EmpleadoExceptions {
        if (correo.trim().length() == 0) {
            throw new EmpleadoExceptions(03, "El correo no tiene caracteres");
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

}
