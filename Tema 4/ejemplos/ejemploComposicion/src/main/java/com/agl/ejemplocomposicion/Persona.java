/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.agl.ejemplocomposicion;

/**
 *
 * @author damt119
 */
public class Persona {

    private String nombre;
    private DNI dni; //composicion

    public Persona() {
        this.nombre = "Anonimo";
        dni = new DNI("11111", 'a');
    }

    public Persona(String nombre, DNI dni) {

        this.nombre = nombre;
        this.dni = dni;

    }

    public Persona(String nombre, String numero, char letra) {

        this.nombre = nombre;
        this.dni = new DNI(numero, letra);
    }

    public void mostrarPersona() {

        System.out.println("Nombre: " + this.nombre + "Número: " + this.dni.getNumero() + "Letra: " + this.dni.getLetra());

    }

}
