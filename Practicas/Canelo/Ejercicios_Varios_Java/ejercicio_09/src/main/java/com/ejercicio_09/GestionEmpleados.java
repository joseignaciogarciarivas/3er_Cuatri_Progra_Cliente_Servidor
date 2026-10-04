package com.ejercicio_09;

// <editor-fold defaultstate="collapsed" desc="IMPORTS">

import com.ejercicio_09.model.Comparador.ComparadorNombre;
import com.ejercicio_09.model.Comparador.ComparadorPago;
import com.ejercicio_09.model.Excepciones.EmpleadoException;
import com.ejercicio_09.model.Excepciones.ErrorEmpleado;
import com.ejercicio_09.model.clsEmpleado.EmpleadoComision;
import com.ejercicio_09.model.clsEmpleado.Empleado;
import com.ejercicio_09.model.clsEmpleado.EmpleadoFijo;
import com.ejercicio_09.model.clsEmpleado.EmpleadoPorHoras;
import com.ejercicio_09.model.clsEmpleado.Pagable;
import java.util.ArrayList;
import java.util.Collections;

// </editor-fold>

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
        
        // <editor-fold defaultstate="collapsed" desc="INTERFAZ">
        System.out.println("╔═══════════════════════════════════════════════════════════════════════╗");        
        System.out.printf("║%s %s%n",centrar("1. REGISTRAR EMPLEADOS DE CUALQUIERA DE LAS TRES MODALIDADES",70),"║");
        // </editor-fold>
        
        ArrayList<Empleado> arrEmp = new ArrayList<>();

        // Empleados Fijos
        EmpleadoFijo fijo1 = new EmpleadoFijo("101001", "Ana Rodríguez Rodríguez", "8888-1111", "ana.rodriguez@empresa.com", 850000, 0);
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

        arrEmp.add(comision2);
        arrEmp.add(fijo1);
        arrEmp.add(horas3);

        arrEmp.add(comision1);
        arrEmp.add(horas1);
        arrEmp.add(fijo3);

        arrEmp.add(comision3);
        arrEmp.add(fijo2);
        arrEmp.add(horas2);

        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="2. MOSTRAR LOS EMPLEADOS REGISTRADOS">
        
        // <editor-fold defaultstate="collapsed" desc="INTERFAZ">
        System.out.println("╠═══════════════════════════════════════════════════════════════════════╣");        
        System.out.printf("║%s %s%n",centrar("2. MOSTRAR LOS EMPLEADOS REGISTRADOS",70),"║");
        System.out.println("╠═══════╦═══════════════╦═══════════════╦═══════════════════════════════╣");      
        System.out.printf("║%s║%s║%s║%s║%n",
                centrar("ID",7),
                centrar("Nombre",15),
                centrar("Teléfono",15),
                centrar("Correo",31),
                "║");
        System.out.println("╠═══════╬═══════════════╬═══════════════╬═══════════════════════════════╣");
        // </editor-fold>
        
        //Recorrido mediante ciclos
        for (Empleado empleado : arrEmp) {
            System.out.println(empleado.toString());
        }

        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="3. BUSCAR UN EMPLEADO UTILIZANDO SU IDENTIFICACIÓN">

        buscarEmpleado(tBusEmp, arrEmp);

        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="4. MOSTRAR EL PAGO CORRESPONDIENTE A CADA EMPLEADO">
        
        // <editor-fold defaultstate="collapsed" desc="INTERFAZ">
        
        System.out.printf("║%s %s%n",centrar("4. MOSTRAR EL PAGO CORRESPONDIENTE A CADA EMPLEADO",70),"║");
        System.out.println("╠═══════╦═══════════════════════════════════════════════════════════════╣");
        System.out.printf("║%s ║ %s %46s%n",centrar("ID",6),centrar("SALARIO",16),"║");
        System.out.println("╠═══════╬═══════════════════════════════════════════════════════════════╣");
        
        // </editor-fold>
        
        //Se imprime en consola pago correspondiente a cada empleado
        for (Empleado empleado : arrEmp) {
            Pagable p = (Pagable) empleado;
            System.out.println(p.MostrarPago());
        }

        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="5. ORDENAR LOS EMPLEADOS POR SU ORDEN NATURAL">
        
        // <editor-fold defaultstate="collapsed" desc="INTERFAZ">
        
        System.out.println("╠═══════╩═══════════════════════════════════════════════════════════════╣");
        
        System.out.printf("║%s %s%n",centrar("5. ORDENAR LOS EMPLEADOS POR SU ORDEN NATURAL [IDENTIFICACION]",70),"║");
        System.out.println("╠═══════╦═══════════════╦═══════════════╦═══════════════════════════════╣");      
        System.out.printf("║%s║%s║%s║%s║%n",
                centrar("ID",7),
                centrar("Nombre",15),
                centrar("Teléfono",15),
                centrar("Correo",31),
                "║");
        System.out.println("╠═══════╬═══════════════╬═══════════════╬═══════════════════════════════╣");
        
        // </editor-fold>
        
        //Se organiza el array por orden Natural declarado en Empleado
        Collections.sort(arrEmp);
        
        //Recorrido mediante ciclos
        for (Empleado empleado : arrEmp) {
            System.out.println(empleado.toString());
        }
        
        // </editor-fold>
              
        // <editor-fold defaultstate="collapsed" desc="6. ORDENAR LOS EMPLEADOS POR NOMBRE">
        
        // <editor-fold defaultstate="collapsed" desc="INTERFAZ">
        
        //System.out.println("╠═══════════════════════════════════════════════════════════════════════╣");
        System.out.println("╠═══════╩═══════════════╩═══════════════╩═══════════════════════════════╣");
        System.out.printf("║%s %s%n",centrar("6. ORDENAR LOS EMPLEADOS POR NOMBRE",70),"║");
        System.out.println("╠═══════╦═══════════════╦═══════════════╦═══════════════════════════════╣");      
        System.out.printf("║%s║%s║%s║%s║%n",
                centrar("ID",7),
                centrar("Nombre",15),
                centrar("Teléfono",15),
                centrar("Correo",31),
                "║");
        System.out.println("╠═══════╬═══════════════╬═══════════════╬═══════════════════════════════╣");
        
        // </editor-fold>
        
        //Se organiza el array por de Nombre        
        Collections.sort(arrEmp, new ComparadorNombre());
        
        //Recorrido mediante ciclos
        for (Empleado empleado : arrEmp) {
            System.out.println(empleado.toString());
        }
        
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="7. ORDENAR LOS EMPLEADOS DE ACUERDO CON EL MONTO DE SU PAGO">
        
        // <editor-fold defaultstate="collapsed" desc="INTERFAZ">
        
        //System.out.println("╠═══════════════════════════════════════════════════════════════════════╣");
        System.out.println("╠═══════╩═══════════════╩═══════════════╩═══════════════════════════════╣");
        System.out.printf("║%s %s%n",centrar("7. ORDENAR LOS EMPLEADOS DE ACUERDO CON EL MONTO DE SU PAGO",70),"║");
        System.out.println("╠═══════╦═══════════════════════════════════════════════════════════════╣");
        System.out.printf("║%s ║ %s %46s%n",centrar("ID",6),centrar("SALARIO",16),"║");
        System.out.println("╠═══════╬═══════════════════════════════════════════════════════════════╣");
        
        // </editor-fold>
        
        //Se organiza el array por orden de Pago        
        Collections.sort(arrEmp, new ComparadorPago());
        
        //Recorrido mediante ciclos
        for (Empleado empleado : arrEmp) {
            Pagable p = (Pagable) empleado;
            System.out.println(p.MostrarPago());
        }
        
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="CIERRE INTERFAZ">
        
        System.out.println("╚═══════╩═══════════════════════════════════════════════════════════════╝");
        
        // </editor-fold>
        
    }

     // <editor-fold defaultstate="collapsed" desc="MÉTODOS Y FUNCIONES">
    
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

    public static String centrar(String texto, int ancho) {
        if (texto.length() >= ancho) {
            return texto;
        }
        
        int espaciosIzq = (ancho - texto.length()) / 2;
        int espaciosDer = ancho - texto.length() - espaciosIzq;
        
        return " ".repeat(espaciosIzq) + texto + " ".repeat(espaciosDer);
    }

    // </editor-fold>
}
