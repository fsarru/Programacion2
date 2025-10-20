package u7_ejercicio1;


public class Main { 
    
    public static void main(String[] args) {
        
        Auto miCoche = new Auto("Toyota", "Etios XS", 4);
        miCoche.mostrarInfo(); 

        Vehiculo miVehiculo = new Vehiculo("Nissan", "Sentra");
        miVehiculo.mostrarInfo();
        
    }
}
