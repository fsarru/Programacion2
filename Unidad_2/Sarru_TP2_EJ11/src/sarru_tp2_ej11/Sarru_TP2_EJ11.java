
package sarru_tp2_ej11;

import java.util.Scanner;

/*11.	Cálculo de descuento especial usando variable global. 
Declara una variable global Ejemplo de entrada/salida: = 0.10. Luego, crea un método calcularDescuentoEspecial(double precio) que use la variable global para calcular el descuento especial del 10%. 
 Dentro del método, declara una variable local descuentoAplicado, almacena el valor del descuento y muestra el precio final con descuento. 
Ejemplo de entrada/salida: 
Ingrese el precio del producto: 200 
El descuento especial aplicado es: 20.0 
El precio final con descuento es: 180.0 
 
 */
public class Sarru_TP2_EJ11 {
    
    public static final double DESCUENTO_ESPECIAL = 0.10;
    
    public static double calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;
        
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
        return precioFinal;
    }
                

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double valor = scanner.nextDouble();

        calcularDescuentoEspecial(valor);
        
        scanner.close();
    }
}