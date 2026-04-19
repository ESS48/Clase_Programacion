/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.agl.aventura_conversacional;

import java.util.Random;

/**
 *
 * @author damt119
 */
public class Enemigo extends Personaje {

    private String tipo;
    private int danioMaximo;
    private boolean derrotado;

    public Enemigo(String tipo, int vida, int danioMaximo) {
        super(vida);
        this.tipo = tipo;
        this.danioMaximo = danioMaximo;
        this.derrotado = false;
    }

    public boolean isDerrotado() {
        return derrotado;
    }

    public void setDerrotado(boolean derrotado) {
        this.derrotado = derrotado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getvida() {
        return super.getVida();
    }

    public void setvida(int vida) {
        super.setVida(vida);
    }

    public int getDanioMaximo() {
        return danioMaximo;
    }

    public void setDanioMaximo(int danioMaximo) {
        this.danioMaximo = danioMaximo;
    }


    public void accesoAtributos() {

        System.out.println("Tipo de Enemigo: " + this.tipo);
        System.out.println("Numero de vida del enemigo: " + super.getVida());
        System.out.println("Daño maximo del enemigo: " + this.danioMaximo);
        System.out.println("¿Esta derrotado? " + this.derrotado);
    }

    public void calcularDanio(int ataque) {

        this.danioMaximo = this.danioMaximo * ataque;

    }

    @Override
    public int atacar() {
        Random r = new Random();
        int daño = r.nextInt(1, danioMaximo);
        return daño;
    }
}
