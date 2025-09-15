package ejercicio10;


public class Ejercicio10 {


    public static void main(String[] args) {
        Titular titular1 = new Titular("Diego Armando", 98765423);

        CuentaBancaria cuenta1 = new CuentaBancaria("125873", 9999.80, "Codigo123!", "1/09/2025");


        cuenta1.setTitular(titular1);


//Mostrar datos desdde la cuenta:
        cuenta1.mostrarDatos();
//Mostrar datos desde el titular:
        titular1.mostrarDatos();
    }
}