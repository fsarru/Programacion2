
package sarru_tp2_ej8;

import java.util.Scanner;

/*Cálculo del Precio Final con impuesto y descuento. 
 	Crea un método calcularPrecioFinal(double impuesto, double descuento) que calcule el precio final de un producto en un e-commerce. La fórmula es: 
PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento) 
PrecioFinal = PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times 
Descuento) 
Desde main(), solicita el precio base del producto, el porcentaje de impuesto y el porcentaje de descuento, llama al método y muestra el precio final.  */
public class Sarru_TP2_EJ8 {

    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double precioFinal = precioBase + (precioBase * impuesto) - (precioBase * descuento);
        return precioFinal;
    }
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el precio base del producto: ");
        double precioBase = scanner.nextDouble();

        System.out.print("Ingresa el porcentaje de impuesto (ej. 10 para 10%): ");
        double porcentajeImpuesto = scanner.nextDouble();

        double impuesto = porcentajeImpuesto / 100;

        System.out.print("Ingresa el porcentaje de descuento (ej. 15 para 15%): ");
        double porcentajeDescuento = scanner.nextDouble();

        double descuento = porcentajeDescuento / 100;

        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
        System.out.println("Precio final del producto: $" + precioFinal);

        scanner.close();
    }
}