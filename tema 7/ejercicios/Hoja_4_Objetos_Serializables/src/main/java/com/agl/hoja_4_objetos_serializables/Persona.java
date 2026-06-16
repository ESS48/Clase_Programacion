/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.agl.hoja_4_objetos_serializables;

import java.io.Serializable;

/**
 *
 * @author damt119
 */
public class Persona implements Serializable{
    private String nombre;
    private String apellido;
    private int edad;
    private Mascota mascota;

    public Persona(String nombre, String apellido, int edad, Mascota mascota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.mascota = mascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    @Override
    public String toString() {
        return "Persona: " + "nombre: " + nombre + ", apellido: " + apellido + ", edad: " + edad + ", mascota: " + mascota;
    }
    
    
}
