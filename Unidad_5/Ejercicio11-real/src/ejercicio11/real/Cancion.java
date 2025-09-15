
package ejercicio11.real;

public class Cancion {
    private String titulo;
    private Artista artista;
    
    
    public Cancion(String titulo, Artista artista){
        this.titulo = titulo;
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public Artista getArtista() {
        return artista;
    }
    
    public void mostrarDatos(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista.getNombre());
        System.out.println("Genero: " + artista.getGenero());
    }
}
