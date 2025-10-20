package u7_ejercicio4; 

public class Animal {
    
    protected String nombre;
    protected String tipo;

    public Animal(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void hacerSonido() {
        System.out.println("El " + tipo + " hace un sonido genérico.");
    }
    

    public void describirAnimal() {
        System.out.print("Nombre: " + nombre + " | Tipo: " + tipo + " | "
                + "Sonido: ");
    }
}