package com.tarea1;

/**
 *
 * @author Usuario
 */
public class EmpleadoCom extends Empleado implements Pagable {

    private double salarioBase;
    private int ventasRealizadas;
    private double porcentajeComision;

    public EmpleadoCom() {
    }

    public EmpleadoCom(String pId, String pNombre, String pNumeroTel, String pCorreo, double salarioBase, int ventasRealizadas, double porcentajeComision) {
        super(pId, pNombre, pNumeroTel, pCorreo);
        this.salarioBase = salarioBase;
        this.ventasRealizadas = ventasRealizadas;
        this.porcentajeComision = porcentajeComision;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) throws EmpleadoExceptions {
        if (salarioBase < 0) {
            throw new EmpleadoExceptions(8, "El salario no puede ser negativo");
        }
        this.salarioBase = salarioBase;
    }

    public int getVentasRealizadas() {
        return ventasRealizadas;
    }

    public void setVentasRealizadas(int ventasRealizadas) throws EmpleadoExceptions {
        if (ventasRealizadas < 0) {
            throw new EmpleadoExceptions(8, "El numero de las ventas no puede ser negativo");
        }
        this.ventasRealizadas = ventasRealizadas;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(double porcentajeComision) throws EmpleadoExceptions {
        if (porcentajeComision < 0) {
            throw new EmpleadoExceptions(9, "El porcentaje de comision no puede ser negativo");
        }
        this.porcentajeComision = porcentajeComision;
    }

    @Override
    public double calcularPago() {
        return salarioBase + (ventasRealizadas * porcentajeComision);
    }

    @Override
    public String MostrarPago() {
        System.out.println("Reporte de pago");
        return  " \t ID: " + getId().toString() + " \n\t Nombre: " + getNombre().toString() + " \n\t Numero: " + getNumeroTel().toString() + " \n\t Correo: " + getCorreo().toString() + " \n\t Pago Total: " + calcularPago();
                
        
    }
}
