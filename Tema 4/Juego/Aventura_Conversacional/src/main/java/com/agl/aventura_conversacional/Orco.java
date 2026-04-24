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
public class Orco extends Enemigo implements Defendible {

    public Orco(String tipo, int vida, int danioMaximo) {
        super(tipo, vida, danioMaximo);
    }

    @Override
    public int atacar() {

        Random fallar = new Random();
        int probabilidad = fallar.nextInt(1, 2);

        if (probabilidad == 1) {
            Random r = new Random();
            int danio = r.nextInt(1, getDanioMaximo());
            return danio;
        } else {
            System.out.println("Fallaste el ataque");
            return 0;
        }

    }

    @Override
    public int modificarDanioRecibido(int danio) {
        Random anulacion = new Random();
        int probabilidad = anulacion.nextInt(1, 3);
        int danioAtaque = 0;
        //esto me sirve para elegir con el random para una de las posibilidades para que se  defienda
        switch (probabilidad) {
            case 1:
                int reduccionDanio = 2;
                danioAtaque = danio - reduccionDanio;
                
                System.out.println("¡El Orco se defiende! El daño se reduce de " + danio + " a " + danioAtaque);
                
                if (danioAtaque < 0) {
                    danioAtaque = 0;
                }
                break;
            case 2:
                System.out.println("El orco que redujo el daño en un 25%");
                danioAtaque = danio * 25 / 100;
                break;
            case 3:
                System.out.println("El orco anulo todo el danio");
                danioAtaque = danio - danio;
                break;
        }

        return danioAtaque;
    }
}
