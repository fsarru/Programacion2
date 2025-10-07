package colecciones3;

import java.util.ArrayList;


public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private ArrayList<Curso> cursos; 

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    
  public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
            if (c.getProfesor() != this) {
                c.setProfesor(this);
            }
        }
    }

    public void eliminarCurso(Curso c) {
        if (cursos.remove(c)) {
            if (c.getProfesor() == this) {
                c.setProfesor(null);
            }
        }
    }

    public void listarCursos() {
        System.out.println("Cursos dictados por " + nombre + ":");
        if (cursos.isEmpty()) {
            System.out.println("  Ningun curso asignado.");
        } else {
            for (Curso curso : cursos) {
                System.out.println("  - " + curso.getCodigo() + ": " + curso.getNombre());
            }
        }
    }

    public void mostrarInfo() {
        System.out.println("ID: " +id);
        System.out.println("Profesor: " + nombre);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Cantidad de cursos: " + cursos.size());
    }
}

