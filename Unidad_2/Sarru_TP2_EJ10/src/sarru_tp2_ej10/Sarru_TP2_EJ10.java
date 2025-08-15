
package sarru_tp2_ej10;

import java.util.Scanner;

/*10.	Actualización de stock a partir de venta y recepción de productos. Crea un método actualizarStock(int stockActual, int cantidadVendida, 
int cantidadRecibida), que calcule el nuevo stock después de una venta y recepción de productos: 
NuevoStock = StockActual − CantidadVendida + CantidadRecibida 
NuevoStock = CantidadVendida + CantidadRecibida 
Desde main(), solicita al usuario el stock actual, la cantidad vendida y la cantidad recibida, y muestra el stock actualizado. 
Ejemplo de entrada/salida: 
Ingrese el stock actual del producto: 50 
Ingrese la cantidad vendida: 20 
Ingrese la cantidad recibida: 30 
El nuevo stock del producto es: 60 

 */
public class Sarru_TP2_EJ10 {

    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        return nuevoStock;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el stoc actual: ");
        int stockActual = scanner.nextInt();
        System.out.print("Ingrese la cantidad de ventas: ");
        int cantidadVendida = scanner.nextInt();
        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = scanner.nextInt();
        
        int stock = actualizarStock(stockActual,cantidadVendida,cantidadRecibida);
        
        System.out.println("El stock actual es: " + stock);
        scanner.close();        

    }
    
}
