
package ejercicio12;


public class Calculadora {
    public void calcular(Impuesto impuesto) {
        double monto = impuesto.getMonto();
        System.out.println("Monto base: $" + monto);
        
//Simulé un cálculo para darle un sentido al programa
        double interes = monto * 0.03;
        double montoFinal = monto + interes;
        
        System.out.println("Interes (3%): $" + interes);
        System.out.println("Monto final a pagar: $" + montoFinal);
    }
}
