package u7_ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class U7_Ejercicio3 {
    
    public static void main(String[] args) {

        List<Empleado> nomina = new ArrayList<>();
        
        nomina.add(new EmpleadoPlanta("Ana Perez", 101, 3000.0, 500.0));
        nomina.add(new EmpleadoTemporal("Juan Gomez", 205, 20.0, 160));
        nomina.add(new EmpleadoPlanta("Luis Castro", 102, 3500.0, 750.0));
        nomina.add(new EmpleadoTemporal("Marta Diaz", 210, 25.0, 120));

        
        for (Empleado emp : nomina) {
            emp.mostrarInfoBasica();
            System.out.println("Sueldo: " + emp.calcularSueldo());
        }

        int plantaCount = 0;
        int temporalCount = 0;
        
        for (Empleado emp : nomina) {
            

            if (emp instanceof EmpleadoPlanta) {
                System.out.println("Clasificado: Empleado de Planta ");
                plantaCount++;
                

            } else if (emp instanceof EmpleadoTemporal) {
                System.out.println("Clasificado: Empleado Temporal ");
                temporalCount++;
            }
        }        
        System.out.println("\nResumen: Planta (" + plantaCount + "), "
                + "dTemporal (" + temporalCount + ")\n");
    }
}