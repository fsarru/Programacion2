package colecciones3;


public class Curso {
    
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        if (this.profesor != null) {
            this.profesor.eliminarCurso(this);
        }
        this.profesor = profesor;
        if (profesor != null) {
            profesor.agregarCurso(this);
        }
    }

    public void mostrarInfo() {
        System.out.println("Codigo: " + codigo);
        System.out.println("Curso: " + nombre);
        System.out.println("Profesor: " + (profesor != null ? profesor.getNombre() : "Sin profesor"));
    }
}
