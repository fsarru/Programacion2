/*EJERCICIO 1:
Registro de Estudiantes

a. Crear una clase Estudiante con los atributos: nombre, apellido, curso,
calificación.
Métodos requeridos: mostrarInfo(), subirCalificacion(puntos),
bajarCalificacion(puntos).
Tarea: Instanciar a un estudiante, mostrar su información, aumentar y disminuir
calificaciones*/

package sarru_tp3;

public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    double calificacion;
    private double puntos;
    
    
    public void mostrarInfo() {
        System.out.println("El estudiante es: " + nombre + " " + apellido);
        System.out.println("Está cursando: " + curso);
        System.out.println("Su calificación actual es: " + calificacion);
    }
  
    public void subirCalificacion(double puntos) {
        calificacion += puntos;
        System.out.println("Nueva calificación: " + calificacion);
    }
    
    public void bajarCalificacion(double puntos) {
    this.calificacion -= puntos;
    System.out.println("Nueva calificación: " + calificacion);
    }
    
        
}
