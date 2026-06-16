/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.agl.hoja02_arraylist;

/**
 *
 * @author damt119
 */
public class MainPersonaje {

    public static void main(String[] args) {

        Equipo e1 = new Equipo();

        Personaje p1 = new Guerrero("Carmelo", 18, 10);
        Personaje p2 = new Guerrero("Valentin", 17, 11);
        Personaje p3 = new Mago("Neco", 14, 15);
        Personaje p4 = new Mago("Azucena", 15, 16);

        e1.insertarPersonaje(p1);
        e1.insertarPersonaje(p2);
        e1.insertarPersonaje(p3);
        e1.insertarPersonaje(p4);

        System.out.println("\nMostrar Personajes");
        e1.mostrarPersonajes();

        System.out.println("\nBuscar");
        Personaje p = e1.buscarPersonajes("Azucena");

        if (p != null) {
            System.out.println(p);
        } else {

            System.out.println("No se puedo enseñar ningun personaje");
        }

        System.out.println("\nEliminar Personaje");
        e1.eliminarPersonaje("Neco");

        e1.mostrarPersonajes();

        System.out.println("\nAccion");

        e1.atacarTodos();
        
        
        Equipo e2 = new Equipo();
        
        e2.insertarPersonaje(p1);
        e2.insertarPersonaje(p2);
        e2.insertarPersonaje(p3);
        e2.insertarPersonaje(p4);
        
        System.out.println("\nPersonajes Desordenados");
        e2.mostrarPersonajes();
        
        e2.ordenarPersonajes();
        
        System.out.println("\nPersonajes Ordenados");
        
        e2.mostrarPersonajes();
    }
    
    
    
}
