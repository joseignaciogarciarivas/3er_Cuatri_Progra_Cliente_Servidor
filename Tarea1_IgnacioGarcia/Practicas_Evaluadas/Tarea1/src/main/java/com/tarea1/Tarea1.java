package com.tarea1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author José Ignacio Garcia Rivas
 */
public class Tarea1 {

    public static void main(String[] args) throws EmpleadoExceptions {

        String opcion = "";
        Scanner teclado = new Scanner(System.in);

        // Seteo de valores para pruebas
        String nombreVacio = "";
        String telefonoVacio = "";
        double salarioNegativo = -10.0;
        double comisionNegativa = -0.2;
        int horasNegativas = -70;

        EmpleadoFijo EmpF1 = null;
        EmpleadoFijo EmpF2 = null;
        EmpleadoFijo EmpF3 = null;
        EmpleadoHoras EmpH1 = null;
        EmpleadoHoras EmpH2 = null;
        EmpleadoHoras EmpH3 = null;
        EmpleadoCom EmpC1 = null;
        EmpleadoCom EmpC2 = null;
        EmpleadoCom EmpC3 = null;

        ArrayList<Empleado> arrEmpleados = new ArrayList<>();
        

        while (!opcion.equals("0")) {
menuPrincipal();
            opcion = teclado.nextLine();

            switch (opcion) {

                case "1":
                    if (!arrEmpleados.isEmpty()) {
                        System.out.println("Los empleados ya fueron cargados.");
                    } else {
                        System.out.println("\n1. REGISTRAR EMPLEADOS\n");

                        EmpF1 = new EmpleadoFijo("100001", "Nicolas Paz", "8888-1111", "correo@miempresa.com",
                                800000, 12000);
                        EmpF2 = new EmpleadoFijo("100002", "Julian Alvarez", "8888-2222",
                                "correo@miempresa.com", 500000, 40000);
                        EmpF3 = new EmpleadoFijo("100003", "Enzo Fernandez", "8888-3333",
                                "correo@miempresa.com", 900000, 60000);

                        EmpH1 = new EmpleadoHoras("100004", "Rodrigo de Paul", "8888-4444",
                                "correo@miempresa.com", 67, 3000);
                        EmpH2 = new EmpleadoHoras("100005", "Alexis McAllister", "8888-5555",
                                "correo@miempresa.com", 90, 3000);
                        EmpH3 = new EmpleadoHoras("100006", "Leandro Paredes", "8888-6666",
                                "correo@miempresa.com", 70, 3000);

                        EmpC1 = new EmpleadoCom("100007", "Lautaro Martinez", "8888-7777",
                                "correo@miempresa.com", 800000, 20, 0.7);
                        EmpC2 = new EmpleadoCom("100008", "Nicolas Tagliafico", "8888-8888",
                                "correo@miempresa.com", 500000, 50, 0.5);
                        EmpC3 = new EmpleadoCom("100009", "Franco Mastantuono", "8888-9999",
                                "correo@miempresa.com", 900000, 60, 0.9);

                        arrEmpleados.add(EmpF2);
                        arrEmpleados.add(EmpC3);
                        arrEmpleados.add(EmpH1);
                        arrEmpleados.add(EmpF3);
                        arrEmpleados.add(EmpC1);
                        arrEmpleados.add(EmpH2);
                        arrEmpleados.add(EmpF1);
                        arrEmpleados.add(EmpC2);
                        arrEmpleados.add(EmpH3);

                        System.out.println("Empleados cargados correctamente.");
                    }
                    break;

                case "2":
                    System.out.println("\n2. MOSTRAR EMPLEADOS \n");
                    if (arrEmpleados.isEmpty()) {
                        System.out.println("No hay empleados cargados.");
                    } else {
                        for (Empleado empleados : arrEmpleados) {
                            System.out.println(empleados.toString());
                        }
                    }
                    break;

                case "3":
                    System.out.print("Digite el ID del empleado que desea buscar: ");
                    String buscarId = teclado.nextLine().trim();
                    buscarEmpleados(arrEmpleados, buscarId);
                    break;

                case "4":
                    MostrardatosPago(arrEmpleados);
                    break;

                case "5":
                    Collections.sort(arrEmpleados);
                    System.out.println("\n5. ORDEN NATURAL CONFIGURADO POR ID\n");
                    System.out.println(" ID" + "\tNOMBRE");
                    for (Empleado emp : arrEmpleados) {
                        System.out.println(" " + emp.getId() + " " + emp.getNombre());
                    }
                    break;

                case "6":
                    Collections.sort(arrEmpleados, new EmpleadoComparator());
                    System.out.println("\n6. ORDEN POR NOMBRE\n");
                    System.out.println(" NOMBRE");
                    for (Empleado emp : arrEmpleados) {

                        System.out.println(" " + emp.getNombre());
                    }
                    break;

                case "7":
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
                    break;

                case "8":
                    if (EmpF1 != null) {
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
                    break;

                case "9":
                    registrarEmpleadoManual(teclado, arrEmpleados);
                    break;

                case "0":

                    break;

                default:
                    System.out.println("¡Opción " + opcion + " inválida!");
            }

            if (!opcion.equals("0")) {
                System.out.println("\nPresione Enter para volver al menú principal.");
                teclado.nextLine();
                System.out.println("\n".repeat(80));
            }
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
        if (ArrEmp.isEmpty()) {
            System.out.println("No hay empleados cargados para mostrar pagos.");
            return;
        }

        for (Empleado empleado : ArrEmp) {
            Pagable p = (Pagable) empleado;
            System.out.println(p.MostrarPago());
        }
    }

    private static void registrarEmpleadoManual(Scanner teclado, ArrayList<Empleado> empleados) {
        System.out.println("\n9. AGREGAR EMPLEADO MANUALMENTE");
        System.out.println("Seleccione el tipo de empleado:");
        System.out.println("1. EmpleadoFijo");
        System.out.println("2. EmpleadoHoras");
        System.out.println("3. EmpleadoCom");
        System.out.print("Tipo: ");
        String tipo = teclado.nextLine().trim();

        if (!tipo.equals("1") && !tipo.equals("2") && !tipo.equals("3")) {
            System.out.println("Tipo de empleado inválido.");
            return;
        }

        System.out.print("ID: ");
        String id = teclado.nextLine();
        System.out.print("Nombre: ");
        String nombre = teclado.nextLine();
        System.out.print("Teléfono: ");
        String telefono = teclado.nextLine();
        System.out.print("Correo: ");
        String correo = teclado.nextLine();

        try {
            Empleado empleado;
            if (tipo.equals("1")) {
                EmpleadoFijo fijo = new EmpleadoFijo();
                fijo.setId(id);
                fijo.setNombre(nombre);
                fijo.setNumeroTel(telefono);
                fijo.setCorreo(correo);
                fijo.setSalarioBase(leerDouble(teclado, "Salario base: "));
                fijo.setBonificacion(leerDouble(teclado, "Bonificación: "));
                empleado = fijo;
            } else if (tipo.equals("2")) {
                EmpleadoHoras porHoras = new EmpleadoHoras();
                porHoras.setId(id);
                porHoras.setNombre(nombre);
                porHoras.setNumeroTel(telefono);
                porHoras.setCorreo(correo);
                porHoras.setHorasTrabajadas(leerEntero(teclado, "Horas trabajadas: "));
                porHoras.setValorHora(leerEntero(teclado, "Valor por hora: "));
                empleado = porHoras;
            } else {
                EmpleadoCom porComision = new EmpleadoCom();
                porComision.setId(id);
                porComision.setNombre(nombre);
                porComision.setNumeroTel(telefono);
                porComision.setCorreo(correo);
                porComision.setSalarioBase(leerDouble(teclado, "Salario base: "));
                porComision.setVentasRealizadas(leerEntero(teclado, "Ventas realizadas: "));
                porComision.setPorcentajeComision(leerDouble(teclado, "Porcentaje de comisión (0 a 1): "));
                empleado = porComision;
            }

            empleados.add(empleado);
            System.out.println("Empleado agregado correctamente.");
        } catch (EmpleadoExceptions e) {
            System.out.println(" Error num: (" + e.getCodError() + "): " + e.getMessage());
        }
    }

    private static int leerEntero(Scanner teclado, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            try {
                return Integer.parseInt(teclado.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un número entero válido.");
            }
        }
    }

    private static double leerDouble(Scanner teclado, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            try {
                return Double.parseDouble(teclado.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un número válido.");
            }
        }
    }

    public static void menuPrincipal() {
        System.out.println("\n========================================");
        System.out.println("      SISTEMA DE GESTIÓN DE EMPLEADOS");
        System.out.println("========================================");
        System.out.println("1. Registrar Empleados");
        System.out.println("2. Mostrar Empleados");
        System.out.println("3. Buscar Empleado por ID");
        System.out.println("4. Mostrar Empleados");
        System.out.println("5. Orden Natural (ID)");
        System.out.println("6. Ordenar por Nombre");
        System.out.println("7. Ordenar por Pago");
        System.out.println("8. Validaciones");
        System.out.println("9. Agregar Empleado Manualmente");
        System.out.println("0. Salir");
        System.out.println("========================================");
        System.out.print("Seleccione una opción: ");
    }

}
