package com.tarea1;


import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author José Ignacio Garcia Rivas
 */
public class Tarea1 {

    public static void main(String[] args) throws EmpleadoExceptions {

        //Seteo de valores para pruebas
        String Buscarid = "101234";
        String nombreVacio = "";
        String telefonoVacio = "";
        double salarioNegativo = -10.0;
        double comisionNegativa = -0.2;
        int horasNegativas = -70;

        ArrayList<Empleado> arrEmpleados = new ArrayList<>();
        System.out.println("\n1.2 REGISTRAR Y MOSTRAR EMPLEADOS \n");

        EmpleadoFijo EmpF1 = new EmpleadoFijo("100001", "Nicolas Paz", "8888-1111", "correo@miempresa.com", 800000, 12000);
        EmpleadoFijo EmpF2 = new EmpleadoFijo("100002", "Julian Alvarez", "8888-2222", "correo@miempresa.com", 500000, 40000);
        EmpleadoFijo EmpF3 = new EmpleadoFijo("100003", "Enzo Fernandez", "8888-3333", "correo@miempresa.com", 900000, 60000);

        EmpleadoHoras EmpH1 = new EmpleadoHoras("100004", "Rodrigo de Paul", "8888-4444", "correo@miempresa.com", 67, 3000);
        EmpleadoHoras EmpH2 = new EmpleadoHoras("100005", "Alexis McAllister", "8888-5555", "correo@miempresa.com", 90, 3000);
        EmpleadoHoras EmpH3 = new EmpleadoHoras("100006", "Leandro Paredes", "8888-6666", "correo@miempresa.com", 70, 3000);

        EmpleadoCom EmpC1 = new EmpleadoCom("100007", "Lautaro Martinez", "8888-7777", "correo@miempresa.com", 800000, 20, 0.7);
        EmpleadoCom EmpC2 = new EmpleadoCom("100008", "Nicolas Tagliafico", "8888-8888", "correo@miempresa.com", 500000, 50, 0.5);
        EmpleadoCom EmpC3 = new EmpleadoCom("100009", "Franco Mastantuono", "8888-9999", "correo@miempresa.com", 900000, 60, 0.9);

        arrEmpleados.add(EmpF2);
        arrEmpleados.add(EmpC3);
        arrEmpleados.add(EmpH1);
        arrEmpleados.add(EmpF3);
        arrEmpleados.add(EmpC1);
        arrEmpleados.add(EmpH2);
        arrEmpleados.add(EmpF1);
        arrEmpleados.add(EmpC2);
        arrEmpleados.add(EmpH3);

        for (Empleado empleados : arrEmpleados) {
            System.out.println(empleados.toString());
        }

        buscarEmpleados(arrEmpleados, Buscarid);

        MostrardatosPago(arrEmpleados);

        Collections.sort(arrEmpleados);
        System.out.println("\n5. ORDEN NATURAL CONFIGURADO POR ID\n");
        System.out.println(" ID" + "\tNOMBRE");
        for (Empleado emp : arrEmpleados) {
            System.out.println(" " + emp.getId() + " " + emp.getNombre());
        }

        Collections.sort(arrEmpleados, new EmpleadoComparator());
        System.out.println("\n6. ORDEN POR NOMBRE\n");
        System.out.println(" NOMBRE");
        for (Empleado emp : arrEmpleados) {

            System.out.println(" " + emp.getNombre());
        }
        System.out.println("\n7. ORDEN DE PAGO\n");

        Collections.sort(arrEmpleados, new ComparatorPago());
        System.out.println(" PAGO" + "\t\tNOMBRE");
        
        for (Empleado emp : arrEmpleados) {
            Pagable p = (Pagable) emp;

            System.out.println(
                    String.format(" %s\t%s",
                    emp.calcularPago(),
                    emp.getNombre()));
        }

        System.out.println("\n8. VALIDACIONES\n");
        try {
            EmpF1.setNombre(nombreVacio);
        } catch (EmpleadoExceptions e) {
            System.out.println(" Error num: (" + e.getCodError() + "): " + e.getMessage());
        }
        
        try {
            EmpF1.setNumeroTel(telefonoVacio);
        } catch (EmpleadoExceptions e) {
            System.out.println(" Error num: (" + e.getCodError() + "): " + e.getMessage());
        }
        
        try {
            EmpF1.setSalarioBase(salarioNegativo);
        } catch (EmpleadoExceptions e) {
            System.out.println(" Error num: (" + e.getCodError() + "): " + e.getMessage());
        }
        
        try {
            EmpC1.setPorcentajeComision(comisionNegativa);
        } catch (EmpleadoExceptions e) {
            System.out.println(" Error num: (" + e.getCodError() + "): " + e.getMessage());
        }
        
        try {
            EmpH1.setHorasTrabajadas(horasNegativas);
        } catch (EmpleadoExceptions e) {
            System.out.println(" Error num: (" + e.getCodError() + "): " + e.getMessage());
        }

    }

    public static void buscarEmpleados(ArrayList<Empleado> ArrEmp, String id) throws EmpleadoExceptions {
        System.out.println("\n3. BUSCAR EMPLEADOS SEGUN ID\n");
        System.out.println(" Buscar empleado por ID");

        try {
            for (Empleado emp : ArrEmp) {
                if (emp.getId().equals(id)) {
                    System.out.println(" Datos del empleado buscado: " + emp.getId() + " " + emp.getNombre());
                    return;
                }
            }
            throw new EmpleadoExceptions(10, "No se encontro ningun empleado con ID: " + id);
        } catch (EmpleadoExceptions e) {
            System.out.println(" Error num: (" + e.getCodError() + "): " + e.getMessage());

        }
    }

    public static void MostrardatosPago(ArrayList<Empleado> ArrEmp) {
        System.out.println("\n4. MOSTRAR PAGO DE LOS EMPLEADOS\n");
        for (Empleado empleado : ArrEmp) {
            Pagable p = (Pagable) empleado;
            System.out.println(p.MostrarPago());
        }
    }

}
