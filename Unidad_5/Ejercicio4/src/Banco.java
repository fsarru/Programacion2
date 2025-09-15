
public class Banco {
    private String nombre;
    private int cuit;
    
    public Banco(String nombre, int cuit){
        this.nombre = nombre;
        this.cuit = cuit;    
 }

    public String getNombre() {
        return nombre;
    }

    public int getCuit() {
        return cuit;
    }
}