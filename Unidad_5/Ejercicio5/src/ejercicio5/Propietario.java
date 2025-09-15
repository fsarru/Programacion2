package ejercicio5;

public class Propietario {
    private String nombre;
    private int dni;
    private Computadora computadora;
        
    public Propietario(String nombre, int dni){
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
        computadora.setPropietario(this);
    }   
        public void mostrarDatos(){
        if (computadora != null) {
            System.out.println("La computadora " + computadora.getMarca() + " con numero de serie" + computadora.getNumeroSerie() + " pertenece a " + nombre + " , cuyo DNI es " + dni);
        } else {
            System.out.println(nombre + " no tiene computadora.");
        }
    }
    
}
