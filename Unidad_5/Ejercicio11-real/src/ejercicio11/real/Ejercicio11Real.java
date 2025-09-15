
package ejercicio11.real;

public class Ejercicio11Real {

    public static void main(String[] args) {
Artista art1 = new Artista("La Vela Puerca", "Rock");
Cancion cancion1 = new Cancion("Zafar", art1);
Reproductor rep = new Reproductor();

rep.reproducir(cancion1);
cancion1.mostrarDatos();

    }
    
}