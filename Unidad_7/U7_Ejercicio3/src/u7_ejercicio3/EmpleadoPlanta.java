package u7_ejercicio3;

public class EmpleadoPlanta extends Empleado {
    
    private double sueldoBase;
    private double bonoAnual;

    public EmpleadoPlanta(String nombre, int legajo, double sueldoBase, double bonoAnual) {
        super(nombre, legajo);
        this.sueldoBase = sueldoBase;
        this.bonoAnual = bonoAnual;
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase + bonoAnual;
    }
}