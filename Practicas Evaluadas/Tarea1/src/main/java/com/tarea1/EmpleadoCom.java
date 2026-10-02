/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tarea1;

/**
 *
 * @author Usuario
 */
public class EmpleadoCom extends Empleado {
    private double salarioBase;
    private int ventasRealizadas;
    private double porcentajeComision;

    public EmpleadoCom() {
    }

    public EmpleadoCom(String pId, String pNombre, String pNumeroTel, String pCorreo, double salarioBase, int ventasRealizadas, double porcentajeComision) {
        super(pId, pNombre, pNumeroTel, pCorreo);
        this.salarioBase = salarioBase;
        this.ventasRealizadas = ventasRealizadas;
        this.porcentajeComision = porcentajeComision;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) throws EmpleadoExceptions{
        if(salarioBase<0){
            throw new EmpleadoExceptions(2, "El salario no puede ser negativo");
        }
        this.salarioBase = salarioBase;
    }

    public int getVentasRealizadas() {
        return ventasRealizadas;
    }

    public void setVentasRealizadas(int ventasRealizadas) {
        this.ventasRealizadas = ventasRealizadas;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    @Override 
    public double calcularPago(){
        return salarioBase + (ventasRealizadas * porcentajeComision);
    }
    
    
}
