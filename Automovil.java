/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package automovil;

/**
 *
 * @author PERSONAL
 */
public class Automovil {
    // Atributos
    private String marca;
    private String modelo;
    private String color;

    // Constructor
    public Automovil(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    // Método para mostrar detalles del automóvil
    public void mostrarDetalles() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Color: " + color);
    }

    // Método para encender el automóvil
    public void encender() {
        System.out.println("El automóvil " + marca + " " + modelo + " ha sido encendido.");
    }

    // Método para acelerar el automóvil
    public void acelerar(int velocidad) {
        System.out.println("El automóvil " + marca + " " + modelo + " está acelerando a " + velocidad + " km/h.");
    }

    // Main para probar la clase Automovil
    public static void main(String[] args) {
        Automovil auto1 = new Automovil("Toyota", "Corolla", "Rojo");
        Automovil auto2 = new Automovil("Honda", "Civic", "Azul");
        Automovil auto3 = new Automovil("Mitsubishi", "Asx", "gris");
        
        auto1.mostrarDetalles();
        auto1.encender();
        auto1.acelerar(60);

        auto2.mostrarDetalles();
        auto2.encender();
        auto2.acelerar(80);
        
        auto3.mostrarDetalles();
        auto3.encender();
        auto3.acelerar(80);
    }
}
