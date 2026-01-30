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
    
    
    private String introduccicon;
    private int menu;
    private String escena1;

    
    
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
    
    public String getIntroduccicon() {
        return introduccicon;
    }

    public void setIntroduccicon(String introduccicon) {
        this.introduccicon = introduccicon;
    }

    public int getMenu() {
        return menu;
    }

    public void setMenu(int menu) {
        this.menu = menu;
    }

    public String getEscena1() {
        return escena1;
    }

    public void setEscena1(String escena1) {
        this.escena1 = escena1;
    }

    public void introduccicon() {

        System.out.println("Estas desorientado y sin querer entras a una cueva, donde te pierdes y encuentras 4 caminos donde si o si tienes que elegir uno. " + this.introduccicon);

    }

    public void menu(int opcion) {

        this.menu = opcion;
        System.out.println("Eleccion: " + this.menu);
        switch (this.menu) {
            case 1:

                break;

            default:
                System.out.println("No hay ninguna opcion de la elegida.");
        }

    }

    public void escena1() {
        System.out.println("Al ir por este camino, te topas con un enemigo y empieza un combate inesperaso. ");

    }
    
    
    public void combate(){
    
    Scanner teclado = new Scanner(System.in);
        String nombre;
        int opcion;

        System.out.println("Dime tu nombre de personaje: ");
        nombre = teclado.next();

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

        } while (jugador.getvida() > 0 && mounstro.getvida() > 0 && opcion != 3);

        if (jugador.getvida() == 0) {
            System.out.println("GAME OVER");
        } else if (mounstro.getvida() == 0) {
            System.out.println("¡Has Ganado!");
        }
    
    }
}
