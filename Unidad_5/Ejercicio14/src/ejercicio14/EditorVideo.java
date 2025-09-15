package ejercicio14;
public class EditorVideo {
    public void exportar(String formato,Proyecto proyecto){
        System.out.println("Se creo el archivo renderizado " + proyecto.getNombre() + " en formato " + formato + ".");
        Render nuevoRender = new Render(formato, proyecto);     
        nuevoRender.mostrarDatos();
    }
   
}