
package ejercicio7;

public class Conductor {

    private String nombre;
    private String licencia;
    private Vehiculo vehiculo;

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLicencia() {
        return licencia;
    }
    
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Licencia: " + licencia);
        if (vehiculo != null) {
            System.out.println("El vehiculo " + vehiculo.getModelo() + " (Patente: " + vehiculo.getPatente() + ") fue asignado a " +nombre);
        } else {
            System.out.println(nombre + " no tiene un vehículo asignado.");
        }
    }
}
