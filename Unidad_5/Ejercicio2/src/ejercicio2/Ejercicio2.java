
package ejercicio2;

public class Ejercicio2 {

    public static void main(String[] args) {


Bateria bateria1 = new Bateria("Li-Ion-5000", "5000mAh");            
            
Usuario usuario1 = new Usuario("Diego Armando", 10101010);

Celular celular1 = new Celular("Nokia", "1100", 91218, bateria1);

usuario1.setCelular(celular1);

    
// Mostrar datos desde Celular
celular1.mostrarDatos();
        
// Mostrar datos de Usuario
usuario1.mostrarCelular();
    }
    
}
