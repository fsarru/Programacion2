/* Ejercicio 1: Verificación de Año Bisiesto.
Escribe un programa en Java que solicite al usuario un año y determine si es bisiesto. Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea divisible por 400.*/


package sarru_tp2;

import java.util.Scanner;


public class Sarru_TP2 {

    public static void main(String[] args) {   
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un año: ");
        int año = scanner.nextInt();

        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            System.out.println(año + " es un año bisiesto.");
        } else {
            System.out.println(año + " no es un año bisiesto.");
        }

        scanner.close();
    }
    
    
}
        