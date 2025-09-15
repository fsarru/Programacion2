package ejercicio1;
public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto; 
    private Titular titular;

 
    public Pasaporte(String numero, String fechaEmision, String imagenFoto, String formatoFoto) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagenFoto, formatoFoto);
    }    
    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public Foto getFoto() {
        return foto;
    }
    
    public Titular getTitular() {
        return titular;
    }

    public void mostrarDatos() {
        System.out.println("Numero: " + numero);
        System.out.println("Fecha de emision: " + fechaEmision);
        if (titular != null) {
            System.out.println("Titular: " + titular.getNombre() + " (DNI: " + titular.getDni() + ")");
        }
        System.out.println("Imagen de la foto: " + foto.getImagen());
    }
}