package com.tarea1;

/**
 *
 * @author Usuario
 */
public class EmpleadoHoras extends Empleado implements Pagable{
     private int horasTrabajadas;   
     private int valorHora;

    public EmpleadoHoras() {
    }

    public EmpleadoHoras(String pId, String pNombre, String pNumeroTel, String pCorreo, int horasTrabajadas, int valorHora) {
        super(pId, pNombre, pNumeroTel, pCorreo);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) throws EmpleadoExceptions{
        if (horasTrabajadas < 0) {
            throw new EmpleadoExceptions(6, "Las horas trabajadas no puede ser negativo");
        }
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) throws EmpleadoExceptions{
        if (valorHora < 0) {
            throw new EmpleadoExceptions(7, "El valor de las horas no puede ser negativo");
        }
        this.valorHora = valorHora;
    }

     @Override
     public double calcularPago(){
         return horasTrabajadas * valorHora;
     }
     
    @Override
    public String MostrarPago() {
        return " Reporte de pago ID: " + getId() + 
                "  Nombre: " + getNombre() +
                "  Pago Total: " + calcularPago();
    }
    @Override
    public String toString() {
//        super(pId, pNombre, pNumeroTel, pCorreo);

        return " Empleado Horas\t\t"
                + " ID: " + super.getId()
                + " Nombre: " + super.getNombre()
                + " Telefono: " + super.getNumeroTel()
                + " Correo: " + super.getCorreo()
                + " Horas Trabajadas: " + horasTrabajadas
                + " Valor Hora: " + valorHora;
    }
}
