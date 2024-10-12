/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maestro;

/**
 *
 * @author PERSONAL
 */
public class Maestro {
    // Atributos
    private String nombre;
    private String materia;
    private int aniosExperiencia;

    // Constructor
    public Maestro(String nombre, String materia, int aniosExperiencia) {
        this.nombre = nombre;
        this.materia = materia;
        this.aniosExperiencia = aniosExperiencia;
    }

    // Método para mostrar detalles del maestro
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre + ", Materia: " + materia + ", Años de Experiencia: " + aniosExperiencia);
    }

    // Método para enseñar
    public void ensenar() {
        System.out.println("El maestro " + nombre + " está enseñando " + materia + ".");
    }

    // Método para calificar
    public void calificar(String estudiante, int nota) {
        System.out.println("El maestro " + nombre + " ha calificado a " + estudiante + " con una nota de " + nota + ".");
    }

    // Main para probar la clase Maestro
    public static void main(String[] args) {
        Maestro maestro1 = new Maestro("Juan Pérez", "Matemáticas", 10);
        Maestro maestro2 = new Maestro("Ana Gómez", "Historia", 5);

        maestro1.mostrarDetalles();
        maestro1.ensenar();
        maestro1.calificar("Pedro", 95);

        maestro2.mostrarDetalles();
        maestro2.ensenar();
        maestro2.calificar("María", 88);
    }
}
