public class TarjetaDeCredito {
    private int numero;
    private String fechaVencimiento;
    private Banco banco;
    private Cliente cliente;
    
    public TarjetaDeCredito(int numero, String fechaVencimiento, Banco banco){
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
        this.cliente = null;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        cliente.setTarjetadecredito(this);
    }

    public int getNumero() {
        return numero;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public Banco getBanco() {
        return banco;
    }

    public Cliente getCliente() {
        return cliente;
    }
          
     public void mostrarDatos(){
        if (cliente != null) {
            System.out.println("La tarjeta de credito del " + banco.getNombre() + " con numeracion " + numero +  " pertenece a "  + cliente.getNombre()+ " , . Cuyo DNI es " + cliente.getDni());
        } else {
            System.out.println(cliente.getNombre() + " no tiene tarjeta de credito.");
        }
     }  
}
