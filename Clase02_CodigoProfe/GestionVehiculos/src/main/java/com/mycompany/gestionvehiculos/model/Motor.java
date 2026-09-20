/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionvehiculos.model;

/**
 *
 * @author Laboratorio
 */
public class Motor {
    private int cilindros;
    private TiposCombustible combustible;

    public Motor() {
    }

    public Motor(int cilindros, TiposCombustible combustible) {
        this.cilindros = cilindros;
        this.combustible = combustible;
    }

    public TiposCombustible getCombustible() {
        return combustible;
    }

    public void setCombustible(TiposCombustible combustible) {
        this.combustible = combustible;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Motor{");
        sb.append("cilindros=").append(cilindros);
        sb.append(", combustible=").append(combustible);
        sb.append('}');
        return sb.toString();
    }
    
    
}

