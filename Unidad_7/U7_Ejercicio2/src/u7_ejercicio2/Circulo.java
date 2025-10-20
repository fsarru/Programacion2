package u7_ejercicio2; // Mantengo tu paquete

public class Circulo extends Figura {
    
    private double radio;

    public Circulo(double radio) {
        super("Circulo"); 
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
    
    public void mostrarInfo() {
        mostrarNombre(); // Heredado de Figura
        System.out.println("Radio: " + radio);
        System.out.println("Area: " + calcularArea());

    }
}