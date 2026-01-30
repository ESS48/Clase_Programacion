/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.agl.aventura_conversacional;

/**
 *
 * @author damt119
 */
public class Juego {

    private int seleccion;
    private String introduccicon;
    private int menu;
    private String escena1;
    
    
    public Juego(){
    
    }

    public int getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(int seleccion) {
        this.seleccion = seleccion;
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

        System.out.println("Entras a una cueva, donde te pierdes y encuentras 4 caminos donde si o si tienes que elegir uno. " + this.introduccicon);

    }

    public void menu(int opcion) {
        
        System.out.println("Eleccion: "+this.menu);
        switch (opcion) {
            case 1:
                System.out.println();
                break;
                
            default:
                System.out.println("No hay ninguna opcion de la elegida.");
        }

    }

    public void escena1() {

        System.out.println("Al ir por este camino, te topas con un enemigo y empieza un combate inesperaso. " + this.escena1);

    }

    public void escena2() {

    }

    public void escena3() {

    }

    public void escena4() {

    }
}
