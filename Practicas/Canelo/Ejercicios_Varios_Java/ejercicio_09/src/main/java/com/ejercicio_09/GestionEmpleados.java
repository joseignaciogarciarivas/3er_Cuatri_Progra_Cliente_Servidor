/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.ejercicio_09;

import com.ejercicio_09.model.Excepciones.EmpleadoException;
import com.ejercicio_09.model.Excepciones.ErrorEmpleado;
import com.ejercicio_09.model.clsEmpleado.EmpleadoComision;
import com.ejercicio_09.model.clsEmpleado.Empleado;
import com.ejercicio_09.model.clsEmpleado.EmpleadoFijo;
import com.ejercicio_09.model.clsEmpleado.EmpleadoPorHoras;
import com.ejercicio_09.model.clsEmpleado.Pagable;
import java.util.ArrayList;

/**
 *
 * @author andresgonzalezgarcia
 */
public class GestionEmpleados {

    public static void main(String[] args) throws EmpleadoException {

        // <editor-fold defaultstate="collapsed" desc="PARAMETRIZACION DE VALORES QA">

        //Digite la identificación del empleado que quieres buscar
        String tBusEmp = "101003";

        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="1. REGISTRAR EMPLEADOS DE CUALQUIERA DE LAS TRES MODALIDADES">
        System.out.println("╔═══════════════════════════════════════════════════════════════════════╗");
        System.out.println("║     1. REGISTRAR EMPLEADOS DE CUALQUIERA DE LAS TRES MODALIDADES      ║");

        ArrayList<Empleado> arrEmp = new ArrayList<>();

        // Empleados Fijos
        EmpleadoFijo fijo1 = new EmpleadoFijo("101001", "Ana Rodríguez", "8888-1111", "ana.rodriguez@empresa.com", 850000, 0);
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
        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="2. MOSTRAR LOS EMPLEADOS REGISTRADOS">
        //Recorrido mediante ciclos
        System.out.println("╠═══════════════════════════════════════════════════════════════════════╣");
        System.out.println("║     2. MOSTRAR LOS EMPLEADOS REGISTRADOS                              ║");
        System.out.println("╠═══════╦═══════════════╦═══════════════╦═══════════════════════════════╣");
        System.out.println("║ ID\t║ Nombre\t║ Teléfono\t║ Correo\t\t\t║");
        System.out.println("╠═══════╬═══════════════╬═══════════════╬═══════════════════════════════╣");
        
        for (Empleado empleado : arrEmp) {
            System.out.println(empleado.toString());
        }

        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="3. BUSCAR UN EMPLEADO UTILIZANDO SU IDENTIFICACIÓN">

        buscarEmpleado(tBusEmp, arrEmp);

        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="4. MOSTRAR EL PAGO CORRESPONDIENTE A CADA EMPLEADO">
                
        System.out.println("║     4. MOSTRAR EL PAGO CORRESPONDIENTE A CADA EMPLEADO                ║");
        //System.out.println("╠═══════╦═══════════════╦═══════════════╦═══════════════════════════════╣");
        System.out.println("╠═══════╦═══════════════════════════════════════════════════════════════╣");
        //System.out.println("║ ID\t║ Salario\t\t\t\t\t\t\t║");
        
        System.out.printf("║%6s ║ %15s %47s%n","ID","SALARIO","║");
        
        
        System.out.println("╠═══════╬═══════════════════════════════════════════════════════════════╣");
        
        for (Empleado empleado : arrEmp) {
            Pagable p = (Pagable) empleado;
            System.out.println(p.MostrarPago());
        }

        // </editor-fold>
        
        System.out.println("╠═══════════════════════════════════════════════════════════════════════╣");
        System.out.println("║     5. ORDENAR LOS EMPLEADOS POR SU ORDEN NATURAL.  POR AQUÍ VOY =D   ║");
        System.out.println("╚═══════════════════════════════════════════════════════════════════════╝");
        //System.out.println("╚═══════╩═══════════════╩═══════════════╩═══════════════════════════════╝");
    }

    public static void buscarEmpleado(String pIdentificacion,
            ArrayList<Empleado> pArrEmpleados) throws EmpleadoException {
        try {
                System.out.println("╠═══════╩═══════════════╩═══════════════╩═══════════════════════════════╣");
                System.out.println("║     3. BUSCAR UN EMPLEADO UTILIZANDO SU IDENTIFICACIÓN --> " + pIdentificacion + "\t║");
                
            if (!existeIdentificacion(pArrEmpleados, pIdentificacion)) {
                System.out.println("╠═══════════════════════════════════════════════════════════════════════╣");
                System.out.print("║     ");

                throw new EmpleadoException(ErrorEmpleado.EMPLEADO_NO_EXISTE.getCodigo(), ErrorEmpleado.EMPLEADO_NO_EXISTE.getMensaje());
            } else {

                for (int i = 0; i < pArrEmpleados.size(); i++) {
                    if (pArrEmpleados.get(i).getIdentificacion().equals(pIdentificacion)) {
                        System.out.println("╠═══════╦═══════════════╦═══════════════╦═══════════════════════════════╣");
                        System.out.println(pArrEmpleados.get(i).toString());
                        System.out.println("╠═══════╩═══════════════╩═══════════════╩═══════════════════════════════╣");
                    }
                }
            }
        } catch (EmpleadoException e) {
            System.out.println("\tError num: (" + e.getCodError() + "): " + e.getMessage()+"\t\t\t\t║");
            System.out.println("╠═══════════════════════════════════════════════════════════════════════╣");
        }
    }

    public static boolean existeIdentificacion(ArrayList<Empleado> pArrEmpleados,
            String identificacion) {

        for (Empleado tEmp : pArrEmpleados) {
            if (tEmp.getIdentificacion().equals(identificacion)) {
                return true;
            }
        }

        return false;
    }
}
