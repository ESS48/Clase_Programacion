/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.agl.hoja02_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author damt119
 */
public class Equipo {

    private ArrayList<Personaje> personajes;

    public Equipo() {
        this.personajes = new ArrayList<>();
    }

    public void insertarPersonaje(Personaje p) {

        personajes.add(p);

    }

    public void mostrarPersonajes() {

        for (Personaje p : personajes) {
            System.out.println(p);
        }

    }

    //busca el personaje y lo devuelve (retorna) entero
    public Personaje buscarPersonajes(String nombre) {

        for (Personaje p : personajes) {
            if (p.getNombre().equals(nombre)) {
                return p;
            }
        }

        return null;
    }

    public void eliminarPersonaje(String nombre) {

        Iterator<Personaje> p = personajes.iterator();
        while (p.hasNext()) {

            Personaje perso = p.next();

            if (perso.getNombre().equals(nombre)) {
                p.remove();
            }
        }
    }

    public void atacarTodos() {

        for (Personaje p : personajes) {
            System.out.println(p.atacar());
        }

    }

    public void ordenarPersonajes() {

        Collections.sort(personajes);
    }

}
