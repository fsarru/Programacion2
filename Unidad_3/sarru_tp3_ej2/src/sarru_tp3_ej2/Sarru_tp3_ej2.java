/*EJERCICIO 2: 
2.	Registro de Mascotas 
a.	Crear una clase Mascota con los atributos: nombre, especie, edad. 
Métodos requeridos: mostrarInfo(), cumplirAnios(). 
Tarea: Crear una mascota, mostrar su información, simular el paso del tiempo y verificar los cambios. 

 */
package sarru_tp3_ej2;

public class Sarru_tp3_ej2 {

    public static void main(String[] args) {
        Mascota a = new Mascota();
        a.nombre = "Pipo";
        a.especie = "perro";
        a.edad = 1;
        
        
        a.mostrarInfo();
        a.cumplirAnios();
        a.cumplirAnios();
        a.cumplirAnios();
        
        
    }
    
}
