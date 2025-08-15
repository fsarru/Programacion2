
package sarru_tp2_ej9;

import java.util.Scanner;

/*9.	Composición de funciones para calcular costo de envío y total de compra. 
a.	calcularCostoEnvio(double peso, String zona): Calcula el costo de 
envío basado en la zona de envío (Nacional o Internacional) y el peso del paquete. 
Nacional: $5 por kg  
Internacional: $10 por kg 
b.	calcularTotalCompra(double precioProducto, double 
costoEnvio): Usa calcularCostoEnvio para sumar el costo del producto con el costo de envío. 
Desde main(), solicita el peso del paquete, la zona de envío y el precio del producto. Luego, muestra el total a pagar. 
Ejemplo de entrada/salida: 
Ingrese el precio del producto: 50 
Ingrese el peso del paquete en kg: 2 
Ingrese la zona de envío (Nacional/Internacional): Nacional 
El costo de envío es: 10.0 
El total a pagar es: 60.0 

 */
public class Sarru_TP2_EJ9 {

    public static double calcularCostoEnvio(double peso, String zona) {
        double costo = 0.0;
        if (zona.equalsIgnoreCase("Nacional")) { //Encontré esta función para evitar problemas con mayúsculas y mínusculas
            costo = peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            costo = peso * 10;
        }
        return costo;
    }

   
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scanner.nextDouble();

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = scanner.next();


        double costoEnvio = calcularCostoEnvio(peso, zona);


        double totalCompra = calcularTotalCompra(precioProducto, costoEnvio);

        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + totalCompra);

        scanner.close();
    }
}