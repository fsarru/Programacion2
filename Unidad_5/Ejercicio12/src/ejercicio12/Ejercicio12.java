
package ejercicio12;

public class Ejercicio12 {

    public static void main(String[] args) {
       
        Contribuyente contribuyente = new Contribuyente("Dorotea Jimenez", 2014765548);
        Impuesto impuesto = new Impuesto(58975.75, contribuyente);
        Calculadora calculadora = new Calculadora();
        calculadora.calcular(impuesto);
   // Datos generados del usuario.     
        impuesto.mostrarDatos();
    }
}
