
package ejercicio6;


public class Ejercicio6 {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Jorge Bermudez", 18698523);
        Mesa mesa = new Mesa(5, 4);
        Reserva reserva = new Reserva("15/09/2025", "21:00", cliente, mesa);

        reserva.mostrarDatos();

        Reserva reservaIncompleta = new Reserva("16/09/2025", "13:30", null, null);
        reservaIncompleta.mostrarDatos();
    }
}
