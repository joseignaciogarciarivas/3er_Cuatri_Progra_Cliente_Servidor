/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.gestionvehiculos.model;

/**
 *
 * @author Laboratorio
 */
public interface Conducible {
    public void encender() throws VehiculoException;
    public void apagar() throws VehiculoException;
    public void acelerar() throws VehiculoException;
    public void detener() throws VehiculoException;
    public void girar() throws VehiculoException;
}
