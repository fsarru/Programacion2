package u7_ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class U7_Ejercicio4 {
    
    public static void main(String[] args) {

        List<Animal> granja = new ArrayList<>();
        
        granja.add(new Perro("Rocko"));
        granja.add(new Gato("Garfield"));
        granja.add(new Vaca("Lola"));
        granja.add(new Perro("Fatiga"));   

        for (Animal animal : granja) {
         
            animal.describirAnimal();
            
            animal.hacerSonido();
        }
    }
}