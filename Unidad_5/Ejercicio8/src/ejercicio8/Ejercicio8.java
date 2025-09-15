
package ejercicio8;

public class Ejercicio8 {

    public static void main(String[] args) {


        Usuario usuario = new Usuario("Franco Sarru", "mimail@email.com");

        Documento documento = new Documento("Este es el titulo del mail", "Este es el contenido del mail", "Este es el codigoHash", "13/09/2025", 
            usuario
        );

        documento.mostrarDatos();
    }
}