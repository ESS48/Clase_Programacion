/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.agl.aventura_conversacional;

/**
 *
 * @author damt119
 */
public class Enemigo {

    private String tipo;
    private int vida;
    private int danioMaximo;

    public Enemigo() {
        this.tipo = "Golem";
        this.vida = 18;
        this.danioMaximo = 5;
    }

    public Enemigo(String tipo, int vida, int danioMaximo) {
        this.tipo = tipo;
        this.vida = vida;
        this.danioMaximo = danioMaximo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getvida() {
        return vida;
    }

    public void setvida(int vida) {
        this.vida = vida;
    }

    public int getDanioMaximo() {
        return danioMaximo;
    }

    public void setDanioMaximo(int danioMaximo) {
        this.danioMaximo = danioMaximo;
    }

    public void restarHP(int cantidad) {

        this.vida = this.vida - cantidad;

        if (this.vida < 0) {
            this.vida = 0;
        }

    }

    public void sumarHP(int cantidad) {
        this.vida = this.vida + cantidad;
    }

    public void accesoAtributos() {

        System.out.println("Tipo de Enemigo: " + this.tipo);
        System.out.println("Numero de vida del enemigo: " + this.vida);
        System.out.println("Daño maximo del enemigo: " + this.danioMaximo);
    }

    public void calcularDanio(int ataque) {

        this.danioMaximo = this.danioMaximo * ataque;

    }
}
