/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.agl.aventura_conversacional;

/**
 *
 * @author damt119
 */
public class Jugador extends Personaje{

    private String nombre;
    private Arma arma;



    public Jugador(String nombre, int vida, Arma arma) {
        super(vida);
        this.nombre = nombre;
        this.arma = arma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getvida() {
        return super.getVida();
    }

    public void setvida(int vida) {
        super.setVida(vida);
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public void accesoAtributos(){
    
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Vida: "+super.getVida());
        
    }

    @Override
    public int atacar() {
        return this.arma.getDanioMaximo();
    }
    
}
