public class PayPal implements PagoConDescuento {
    private final double PORCENTAJE_DESCUENTO = 0.05; 

    @Override
    public double aplicarDescuento(double monto) {
        double montoConDescuento = monto * (1 - PORCENTAJE_DESCUENTO);
        System.out.printf(" Descuento por pago con PayPal aplicado. Nuevo "
                + "total: " + montoConDescuento, 
                          PORCENTAJE_DESCUENTO * 100, montoConDescuento);
        return montoConDescuento;
    }

    @Override
    public boolean procesarPago(double monto) {
        double montoFinal = aplicarDescuento(monto);
        System.out.println("Procesando pago final de $" + montoFinal + 
                " con PayPal");
        return true; 
    }
}