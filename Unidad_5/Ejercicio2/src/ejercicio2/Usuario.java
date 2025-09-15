package ejercicio2;

public class Usuario {
    private String nombre;
    private int dni;
    private Celular celular; 

    public Usuario(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }
    

    public void setCelular(Celular celular) {
        this.celular = celular;
        celular.setUsuario(this);
    }

    public Celular getCelular() {
        return celular;
    }    
    
    public void mostrarCelular() {
        if (celular != null) {
            System.out.println(nombre + " tiene un celular de la marca " + celular.getMarca() + " , modelo " + celular.getModelo() + " cuyo IMEI es " + celular.getImei());
        } else {
            System.out.println(nombre + " no tiene celular.");
        }
    }

}
