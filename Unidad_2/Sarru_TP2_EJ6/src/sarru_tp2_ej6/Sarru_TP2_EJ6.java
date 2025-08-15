
package sarru_tp2_ej6;

import java.util.Scanner;

public class Sarru_TP2_EJ6 {

    /*6.	Contador de Positivos, Negativos y Ceros (for).  
Escribe un programa que pida al usuario ingresar 10 números enteros y cuente cuántos son positivos, negativos y cuántos son ceros. */
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        int num = 0;
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        
        System.out.print("Ingresa 10 números enteros: ");
        for(int i = 1;i <= 10; i++){
            System.out.print("Ingrese el número " + i + ": ");
            num = scanner.nextInt();
            
            if (num > 0) {
                positivos++;
            } else if (num < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        System.out.println("Hay " + positivos + " números positivos.");
        System.out.println("Hay " + negativos + " números negativos.");
        System.out.println("Hay " + ceros + " ceros");

        scanner.close();
    }
}