package com.ejercicio_09.model;

/**
 *
 * @author andresgonzalezgarcia
 */
public abstract class Empleado implements Comparable<Empleado> {

    //Declaración de Variables Globales de la Clase
    private String identificacion;
    private String nombre;
    private String telefono;
    private String correo;

    //Constructor Vacio
    public Empleado() {

    }

    //Constructor con todos los parametros
    public Empleado(String pIdentificacion, String pNombre, String pTelefono,
            String pCorreo) {
        this.identificacion = pIdentificacion;
        this.nombre = pNombre;
        this.telefono = pTelefono;
        this.correo = pCorreo;
    }

    //Gets & Sets
    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    //Métodos y Funciones
    public abstract double CalcularPago();

//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//                
//        sb.append("\nID:\t\t").append(identificacion);
//        sb.append("\nNombre:\t\t").append(nombre);
//        sb.append("\nTeléfono:\t").append(telefono);
//        sb.append("\nCorreo:\t\t").append(correo);
//        
//        return sb.toString();
//    }
    @Override
    public String toString() {

        return String.format("%s \t%s \t%s \t%s",
                identificacion,
                nombre.substring(0,Math.min(nombre.length(),10)),
                telefono.substring(0,Math.min(telefono.length(),10)),
                correo.substring(0,Math.min(correo.length(),30)));

    }

}
