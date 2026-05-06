/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.agl.ejemplo_conjuntos_mapas;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author damt119
 */
public class Ejemplo_conjuntos_mapas {

    public static void main(String[] args) {

        //pares clave valor
        HashMap<Integer, String> mapaNumeros = new HashMap<>();

        mapaNumeros.put(1, "Uno");
        mapaNumeros.put(2, "Dos");
        mapaNumeros.put(3, "Tres");

        System.out.println("Valor de la clase 3: " + mapaNumeros.get(3));

        if (!mapaNumeros.containsKey(4)) {
            mapaNumeros.put(4, "Cuatro");
        }
        //forma de recorer un mapa
        //el keySet te devuelve un vconjunto de numeros clave
        for (int n : mapaNumeros.keySet()) {
            System.out.println(n + " " + mapaNumeros.get(n));
        }

        mapaNumeros.replace(3, "TRES");

        mapaNumeros.remove(1);

        //otra forma de recorrer los mapas
        for (Map.Entry<Integer, String> entry : mapaNumeros.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + " Valor: " + entry.getValue());
        }

    }
}
