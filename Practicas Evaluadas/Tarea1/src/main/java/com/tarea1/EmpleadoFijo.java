/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tarea1;

/**
 *
 * @author Usuario
 */
public class EmpleadoFijo extends Empleado implements Pagable {

    private double salarioBase;
    private double bonificacion;

    public EmpleadoFijo() {
    }

    public EmpleadoFijo(String pId, String pNombre, String pNumeroTel, String pCorreo, double salarioBase, double bonificacion) {
        super(pId, pNombre, pNumeroTel, pCorreo);
        this.salarioBase = salarioBase;
        this.bonificacion = bonificacion;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) throws EmpleadoExceptions {

        if (salarioBase < 0) {
            throw new EmpleadoExceptions(4, "El salario no puede ser negativo");
        }
        this.salarioBase = salarioBase;
    }

    public double getbonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) throws EmpleadoExceptions {

        if (bonificacion < 0) {
            throw new EmpleadoExceptions(5, "La bonificacion no puede ser negativa");
        }
        this.bonificacion = bonificacion;
    }

    @Override
    public double calcularPago() {
        return salarioBase + bonificacion;
    }

    @Override
    public String MostrarPago() {
        System.out.println("Reporte de pago");
        return  " \t ID: " + getId().toString() + " \n\t Nombre: " + getNombre().toString() + " \n\t Numero: " + getNumeroTel().toString() + " \n\t Correo: " + getCorreo().toString() + " \n\t Pago Total: " + calcularPago();
                
        
    }

}
