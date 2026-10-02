/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.ejercicio_09;

import com.ejercicio_09.model.*;
import java.util.ArrayList;

/**
 *
 * @author andresgonzalezgarcia
 */
public class GestionEmpleados {

    public static void main(String[] args) throws EmpleadoException {

        ArrayList<Empleado> arrEmp = new ArrayList<>();

        // Empleados Fijos
        EmpleadoFijo fijo1 = new EmpleadoFijo("101001", "Ana Rodríguez", "8888-1111", "ana.rodriguez@empresa.com", 850000, 50000);
        EmpleadoFijo fijo2 = new EmpleadoFijo("101002", "Carlos Méndez", "8888-2222", "carlos.mendez@empresa.com", 1200000, 150000);
        EmpleadoFijo fijo3 = new EmpleadoFijo("101003", "Laura Jiménez", "8888-3333", "laura.jimenez@empresa.com", 950000, 75000);

        // Empleados por Horas
        EmpleadoPorHoras horas1 = new EmpleadoPorHoras("201001", "José Vargas", "8777-1111", "jose.vargas@empresa.com", 160, 4500);
        EmpleadoPorHoras horas2 = new EmpleadoPorHoras("201002", "Sofía Castro", "8777-2222", "sofia.castro@empresa.com", 120, 5500);
        EmpleadoPorHoras horas3 = new EmpleadoPorHoras("201003", "David Herrera", "8777-3333", "david.herrera@empresa.com", 180, 4000);

        // Empleados por Comisión
        EmpleadoComision comision1 = new EmpleadoComision("301001", "Daniela Mora", "8666-1111", "daniela.mora@empresa.com", 600000, 3500000, 0.08);
        EmpleadoComision comision2 = new EmpleadoComision("301002", "Andrés Solano", "8666-2222", "andres.solano@empresa.com", 650000, 5000000, 0.10);
        EmpleadoComision comision3 = new EmpleadoComision("301003", "María Fernández", "8666-3333", "maria.fernandez@empresa.com", 550000, 2800000, 0.07);

        arrEmp.add(fijo1);
        arrEmp.add(fijo2);
        arrEmp.add(fijo3);

        arrEmp.add(horas1);
        arrEmp.add(horas2);
        arrEmp.add(horas3);

        arrEmp.add(comision1);
        arrEmp.add(comision2);
        arrEmp.add(comision3);

        //Recorrido mediante ciclos
        
        System.out.println("ID\tNombre\t\tTeléfono\tCorreo");
        for (Empleado empleado : arrEmp) {
            System.out.println(empleado.toString());
        }

        try {
            if (existeIdentificacion(arrEmp, "101001")) {
                throw new EmpleadoException(1, "Identificación duplicada");
            }
        } catch (EmpleadoException e) {
            System.out.println("\tError num: (" + e.getCodError() + "): " + e.getMessage());
        }

    }

    public static boolean existeIdentificacion(ArrayList<Empleado> pEmpleados,
            String identificacion) {

        for (Empleado tEmp : pEmpleados) {
            if (tEmp.getIdentificacion().equals(identificacion)) {
                return true;
            }
        }

        return false;
    }
}
