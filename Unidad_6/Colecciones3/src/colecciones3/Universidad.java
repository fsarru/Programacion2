
package colecciones3;

import java.util.ArrayList;


public class Universidad {
    private String nombre;
    private ArrayList<Profesor> profesores;
    private ArrayList<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void agregarProfesor(Profesor profesor) {
        if (profesor != null && !profesores.contains(profesor)) {
            profesores.add(profesor);
        }
    }

    public void agregarCurso(Curso curso) {
        if (curso != null && !cursos.contains(curso)) {
            cursos.add(curso);
        }
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);
        if (curso != null && profesor != null) {
            curso.setProfesor(profesor);
        }
    }

    public void listarProfesores() {
        System.out.println("Lista de Profesores en " + nombre + ":");
        if (profesores.isEmpty()) {
            System.out.println("  Ningun profesor registrado.");
        } else {
            for (Profesor profesor : profesores) {
                profesor.mostrarInfo();
                System.out.println();
            }
        }
    }

    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("  Ningun curso registrado.");
        } else {
            for (Curso curso : cursos) {
                curso.mostrarInfo();
            }
        }
    }

   public Profesor buscarProfesorPorId(String id) {
    for (Profesor profesor : profesores) {
        if (profesor.getId().equals(id)) {
            return profesor;
        }
    }
    return null;
}

 public Curso buscarCursoPorCodigo(String codigo) {
    for (Curso curso : cursos) {
        if (curso.getCodigo().equals(codigo)) {
            return curso;
        }
    }
    return null;
}

 public void eliminarCurso(String codigo) {
    Curso curso = buscarCursoPorCodigo(codigo);    
    if (curso == null) {
        System.out.println("Curso no encontrado.");
        return;
    }
    if (curso.getProfesor() != null) {
        curso.setProfesor(null); 
    }
    cursos.remove(curso);
    System.out.println("Se elimino el curso: " + curso.getNombre() + " con codigo (" + codigo + ")");
}
    

    public void eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor != null) {
            for (Curso curso : new ArrayList<>(profesor.getCursos())) {
                curso.setProfesor(null);
            }
            profesores.remove(profesor);
        }
    }

    public void reporteCursosPorProfesor() {
        System.out.println("Reporte: Cantidad de cursos por profesor en " + nombre + ":");
        if (profesores.isEmpty()) {
            System.out.println("  Ningun profesor registrado.");
        } else {
            for (Profesor profesor : profesores) {
                System.out.println("  - " + profesor.getNombre() + ": " + profesor.getCursos().size() + " cursos");
            }
        }
    }
}
