/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tarea1;

/**
 *
 * @author Usuario
 */
public class EmpleadoExceptions extends Exception {
    private int codError;

    public EmpleadoExceptions(int codError, String message) {
        super(message);
        this.codError = codError;
    }

    public int getCodError() {
        return codError;
    }

    public void setCodError(int codError) {
        this.codError = codError;
    }
}
