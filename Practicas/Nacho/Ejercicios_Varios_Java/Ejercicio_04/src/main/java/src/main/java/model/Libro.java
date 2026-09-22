package src.main.java.model;

public class Libro{
    private String titulo;
    private String isbn;
    private static int cantidadLibros;
    private Autor autor;

    public Libro(String pTitulo, String pIsbn, int pCantidadLibros, Autor pAutor){
        this.titulo = pTitulo;
        this.isbn = pIsbn;
        this.cantidadLibros = pCantidadLibros;
        this.autor = pAutor;
        
        cantidadLibros++;

    }

    public static int getCantidadLibros(){
        return cantidadLibros;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Libro{");
        sb.append("titulo=").append(titulo);
        sb.append(", isbn=").append(isbn);
        sb.append(", autor=").append(autor);
        sb.append('}');
        return sb.toString();
    }
    

}