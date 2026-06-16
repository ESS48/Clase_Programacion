/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.agl.mini_combate;

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
    
    
}
