package ejercicio7;

public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor; 
    private Conductor conductor;

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        conductor.setVehiculo(this);
    }

    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void mostrarDatos() {
        System.out.println("Patente: " + patente);
        System.out.println("Modelo: " + modelo);
        System.out.println("Motor: Tipo " + motor.getTipo() + ", Número de Serie " + motor.getNumeroSerie());
        if (conductor != null) {
            System.out.println("Conductor asignado: " + conductor.getNombre() + " (Licencia: " + conductor.getLicencia() + ")");
        } else {
            System.out.println("No tiene un conductor asignado.");
        }
    }
}