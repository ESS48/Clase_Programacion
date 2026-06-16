/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.agl.mini_combate;

/**
 *
 * @author damt119
 */
public class Mounstro {

    private String tipo;
    private int hp;
    private int danioMaximo;

    public Mounstro() {
        this.tipo="Golem";
        this.hp=18;
        this.danioMaximo=5;
    }

    public Mounstro(String tipo, int hp, int danioMaximo) {
        this.tipo = tipo;
        this.hp = hp;
        this.danioMaximo = danioMaximo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDanioMaximo() {
        return danioMaximo;
    }

    public void setDanioMaximo(int danioMaximo) {
        this.danioMaximo = danioMaximo;
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
