
package colecciones2;


public class Colecciones2 {


    public static void main(String[] args) {


        // Tarea 1.
        Biblioteca bibliotecaUtn = new Biblioteca("Biblioteca UTN");
        
        // Tarea 2.
        Autor autor1 = new Autor("A001", "Jose Palomino", "Nicaragua");
        Autor autor2 = new Autor("A002", "Berta Marquez", "Argentina");
        Autor autor3 = new Autor("A003", "Ernesto Bit", "Groenlandia");
        System.out.println("---------- \n");         


        // Tarea 3.

        bibliotecaUtn.agregarLibro("I123", "Introduccion a las bases de datos", 1970, autor1);
        bibliotecaUtn.agregarLibro("I345", "Fundamentos de la programacion", 2001, autor2);
        bibliotecaUtn.agregarLibro("I678", "Buscando los datos", 1985, autor3);
        bibliotecaUtn.agregarLibro("I901", "SQL y mas", 1985, autor1);
        bibliotecaUtn.agregarLibro("I234", "Iniciando en Java", 2003, autor2);
        System.out.println("---------- \n");

        // Tarea 4.
        bibliotecaUtn.listarLibros();
        System.out.println("---------- \n");
        

        // Tarea 5.

        bibliotecaUtn.buscarLibroPorIsbn("I901");
        System.out.println("---------- \n");
        
        // Tarea 5.
        bibliotecaUtn.filtrarLibrosPorAnio(1985);
         System.out.println("---------- \n");
       
        // Tarea 7.
        bibliotecaUtn.eliminarLibro("I678");
        System.out.println("---------- \n");


        // Tarea 8.
        bibliotecaUtn.obtenerCantidadLibros();
        System.out.println("---------- \n");

        // Tarea 9. 
        bibliotecaUtn.mostrarAutoresDisponibles();
    
    }
}

