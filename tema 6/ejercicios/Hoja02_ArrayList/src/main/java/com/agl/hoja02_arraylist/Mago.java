/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.agl.hoja02_arraylist;

/**
 *
 * @author damt119
 */
public class Mago extends Personaje {

    private int mana;

    public Mago(String nombre, int vida, int mana) {
        super(nombre, vida);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public String atacar() {

        return "El mago esta atacando";

    }

    @Override
    public String toString() {
        return "Mago{" + super.toString() + "mana=" + mana + '}';
    }

}
