/*EJERCICIO 3:

3.	Encapsulamiento con la Clase Libro 
a.	Crear una clase Libro con atributos privados: titulo, autor, añoPublicacion. 
Métodos requeridos: Getters para todos los atributos. Setter con validación para añoPublicacion. 
Tarea: Crear un libro, intentar modificar el año con un valor inválido y luego con uno válido, mostrar la información final. 
*/
package sarru_tp3_ej3;

public class Sarru_TP3_ej3 {

    public static void main(String[] args) {

        Libro a = new Libro();
        a.setTitulo("Fundamentos de la Programacion");
        a.setAutor("Jose Martin Fierro");
        a.setanioPublicacion(2025);

         a.mostrarInfo();
        
         
         // Cambio de año incorrecto
        a.setcambioAnioPublicacion(2026);
        
         // Cambio de año correcto
        a.setcambioAnioPublicacion(2020);
        a.mostrarInfo();
    }
    
}