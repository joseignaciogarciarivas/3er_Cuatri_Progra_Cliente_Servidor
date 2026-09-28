package com.ejercicio_08.model;

/**
 *
 * @author andresgonzalezgarcia
 */
public abstract class Vehiculo {
    
    private String marca;
    private String modelo;
    private int combustible;

    //Constructor Vacio
    public Vehiculo(){
        
    }
    
    //Constructor con todos los parametros
    public Vehiculo(String pMarca, String pModelo, int pCombustible){
        this.marca = pMarca;
        this.modelo = pModelo;
        this.combustible = pCombustible;
    }
    
    //Gets & Sets
    public String getMarca(){
        return marca;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public int getCombustible(){
        return combustible;
    }
    
    //Métodos y Funciones
    
    public enum eTipoVehiculo{
        AUTOMOVIL,
        CAMION,
        MOTOCICLETA;
    }
    
    public abstract int calcularAutonomia();

    public abstract eTipoVehiculo getTipoVehiculo();

}
