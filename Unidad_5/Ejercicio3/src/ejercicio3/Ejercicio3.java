
package ejercicio3;

public class Ejercicio3 {

    public static void main(String[] args) {

        Autor autor = new Autor("Jose Fierro", "Argentino");
        Editorial editorial = new Editorial("Kapelusz", "Calle Falsa 123");
        

        Libro libro = new Libro("Fundamentos de la Programación", 123321, editorial, autor); 
        libro.mostrarLibro();  }
}