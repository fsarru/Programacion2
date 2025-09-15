
package ejercicio7;

public class Ejercicio7 {


    public static void main(String[] args) {

        Motor motor = new Motor("Diesel", 98765);
        Conductor conductor = new Conductor("Graciela Gomez", "B-7890123");

        Vehiculo vehiculo = new Vehiculo("XYZ321", "VW Polo", motor);

        vehiculo.setConductor(conductor);


        vehiculo.mostrarDatos();
        conductor.mostrarDatos();
    }
}