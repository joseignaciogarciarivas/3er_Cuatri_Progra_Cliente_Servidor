package com.clase1.gestordecomputadoras.model;

public class Procesador {

    //Declaración de variables Globales
    private String modelo;
    private int nucleos;
    private tipoArquitectura tipoArq;

    //Constructor Vacio
    public void Procesador() {

    }

    //Constructor con todos los atributos
    public void Procesador(String pModelo, int pNucleos, tipoArquitectura pTipoArq) {
        this.modelo = pModelo;
        this.nucleos = pNucleos;
        this.tipoArq = pTipoArq;
    }

    public enum tipoArquitectura {
        X86,
        X64,
        ARM;
    }

    @Override
    public String toString() {
        return modelo + 
               " - " + nucleos + 
               " - " + tipoArq;
               
    }

}
