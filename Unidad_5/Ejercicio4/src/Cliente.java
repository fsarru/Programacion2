
public class Cliente {
    private String nombre;
    private int dni;
    private TarjetaDeCredito tarjetadecredito;
    
    public Cliente(String nombre, int dni){
        this.nombre = nombre;
        this.dni = dni;
        this.tarjetadecredito = null;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }
    
    public void setTarjetadecredito(TarjetaDeCredito tarjetadecredito) {
        this.tarjetadecredito = tarjetadecredito;
    }
    
    public void mostrarDatos(){
        if (tarjetadecredito != null) {
            System.out.println(nombre + " tiene una tarjeta de credito cuyo numero es " + tarjetadecredito.getNumero() + " y su fecha de vencimiento es " + tarjetadecredito.getFechaVencimiento());
        } else {
            System.out.println(nombre + " no tiene tarjeta de credito.");
        }
    }
}

