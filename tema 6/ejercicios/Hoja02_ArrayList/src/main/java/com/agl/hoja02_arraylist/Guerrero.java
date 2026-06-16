/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.agl.hoja02_arraylist;

/**
 *
 * @author damt119
 */
public class Guerrero extends Personaje {

    private int fuerza;

    public Guerrero(String nombre, int vida, int fuerza) {
        super(nombre, vida);
        this.fuerza = fuerza;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    @Override
    public String atacar() {
        return "El guerrero esta atacando";
    }

    @Override
    public String toString() {
        return "Guerrero{" + super.toString() + "fuerza=" + fuerza + '}';
    }
    
}
