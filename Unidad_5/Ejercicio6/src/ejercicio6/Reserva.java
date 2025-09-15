
package ejercicio6;

public class Reserva {
    private String fecha;
    private String hora;
    private Cliente cliente;
    private Mesa mesa;
    
 public Reserva (String fecha, String hora, Cliente cliente, Mesa mesa){
     this.fecha = fecha;
     this.hora = hora;
     this.cliente = cliente;
     this.mesa = mesa;
 }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }
 
 public void mostrarDatos(){
     if(cliente != null || mesa != null){
         System.out.println("Se reservo para el " +fecha+ " a las " +hora+ " la mesa Nro " + mesa.getNumero() + " a nombre de " + cliente.getNombre());
     }
     else {
         System.out.println("Faltan datos para poder confirmar la reserva");
     }
 }
         
}
