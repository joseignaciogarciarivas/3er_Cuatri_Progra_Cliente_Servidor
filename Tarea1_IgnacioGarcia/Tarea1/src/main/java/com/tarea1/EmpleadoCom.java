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
            throw new EmpleadoExceptions(9, "El numero de las ventas no puede ser negativo");
        }
        this.ventasRealizadas = ventasRealizadas;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(double porcentajeComision) throws EmpleadoExceptions {
        if ((porcentajeComision < 0) || (porcentajeComision > 1)){
            throw new EmpleadoExceptions(10, "El porcentaje de comision esta fuera de los rangos establecidos");
        }
        this.porcentajeComision = porcentajeComision;
    }

    @Override
    public double calcularPago() {
        return salarioBase + (ventasRealizadas * porcentajeComision);
    }

    @Override
    public String MostrarPago() {
        return " Reporte de pago ID: " + getId() + 
                "  Nombre: " + getNombre() +
                "  Pago Total: " + calcularPago();
    }

    @Override
    public String toString() {

        return " Empleado Comision\t"
                + " ID: " + super.getId()
                + " Nombre: " + super.getNombre()
                + " Telefono: " + super.getNumeroTel()
                + " Correo: " + super.getCorreo()
                + " Salario Base: " + salarioBase
                + " Ventas Realizadas: " + ventasRealizadas
                + " Porcentaje Comision: " + porcentajeComision; 
    }

}
