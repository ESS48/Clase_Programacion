/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.agl.aventura_conversacional;

/**
 *
 * @author damt119
 */
public class Jugador {

    private String nombre;
    private int vida;
    private Arma arma;

    public Jugador() {
        this.nombre = "Elias";
        this.vida = 50;
        this.arma = new Arma("Baston",4);
    }

    public Jugador(String nombre, int vida, Arma arma) {
        this.nombre = nombre;
        this.vida = vida;
        this.arma = arma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getvida() {
        return vida;
    }

    public void setvida(int vida) {
        this.vida = vida;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
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
    
    public void accesoAtributos(){
    
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Vida: "+this.vida);
        System.out.println("Arma: "+this.arma);
        
    }
    
}
