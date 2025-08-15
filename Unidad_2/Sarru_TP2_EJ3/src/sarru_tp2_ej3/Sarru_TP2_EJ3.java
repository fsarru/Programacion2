
package sarru_tp2_ej3;

import java.util.Scanner;

public class Sarru_TP2_EJ3 {

    /*3.	Clasificación de Edad. 
Escribe un programa en Java que solicite al usuario su edad y clasifique su etapa de vida según la siguiente tabla: 
Menor de 12 años: "Niño" 
Entre 12 y 17 años: "Adolescente" 
Entre 18 y 59 años: "Adulto" 
60 años o más: "Adulto mayor" 

   
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa su edad: ");
        int edad = scanner.nextInt();
        
        if (edad < 12){
            System.out.println("Eres un Niño");
        } else if (edad >= 12 && edad < 17) {
            System.out.println("Eres un Adolescente");
        } else if (edad >= 18 && edad < 59) {
            System.out.println("Eres un Adulto");
        } else {
            System.out.println("Eres un Adulto mayor");
        }
    }
    
}
