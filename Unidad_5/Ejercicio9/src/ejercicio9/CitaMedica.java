package ejercicio9;

public class CitaMedica {
    private String fecha;
    private String hora;
    private Paciente paciente;
    private Profesional profesional;

    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profesional = profesional;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Profesional getProfesional() {
        return profesional;
    }

    public void mostrarDatos() {

        System.out.println("Fecha: " + fecha);
        System.out.println("Hora: " + hora);
        System.out.println("Nombre: " + paciente.getNombre());
        System.out.println("Obra Social: " + paciente.getObraSocial());
        System.out.println("Nombre: " + profesional.getNombre());
        System.out.println("Especialidad: " + profesional.getEspecialidad());
    }
}

