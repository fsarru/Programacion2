/*EJERCICIO2:
a.	Crear una clase Mascota con los atributos: nombre, especie, edad. 
Métodos requeridos: mostrarInfo(), cumplirAnios(). 

 */
package sarru_tp3_ej2;

public class Mascota {
    
    String nombre;
    String especie;
    int edad;
    
    public void mostrarInfo() {
        System.out.println("Las mascota se llama " + nombre + ", es un " + especie + " y tiene " + edad + " años.");
    }     
    
    public void cumplirAnios() {
        edad = edad + 1;
        System.out.println("¡Es el cumpleaños de " + nombre + "! Felicidades!! Ahora tiene " + edad + " años.");

    
    
    }
        
}
