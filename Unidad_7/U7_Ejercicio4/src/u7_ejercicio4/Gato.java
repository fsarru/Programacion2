package u7_ejercicio4;

public class Gato extends Animal {
    
    public Gato(String nombre) {
        super(nombre, "Gato");
    }


    @Override
    public void hacerSonido() {
        System.out.println("Miau!");
    }
}