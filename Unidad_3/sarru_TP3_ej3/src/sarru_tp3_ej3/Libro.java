/*EJERCICIO 3:

3.	Encapsulamiento con la Clase Libro 
a.	Crear una clase Libro con atributos privados: titulo, autor, añoPublicacion. 
Métodos requeridos: Getters para todos los atributos. Setter con validación para añoPublicacion. 
Tarea: Crear un libro, intentar modificar el año con un valor inválido y luego con uno válido, mostrar la información final. 


 */
package sarru_tp3_ej3;

public class Libro {
    
    private String titulo;
    private String autor;
    private int anioPublicacion;


    public String getTitulo() {
        return this.titulo;
    }
    
    public String getAutor() {
        return this.autor;
    }
    
    public int getAnioPublicacion() {
        return this.anioPublicacion;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void setanioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    
    
    // Setter con validación para el año
    public void setcambioAnioPublicacion(int anio) {
        if (anio > 0 && anio <= 2025) {
            this.anioPublicacion = anio;
            System.out.println("El año de publicacion se actualizo correctamente a " + anio + ".");
        } else {
            System.out.println("Error: El año de publicacion " + anio + " no es valido.");
        }
    }
    
    public void mostrarInfo() {
        System.out.println("El nombre del libro es: " + titulo);
        System.out.println("El autor es: " + autor);
        System.out.println("El año de publicacion fue: " + anioPublicacion);
    }
}