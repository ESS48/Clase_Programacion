/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.agl.aventura_conversacional;

import java.util.Random;

/**
 *
 * @author santi
 */
public class Goblin extends Enemigo {

    public Goblin(String tipo, int vida, int danioMaximo) {
        super(tipo, vida, danioMaximo);
    }

    @Override
    public int atacar() {

        Random criticos = new Random();
        int probabilidad = criticos.nextInt(1,2);

        if (probabilidad==1) {
            Random r = new Random();
            int danio = r.nextInt(1, getDanioMaximo());
            return danio;
        } else {
            Random r = new Random();
            int danio = r.nextInt(1, getDanioMaximo());
            int multiplicador = danio * 2;
            return multiplicador;
        }

    }

}
