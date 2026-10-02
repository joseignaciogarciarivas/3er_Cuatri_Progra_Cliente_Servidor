package com.ejercicio_10.model;

/**
 *
 * @author andresgonzalezgarcia
 */
public class Libro implements Comparable<Libro>{

    //Variables Globales de la Clase
    private String titulo;
    private String isbn;
    private Autor Autor;
    private int anioPublicacion;
    private int cantidadPaginas;
    private GeneroLiterario generoLiterario;

    private static int cantidadLibros;

    //Constructor vacio
    public Libro() {

    }

    //Constructor con todos los parámetros
    public Libro(String pTitulo, String pIsbn, Autor pAutor,
            int pAnioPublicacion, int pCantidadPaginas, GeneroLiterario pGenLit) {
        this.titulo = pTitulo;
        this.isbn = pIsbn;
        this.Autor = pAutor;
        this.anioPublicacion = pAnioPublicacion;
        this.cantidadPaginas = pCantidadPaginas;
        this.generoLiterario = pGenLit;
        
        cantidadLibros++;
    }

    //Gets & Sets
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return Autor;
    }

    public void setAutor(Autor Autor) {
        this.Autor = Autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public void setCantidadPaginas(int cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }

    public GeneroLiterario getGeneroLiterario() {
        return generoLiterario;
    }

    public void setGeneroLiterario(GeneroLiterario generoLiterario) {
        this.generoLiterario = generoLiterario;
    }

    public static int getCantidadLibros() {
        return cantidadLibros;
    }

    public static void setCantidadLibros(int cantidadLibros) {
        Libro.cantidadLibros = cantidadLibros;
    }

    //Métodos y Funciones
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("\nTitulo:\t\t\t").append(titulo);
        sb.append("\nISBN:\t\t\t").append(isbn);
        sb.append(Autor);
        sb.append("\nAño Publicación:\t").append(anioPublicacion);
        sb.append("\nCantidad Páginas:\t").append(cantidadPaginas);
        sb.append("\nGénero Literario:\t").append(generoLiterario);        

        return sb.toString();
    }

    @Override
    public int compareTo(Libro otro) {
        return this.titulo.compareToIgnoreCase(otro.titulo);
    }
    
    

}
