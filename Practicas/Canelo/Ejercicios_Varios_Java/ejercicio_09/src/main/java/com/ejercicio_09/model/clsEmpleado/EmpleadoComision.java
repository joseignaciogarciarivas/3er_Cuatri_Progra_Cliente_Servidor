package com.ejercicio_09.model.clsEmpleado;

import com.ejercicio_09.model.Excepciones.EmpleadoException;
import com.ejercicio_09.model.Excepciones.ErrorEmpleado;

/**
 *
 * @author andresgonzalezgarcia
 */
public class EmpleadoComision extends Empleado implements Pagable{

    //Declaración de Variables Globales
    private double salarioBase;
    private double ventasRealizadas;
    private double porcentajeComision;

    //Constructor Vacio
    public EmpleadoComision() {

    }

    //Constructor con todos los Parámetros
    public EmpleadoComision(String pIdentificacion, String pNombre, String pTelefono,
            String pCorreo, double pSalarioBase, double pVentasRealizadas, double pPorcentajeComision) {

        super(pIdentificacion, pNombre, pTelefono, pCorreo);

        this.salarioBase = pSalarioBase;
        this.ventasRealizadas = pVentasRealizadas;
        this.porcentajeComision = pPorcentajeComision;
    }

    //Gets & Sets

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) throws EmpleadoException {
        if (salarioBase < 0) {
            throw new EmpleadoException(ErrorEmpleado.VALOR_NEGATIVO.getCodigo(), 
                    ErrorEmpleado.VALOR_NEGATIVO.getMensaje("salarioBase"));
        }
        this.salarioBase = salarioBase;
    }

    public double getVentasRealizadas() {
        return ventasRealizadas;
    }

    public void setVentasRealizadas(double ventasRealizadas) throws EmpleadoException {
        if (ventasRealizadas < 0) {
            throw new EmpleadoException(ErrorEmpleado.VALOR_NEGATIVO.getCodigo(), 
                    ErrorEmpleado.VALOR_NEGATIVO.getMensaje("ventasRealizadas"));
        }
        this.ventasRealizadas = ventasRealizadas;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(double porcentajeComision) throws EmpleadoException {
        if ((porcentajeComision < 0) || (porcentajeComision > 1))  {
            throw new EmpleadoException(ErrorEmpleado.PORCENTAJE_INVALIDO.getCodigo(), 
                    ErrorEmpleado.PORCENTAJE_INVALIDO.getMensaje("porcentajeComision"));
        }
        
        this.porcentajeComision = porcentajeComision;
    }
    
    
    //Métodos y Funciones    
    @Override
    public double CalcularPago() {
        return this.salarioBase + (this.ventasRealizadas * this.porcentajeComision);
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
