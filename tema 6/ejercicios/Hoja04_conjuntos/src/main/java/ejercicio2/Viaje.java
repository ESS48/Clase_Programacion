/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 *
 * @author damt119
 */
public class Viaje {

    private LinkedHashSet<String> ciudades;

    public Viaje() {
        this.ciudades = new LinkedHashSet<>();
    }

    public void añadirCiudad(String nombre) {

        ciudades.add(nombre);

    }

    public void borrarCiudad(String nombre) {

        Iterator<String> c = ciudades.iterator();

        while (c.hasNext()) {
            String ciudad = c.next();
            if (ciudad.equalsIgnoreCase(nombre)) {
                c.remove();
            }
        }

    }

    public void mostrarCiudad() {

        for (String c : ciudades) {
            System.out.println(c);
        }

    }
}
