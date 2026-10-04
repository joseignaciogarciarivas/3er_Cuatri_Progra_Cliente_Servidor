package com.tarea1;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author José Ignacio Garcia Rivas
 */
public class Tarea1 {

    public static void main(String[] args) throws EmpleadoExceptions {

        String Buscarid = "106783";

        ArrayList<Empleado> arrEmpleados = new ArrayList<>();
        System.out.println("1.2 REGISTRAR Y MOSTRAR EMPLEADOS");
        
        EmpleadoFijo EmpF1 = new EmpleadoFijo("102435", "Nicolas Paz", "8888-1111", "correo@miempresa.com", 800000, 12000);
        EmpleadoFijo EmpF2 = new EmpleadoFijo("108297", "Julian Alvarez", "8888-2222", "correo@miempresa.com", 500000, 40000);
        EmpleadoFijo EmpF3 = new EmpleadoFijo("101234", "Enzo Fernandez", "8888-3333", "correo@miempresa.com", 900000, 60000);

        EmpleadoHoras EmpH1 = new EmpleadoHoras("102143", "Rodrigo de Paul", "8888-4444", "correo@miempresa.com", 67, 3);
        EmpleadoHoras EmpH2 = new EmpleadoHoras("101875", "Alexis McAllister", "8888-5555", "correo@miempresa.com", 90, 3);
        EmpleadoHoras EmpH3 = new EmpleadoHoras("106783", "Leandro Paredes", "8888-6666", "correo@miempresa.com", 70, 3);

        EmpleadoCom EmpC1 = new EmpleadoCom("103467", "Lautaro Martinez", "8888-7777", "correo@miempresa.com", 800000, 20, 0.7);
        EmpleadoCom EmpC2 = new EmpleadoCom("105483", "Nicolas Tagliafico", "8888-8888", "correo@miempresa.com", 500000, 50, 0.5);
        EmpleadoCom EmpC3 = new EmpleadoCom("108456", "Franco Mastantuono", "8888-9999", "correo@miempresa.com", 900000, 60, 0.9);

        arrEmpleados.add(EmpF1);
        arrEmpleados.add(EmpF2);
        arrEmpleados.add(EmpF3);

        arrEmpleados.add(EmpH1);
        arrEmpleados.add(EmpH2);
        arrEmpleados.add(EmpH3);

        arrEmpleados.add(EmpC1);
        arrEmpleados.add(EmpC2);
        arrEmpleados.add(EmpC3);

        
        for (Empleado empleados : arrEmpleados) {
            System.out.println(empleados.toString());
        }
        try {
            EmpF1.setNombre("");

        } catch (EmpleadoExceptions e) {
             System.out.println("Error num: (" + e.getCodError() + "): " + e.getMessage());
        }

        buscarEmpleados(arrEmpleados, Buscarid);
        
        MostrardatosPago(arrEmpleados);
        
        
        Collections.sort(arrEmpleados, new EmpleadoComparator());
        
        for (Empleado emp : arrEmpleados){
            System.out.println(emp.toString());
        }

    }

    public static void buscarEmpleados(ArrayList<Empleado> ArrEmp, String id) throws EmpleadoExceptions {
        System.out.println("3. BUSCAR EMPLEADOS SEGUN ID");
        System.out.println("Buscar empleado por ID");

        try {
            for (Empleado emp : ArrEmp) {
                if (emp.getId().equals(id)) {
                    System.out.println("Datos del empleado buscado: " + emp.toString());
                    return;
                }
            }
            throw new EmpleadoExceptions(10, "No se encontro ningun empleado con ID: " + id);
        } catch (EmpleadoExceptions e) {
            System.out.println("Error num: (" + e.getCodError() + "): " + e.getMessage());
            

        }
    }
    
    public static void MostrardatosPago(ArrayList<Empleado> ArrEmp){
        System.out.println("4. MOSTRAR PAGO DE LOS EMPLEADOS");
        for (Empleado empleado : ArrEmp) {
            Pagable p = (Pagable) empleado;
            System.out.println(p.MostrarPago());
        }
    }
    
   

}
