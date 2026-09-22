package com.clase1.gestordecomputadoras;

import com.clase1.gestordecomputadoras.model.Computadora;
import com.clase1.gestordecomputadoras.model.Procesador;

public class Principal {
    
    public void main(){
        //Declaración de variables locales
        Procesador procesador1 = new Procesador();
        Procesador procesador2 = new Procesador();
        Procesador procesador3 = new Procesador();
        Procesador procesador4 = new Procesador();
        Procesador procesador5 = new Procesador();
        
        Computadora computadora1 = new Computadora();
        Computadora computadora2 = new Computadora();
        Computadora computadora3 = new Computadora();
        Computadora computadora4 = new Computadora();
        Computadora computadora5 = new Computadora();
        
        //Llenado de datos de prueba para Procesadores
        procesador1.Procesador("Intel Core i5-12400", 6, Procesador.tipoArquitectura.X64);
        procesador2.Procesador("AMD Ryzen 5 5600G", 6, Procesador.tipoArquitectura.X64);
        procesador3.Procesador("Intel Core i7-12700", 12, Procesador.tipoArquitectura.X64);
        procesador4.Procesador("Apple M3", 8, Procesador.tipoArquitectura.ARM);
        procesador5.Procesador("AMD Ryzen 7 7700", 8, Procesador.tipoArquitectura.X64);
        
        //Llenado de datos de prueba para Computadoras
        computadora1.Computadora("Dell", "DELL-7845X", procesador1);
        computadora2.Computadora("HP", "HP-9032K", procesador2);
        computadora3.Computadora("Lenovo", "LEN-4521M", procesador3);
        computadora4.Computadora("Apple", "APP-M3-7821", procesador4);
        computadora5.Computadora("Asus", "ASUS-6619P", procesador5);
        
        System.out.println(computadora1.toString());
        System.out.println(computadora2.toString());
        System.out.println(computadora3.toString());
        System.out.println(computadora4.toString());
        System.out.println(computadora5.toString());
        System.out.println("Total de Computadoras creadas: " + Computadora.getContador());
        
    }

}
