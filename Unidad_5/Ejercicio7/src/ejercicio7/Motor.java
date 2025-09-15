
package ejercicio7;

public class Motor {

    private String tipo;
    private int numeroSerie;

    public Motor(String tipo, int numeroSerie) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }
}
