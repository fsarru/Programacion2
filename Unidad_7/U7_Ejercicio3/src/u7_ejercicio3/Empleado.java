package u7_ejercicio3;

public abstract class Empleado {
    
    protected String nombre;
    protected int legajo;

    public Empleado(String nombre, int legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }

    public abstract double calcularSueldo();
    
    public void mostrarInfoBasica() {
        System.out.print("Nombre: " + nombre + " (Legajo: " + legajo + ")");
    }
}