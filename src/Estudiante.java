public class Estudiante {

// Atributos de la clase
String nombre;
int edad;
String carrera;

// Constructor
// Sirve para inicializar los valores del objeto
public Estudiante(String nombre, int edad,                 String carrera) {
  this.nombre = nombre;
  this.edad = edad;
  this.carrera = carrera;
   }
  
  // Metodo para mostrar informacion del estudiante
public void mostrarInformacion() {
  System.out.println("Nombre: " + nombre);
   System.out.println("Edad: " + edad);
   System.out.println("Carrera: " + carrera);
  }
  // Metodo de saludo

  public void saludar() {
     System.out.println("Hola, mi nombre es " + nombre);
    }
  }
