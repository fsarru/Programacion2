public class Cliente implements Notificable {
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }

    @Override
    public void recibirNotificacion(String mensaje) {
        System.out.println("Cliente " + nombre + " Notificado: " + mensaje);
    }
}