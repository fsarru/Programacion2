import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {
    private List<Producto> productos;
    private Cliente cliente;
    private EstadoPedido estado;
    private Pago metodoPago;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.estado = EstadoPedido.PENDIENTE; 
    }

    public void agregarProducto(Producto p) {
        this.productos.add(p);
    }
    
    public void setMetodoPago(Pago metodoPago) {
        this.metodoPago = metodoPago;
    }

public void cambiarEstado(EstadoPedido nuevoEstado) {
    this.estado = nuevoEstado;
    String mensaje = String.format("El estado de su pedido ha cambiado a: " + nuevoEstado.name());
    cliente.recibirNotificacion(mensaje);
}

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }

    public boolean realizarPago() {
        if (metodoPago == null) {
            System.out.println("ERROR: No se ha seleccionado un método de pago.");
            return false;
        }

        double totalAPagar = calcularTotal();
        System.out.println("Total del Pedido: $" + totalAPagar);
        boolean pagoExitoso = metodoPago.procesarPago(totalAPagar); 
        if (pagoExitoso) {
            cambiarEstado(EstadoPedido.PAGADO); 
            return true;
        } else {
            cambiarEstado(EstadoPedido.RECHAZADO);
            return false;
        }
    }
}