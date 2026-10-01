package com.ejercicio_09.model;

/**
 *
 * @author andresgonzalezgarcia
 */
public enum ErrorEmpleado {

    VALOR_NEGATIVO(1, "El valor debe ser mayor que cero"),
    ID_DUPLICADA(2, "La identificación ya existe"),
    HORAS_INVALIDAS(3, "Las horas trabajadas no pueden ser negativas"),
    PORCENTAJE_INVALIDO(4, "Porcentaje inválido {0.1 a 1.0}");

    private final int codigo;
    private final String mensaje;

    ErrorEmpleado(int codigo, String mensaje) {
        this.codigo = codigo;
        this.mensaje = mensaje;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getMensaje(String pExtra) {
        return mensaje + "-->[ " + pExtra+" ]";
    }
}
