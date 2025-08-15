
package sarru_tp2_ej5;

import java.util.Scanner;

public class Sarru_TP2_EJ5 {

    /*5.	Suma de Números Pares (while).  
Escribe un programa que solicite números al usuario y sume solo los números pares. 
    El ciclo debe continuar hasta que el usuario ingrese el número 0, 
    momento en el que se debe mostrar la suma total de los pares ingresados. 

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int pares = 0;

        System.out.println("Ingresa un número (ingresa 0 para finalizar):");
        
        num = scanner.nextInt();
   
        while (num != 0) {
            if (num % 2 == 0) {
                pares += num;
            }
         
            System.out.println("Ingresa otro número (ingresa 0 para finalizar):");
            num = scanner.nextInt();
        }

        System.out.println("La suma de los números pares es: " + pares);

        scanner.close();
    }
}