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
public class Arma {

    private String tipoArma;
    private int danioMaximo;

    public Arma(String tipoArma, int danioMaximo) {
        this.tipoArma = tipoArma;
        this.danioMaximo = danioMaximo;
    }

    public String getTipoArma() {
        return tipoArma;
    }

    public void setTipoArma(String tipoArma) {
        this.tipoArma = tipoArma;
    }

    public int getDanioMaximo() {
        return danioMaximo;
    }

    public void setDanioMaximo(int danioMaximo) {
        this.danioMaximo = danioMaximo;
    }
    
    public void acceso(){
    
        System.out.println("Tipo de arma: "+this.tipoArma);
        System.out.println("Daño maximo: "+this.danioMaximo);
    }
    
    public void devolverDanio(){
    
        Random r=new Random();
        int devolver=r.nextInt();
        
        this.danioMaximo=devolver;
    
    }
    
    
    
    
}
