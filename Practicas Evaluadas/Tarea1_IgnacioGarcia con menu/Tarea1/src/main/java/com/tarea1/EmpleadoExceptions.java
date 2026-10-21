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

