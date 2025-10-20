
package u7_ejercicio2;

public class U7_Ejercicio2 {


    public static void main(String[] args) {

        Circulo miCirculo = new Circulo(5.0);
        miCirculo.mostrarInfo();
        

        Rectangulo miRectangulo = new Rectangulo(4.0, 6.0);
        miRectangulo.mostrarInfo();
        

        Figura figura1 = new Circulo(10.0);
        Figura figura2 = new Rectangulo(5.0, 10.0);
        
        System.out.println("Area de la figura 1 (" + figura1.nombre + "): " 
                + figura1.calcularArea());
        System.out.println("Area de la figura 2 (" + figura2.nombre + "): " 
                + figura2.calcularArea());
    }
}
