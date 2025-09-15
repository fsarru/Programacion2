package ejercicio9;
public class Ejercicio9 {

    public static void main(String[] args) {


        Paciente paciente = new Paciente("Franco Sarru", "Prevencion Salud");
        Profesional profesional = new Profesional("Dr. Belisario Lopez", "Oftalmologia");


        CitaMedica cita = new CitaMedica("15/09/2025", "10:30", paciente, profesional);
        cita.mostrarDatos();
    }
}