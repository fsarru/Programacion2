package ejercicio13;

public class Ejercicio13 {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("Manuela", "elmaildemanuela@ejemplo.com");
        CodigoQR codigo = GeneradorQR.generar("texto para generar el QR", usuario);
        codigo.mostrarDatos();
    }
    
}
