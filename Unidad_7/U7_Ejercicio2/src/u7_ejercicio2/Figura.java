
package u7_ejercicio2;


public abstract class Figura {
    
    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarNombre() {
        System.out.println("Soy un: " + nombre);
    }
    
    public abstract double calcularArea();
}
    
