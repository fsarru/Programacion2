/*EJERCICIO 5:	Simulación de Nave Espacial 
Crear una clase NaveEspacial con los atributos: nombre, combustible. 
Métodos requeridos: despegar(), avanzar(distancia), recargarCombustible(cantidad), mostrarEstado(). 
Reglas: Validar que haya suficiente combustible antes de avanzar y evitar que se supere el límite al recargar. 
Tarea: Crear una nave con 50 unidades de combustible, intentar avanzar sin recargar, luego recargar y avanzar correctamente. Mostrar el estado al final. 

 */
package sarru_tp3_ej5;

public class NaveEspacial {


    private String nombre;
    private double combustible;
    private final double CAPACIDAD_MAXIMA = 100.0; 

    public void despegar() {
        System.out.println("La nave " + nombre + " ha despegado!");
    }

    
    public void avanzar(double distancia) {
        double combustibleNecesario = distancia * 0.5; // Definí un consumo por cantidad de km.
        if (combustible >= combustibleNecesario) {
            combustible -= combustibleNecesario;
            System.out.println("La nave " + nombre + " avanzo " + distancia + " km.");
        } else {
            System.out.println("No hay suficiente combustible para avanzar " + distancia + " km. Necesitas al menos " + combustibleNecesario + " unidades.");
        }
    }


    public void recargarCombustible(double cantidad) {
        if (combustible + cantidad > CAPACIDAD_MAXIMA) {
            System.out.println("No se puede recargar. La cantidad supera la capacidad maxima!");
        } else {
            combustible += cantidad;
            System.out.println("Se recargaron " + cantidad + " unidades de combustible.");
        }
    }

    // Método para mostrar el estado actual
    public void mostrarEstado() {
        System.out.println("Combustible actual: " + this.combustible + " / " + CAPACIDAD_MAXIMA + " unidades.");
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }
}
