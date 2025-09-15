package ejercicio11.real;
public class Reproductor {
    public void reproducir(Cancion cancion){
        System.out.println("Se esta reproduciendo la cancion " + cancion.getTitulo() + "Del artista: " + cancion.getArtista().getNombre());
    }
}
