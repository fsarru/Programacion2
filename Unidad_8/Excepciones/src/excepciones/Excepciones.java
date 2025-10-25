
package excepciones;
        
            
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Excepciones {


    private static final Scanner scanner = new Scanner(System.in);
    private static final String NOMBRE_ARCHIVO = "datos.txt"; 



    public static void verificarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("La edad (" + edad + ") es invalida. Debe estar entre 0 y 120.");
        }
        System.out.println(" Edad " + edad + " validada.");
    }


    public static void main(String[] args) {

        // 1. División segura (ArithmeticException)
        try {
            System.out.print("Introduce el dividendo: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Introduce el divisor: ");
            double num2 = scanner.nextDouble();

            if (num2 == 0) {
                 throw new ArithmeticException("El divisor no puede ser cero.");
            }

            double resultado = num1 / num2;
            System.out.printf("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.err.println(" Error: Se esperaba un número.");
        }


        // 2. Conversión de cadena a número (NumberFormatException)
        System.out.print("Introduce un texto (prueba con 'hola'): ");
        if (scanner.hasNextLine()) scanner.nextLine(); 
        String texto = scanner.nextLine();

        try {
            int numero = Integer.parseInt(texto);
            System.out.println("Conversión exitosa. Número: " + numero);
        } catch (NumberFormatException e) {
            System.err.println(" Error: '" + texto + "' no es un número entero válido.");
        }


        // 3. Lectura de archivo (FileNotFoundException)
        System.out.println("\n--- 3. Lectura de Archivo (FileNotFoundException) ---");
        try {
            FileReader fileReader = new FileReader(NOMBRE_ARCHIVO);
            
            System.out.println("Archivo encontrado.");
            fileReader.close(); 
        } catch (java.io.FileNotFoundException e) {
            System.err.println(" Error: Archivo no encontrado.");
        } catch (IOException e) {
            System.err.println(" Error de I/O: " + e.getMessage());
        }


        // 4. Excepción personalizada (EdadInvalidaException)
        try {
            verificarEdad(30);
            verificarEdad(-5); 
        } catch (EdadInvalidaException e) {
            System.err.println(" Capturada: " + e.getMessage());
        }


        // 5. Uso de try-with-resources (IOException)
        System.out.println("\n--- 5. Uso de try-with-resources ---");
        try (BufferedReader reader = new BufferedReader(new FileReader(NOMBRE_ARCHIVO))) {
            
            String linea;
            System.out.println("✅ Lectura con try-with-resources:");
            while ((linea = reader.readLine()) != null) {
                System.out.println("Línea: " + linea);
            }
            
        } catch (java.io.FileNotFoundException e) {
            // Captura si el archivo no existe
            System.err.println("Error de I/O: Archivo no encontrado para try-with-resources.");
        } catch (IOException e) {
            // Captura cualquier otro error de I/O (lectura, cierre, etc.)
            System.err.println("Error de I/O: Ocurrió un error al leer el archivo: " + e.getMessage());}
    }
}



