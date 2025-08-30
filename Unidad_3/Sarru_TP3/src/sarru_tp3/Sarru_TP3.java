
package sarru_tp3;

public class Sarru_TP3 {

  
    public static void main(String[] args) {
       
        Estudiante a = new Estudiante();
        a.nombre = "Franco";
        a.apellido = "Sarrú";
        a.curso = "Programación II";
        a.calificacion = 8.5;
        
        
      a.mostrarInfo();
      a.subirCalificacion(1.5);
      a.bajarCalificacion(3);
            
              
    }
    
}
