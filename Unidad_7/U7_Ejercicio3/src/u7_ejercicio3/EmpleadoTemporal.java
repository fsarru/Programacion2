package u7_ejercicio3;

public class EmpleadoTemporal extends Empleado {
    
    private double tarifaPorHora;
    private int horasTrabajadas;

    public EmpleadoTemporal(String nombre, int legajo, double tarifaPorHora, int horasTrabajadas) {
        super(nombre, legajo);
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSueldo() {
        return tarifaPorHora * horasTrabajadas;
    }
}