package ejercicio13;

public class GeneradorQR {
    public static CodigoQR generar(String valor, Usuario usuario){
        System.out.println("Se creo el codigo QR para el valor: " + valor + " y se asigno al usuario " + usuario.getNombre());
        return new CodigoQR(valor, usuario);
    }
}
