
package sarru_tp2_ej7;

import java.util.Scanner;

/*Validación de Nota entre 0 y 10 (do-while). 
Escribe un programa que solicite al usuario una nota entre 0 y 10. 
Si el usuario ingresa un número fuera de este rango, debe seguir pidiéndole la nota hasta que ingrese un valor válido.  */
public class Sarru_TP2_EJ7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota;

        do {
            System.out.print("Ingresa una nota entre 0 y 10: ");
            nota = scanner.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida. Por favor, ingrese un valor entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10); //
        System.out.println("Nota guardada correctamente");
        
        scanner.close();
    }
}