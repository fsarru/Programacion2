/*● int id: Identificador único del empleado.
● String nombre: Nombre completo.
● String puesto: Cargo que desempeña.
● double salario: Salario actual.
● static int totalEmpleados: Contador global de empleados creados.*/

package sarru_unidad4;


public class Empleado {
    
    
//Atributos - Privados    
private int id; //Identificador único del empleado.
private String nombre; //Nombre completo.
private String puesto; //Cargo que desempeña.
private double salario; //Salario actual.

//Atributos Estáticos
private static int totalEmpleados = 0; //Contador global de empleados creados.
private static int ultimoId = 0;

// Sobrecarga de constructores

// 1er constructor - Todos los atributos
 public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
        if (id > ultimoId) {
            ultimoId = id; // Para no repetir ID
        }
        
        }
 
 // 2do constructor - atributo nomre y puesto. Salario predeterminado
 public Empleado(String nombre, String puesto) {
     this.id = ++ultimoId;   
     this.nombre = nombre;
     this.puesto = puesto;
     this.salario = 1000.00;
     totalEmpleados++;
 }
  
 
 // Método sobrecargado para actulizar salario por un porcentaje
    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100);
    }

 // Método sobrecargado para actulizar salario por una suma fija
    public void actualizarSalario(int aumento) {
        this.salario += aumento;
    }

    
    //Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static int getTotalEmpleados() {
        return totalEmpleados;
    }

    public static void setTotalEmpleados(int totalEmpleados) {
        Empleado.totalEmpleados = totalEmpleados;
    }
   
    
    // Mostar total de empleados creados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
  
    // toString

    @Override
    public String toString() {
        return "El empleado a consultar es {" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }


}