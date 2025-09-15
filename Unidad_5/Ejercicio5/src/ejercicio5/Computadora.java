package ejercicio5;
public class Computadora {

    private String marca;
    private int numeroSerie;
    private PlacaMadre placamadre;
    private Propietario propietario;
    
    public Computadora(String marca, int numeroSerie, String modeloPlacaMadre, String chipsetPlacaMadre){
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placamadre = new PlacaMadre(modeloPlacaMadre, chipsetPlacaMadre);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public PlacaMadre getPlacamadre() {
        return placamadre;
    }

    public void setPlacamadre(PlacaMadre placamadre) {
        this.placamadre = placamadre;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
   
     public void mostrarDatos(){
        if (propietario != null) {
            System.out.println("La computadora " + marca + " con numero de serie" + numeroSerie + " pertenece a " + propietario.getNombre() + " , cuyo DNI es " + propietario.getDni());
        } else {
            System.out.println(propietario.getNombre() + " no tiene computadora.");
        }
     }
}
















