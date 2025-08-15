
package sarru_tp2_ej12;

/**
 *
 * @author franc
 */
public class Sarru_TP2_EJ12 {

    /*12.	Modificación de un array de precios y visualización de resultados.  
Crea un programa que: 
a.	Declare e inicialice un array con los precios de algunos productos. 
b.	Muestre los valores originales de los precios. 
c.	Modifique el precio de un producto específico. 
d.	Muestre los valores modificados. 
Salida esperada: 
Precios originales: 
Precio: $199.99 
Precio: $299.5 
Precio: $149.75 
Precio: $399.0 
Precio: $89.99 
Precios modificados: 
Precio: $199.99 
Precio: $299.5 
Precio: $129.99 
Precio: $399.0 
Precio: $89.99 
Conceptos Clave Aplicados: 
✔	Uso de arrays (double[]) para almacenar valores. 
✔	Recorrido del array con for-each para mostrar valores. 
✔	Modificación de un valor en un array mediante un índice. 
✔	Reimpresión del array después de la modificación. */
    public static void main(String[] args) {
       
        double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};

        System.out.println("Precios originales:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }

        int modificados = 2;
        double nuevoPrecio = 129.99;
        precios[modificados] = nuevoPrecio;

        System.out.println("Precios modificados:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
    }
}