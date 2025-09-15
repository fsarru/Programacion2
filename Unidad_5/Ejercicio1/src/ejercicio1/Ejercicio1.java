
package ejercicio1;

public class Ejercicio1 {

    public static void main(String[] args) {

    Titular titular = new Titular("Franco", 45678901);

    Pasaporte pasaporte = new Pasaporte("AE123456", "13/09/2025", "foto_franco.jpg", "JPEG");
    titular.setPasaporte(pasaporte);

       // Mostrar datos de Titular
    titular.mostrarPasaporte();
        
        // Mostrar datos de Pasaporte
    pasaporte.mostrarDatos();
    }
}
