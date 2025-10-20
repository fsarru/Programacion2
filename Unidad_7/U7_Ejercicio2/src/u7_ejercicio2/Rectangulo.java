package u7_ejercicio2; // Mantengo tu paquete

public class Rectangulo extends Figura {
    
    private double largo;
    private double ancho;

    public Rectangulo(double largo, double ancho) {
        super("Rectangulo"); 
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    public double calcularArea() {
        return largo * ancho;
    }

    public void mostrarInfo() {
        mostrarNombre();
        System.out.println("Largo: " + largo + ", Ancho: " + ancho);
        System.out.println("Area: " + calcularArea());

    }
}