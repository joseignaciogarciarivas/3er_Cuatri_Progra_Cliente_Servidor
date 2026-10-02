package com.ejercicio_09.model.clsEmpleado;

import com.ejercicio_09.model.Excepciones.EmpleadoException;
import com.ejercicio_09.model.Excepciones.ErrorEmpleado;

/**
 *
 * @author andresgonzalezgarcia
 */
public class EmpleadoPorHoras extends Empleado implements Pagable {

    //Declaración de Variables Globales
    private int horasTrabajadas;
    private double valorHora;

    //Constructor Vacio
    public EmpleadoPorHoras() {

    }

    //Constructor con todos los Parámetros
    public EmpleadoPorHoras(String pIdentificacion, String pNombre, String pTelefono,
            String pCorreo, int pHorasTrabajadas, double pValorHora) {

        super(pIdentificacion, pNombre, pTelefono, pCorreo);

        this.horasTrabajadas = pHorasTrabajadas;
        this.valorHora = pValorHora;
    }

    //Gets & Sets
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) throws EmpleadoException {
        if (horasTrabajadas < 0) {
            throw new EmpleadoException(ErrorEmpleado.VALOR_NEGATIVO.getCodigo(), 
                    ErrorEmpleado.VALOR_NEGATIVO.getMensaje("horasTrabajadas"));
        }
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) throws EmpleadoException {
        if (valorHora < 0) {
            throw new EmpleadoException(ErrorEmpleado.VALOR_NEGATIVO.getCodigo(), 
                    ErrorEmpleado.VALOR_NEGATIVO.getMensaje("valorHora"));
        }

        this.valorHora = valorHora;
    }

    //Métodos y Funciones    
    @Override
    public double CalcularPago() {
        return this.horasTrabajadas * this.valorHora;
    }

    @Override
    public String MostrarPago() {
        return "Salario Empleado del Fijo: " + CalcularPago();
    }

    @Override
    public int compareTo(Empleado otro) {
        return getIdentificacion().compareTo(otro.getIdentificacion());
    }
}
