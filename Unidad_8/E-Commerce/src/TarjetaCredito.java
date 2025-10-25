public class TarjetaCredito implements Pago {
    @Override
    public boolean procesarPago(double monto) {
        System.out.println("Procesando pago de $" + monto + " "
                + "con Tarjeta de credito");
        return true; 
    }
}