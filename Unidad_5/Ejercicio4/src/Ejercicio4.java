public class Ejercicio4 {

    public static void main(String[] args) {
        Banco banco = new Banco("Banco Santa Fe", 5879248);
        Cliente cliente = new Cliente("Franco Sarru", 98765823);
        TarjetaDeCredito tc = new TarjetaDeCredito(34587, "13/09/2027", banco);
        
        tc.setCliente(cliente);


        tc.mostrarDatos();
        
        cliente.mostrarDatos();
    }
    
}
