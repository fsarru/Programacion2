
package ejercicio14;

public class Ejercicio14 {

    public static void main(String[] args) {

        Proyecto proyectoFinal = new Proyecto("Mi pelicula", 120.5);

        EditorVideo editor = new EditorVideo();

         editor.exportar(".MP4", proyectoFinal);
    }
}
