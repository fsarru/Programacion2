package sarru_tp2_ej4;

import java.util.Scanner;

/*4.	Calculadora de Descuento según categoría. 
Escribe un programa que solicite al usuario el precio de un producto y su categoría (A, B o C). 
Luego, aplique los siguientes descuentos: 
Categoría A: 10% de descuento 
Categoría B: 15% de descuento  
Categoría C: 20% de descuento 
El programa debe mostrar el precio original, el descuento aplicado y el precio final 

 */
public class Sarru_TP2_EJ4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el precio de su producto: ");
        double precio = scanner.nextDouble();
        
        System.out.print("Ingresa la categoria (A,B o C): ");
        char categoria = scanner.next().charAt(0);;
        
        double descuento= 0.0;
        double precioFinal = 0.0;
        
        if (categoria == 'A' || categoria == 'a'){
            descuento = precio * 0.10;
        }
        else if (categoria == 'B' || categoria ==  'b'){
            descuento = precio * 0.20;
        }
        
        else if (categoria == 'C' || categoria ==  'c'){
            descuento = precio * 0.30;
        }
        else {
            System.out.println("No se reconoce la categoría");
        }
        
        precioFinal = precio - descuento;
        
        System.out.println("Precio original: $" + precio);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Precio final: $" + precioFinal);
            
    }
    
}
