/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author damt119
 */
public class Main {
    public static void main(String[] args) {
        
        ProductoCultural pc1 = new Libro("La programacion",15.5,"Fernando Lopez",50);
        ProductoCultural pc2 = new Videojuego("Pokemon",48.99,"Nintendo",10);
        
        //mostrar por pantalla
        String l1=pc1.toString();
        System.out.println(l1);
        String v1=pc2.toString();
        System.out.println(v1);
        
        //creacion de una pequeña lista
        ProductoCultural pc3 = new Libro("La inundacion",17.5,"Cristina Lopez",60);
        ProductoCultural pc4 = new Videojuego("Zelda",46.99,"Nintendo",12);        
        ProductoCultural pc5 = new Libro("La programacion",15.5,"Julia Lopez",70);
        ProductoCultural pc6 = new Videojuego("Fire emblem",49.99,"Nintendo",15);
        
        //ordenar lista con arrayList
        ArrayList<ProductoCultural> titulo = new ArrayList<>();
        
        titulo.add(pc3);
        titulo.add(pc4);
        titulo.add(pc5);
        titulo.add(pc6);
        
        //Mostrar lista ordenada
        
        for (ProductoCultural p: titulo) {
            System.out.println(p);
        }
        Collections.sort(titulo);
    }
}
