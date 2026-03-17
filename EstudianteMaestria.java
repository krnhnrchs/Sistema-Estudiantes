public class EstudianteMaestria extends Estudiante {

    String especialidad;

    public EstudianteMaestria(String nombre, int edad, String carrera, String especialidad) {
        super(nombre, edad, carrera);
        this.especialidad = especialidad;
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Especialidad: " + especialidad);
    }
}
