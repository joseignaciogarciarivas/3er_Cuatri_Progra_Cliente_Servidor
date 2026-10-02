/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tarea1;

/**
 *
 * @author Usuario
 */
public class EmpleadoHoras extends Empleado {
     private int horasTrabajadas;   
     private int valorHora;

    public EmpleadoHoras() {
    }

    public EmpleadoHoras(String pId, String pNombre, String pNumeroTel, String pCorreo, int horasTrabajadas, int valorHora) {
        super(pId, pNombre, pNumeroTel, pCorreo);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) throws EmpleadoExceptions{
        if (horasTrabajadas < 0) {
            throw new EmpleadoExceptions(06, "Las horas trabajadas no puede ser negativo");
        }
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) throws EmpleadoExceptions{
        if (valorHora < 0) {
            throw new EmpleadoExceptions(06, "El valor de las horas no puede ser negativo");
        }
        this.valorHora = valorHora;
    }

  
     
     @Override
     public double calcularPago(){
         return horasTrabajadas * valorHora;
     }
}
