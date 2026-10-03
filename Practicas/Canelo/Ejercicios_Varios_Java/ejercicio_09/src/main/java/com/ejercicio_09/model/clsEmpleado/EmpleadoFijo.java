package com.ejercicio_09.model.clsEmpleado;

import com.ejercicio_09.model.Excepciones.EmpleadoException;
import com.ejercicio_09.model.Excepciones.ErrorEmpleado;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author andresgonzalezgarcia
 */
public class EmpleadoFijo extends Empleado implements Pagable {

    //Declaración de Variables Globales
    private double salarioBase;
    private double bonificacion;

    //Constructor Vacio
    public EmpleadoFijo() {

    }

    //Constructor con todos los Parámetros
    public EmpleadoFijo(String pIdentificacion, String pNombre, String pTelefono,
            String pCorreo, double pSalarioBase, double pBonificacion) {

        super(pIdentificacion, pNombre, pTelefono, pCorreo);

        this.salarioBase = pSalarioBase;
        this.bonificacion = pBonificacion;
    }

    //Gets & Sets
    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) throws EmpleadoException {
        if (salarioBase < 0) {
            throw new EmpleadoException(ErrorEmpleado.VALOR_NEGATIVO.getCodigo(),
                    ErrorEmpleado.VALOR_NEGATIVO.getMensaje("salarioBase"));
        }
        this.salarioBase = salarioBase;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) throws EmpleadoException {
        if (bonificacion < 0) {
            throw new EmpleadoException(ErrorEmpleado.VALOR_NEGATIVO.getCodigo(),
                    ErrorEmpleado.VALOR_NEGATIVO.getMensaje("bonificacion"));
        }
        this.bonificacion = bonificacion;
    }

    //Métodos y Funciones    
    @Override
    public double CalcularPago() {

        return this.salarioBase + this.bonificacion;
    }

    @Override
    public String MostrarPago() {

        NumberFormat formato = NumberFormat.getCurrencyInstance(new Locale("es", "CR"));

        //System.out.println(formato.format(CalcularPago()).toString());
        return String.format("║%s ║ %15s \t\t\t\t\t\t║",
                super.getIdentificacion(),
                formato.format(CalcularPago()));
    }
}
