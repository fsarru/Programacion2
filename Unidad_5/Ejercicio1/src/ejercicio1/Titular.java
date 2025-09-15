
package ejercicio1;

public class Titular {
    private String nombre;
    private int dni;
    private Pasaporte pasaporte; 

    public Titular(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }
    

    public void setPasaporte(Pasaporte pasaporte) {
        // Se establece la referencia al pasaporte.
        this.pasaporte = pasaporte;
        pasaporte.setTitular(this);
    }

    public void mostrarPasaporte() {
        if (pasaporte != null) {
            System.out.println(nombre + " tiene pasaporte con numeración " + pasaporte.getNumero() + " y fecha de emisión " + pasaporte.getFechaEmision());
        } else {
            System.out.println(nombre + " no tiene pasaporte.");
        }
    }
}
