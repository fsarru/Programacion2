/*EJERCICIO 4: 
Gestión de Gallinas en Granja Digital 
a.	Crear una clase Gallina con los atributos: idGallina, edad, huevosPuestos. 
Métodos requeridos: ponerHuevo(), envejecer(), mostrarEstado(). 
Tarea: Crear dos gallinas, simular sus acciones (envejecer y poner huevos), y mostrar su estado. 
 

 */
package sarru_tp3_ej4;

public class Sarru_TP3_ej4 {
    
    public static void main(String[] args) {
        
        Gallina a = new Gallina();
        a.idGallina = 250501;
        a.edad = 5;
        a.huevosPuestos = 0;
        
        Gallina b = new Gallina();
        b.idGallina = 91218;
        b.edad = 2;
        b.huevosPuestos = 3;                
        
        a.mostrarEstado();
        b.mostrarEstado();
        
     
      a.envejecer(2);
      a.ponerHuevo(5    );
      b.envejecer(8);
      b.ponerHuevo(14);
      
        a.mostrarEstado();
        b.mostrarEstado();
      
      
    }
    
}
