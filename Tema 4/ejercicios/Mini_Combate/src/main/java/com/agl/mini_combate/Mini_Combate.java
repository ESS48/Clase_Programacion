/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.agl.mini_combate;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author damt119
 */
public class Mini_Combate {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        int opcion;

        System.out.println("Dime tu nombre de personaje: ");
        nombre = teclado.next();

        Arma a1 = new Arma("Cuchillo ", 5);
        Jugador jugador = new Jugador(nombre, 12, a1);
        Mounstro mounstro = new Mounstro("Goblin ", 15, 4);

        System.out.println("¡Que empieze el combate!");

        do {

            System.out.println("Jugador: " + jugador.getNombre());
            System.out.println("Vida: " + jugador.getHp());
            System.out.println("Arma: " + jugador.getArma().getDanioMaximo());

            System.out.println("Mounstro: " + mounstro.getTipo());
            System.out.println("Vida: " + mounstro.getHp());
            System.out.println("Daño máx: " + mounstro.getDanioMaximo());

            System.out.println("Escoge una opción: ");
            System.out.println("1. Atacar");
            System.out.println("2. Curarte");
            System.out.println("3. Huir");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    Random dado = new Random();
                    int ataque = dado.nextInt(jugador.getArma().getDanioMaximo());
                    mounstro.restarHP(ataque);
                    System.out.println("Daño: " + ataque);
                    
                    break;
                case 2:

                    jugador.sumarHP(2);
                    System.out.println("Te curaste 2 puntos de vida.");
                    break;

                case 3:

                    System.out.println("Has huido");
                    System.out.println("FIN DEL JUEGO");

                    break;

                default:
                    System.out.println("Intentelo de nuevo.");

            }

            //Turno mounstro
            if (opcion == 1 || opcion == 2) {
                Random r1 = new Random();
                int golpe = r1.nextInt(mounstro.getDanioMaximo());
                jugador.restarHP(golpe);
                System.out.println("El goblin te ataca y te hace " + golpe + " de daño.");
            }

        } while (jugador.getHp() > 0 && mounstro.getHp() > 0 && opcion != 3);

        if (jugador.getHp() == 0) {
            System.out.println("GAME OVER");
        } else if (mounstro.getHp() == 0) {
            System.out.println("¡Has Ganado!");
        }

    }
}
