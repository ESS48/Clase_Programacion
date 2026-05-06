/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.agl.hoja04_conjuntos;

import java.util.HashSet;
import java.util.Iterator;


/**
 *
 * @author damt119
 */
public class Mundo {

    private HashSet<String> paises;

    public Mundo() {

        this.paises = new HashSet<>();

    }

    public void añadirPais(String nombre) {

        paises.add(nombre);

    }

    public void borrarPais(String nombre) {

        //paises.removeIf(p -> p.equalsIgnoreCase(nombre));
        Iterator<String> p = paises.iterator();
        while (p.hasNext()) {

            String pais = p.next();

            if (pais.equalsIgnoreCase(nombre)) {
                p.remove();
            }
        }
    }   

    public void mostrarPaises() {

        for (String p : paises) {
            System.out.println(p);
        }

    }
}
