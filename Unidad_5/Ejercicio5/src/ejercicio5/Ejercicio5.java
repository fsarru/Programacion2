
package ejercicio5;


public class Ejercicio5 {

    public static void main(String[] args) {
        Propietario prop1 = new Propietario("Pepe Sanchez", 30257698);
        Computadora pc1 = new Computadora("Lenovo", 123321, "AS57", "C5687");
        
        prop1.setComputadora(pc1);
        prop1.mostrarDatos();
        pc1.mostrarDatos();
    }
    
}
