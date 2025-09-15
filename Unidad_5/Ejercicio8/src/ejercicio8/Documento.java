package ejercicio8;

public class Documento {

    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital;

      public Documento(String titulo, String contenido, String codigoHash, String fecha, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;

        this.firmaDigital = new FirmaDigital(codigoHash, fecha, usuario);
    }

    public String getTitulo() {
        return titulo;
    }
    
    public String getContenido() {
        return contenido;
    }
    
    public FirmaDigital getFirmaDigital() {
        return firmaDigital;
    }

    public void mostrarDatos() {

        System.out.println("Titulo: " + titulo);
        System.out.println("Contenido: " + contenido);
        System.out.println("Codigo Hash: " + firmaDigital.getCodigoHash());
        System.out.println("Fecha: " + firmaDigital.getFecha());
        System.out.println("Usuario: " + firmaDigital.getUsuario().getNombre());
        System.out.println("Email del Usuario: " + firmaDigital.getUsuario().getEmail());
    }
}