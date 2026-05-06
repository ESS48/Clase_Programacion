/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.agl.hoja02_arraylist;

/**
 *
 * @author damt119
 */
public abstract class Personaje implements Comparable<Personaje> {

    private String nombre;
    private int vida;

    public Personaje(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Personaje{" + "nombre=" + nombre + ", vida=" + vida + '}';
    }

    public abstract String atacar();

    //    @Override
    // public int compareTo(Personaje otro) {
    //   return this.nombre.compareTo(otro.nombre);
    //}
    @Override
    public int compareTo(Personaje otro) {

        return Integer.compare(this.vida, otro.vida);
    }
}
