/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.agl.mini_combate;

/**
 *
 * @author damt119
 */
public class Jugador {

    private String nombre;
    private int hp;
    private Arma arma;

    public Jugador() {
        this.nombre = "Elias";
        this.hp = 50;
        this.arma = new Arma("Baston",4);
    }

    public Jugador(String nombre, int hp, Arma arma) {
        this.nombre = nombre;
        this.hp = hp;
        this.arma = arma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public void restarHP(int cantidad) {

        this.hp = this.hp - cantidad;

        if (this.hp < 0) {
            this.hp = 0;
        }

    }

    public void sumarHP(int cantidad) {
        this.hp = this.hp + cantidad;
    }
}
