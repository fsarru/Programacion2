package ejercicio14;

public class Render {
 
    private String formato;
    private Proyecto proyecto;
    
    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }

    public String getFormato() {
        return formato;
    }
    
    public Proyecto getProyecto() {
        return proyecto;
    }

    public void mostrarDatos() {
        System.out.println("Formato: " + formato);
        System.out.println("Proyecto asociado: " + proyecto.getNombre());
        System.out.println("Duracion del proyecto: " + proyecto.getDuracionMin() + " minutos");
    }
}