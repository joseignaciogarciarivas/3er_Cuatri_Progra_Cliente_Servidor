package com.ejercicio_09.model;

/**
 *
 * @author andresgonzalezgarcia
 */
public class EmpleadoFijo extends Empleado implements Pagable {

    //Declaración de Variables Globales
    private double salarioBase;
    private double bonificacion;

    //Constructor Vacio
    public EmpleadoFijo() {

    }

    //Constructor con todos los Parámetros
    public EmpleadoFijo(String pIdentificacion, String pNombre, String pTelefono,
            String pCorreo, double pSalarioBase, double pBonificacion) {

        super(pIdentificacion, pNombre, pTelefono, pCorreo);

        this.salarioBase = pSalarioBase;
        this.bonificacion = pBonificacion;
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

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) throws EmpleadoException {
        if (bonificacion < 0) {
            throw new EmpleadoException(ErrorEmpleado.VALOR_NEGATIVO.getCodigo(),
                    ErrorEmpleado.VALOR_NEGATIVO.getMensaje("bonificacion"));
        }
        this.bonificacion = bonificacion;
    }

    //Métodos y Funciones    
    @Override
    public double CalcularPago() {
        return this.salarioBase + this.bonificacion;
    }

    @Override
    public void MostrarPago() {
        System.out.println("Salario Empleado del Fijo: " + CalcularPago());
    }

    @Override
    public int compareTo(Empleado otro) {
        return getIdentificacion().compareTo(otro.getIdentificacion());
    }

}
