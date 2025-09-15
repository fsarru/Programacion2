package ejercicio13;


public class CodigoQR {
    private String valor;
    private Usuario usuario;
    
    public CodigoQR(String valor, Usuario usuario){
        this.valor = valor;
        this.usuario = usuario;
    }
    public String getValor(){
        return valor;
    }
    public Usuario getUsuario(){
        return usuario;
    }
    
    public void mostrarDatos(){
        System.out.println("Valor: " +valor);
        System.out.println("Usuario asignado" + usuario.getNombre());
        System.out.println("Emails del usuario" + usuario.getEmail());
    }
    
}
