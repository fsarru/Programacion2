
package sarru_unidad4;


public class Sarru_Unidad4 {

    public static void main(String[] args) {
        //creación de empleados con constructores
        
        //Constructor 1:
        Empleado emp1 = new Empleado(1, "Carlos Perez", "Gerente", 1800);

        // Validación constante de los empleados creados
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
    
        //Constructor 2:
        Empleado emp2 = new Empleado("Martina Gonzalez", "Jefe");
       
        // Validación constante de los empleados creados
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
        
         Empleado emp3 = new Empleado("Rafael Gomez", "Operador");
        
    
       
    
    // toString de cada empleado
    
    System.out.println(emp1.toString());
    System.out.println(emp2.toString());
    System.out.println(emp3.toString());
    
    // Actualizar salarios con métodos sobrecargados
    emp1.actualizarSalario(200);
    emp2.actualizarSalario(30.0);
    emp3.actualizarSalario(100);
    
    System.out.println(emp1.toString());
    System.out.println(emp2.toString());
    System.out.println(emp3.toString());
    
System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());}
}

