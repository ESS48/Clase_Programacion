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
public class Mascota implements Serializable{
    private String nombre;
    private int numPatas;

    public Mascota(String nombre, int numPatas) {
        this.nombre = nombre;
        this.numPatas = numPatas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    @Override
    public String toString() {
        return "Mascota: " + "nombre: " + nombre + ", numPatas: " + numPatas;
    }
    
    
}
