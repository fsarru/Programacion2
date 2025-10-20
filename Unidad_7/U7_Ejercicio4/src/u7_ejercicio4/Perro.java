package u7_ejercicio4;

public class Perro extends Animal {
    
    public Perro(String nombre) {
        super(nombre, "Perro");
    }


    @Override
    public void hacerSonido() {
        System.out.println("Guau!");
    }
}