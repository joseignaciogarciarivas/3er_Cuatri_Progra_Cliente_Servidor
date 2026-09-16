package com.clase1.gestordecomputadoras.model;

public class Computadora {
    
    //Declaración de variables Globales
    private String marca;
    private String numeroSerie;
    private Procesador procesador;
    private static int contador = 0;
        
    //Constructor
    public void Computadora(String pMarca, String pNumeroSerie, Procesador pProcesador){
        this.marca = pMarca;
        this.numeroSerie = pNumeroSerie;
        this.procesador = pProcesador;
        
        contador++;
    }
    
    //Gets & Sets

    public static int getContador() {
        return contador;
    }
    
    //Métodos y Funciones

    @Override
    public String toString() {
        return "Marca = \t\t" + marca + 
               "\nNumero de Serie = \t" + numeroSerie + 
               "\nProcesador = \t\t" + procesador +
               "\n---------------------------------------------------------------\n\n";
    }
    
}
