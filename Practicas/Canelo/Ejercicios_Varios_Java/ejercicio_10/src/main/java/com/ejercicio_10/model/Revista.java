package com.ejercicio_10.model;

/**
 *
 * @author andresgonzalezgarcia
 */
public class Revista extends Libro implements Prestable {

    //Declaracion de variables Globales de la Clase
    private int numeroEdicion;
    private boolean prestado = false;
    private int diasPrestamo;

    //Constructor Vacio
    public Revista() {

    }

    //Constructor con todos los parametros
    public Revista(String pTitulo,
            String pIsbn, int pAnioPublicacion, int pCantPag, int pNumEdi, GeneroLiterario pGenLit,
            Autor pAutor) {
               
        super(pTitulo, pIsbn, pAutor, pAnioPublicacion, pCantPag, pGenLit);

        this.numeroEdicion = pNumEdi;
    }

    //Gets & Sets
    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public int getDiasPrestamo() {
        return diasPrestamo;
    }

    public void setDiasPrestamo(int diasPrestamo) throws BibliotecaException {

        if (diasPrestamo <= 0) {
            throw new BibliotecaException(04, "Cantidad de días prestamo debe de ser mayor a cero");
        }

        this.diasPrestamo = diasPrestamo;
    }

    //Métodos y Funciones
    @Override
    public void prestar() throws BibliotecaException {

        if (this.isPrestado()) {
            throw new BibliotecaException(01, "La revista ya se encuentra prestada.");
        }

        this.setPrestado(true);
        System.out.println("\tRA/Se ha prestado la revista.");
    }

    @Override
    public void devolver() throws BibliotecaException {
        if (!this.isPrestado()) {
            throw new BibliotecaException(02, "La revista no se ha prestado.");
        }

        this.setPrestado(false);
        System.out.println("\tRA/Se ha devuelto la revista.");
    }

    @Override
    public void renovarPrestamo(int pDiasPrestamo) throws BibliotecaException {
        if (!this.isPrestado()) {
            throw new BibliotecaException(03, "Intenta renovar un prestamo inexistente.");
        }

        this.setDiasPrestamo(pDiasPrestamo);
        System.out.println("\tRA/Se ha renovado el prestamo.");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("\nTitulo:\t\t\t").append(getTitulo());
        sb.append("\nISBN:\t\t\t").append(getIsbn());
        sb.append(getAutor());
        sb.append("\nAño Publicación:\t").append(getAnioPublicacion());
        sb.append("\nCantidad Páginas:\t").append(getCantidadPaginas());
        sb.append("\nGénero Literario:\t").append(getGeneroLiterario());  
        
        sb.append("\nNúmero Edicion:\t\t").append(numeroEdicion);
        sb.append("\nPréstado:\t\t").append(prestado);
        sb.append("\nDías Prestamo:\t\t").append(diasPrestamo);

        return sb.toString();
    }
    
    

}
