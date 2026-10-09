package com.ejercicio_11.model;

/**
 *
 * @author Laboratorio
 */
public class VehiculoException extends Exception {
    private int codError;

    public VehiculoException(int codError, String message) {
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
