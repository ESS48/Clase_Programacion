/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.agl.hoja2_ficheros;

/**
 *
 * @author damt119
 */
public class Persona {
    
    private String nombre;
    private String edad;
    private String ciudad;

    public Persona(String nombre, String edad, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Persona: " + "nombre: " + nombre + ", edad: " + edad + ", ciudad: " + ciudad ;
    }
    
    
    
}
