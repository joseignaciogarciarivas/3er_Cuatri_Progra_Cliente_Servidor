package src.main.java.model;

import java.util.ArrayList;

public class Biblioteca {

    ArrayList<Libro> arrLibros = new ArrayList<>();

    public void AgregarLibro(Libro plibro) {
        arrLibros.add(plibro);
    }

    public void mostrarLibros() {
        for (int i = 0; i < arrLibros.size(); i++) {
            System.out.println(arrLibros.get(i).toString());
        }        
    }
}
