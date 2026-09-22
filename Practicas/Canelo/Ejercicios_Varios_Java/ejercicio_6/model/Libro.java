package ejercicios_canelo.ejercicio_6.model;

public class Libro {

    // Declaración de Variables Globales
    private String titulo;
    private String isbn;
    private Autor clsAutor;
    private static int contador;

    //Constructor vacio
    public Libro(){

    }

    // Constructor con todos los atributos
    public Libro(String pTitulo, String pIsbn, Autor pClsAutor) {
        this.titulo = pTitulo;
        this.isbn = pIsbn;
        this.clsAutor = pClsAutor;
        contador++;
    }

    public static int getCantidadLibros() {
        return contador;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Titulo: " + titulo);
        sb.append("isbn: " + isbn);
        sb.append("Autor: " + clsAutor.toString());

        return sb.toString();
    }



}