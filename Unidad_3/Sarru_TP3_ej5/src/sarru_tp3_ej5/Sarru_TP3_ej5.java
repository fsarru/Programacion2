/*EJERCICIO 5:	Simulación de Nave Espacial 
Crear una clase NaveEspacial con los atributos: nombre, combustible. 
Métodos requeridos: despegar(), avanzar(distancia), recargarCombustible(cantidad), mostrarEstado(). 
Reglas: Validar que haya suficiente combustible antes de avanzar y evitar que se supere el límite al recargar. 
Tarea: Crear una nave con 50 unidades de combustible, intentar avanzar sin recargar, luego recargar y avanzar correctamente. Mostrar el estado al final. 
 */
package sarru_tp3_ej5;


public class Sarru_TP3_ej5 {

   
    public static void main(String[] args) {

    
        NaveEspacial a = new NaveEspacial();

        
        a.setNombre("SpaceF");
        a.setCombustible(50.0);

        
        a.mostrarEstado();

        
        a.despegar();

        

        a.avanzar(150.0); 
        a.mostrarEstado();



        a.recargarCombustible(60.0); 


        a.recargarCombustible(40.0); 



        a.avanzar(150.0);


        a.mostrarEstado();
    }
}
    
    
