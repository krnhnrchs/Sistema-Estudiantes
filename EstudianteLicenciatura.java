public class EstudianteLicenciatura extends Estudiante {

    String semestre;

    public EstudianteLicenciatura(String nombre, int edad, String carrera, String semestre) {
        super(nombre, edad, carrera);
        this.semestre = semestre;
    }
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Semestre: " + semestre);
    }
}
