/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author damt119
 */
public class main {

    public static void main(String[] args) {

        Viaje v1 = new Viaje();

        v1.añadirCiudad("Pamplona");
        v1.añadirCiudad("Bilbao");
        v1.añadirCiudad("Santander");
        v1.añadirCiudad("San sebastian");
        v1.añadirCiudad("Bilbao");

        v1.borrarCiudad("santander");

        System.out.println("Estos son los paises");
        v1.mostrarCiudad();

    }
}
