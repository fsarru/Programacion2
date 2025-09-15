
package ejercicio2;

public class Celular {
    private String marca;
    private String modelo;
    private int imei;
    private Bateria bateria; 
    private Usuario usuario;

 
    public Celular(String marca, String modelo, int imei, Bateria bateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.imei = imei;
        this.bateria = bateria;
    }    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getImei() {
        return imei;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Bateria getBateria() {
        return bateria;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void mostrarDatos() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("IMEI: " + imei);
        System.out.println("Bateria: Modelo " + bateria.getModelo() + ", Capacidad " + bateria.getCapacidad());
        if (usuario != null) {
            System.out.println("Usuario: " + usuario.getNombre() + " (DNI: " + usuario.getDni() + ")");
        } else {
            System.out.println(" El celular no tiene usuario asignado.");
        }
    }
}
