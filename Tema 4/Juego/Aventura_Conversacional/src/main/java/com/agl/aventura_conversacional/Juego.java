/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.agl.aventura_conversacional;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author damt119
 */
public class Juego {

    private Scanner sc = new Scanner(System.in);
    Jugador jugador;
    private Enemigo[] mounstro;
    Arma a1;

    public void introducion() {
        int camino;

        System.out.println("Dime tu nombre de personaje: ");
        String nombre = sc.next();
        a1 = new Arma("Cuchillo ", 5);
        jugador = new Jugador(nombre, 12, a1);

        mounstro = new Enemigo[3];
        mounstro[0] = new Enemigo("Goblin", 15, 4);
        mounstro[1] = new Enemigo("Golem", 11, 3);
        mounstro[2] = new Enemigo("Bruja", 14, 2);

        System.out.println("==Inicio  De  Partida==");
        System.out.println("Estas desorientado y sin querer entras a una cueva, donde te pierdes y encuentras 4 caminos donde si o si tienes que elegir uno. ");

        do {
            System.out.println("Primera camino");
            System.out.println("Segundo camino");
            System.out.println("Tercer camino");
            System.out.println("Cuarto camino");

            camino = sc.nextInt();

            switch (camino) {
                case 1:
                    escena1();
                    break;
                case 2:
                    escena2();
                    break;
                case 3:
                    escena3();
                    break;
                case 4:
                    escena4();

                    if (jugador.getvida() > 6) {
                        finalBueno();
                    } else {
                        finalMalo();
                    }
                    break;
                default:
                    System.out.println("¡OYE!");
                    System.out.println("Ese camino no existe.");
                    System.out.println("No me tomes el pelo y vuelve a elegir");
                    break;
            }
        } while (jugador.getvida() > 0 && camino != 4);
    }

    private Enemigo buscarEnemigo() {

        for (int i = 0; i < mounstro.length; i++) {

            if (!mounstro[i].isDerrotado()) {
                return mounstro[i];
            }
        }
        return null;

    }

    private void escena1() {
        System.out.println("Al ir por el primer camino, te topas con un enemigo y empieza un combate inesperado. ");

        Enemigo mounstro = buscarEnemigo();

        if (mounstro == null) {
            System.out.println("No hay enemigos");
            return;
        }
        

        System.out.println("¡Que empieze el combate!");
        int opcion;
        do {

            System.out.println("Jugador: " + jugador.getNombre());
            System.out.println("Vida: " + jugador.getvida());
            System.out.println("Arma: " + jugador.getArma().getDanioMaximo());

            System.out.println("Mounstro: " + mounstro.getTipo());
            System.out.println("Vida: " + mounstro.getvida());
            System.out.println("Daño máx: " + mounstro.getDanioMaximo());

            System.out.println("Escoge una opción: ");
            System.out.println("1. Atacar");
            System.out.println("2. Curarte");
            System.out.println("3. Huir");
            opcion = sc.nextInt();

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
                    System.out.println("FIN DEL COMBATE");

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

        } while (jugador.getvida() > 0 && mounstro.getvida() > 0 && opcion != 3);

        if (jugador.getvida() <= 0) {
            System.out.println("GAME OVER");
        } else if (mounstro.getvida() <= 0) {
            mounstro.setDerrotado(true);
            System.out.println("¡Has Ganado el combate!");
            
        }

    }

    private void escena2() {

        System.out.println("Eliges el segundo camino pero como hay tantos boquetes en el suelo, te caes y te golpeas de cara contra el suelo, haciendo que te quite 3 de vida");
        jugador.restarHP(3);
        jugador.accesoAtributos();
        System.out.println("Despues del golpe te das cuenta que el camino no tiene salida, haciendo que vuelvas para atras.");
    }

    private void escena3() {

        System.out.println("Sigues por este camino donde caminas durante mucho tiempo, haciendo que vuelvas al principio y dando te cuenta que hay una pocion de vida en el suelo para curarte  ");
        jugador.sumarHP(4);
        jugador.accesoAtributos();
    }

    private void escena4() {

        System.out.println("Sigues el camino donde te aparecen unas luciernagas donde te guian hasta la salida. ");

    }

    private void finalBueno() {

        System.out.println("Al salir de la cueva sigues tu camino y llegas a un pueblo donde puedes descansar tranquilamente.");

        System.out.println("¡ENHORABUENA!");
        System.out.println("¡Has Completo el juego!");

    }

    private void finalMalo() {

        System.out.println("Al salir de la cueva te siente tan herido haciendo que no puedas seguir con tu aventura haciendo que te encuentren unos enemigos y te ataquen sin piedad.");

        System.out.println("¡ENHORABUENA!");
        System.out.println("¡HAS COMPLETADO EL JUEGO!");

    }
}
