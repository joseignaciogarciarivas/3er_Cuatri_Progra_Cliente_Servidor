package com.ejercicio_10.model;

/**
 *
 * @author andresgonzalezgarcia
 */
public class BibliotecaException extends Exception {

    //Declaracion de variables Globales
    private int codError;

    //Constructor con todos los parámetros
    public BibliotecaException(int pCodError, String pMensaje) {
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
