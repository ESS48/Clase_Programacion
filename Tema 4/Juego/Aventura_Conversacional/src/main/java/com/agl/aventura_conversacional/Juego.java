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

    private Jugador jugador;
    private Arma Arma;
    private Enemigo enemigo;
    private Scanner sc = new Scanner(System.in);

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Arma getArma() {
        return Arma;
    }

    public void setArma(Arma Arma) {
        this.Arma = Arma;
    }

    public Enemigo getEnemigo() {
        return enemigo;
    }

    public void setEnemigo(Enemigo enemigo) {
        this.enemigo = enemigo;
    }

    public void introduccicon() {
        System.out.println("==Inicio  De  Partida==");
        System.out.println("Estas desorientado y sin querer entras a una cueva, donde te pierdes y encuentras 4 caminos donde si o si tienes que elegir uno. ");
        System.out.println("Primer camino");
        System.out.println("Segundo camino");
        System.out.println("Tercer camino");
        System.out.println("Cuarto camino");

        int camino = sc.nextInt();

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
                break;
            default:
                System.out.println("¡OYE!");
                System.out.println("Ese camino no existe.");
                break;
        }
    }

    private void escena1() {
        System.out.println("Al ir por el primer camino, te topas con un enemigo y empieza un combate inesperaso. ");

        
        
        int opcion=sc.nextInt();

        System.out.println("Dime tu nombre de personaje: ");
        String nombre = sc.next();

        Arma a1 = new Arma("Cuchillo ", 5);
        Jugador jugador = new Jugador(nombre, 12, a1);
        Enemigo mounstro = new Enemigo("Goblin ", 15, 4);

        System.out.println("¡Que empieze el combate!");

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

        } while (jugador.getvida() > 0 && mounstro.getvida() > 0 && opcion != 3);

        if (jugador.getvida() == 0) {
            System.out.println("GAME OVER");
        } else if (mounstro.getvida() == 0) {
            System.out.println("¡Has Ganado!");
        }

    }

    private void escena2() {

        System.out.println("Eliges el segundo camino pero como hay tantos boquetes en el suelo, te caes y te golpeas de cara contra el suelo, haciendo que te baje 3 puntos de vida ");
        jugador.restarHP(3);
        jugador.accesoAtributos();
        System.out.println("Despues del golpe te das cuenta que el camino no tiene salida.");
    }

    private void escena3() {

        System.out.println("Sigues por este camino donde caminas durante mucho tiempo, haciendo que vuelvas al principio. ");

    }

    private void escena4() {

        System.out.println("Sigues el camino donde te aparecen unas luciernagas donde te guian hasta la salida. ");

    }
}
