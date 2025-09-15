
package ejercicio10;


public class CuentaBancaria {

    private String cbu;
    private double saldo;
    private ClaveSeguridad claveSeguridad; 
    private Titular titular;

    public CuentaBancaria(String cbu, double saldo, String codigoClave, String fechaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = new ClaveSeguridad(codigoClave, fechaModificacion);
    }
    

    public void setTitular(Titular titular) {
        this.titular = titular;
        titular.setCuentaBancaria(this);
    }

    public String getCbu() {
        return cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public ClaveSeguridad getClaveSeguridad() {
        return claveSeguridad;
    }

    public Titular getTitular() {
        return titular;
    }

    public void mostrarDatos() {

        System.out.println("CBU: " + cbu);
        System.out.println("Saldo: $" + saldo);
        System.out.println("Clave de seguridad: " + claveSeguridad.getCodigo());
        System.out.println("Ultima modificacion de Clave: " + claveSeguridad.getUltimaModificacion());
        if (titular != null) {
            System.out.println("Titular: " + titular.getNombre() + " (DNI: " + titular.getDni() + ")");
        } else {
            System.out.println("Sin titular asignado.");
        }
    }
}
