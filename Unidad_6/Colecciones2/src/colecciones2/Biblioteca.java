
package colecciones2;

import java.util.ArrayList;



public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> libros;
    
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>(); 
    }

public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
    boolean isbnExiste = false;

    for (Libro libro : libros) {
        if (libro.getIsbn().equals(isbn)) {
            isbnExiste = true;
        }
    }
    if (!isbnExiste) {
        Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(nuevoLibro);
        System.out.println("Libro agregado: " + titulo);
    } else {
        System.out.println("Ya existe un libro con el ISBN " + isbn);
    }
}

 public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("La biblioteca está vacía.");
            }
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
 }
 
public Libro buscarLibroPorIsbn(String isbn) {
    int ubicacion = 0;
    for (Libro libro : libros) {
        if (libro.getIsbn().equals(isbn)) {            
            libro.mostrarInfo();
            return libro;
        }
        ubicacion++;
    }
    System.out.println("Libro con ISBN " + isbn + " no encontrado en la biblioteca.");
    return null;
}


public void eliminarLibro(String isbn) {
        Libro eliminar = buscarLibroPorIsbn(isbn);
        if (eliminar != null) {
            libros.remove(eliminar);
            System.out.println("Libro '" + eliminar.getTitulo() + "' ELIMINADO.");
            System.out.println("\nLos libros disponibles son los siguientes: \n");
            listarLibros();
        } else {
            System.out.println("No se encontro un libro con el ISBN " + isbn + " para eliminar.");
        }
}

public int obtenerCantidadLibros() {
    System.out.println("La biblioteca cuenta con " +libros.size()+ " libros");
        return libros.size();
        
    }

 public void filtrarLibrosPorAnio(int anio) {
        System.out.println("Libros publicados en " + anio);
        ArrayList<Libro> filtrados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                filtrados.add(libro);
            }
        }
        if (filtrados.isEmpty()) {
            System.out.println(" No se encontraron libros publicados en el año " + anio + " en nuestra Biblioteca.");
            return;
        }        
        for (Libro libro : filtrados) {
            System.out.println("Los libros publicados en el anio " +anio+ " son: " +libro.getTitulo());
        }
 }
 
public void mostrarAutoresDisponibles() {
    ArrayList<String> nombresAutoresUnicos = new ArrayList<>(); 
    

    for (Libro libro : libros) {
        String nombreAutor = libro.getAutor().getNombre();
        if (!nombresAutoresUnicos.contains(nombreAutor)) {
            nombresAutoresUnicos.add(nombreAutor);
        }

    }    
    System.out.println("Contamos con " + nombresAutoresUnicos.size() + " autores distintos en la biblioteca.");

    for (String nombreAutor : nombresAutoresUnicos) {
        System.out.println(nombreAutor);
    }
}
}