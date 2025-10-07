
package colecciones3;


public class Colecciones3 {


    public static void main(String[] args) {

        // Crear universidad
        Universidad universidad = new Universidad("UTN");

        // Tarea 1:
        
        Curso curso1 = new Curso("C001", "Algebra I");
        Curso curso2 = new Curso("C002", "Programacion I");
        Curso curso3 = new Curso("C003", "Fisica I");
        Curso curso4 = new Curso("C004", "Algoritmos");
        Curso curso5 = new Curso("C005", "Programacion II");
        
        Profesor prof1 = new Profesor("P001", "Ana Lopez", "Matematicas"); 
        Profesor prof2 = new Profesor("P002", "Carlos Gomez", "Informatica");
        Profesor prof3 = new Profesor("P003", "Maria Torres", "Programacion");
        
       
        // Tarea 2:
        universidad.agregarProfesor(prof1);
        universidad.agregarProfesor(prof2);
        universidad.agregarProfesor(prof3);
        universidad.agregarCurso(curso1);
        universidad.agregarCurso(curso2);
        universidad.agregarCurso(curso3);
        universidad.agregarCurso(curso4);
        universidad.agregarCurso(curso5);
 

        // Tarea 3:
        universidad.asignarProfesorACurso("C001", "P001"); 
        universidad.asignarProfesorACurso("C002", "P002"); 
        universidad.asignarProfesorACurso("C003", "P003"); 
        universidad.asignarProfesorACurso("C004", "P001"); 
        universidad.asignarProfesorACurso("C005", "P002");
        System.out.println("---------- \n");  

        // Tarea 4:

        universidad.listarCursos();
        System.out.println();
        System.out.println("---------- \n");  
        universidad.listarProfesores();
        System.out.println("---------- \n");   

        // Tarea 5:
        universidad.asignarProfesorACurso("C001", "P002");
        curso1.mostrarInfo();
        prof1.listarCursos();
        prof2.listarCursos();
        System.out.println("---------- \n");   

        // Tarea 6:
        universidad.eliminarCurso("C005");
        prof2.listarCursos();
        universidad.listarCursos();
        System.out.println("---------- \n");   

        // Tarea 7:
        universidad.eliminarProfesor("P003");
        curso3.mostrarInfo();
        universidad.listarProfesores();
        System.out.println("---------- \n");   

        // Tarea 8: Reporte de cursos por profesor
        universidad.reporteCursosPorProfesor();
        System.out.println("---------- \n");   
    }
}