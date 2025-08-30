/*EJERCICIO 4: 
Gestión de Gallinas en Granja Digital 
a.	Crear una clase Gallina con los atributos: idGallina, edad, huevosPuestos. 
Métodos requeridos: ponerHuevo(), envejecer(), mostrarEstado(). 
Tarea: Crear dos gallinas, simular sus acciones (envejecer y poner huevos), y mostrar su estado. 
 

 */
package sarru_tp3_ej4;

public class Gallina {
    
       
    int idGallina;
    int edad;
    int huevosPuestos;
    
    public void mostrarEstado() {
        System.out.println("La gallina con ID: " + idGallina + " tiene " + edad + " meses y ha puesto " + huevosPuestos + " huevos.");

    }
  
    public void envejecer(int meses) {
        edad += meses;
        System.out.println("La gallina " + idGallina + " ahora tiene: " + edad + " meses");
    }
    
    public void ponerHuevo(int huevos) {
        huevosPuestos += huevos;
        System.out.println("La gallina " + idGallina + " acumula " + huevosPuestos + " huevos puestos.");
    }
}
