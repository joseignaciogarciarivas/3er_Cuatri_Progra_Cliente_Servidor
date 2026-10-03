package com.ejercicio_09.model.Excepciones;

/**
 *
 * @author andresgonzalezgarcia
 */
public class EmpleadoException extends Exception {

    //Declaracion de variables Globales
    private int codError;

    //Constructor con todos los parámetros
    public EmpleadoException(int pCodError, String pMensaje) {
        super(pMensaje);

        this.codError = pCodError;
    }
    
    //Gets & Sets
    public void setCodError(int pCodError){
        this.codError = pCodError;
    }
    
    public int getCodError(){
        return codError;
    }
}