package ejercicio10;


public class Titular {

    private String nombre;
    private int dni;
    private CuentaBancaria cuentaBancaria;

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


    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        if (cuentaBancaria != null) {
            System.out.println("Cuenta bancaria asociada (CBU): " + cuentaBancaria.getCbu());
            System.out.println("Saldo: $" + cuentaBancaria.getSaldo());
        } else {
            System.out.println(nombre + " no tiene una cuenta bancaria asociada.");
        }
    }
}