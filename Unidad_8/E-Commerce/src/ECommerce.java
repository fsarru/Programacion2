public class ECommerce {

     public static void main(String[] args) {

        Cliente ana = new Cliente("Ana Lopez");
        Pedido pedidoAna = new Pedido(ana);

        Producto libro = new Producto("Libro de Java", 50.0);
        Producto teclado = new Producto("Teclado Mecanico", 120.0);

        pedidoAna.agregarProducto(libro);
        pedidoAna.agregarProducto(teclado);

        System.out.println("Total a Pagar antes de descuentos: $" + 
                pedidoAna.calcularTotal());


          pedidoAna.setMetodoPago(new PayPal());
        pedidoAna.realizarPago();

        pedidoAna.cambiarEstado(EstadoPedido.ENVIADO);
        pedidoAna.cambiarEstado(EstadoPedido.ENTREGADO);

        Cliente luis = new Cliente("Luis Gomez");
        Pedido pedidoLuis = new Pedido(luis);
        pedidoLuis.agregarProducto(new Producto("Pelota", 300.0));
        
        pedidoLuis.setMetodoPago(new TarjetaCredito());
        pedidoLuis.realizarPago();
        pedidoLuis.cambiarEstado(EstadoPedido.RECHAZADO);
    }
}